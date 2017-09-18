package com.qianmi.open.api.response;

import com.qianmi.open.api.tool.mapping.ApiField;
import com.qianmi.open.api.domain.elife.GasCardInfo;

import com.qianmi.open.api.QianmiResponse;

/**
 * API: bm.elife.gasCard.getAccountInfo response.
 *
 * @author auto
 * @since 2.0
 */
public class BmGasCardGetAccountInfoResponse extends QianmiResponse {

	private static final long serialVersionUID = 1L;

	/** 
	 * 加油卡查询 （姓名，状态）
	 */
	@ApiField("gasCardInfo")
	private GasCardInfo gasCardInfo;

	public void setGasCardInfo(GasCardInfo gasCardInfo) {
		this.gasCardInfo = gasCardInfo;
	}
	public GasCardInfo getGasCardInfo( ) {
		return this.gasCardInfo;
	}

}
