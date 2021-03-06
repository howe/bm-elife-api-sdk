package com.qianmi.open.api.request;

import com.qianmi.open.api.tool.util.RequestCheckUtils;
import java.util.Map;

import com.qianmi.open.api.QianmiRequest;
import com.qianmi.open.api.tool.util.QianmiHashMap;
import com.qianmi.open.api.response.TrainOrderPayResponse;
import com.qianmi.open.api.ApiRuleException;

/**
 * API: qianmi.elife.train.order.pay request
 *
 * @author auto
 * @since 1.0
 */
public class TrainOrderPayRequest implements QianmiRequest<TrainOrderPayResponse> {

    private Map<String, String> headerMap = new QianmiHashMap();
	private QianmiHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	 * 订单编号
	 */
	private String tradeNo;

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo() {
		return this.tradeNo;
	}

    public Long getTimestamp() {
    	return this.timestamp;
    }
    public void setTimestamp(Long timestamp) {
    	this.timestamp = timestamp;
    }

	public String getApiMethodName() {
		return "qianmi.elife.train.order.pay";
	}

	public Map<String, String> getTextParams() {
		QianmiHashMap txtParams = new QianmiHashMap();
		txtParams.put("tradeNo", this.tradeNo);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new QianmiHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<TrainOrderPayResponse> getResponseClass() {
		return TrainOrderPayResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(tradeNo, "tradeNo");
    }

	public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}