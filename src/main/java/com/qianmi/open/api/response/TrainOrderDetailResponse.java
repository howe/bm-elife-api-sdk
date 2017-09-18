package com.qianmi.open.api.response;

import com.qianmi.open.api.tool.mapping.ApiField;
import com.qianmi.open.api.domain.elife.TicketTrade;

import com.qianmi.open.api.QianmiResponse;

/**
 * API: qianmi.elife.train.order.detail response.
 *
 * @author auto
 * @since 2.0
 */
public class TrainOrderDetailResponse extends QianmiResponse {

	private static final long serialVersionUID = 1L;

	/** 
	 * 订单详情，包含子单信息与保险信息
	 */
	@ApiField("ticketTrade")
	private TicketTrade ticketTrade;

	public void setTicketTrade(TicketTrade ticketTrade) {
		this.ticketTrade = ticketTrade;
	}
	public TicketTrade getTicketTrade( ) {
		return this.ticketTrade;
	}

}
