package com.dc.manager.model.enumModel;

/**
 * 
 * @ClassName: DiscountType
 * @Description: 折扣类型
 * @author: zhaopo
 * @date: 2017年1月16日 下午3:10:53
 */
public enum DiscountType {
	free("0"), oneFold("1"), twoFold("2"), threeFold("3"), fourFold("4"), fiveFold("5"), sixFold("6"), sevenFold("7"), eightFold("8"), nineFold("9"), allFold("100");

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private DiscountType() {
	}

	private DiscountType(String name) {
		this.name = name;
	}
}
