package com.dc.manager.model.enumModel;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @ClassName: TransactionRecordType
 * @Description: 交易记录的类型
 * @author: zhaopo
 * @date: 2016年12月7日 下午8:00:36
 */
public enum TransactionRecordType {
	OfflineBuyNp("线下年票销售"), OnLineBuyNp("线上年票销售"),OffLineExcel("线下Excel导入"),Renew("续费");

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private TransactionRecordType(String name) {
		this.name = name;
	}

	private TransactionRecordType() {
	}

	public static Map<String,String> getTransactionRecordTypeMap(){
		Map<String,String> map=new HashMap<String, String>();
		map.put("OfflineBuyNp", "线下年票销售");
		map.put("OnLineBuyNp", "线上年票销售");
		map.put("OffLineExcel", "线下Excel导入");
		map.put("Renew", "续费");
		return map;
	}
}
