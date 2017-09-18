package com.qianmi.open.api.response;

import com.qianmi.open.api.tool.mapping.ApiField;

import com.qianmi.open.api.QianmiResponse;

/**
 * API: qianmi.elife.air.order.cancel response.
 *
 * @author auto
 * @since 2.0
 */
public class AirOrderCancelResponse extends QianmiResponse {

	private static final long serialVersionUID = 1L;

	/** 
	 * 操作结果 1 成功 0 失败
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
