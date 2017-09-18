package com.qianmi.open.api.request;

import com.qianmi.open.api.tool.util.RequestCheckUtils;
import java.util.Map;

import com.qianmi.open.api.QianmiRequest;
import com.qianmi.open.api.tool.util.QianmiHashMap;
import com.qianmi.open.api.response.GasCardGetAccountInfoResponse;
import com.qianmi.open.api.ApiRuleException;

/**
 * API: qianmi.elife.gasCard.getAccountInfo request
 *
 * @author auto
 * @since 1.0
 */
public class GasCardGetAccountInfoRequest implements QianmiRequest<GasCardGetAccountInfoResponse> {

    private Map<String, String> headerMap = new QianmiHashMap();
	private QianmiHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	 * 加油卡帐号
	 */
	private String gasCardNo;

	/** 
	 * 加油卡帐号所属供应商sinopec或者cnpc
	 */
	private String operator;

	/** 
	 * 加油卡所属地
	 */
	private String province;

	public void setGasCardNo(String gasCardNo) {
		this.gasCardNo = gasCardNo;
	}
	public String getGasCardNo() {
		return this.gasCardNo;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getOperator() {
		return this.operator;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	public String getProvince() {
		return this.province;
	}

    public Long getTimestamp() {
    	return this.timestamp;
    }
    public void setTimestamp(Long timestamp) {
    	this.timestamp = timestamp;
    }

	public String getApiMethodName() {
		return "qianmi.elife.gasCard.getAccountInfo";
	}

	public Map<String, String> getTextParams() {
		QianmiHashMap txtParams = new QianmiHashMap();
		txtParams.put("gasCardNo", this.gasCardNo);
		txtParams.put("operator", this.operator);
		txtParams.put("province", this.province);
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

	public Class<GasCardGetAccountInfoResponse> getResponseClass() {
		return GasCardGetAccountInfoResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(gasCardNo, "gasCardNo");
		RequestCheckUtils.checkNotEmpty(operator, "operator");
    }

	public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}