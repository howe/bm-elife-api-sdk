package com.qianmi.open.api.request;

import com.qianmi.open.api.tool.util.RequestCheckUtils;
import java.util.Map;

import com.qianmi.open.api.QianmiRequest;
import com.qianmi.open.api.tool.util.QianmiHashMap;
import com.qianmi.open.api.response.BmRechargeMobileGetItemInfoResponse;
import com.qianmi.open.api.ApiRuleException;

/**
 * API: bm.elife.recharge.mobile.getItemInfo request
 *
 * @author auto
 * @since 1.0
 */
public class BmRechargeMobileGetItemInfoRequest implements QianmiRequest<BmRechargeMobileGetItemInfoResponse> {

    private Map<String, String> headerMap = new QianmiHashMap();
	private QianmiHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	 * 手机号码
	 */
	private String mobileNo;

	/** 
	 * 充值面额
	 */
	private String rechargeAmount;

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getMobileNo() {
		return this.mobileNo;
	}

	public void setRechargeAmount(String rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}
	public String getRechargeAmount() {
		return this.rechargeAmount;
	}

    public Long getTimestamp() {
    	return this.timestamp;
    }
    public void setTimestamp(Long timestamp) {
    	this.timestamp = timestamp;
    }

	public String getApiMethodName() {
		return "bm.elife.recharge.mobile.getItemInfo";
	}

	public Map<String, String> getTextParams() {
		QianmiHashMap txtParams = new QianmiHashMap();
		txtParams.put("mobileNo", this.mobileNo);
		txtParams.put("rechargeAmount", this.rechargeAmount);
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

	public Class<BmRechargeMobileGetItemInfoResponse> getResponseClass() {
		return BmRechargeMobileGetItemInfoResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(mobileNo, "mobileNo");
		RequestCheckUtils.checkNotEmpty(rechargeAmount, "rechargeAmount");
    }

	public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}