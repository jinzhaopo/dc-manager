package com.dc.manager.model.enumModel;

/**
 * 
 * @ClassName: SexType
 * @Description: 男女
 * @author: zhaopo
 * @date: 2016年11月23日 下午4:23:06
 */
public enum SexType {
	MAN("男"), WOMAN("女");

	private SexType(String name) {
		this.name = name;
	}

	private SexType() {
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
