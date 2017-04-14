package com.dc.manager.model.enumModel;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @ClassName: TouristSource
 * @Description: 游客来源
 * @author: zhaopo
 * @date: 2016年11月3日 上午9:35:46
 */
public enum TouristSource {

//	ONLINE(1, "线上注册"), // 线上注册
//	OFFLINE(2, "线下录入"), // 线下录入
//	TRAVEL_AGNECY_COOPERATION(3, "旅行社合作");// 旅行社合作

	ONLINE(1), // 线上注册
	OFFLINE(2), // 线下录入
	TRAVEL_AGNECY_COOPERATION(3);// 旅行社合作
	
	private Integer key;

	private TouristSource(Integer key) {
		this.key = key;
	}

	public Integer getKey() {
		return key;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

	public static Map<Integer,String> getTouristSourceMap(){	
		 Map<Integer,String> map=new LinkedHashMap<Integer, String>(3);
		 map.put(ONLINE.getKey(), "线上注册");
		 map.put(OFFLINE.getKey(), "线下录入");
		 map.put(TRAVEL_AGNECY_COOPERATION.getKey(), "旅行社合作");
		 return map;
	}
}
