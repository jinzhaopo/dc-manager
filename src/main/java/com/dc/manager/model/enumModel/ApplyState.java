package com.dc.manager.model.enumModel;

import java.util.HashMap;
import java.util.Map;

public enum ApplyState {

	NO_DEAL(1), // 审核未处理
	VERIFY_NO_PASS(2), // 审核未通过
	VERIFY_PASS(3);// 审核通过

	private Integer key;

	private ApplyState(Integer key) {
		this.key = key;
	}

	public Integer getKey() {
		return key;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

    static{	
    	Map<Integer,String> map=new HashMap<Integer,String>();
    	map.put(NO_DEAL.getKey(), "审核未处理");
    	map.put(VERIFY_NO_PASS.getKey(), "审核未通过");
    	map.put(VERIFY_PASS.getKey(), "审核通过");
    }
}
