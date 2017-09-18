package com.qianmi.open.api.response;

import com.qianmi.open.api.tool.mapping.ApiField;
import com.qianmi.open.api.domain.elife.OrderDetailInfo;

import com.qianmi.open.api.QianmiResponse;

/**
 * API: bm.elife.recharge.mobile.payBill response.
 *
 * @author auto
 * @since 2.0
 */
public class BmRechargeMobilePayBillResponse extends QianmiResponse {

	private static final long serialVersionUID = 1L;

	/** 
	 * 订单详情-用于展示订单详情
	 */
	@ApiField("orderDetailInfo")
	private OrderDetailInfo orderDetailInfo;

	public void setOrderDetailInfo(OrderDetailInfo orderDetailInfo) {
		this.orderDetailInfo = orderDetailInfo;
	}
	public OrderDetailInfo getOrderDetailInfo( ) {
		return this.orderDetailInfo;
	}

}
