package com.qianmi.open.api.response;

import com.qianmi.open.api.tool.mapping.ApiField;
import com.qianmi.open.api.domain.elife.AcctInfo;

import com.qianmi.open.api.QianmiResponse;

/**
 * API: bm.elife.finance.getAcctInfo response.
 *
 * @author auto
 * @since 2.0
 */
public class BmFinanceGetAcctInfoResponse extends QianmiResponse {

	private static final long serialVersionUID = 1L;

	/** 
	 * 账户信息
	 */
	@ApiField("acctInfo")
	private AcctInfo acctInfo;

	public void setAcctInfo(AcctInfo acctInfo) {
		this.acctInfo = acctInfo;
	}
	public AcctInfo getAcctInfo( ) {
		return this.acctInfo;
	}

}
