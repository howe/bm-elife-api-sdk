package com.qianmi.open.api.request;

import com.qianmi.open.api.tool.util.RequestCheckUtils;
import java.util.Map;

import com.qianmi.open.api.QianmiRequest;
import com.qianmi.open.api.tool.util.QianmiHashMap;
import com.qianmi.open.api.response.GameClassesListResponse;
import com.qianmi.open.api.ApiRuleException;

/**
 * API: qianmi.elife.game.classes.list request
 *
 * @author auto
 * @since 1.0
 */
public class GameClassesListRequest implements QianmiRequest<GameClassesListResponse> {

    private Map<String, String> headerMap = new QianmiHashMap();
	private QianmiHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	 * 充值类型 1:直充 2:卡密
	 */
	private String chargeType;

	/** 
	 * 游戏名称V编号
	 */
	private String gameId;

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}
	public String getChargeType() {
		return this.chargeType;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}
	public String getGameId() {
		return this.gameId;
	}

    public Long getTimestamp() {
    	return this.timestamp;
    }
    public void setTimestamp(Long timestamp) {
    	this.timestamp = timestamp;
    }

	public String getApiMethodName() {
		return "qianmi.elife.game.classes.list";
	}

	public Map<String, String> getTextParams() {
		QianmiHashMap txtParams = new QianmiHashMap();
		txtParams.put("chargeType", this.chargeType);
		txtParams.put("gameId", this.gameId);
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

	public Class<GameClassesListResponse> getResponseClass() {
		return GameClassesListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(gameId, "gameId");
    }

	public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}