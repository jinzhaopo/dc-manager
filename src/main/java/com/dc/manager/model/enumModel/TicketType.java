package com.dc.manager.model.enumModel;

/**
 * 
 * @ClassName: TicketType
 * @Description: 套餐类型
 * @author: zhaopo
 * @date: 2016年11月25日 上午9:10:36
 */
public enum TicketType {
	ANNUAL("年票联票"),MONTH("月票"),SEASON("季票");

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private TicketType(String name) {
		this.name = name;
	}

	private TicketType() {
	}

}
