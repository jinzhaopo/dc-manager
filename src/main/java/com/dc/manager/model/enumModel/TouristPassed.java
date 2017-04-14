package com.dc.manager.model.enumModel;

/**
 * 
 * @ClassName: TouristSource
 * @Description: 游客审核状态
 * @author: zhaopo
 * @date: 2016年11月3日 上午9:35:46
 */
public enum TouristPassed {

	NORMAL(1), // 正常
	NO_NORMAL(2),//不正常
	NO_DEAL(3), // 审核未处理
	VERIFY_NO_PASS(4), // 审核不通过
	VERIFY_PASS(5);// 审核通过

	private Integer key;

	private TouristPassed(Integer key) {
		this.key = key;
	}

	public Integer getKey() {
		return key;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

}
