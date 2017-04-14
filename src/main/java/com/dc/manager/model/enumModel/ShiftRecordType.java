package com.dc.manager.model.enumModel;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @ClassName: ShiftRecordType
 * @Description: 交班状态
 * @author: zhaopo
 * @date: 2017年1月17日 下午3:26:14
 */
@XmlRootElement(name = "shiftRecordType")
public enum ShiftRecordType {
	submit("交班提交"), succeed("交班成功");

	private String name;

	private ShiftRecordType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
