package com.qianmi.open.api.response;

import java.util.List;
import com.qianmi.open.api.tool.mapping.ApiField;
import com.qianmi.open.api.tool.mapping.ApiListField;
import com.qianmi.open.api.domain.elife.ItemProp;

import com.qianmi.open.api.QianmiResponse;

/**
 * API: qianmi.elife.units.list response.
 *
 * @author auto
 * @since 2.0
 */
public class UnitsListResponse extends QianmiResponse {

	private static final long serialVersionUID = 1L;

	/** 
	 * 缴费单位属性集合
	 */
	@ApiListField("itemProps")
	@ApiField("itemProp")
	private List<ItemProp> itemProps;

	public void setItemProps(List<ItemProp> itemProps) {
		this.itemProps = itemProps;
	}
	public List<ItemProp> getItemProps( ) {
		return this.itemProps;
	}

}
