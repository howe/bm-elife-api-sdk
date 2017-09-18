package com.qianmi.open.api.response;

import com.qianmi.open.api.tool.mapping.ApiField;
import com.qianmi.open.api.domain.elife.TicketTrade;

import com.qianmi.open.api.QianmiResponse;

/**
 * API: qianmi.elife.train.order.create response.
 *
 * @author auto
 * @since 2.0
 */
public class TrainOrderCreateResponse extends QianmiResponse {

	private static final long serialVersionUID = 1L;

	/** 
	 * 预订火车票返回对象
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
