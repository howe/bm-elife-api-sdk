package com.qianmi.open.api.qmcs.endpoint;

import com.qianmi.open.api.qmcs.endpoint.MessageIO.MessageDecoder;
import com.qianmi.open.api.qmcs.endpoint.MessageType.HeaderType;
import com.qianmi.open.api.qmcs.endpoint.MessageType.ValueFormat;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.HashMap;

public class MessageDecoderImpl implements MessageDecoder {
	@Override
	public Message readMessage(ByteBuffer buffer) {
		buffer.order(ByteOrder.LITTLE_ENDIAN);

		Message msg = new Message();
		msg.messageType = buffer.get();
		// read kv
		HashMap<String, Object> dict = new HashMap<String, Object>();
		short headerType = buffer.getShort();
		while (headerType != HeaderType.EndOfHeaders) {
			if (headerType == HeaderType.Custom)
				dict.put(readCountedString(buffer), readCustomValue(buffer));
			else if (headerType == HeaderType.StatusCode)
				msg.statusCode = buffer.getInt();
			else if (headerType == HeaderType.StatusPhrase)
				msg.statusPhase = readCountedString(buffer);
			else if (headerType == HeaderType.Flag)
				msg.flag = buffer.getInt();
			else if (headerType == HeaderType.Token)
				msg.token = readCountedString(buffer);
			headerType = buffer.getShort();
		}
		msg.content = dict;
		buffer.order(ByteOrder.BIG_ENDIAN);
		return msg;
	}

	// UTF-8 only
	private static String readCountedString(ByteBuffer buffer)
	{
		int size = buffer.getInt();
		if (size > 0) {
			byte[] data = new byte[size];
			buffer.get(data, 0, data.length);
			return new String(data, Charset.forName("UTF-8"));
		}
		return null;
	}

	private static Object readCustomValue(ByteBuffer buffer) {
		byte format = buffer.get();
		switch (format) {
		case ValueFormat.Void:
			return null;
		case ValueFormat.Byte:
			return buffer.get();
		case ValueFormat.Int16:
			short value = buffer.getShort();
			return value;
		case ValueFormat.Int32:
			int intValue = buffer.getInt();
			return intValue;
		case ValueFormat.Int64:
			long longValue = buffer.getLong();
			return longValue;
		case ValueFormat.Date:
			long ticks = buffer.getLong();
			return new Date(ticks);
		case ValueFormat.ByteArray:
			byte[] byteArray = new byte[buffer.getInt()];
			buffer.get(byteArray);
			return byteArray;
		default:
			return readCountedString(buffer);
		}
	}
}