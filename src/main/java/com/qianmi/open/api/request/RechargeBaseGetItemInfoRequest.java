package com.qianmi.open.api.request;

import com.qianmi.open.api.tool.util.RequestCheckUtils;
import java.util.Map;

import com.qianmi.open.api.QianmiRequest;
import com.qianmi.open.api.tool.util.QianmiHashMap;
import com.qianmi.open.api.response.RechargeBaseGetItemInfoResponse;
import com.qianmi.open.api.ApiRuleException;

/**
 * API: qianmi.elife.recharge.base.getItemInfo request
 *
 * @author auto
 * @since 1.0
 */
public class RechargeBaseGetItemInfoRequest implements QianmiRequest<RechargeBaseGetItemInfoResponse> {

    private Map<String, String> headerMap = new QianmiHashMap();
	private QianmiHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	 * 商品ID
	 */
	private String itemId;

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId() {
		return this.itemId;
	}

    public Long getTimestamp() {
    	return this.timestamp;
    }
    public void setTimestamp(Long timestamp) {
    	this.timestamp = timestamp;
    }

	public String getApiMethodName() {
		return "qianmi.elife.recharge.base.getItemInfo";
	}

	public Map<String, String> getTextParams() {
		QianmiHashMap txtParams = new QianmiHashMap();
		txtParams.put("itemId", this.itemId);
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

	public Class<RechargeBaseGetItemInfoResponse> getResponseClass() {
		return RechargeBaseGetItemInfoResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
    }

	public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}