package com.dc.manager.model.rbac;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.dc.framework.mybatis.model.BaseEntity;
import com.dc.manager.model.enumModel.LogOperatiorType;


/**
 * 
 * @ClassName: Log
 * @Description: 日志表
 * @author: zhaopo
 * @date: 2016年11月3日 上午9:31:22
 */
@Table(name = "s_log")
public class Log extends BaseEntity {

	private static final long serialVersionUID = -5043066433320580904L;
	public static final String LOG_CONTENT_ATTRIBUTE_NAME = (new StringBuilder(Log.class.getName()).append(".CONTENT")).toString();
	/**
	 * 操作
	 */
	private LogOperatiorType operatior;
	/**
	 * 内容
	 */
	private String content;
	/**
	 * 参数(页面显示的时候用)
	 */
	private String parameter;
	/**
	 * 动作url
	 */
	private String operation;
	/**
	 * ip
	 */
	private String ip;
	/**
	 * 操作员 拼接表名称
	 */
	@Column(name = "operate_id")
	private String operateId;
	/**
	 * 操作员名称
	 */
	@Column(name = "operate_name")
	private String operateName;
	/**
	 * 受理的id 有很多的表 所以要拼表名称
	 */
	@Column(name = "accept_id")
	private String acceptId;
	/**
	 * 受理的名称
	 */
	@Column(name = "accept_name")
	private String acceptName;

	public String getAcceptId() {
		return acceptId;
	}

	public void setAcceptId(String acceptId) {
		this.acceptId = acceptId;
	}

	public String getAcceptName() {
		return acceptName;
	}

	public void setAcceptName(String acceptName) {
		this.acceptName = acceptName;
	}

	public LogOperatiorType getOperatior() {
		return operatior;
	}

	public void setOperatior(LogOperatiorType operatior) {
		this.operatior = operatior;
	}

	public String getOperateId() {
		return operateId;
	}

	public void setOperateId(String operateId) {
		this.operateId = operateId;
	}

	public String getOperateName() {
		return operateName;
	}

	public void setOperateName(String operateName) {
		this.operateName = operateName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getParameter() {
		return parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Transient
	public String getOperatiorName() {
		return getOperatior().getName();
	}

}
