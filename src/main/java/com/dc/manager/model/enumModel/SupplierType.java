package com.dc.manager.model.enumModel;

/**
 * 
 * @ClassName: SupplierType
 * @Description: 商家类型
 * @author: zhaopo
 * @date: 2016年11月24日 下午1:28:24
 */
public enum SupplierType {
	TheTravelAgency("旅行社"), WeChatPublicNo("微信公众号");
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private SupplierType() {
	}

	private SupplierType(String name) {
		this.name = name;
	}

}
