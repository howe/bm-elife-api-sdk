package com.qianmi.open.api.request;

import com.qianmi.open.api.tool.util.RequestCheckUtils;
import java.util.Map;

import com.qianmi.open.api.QianmiRequest;
import com.qianmi.open.api.tool.util.QianmiHashMap;
import com.qianmi.open.api.response.VideoCardCreateBillResponse;
import com.qianmi.open.api.ApiRuleException;

/**
 * API: qianmi.elife.video.card.createBill request
 *
 * @author auto
 * @since 1.0
 */
public class VideoCardCreateBillRequest implements QianmiRequest<VideoCardCreateBillResponse> {

    private Map<String, String> headerMap = new QianmiHashMap();
	private QianmiHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	 * 充值账号，各大视频网站的会员号
	 */
	private String account;

	/** 
	 * 回调地址
	 */
	private String callback;

	/** 
	 * 标准商品编号
	 */
	private String itemId;

	/** 
	 * 外部订单号
	 */
	private String outerTid;

	public void setAccount(String account) {
		this.account = account;
	}
	public String getAccount() {
		return this.account;
	}

	public void setCallback(String callback) {
		this.callback = callback;
	}
	public String getCallback() {
		return this.callback;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId() {
		return this.itemId;
	}

	public void setOuterTid(String outerTid) {
		this.outerTid = outerTid;
	}
	public String getOuterTid() {
		return this.outerTid;
	}

    public Long getTimestamp() {
    	return this.timestamp;
    }
    public void setTimestamp(Long timestamp) {
    	this.timestamp = timestamp;
    }

	public String getApiMethodName() {
		return "qianmi.elife.video.card.createBill";
	}

	public Map<String, String> getTextParams() {
		QianmiHashMap txtParams = new QianmiHashMap();
		txtParams.put("account", this.account);
		txtParams.put("callback", this.callback);
		txtParams.put("itemId", this.itemId);
		txtParams.put("outerTid", this.outerTid);
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

	public Class<VideoCardCreateBillResponse> getResponseClass() {
		return VideoCardCreateBillResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(account, "account");
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
    }

	public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}