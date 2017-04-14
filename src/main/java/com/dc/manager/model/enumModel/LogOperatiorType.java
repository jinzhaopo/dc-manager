package com.dc.manager.model.enumModel;

/**
 * 
 * @ClassName: LogOperatiorType
 * @Description: 日志操作类型
 * @author: zhaopo
 * @date: 2016年12月1日 上午10:05:08
 */
public enum LogOperatiorType {
	sale_add_tourist("线下售票添加游客"), sale_bind_np("线下售票绑定年票资质"), sale_sale_np("线下年票销售"), sale_tourist_importExcel("线下EXCEL游客导入"),
	sale_audit_np("微信游客年票资质审核"), submit_shift("提交交班信息"),success_shift("交班成功");
	private String name;

	public String getName() {
		return name;
	}

	private LogOperatiorType() {
	}

	private LogOperatiorType(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
