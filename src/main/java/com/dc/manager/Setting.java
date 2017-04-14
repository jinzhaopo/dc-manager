package com.dc.manager;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @ClassName: Setting
 * @Description: 系统配置类
 * @author: zhaopo
 * @date: 2016年11月4日 上午9:07:41
 */
public class Setting implements Serializable {

	private static final long serialVersionUID = 5539786245179492300L;
	public static final String CACHE_NAME = "setting";
	public static final Integer CACHE_KEY = 0;

	/** 网站名称 **/
	private String name;

	/** 系统cookie识别码 **/
	private String cookie_key;

	/** Cookie路径 **/
	private String cookiePath;

	/** Cookie作用域 **/
	private String cookieDomain;
	/**
	 * 年票过期时间
	 */
	private int expirationTime;
	/**
	 * 检票过期时间
	 */
	private int checkInTime;

	/**
	 * 丽水市缙云县身份证前6位号码
	 */
	private String licenceNumberVerify;// "331122,332526";

	// ====================各种价格=====================

	private BigDecimal priceOfAnnualTicket;

	/**
	 * 年票过期时间间隔
	 */
	private int yearTicketTimeLength;

	// ===========定时器==================
	/**
	 * 更新会员的触发器
	 */
	private String updateTouristTrigger;

	// =============短信配置==============
	private String smsUserName;

	private String smsPassword;

	private String smsApikey;

	private String applySmsMessageInfo;// 审核通过短信通知

	private String noApplySmsMessageInfo;// 审核不通过短信通知

	public String getSmsUserName() {
		return smsUserName;
	}

	public void setSmsUserName(String smsUserName) {
		this.smsUserName = smsUserName;
	}

	public String getSmsPassword() {
		return smsPassword;
	}

	public void setSmsPassword(String smsPassword) {
		this.smsPassword = smsPassword;
	}

	public String getSmsApikey() {
		return smsApikey;
	}

	public void setSmsApikey(String smsApikey) {
		this.smsApikey = smsApikey;
	}

	public String getUpdateTouristTrigger() {
		return updateTouristTrigger;
	}

	public void setUpdateTouristTrigger(String updateTouristTrigger) {
		this.updateTouristTrigger = updateTouristTrigger;
	}

	public String getLicenceNumberVerify() {
		return licenceNumberVerify;
	}

	public void setLicenceNumberVerify(String licenceNumberVerify) {
		this.licenceNumberVerify = licenceNumberVerify;
	}

	public int getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(int checkInTime) {
		this.checkInTime = checkInTime;
	}

	public BigDecimal getPriceOfAnnualTicket() {
		return priceOfAnnualTicket;
	}

	public void setPriceOfAnnualTicket(BigDecimal priceOfAnnualTicket) {
		this.priceOfAnnualTicket = priceOfAnnualTicket;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCookie_key() {
		return cookie_key;
	}

	public void setCookie_key(String cookie_key) {
		this.cookie_key = cookie_key;
	}

	public String getCookiePath() {
		return cookiePath;
	}

	public void setCookiePath(String cookiePath) {
		this.cookiePath = cookiePath;
	}

	public String getCookieDomain() {
		return cookieDomain;
	}

	public void setCookieDomain(String cookieDomain) {
		this.cookieDomain = cookieDomain;
	}

	public int getExpirationTime() {
		return expirationTime;
	}

	public void setExpirationTime(int expirationTime) {
		this.expirationTime = expirationTime;
	}

	public int getYearTicketTimeLength() {
		return yearTicketTimeLength;
	}

	public void setYearTicketTimeLength(int yearTicketTimeLength) {
		this.yearTicketTimeLength = yearTicketTimeLength;
	}

	public String getApplySmsMessageInfo() {
		return applySmsMessageInfo;
	}

	public void setApplySmsMessageInfo(String applySmsMessageInfo) {
		this.applySmsMessageInfo = applySmsMessageInfo;
	}

	public String getNoApplySmsMessageInfo() {
		return noApplySmsMessageInfo;
	}

	public void setNoApplySmsMessageInfo(String noApplySmsMessageInfo) {
		this.noApplySmsMessageInfo = noApplySmsMessageInfo;
	}

}
