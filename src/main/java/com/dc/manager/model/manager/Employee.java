package com.dc.manager.model.manager;

import java.beans.Transient;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

import com.dc.manager.model.enumModel.SexType;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;

import framework.model.PriorityEntity;

/**
 * 
 * @ClassName: Employee
 * @Description: 员工
 * @author: zhaopo
 * @date: 2016年11月23日 下午4:12:48
 */
@Table(name = "s_manager_employee")
public class Employee extends PriorityEntity {

	private static final long serialVersionUID = -8415367731446767581L;
	/**
	 * 真实姓名
	 */
	@Column(name = "real_name")
	private String realName;
	/**
	 * 省份证
	 */
	@Column(name = "id_card")
	private String idCard;
	/**
	 * 电话
	 */
	private String phone;
	/**
	 * 密码 默认值是123456
	 */
	private String password;
	/**
	 * 地址
	 */
	private String address;
	/**
	 * 入职时间
	 */
	@Column(name = "in_date")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	@XmlTransient
	private Date inDate;
	/**
	 * 性别
	 */
	@Column(name = "sex_type")
	private SexType sexType;

	/**
	 * 描述
	 */
	private String description;

	/**
	 * 是否禁止账号登陆
	 */
	@Column(name = "is_account_enabled")
	private Boolean isAccountEnabled;

	// -----------2016/11/28-------------
	/**
	 * 上次登录时间
	 */
	@Column(name = "last_login_time")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	@XmlTransient
	private Date lastLoginTime; // 上次登录时间
	/**
	 * 上次登录的IP
	 */
	@Column(name = "last_login_ip")
	private String lastLoginIp;

	/**
	 * 账号锁定日期
	 */
	@Column(name = "locked_date")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	@XmlTransient
	private Date lockedDate;
	/**
	 * 是否锁定
	 */
	@Column(name = "is_account_locked")
	private Boolean isAccountLocked;// 账号是否锁定
	/**
	 * 登录失败次数
	 */
	@Column(name = "login_failure_count")
	private Integer loginFailureCount;

	// -----------2016/11/28-------------

	/****** 关联关系 *****/
	/**
	 * 用户的id
	 */
	@Column(name = "user_id")
	private Long userId;
	/**
	 * 景区id
	 */
	@Column(name = "dept_id")
	private Long deptId;

	// ---------------2016/12/14-----------------
	/**
	 * 是否能够进行审核
	 */
	@Column(name = "is_review")
	private Boolean isReview;

	// ---------------2017/1/16-------------------
	/**
	 * 是否能够进行折扣的处理
	 */
	@Column(name = "is_discount")
	private Boolean isDiscount;

	// ------------2017/2/17-----------
	/**
	 * 是否不理会交班规则
	 */
	@Column(name = "is_login_shift")
	private Boolean isLoginShift;

	public Boolean getIsLoginShift() {
		return isLoginShift;
	}

	public void setIsLoginShift(Boolean isLoginShift) {
		this.isLoginShift = isLoginShift;
	}

	public Boolean getIsDiscount() {
		return isDiscount;
	}

	public void setIsDiscount(Boolean isDiscount) {
		this.isDiscount = isDiscount;
	}

	public Boolean getIsReview() {
		return isReview;
	}

	public void setIsReview(Boolean isReview) {
		this.isReview = isReview;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsAccountLocked() {
		return isAccountLocked;
	}

	public void setIsAccountLocked(Boolean isAccountLocked) {
		this.isAccountLocked = isAccountLocked;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public Date getLockedDate() {
		return lockedDate;
	}

	public void setLockedDate(Date lockedDate) {
		this.lockedDate = lockedDate;
	}

	public Integer getLoginFailureCount() {
		return loginFailureCount;
	}

	public void setLoginFailureCount(Integer loginFailureCount) {
		this.loginFailureCount = loginFailureCount;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getInDate() {
		return inDate;
	}

	public void setInDate(Date inDate) {
		this.inDate = inDate;
	}

	public SexType getSexType() {
		return sexType;
	}

	public void setSexType(SexType sexType) {
		this.sexType = sexType;
	}

	public Boolean getIsAccountEnabled() {
		return isAccountEnabled;
	}

	public void setIsAccountEnabled(Boolean isAccountEnabled) {
		this.isAccountEnabled = isAccountEnabled;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@JsonIgnore
	@Transient
	public String getSex() {
		return getSexType().getName();
	}

	@JsonIgnore
	@Transient
	public String getName() {
		return realName;
	}

}
