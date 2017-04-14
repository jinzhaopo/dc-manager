package com.dc.manager.model.manager;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.yundao.tour.util.SettingUtils;

import framework.model.PriorityEntity;

/**
 * 
 * @ClassName: Dept
 * @Description: 景区管理
 * @author: zhaopo
 * @date: 2016年11月21日 下午3:19:18
 */
@Table(name = "s_dept")
public class Dept extends PriorityEntity {

	private static final long serialVersionUID = -8067263249902296614L;
	/**
	 * 景区名称
	 */
	private String name;
	/**
	 * 地址
	 */
	private String address;
	/**
	 * 编码
	 */
	private String code;
	/**
	 * 联系人
	 */
	@Column(name = "link_name")
	private String linkName;
	/**
	 * 联系人电话
	 */
	@Column(name = "link_phone")
	private String linkPhone;
	/**
	 * 描述
	 */
	private String description;

	/**** 关联关系 ***/
	@Column(name = "up_dept_id")
	/**
	 * 上级景区
	 */
	private Long upDeptId;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLinkName() {
		return linkName;
	}

	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}

	public String getLinkPhone() {
		return linkPhone;
	}

	public void setLinkPhone(String linkPhone) {
		this.linkPhone = linkPhone;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getUpDeptId() {
		return upDeptId;
	}

	public void setUpDeptId(Long upDeptId) {
		this.upDeptId = upDeptId;
	}

	@Transient
	public Dept genRoot() {
		Dept rootDept = new Dept();
		rootDept.setName(SettingUtils.get().getName());
		return rootDept;
	}

	@Transient
	public Long getParentId() {
		return upDeptId;
	}

}
