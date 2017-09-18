package com.qianmi.open.api.response;

import java.util.List;
import com.qianmi.open.api.tool.mapping.ApiField;
import com.qianmi.open.api.tool.mapping.ApiListField;
import com.qianmi.open.api.domain.elife.MobileItemInfo;

import com.qianmi.open.api.QianmiResponse;

/**
 * API: qianmi.elife.recharge.mobile.getItemList response.
 *
 * @author auto
 * @since 2.0
 */
public class RechargeMobileGetItemListResponse extends QianmiResponse {

	private static final long serialVersionUID = 1L;

	/** 
	 * 话费商品信息
	 */
	@ApiListField("mobileItems")
	@ApiField("mobileItem")
	private List<MobileItemInfo> mobileItems;

	public void setMobileItems(List<MobileItemInfo> mobileItems) {
		this.mobileItems = mobileItems;
	}
	public List<MobileItemInfo> getMobileItems( ) {
		return this.mobileItems;
	}

}
