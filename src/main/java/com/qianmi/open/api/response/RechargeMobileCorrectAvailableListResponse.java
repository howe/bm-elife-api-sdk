package com.qianmi.open.api.response;

import java.util.List;
import com.qianmi.open.api.tool.mapping.ApiField;
import com.qianmi.open.api.tool.mapping.ApiListField;
import com.qianmi.open.api.domain.elife.CorrectAvailableOrder;

import com.qianmi.open.api.QianmiResponse;

/**
 * API: qianmi.elife.recharge.mobile.correct.available.list response.
 *
 * @author auto
 * @since 2.0
 */
public class RechargeMobileCorrectAvailableListResponse extends QianmiResponse {

	private static final long serialVersionUID = 1L;

	/** 
	 * 可充值订单列表
	 */
	@ApiListField("correctAvailableOrders")
	@ApiField("correctAvailableOrder")
	private List<CorrectAvailableOrder> correctAvailableOrders;

	public void setCorrectAvailableOrders(List<CorrectAvailableOrder> correctAvailableOrders) {
		this.correctAvailableOrders = correctAvailableOrders;
	}
	public List<CorrectAvailableOrder> getCorrectAvailableOrders( ) {
		return this.correctAvailableOrders;
	}

}
