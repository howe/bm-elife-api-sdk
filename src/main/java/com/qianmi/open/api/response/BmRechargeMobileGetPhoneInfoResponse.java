package com.qianmi.open.api.response;

import com.qianmi.open.api.tool.mapping.ApiField;
import com.qianmi.open.api.domain.elife.PhoneInfo;

import com.qianmi.open.api.QianmiResponse;

/**
 * API: bm.elife.recharge.mobile.getPhoneInfo response.
 *
 * @author auto
 * @since 2.0
 */
public class BmRechargeMobileGetPhoneInfoResponse extends QianmiResponse {

	private static final long serialVersionUID = 1L;

	/** 
	 * 手机或固话详情 （包含余额）
	 */
	@ApiField("phoneInfo")
	private PhoneInfo phoneInfo;

	public void setPhoneInfo(PhoneInfo phoneInfo) {
		this.phoneInfo = phoneInfo;
	}
	public PhoneInfo getPhoneInfo( ) {
		return this.phoneInfo;
	}

}
