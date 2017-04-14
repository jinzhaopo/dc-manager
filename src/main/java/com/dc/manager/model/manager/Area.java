package com.dc.manager.model.manager;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;

import framework.model.PriorityEntity;
import framework.util.StringUtil;

/**
 * 
 * @ClassName: Area
 * @Description: 地区
 * @author: zhaopo
 * @date: 2016年11月10日 上午10:56:51
 */
@Table(name = "s_area")
public class Area extends PriorityEntity {

	private static final long serialVersionUID = 4435404405958111308L;
	public static final String PATH_SEPARATOR = ",";// 树路径分隔符

	/**
	 * 地区名称
	 */
	private String name;
	/**
	 * 树路径
	 */
	private String path;
	/**
	 * 全路径
	 */
	@Column(name="full_name")
	private String fullName;
	/**
	 * 上级地区id
	 */
	@Column(name="parent_id")
	private Long parentId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Transient
	public String getAreaPath(){
		String areaPath = path;
		if(StringUtil.getNullStr(areaPath).indexOf(",") == 0) {
			areaPath = areaPath.substring(1, areaPath.length());
		}
		if(StringUtil.getNullStr(areaPath).lastIndexOf(",") >= 0 
				&& StringUtil.getNullStr(areaPath).lastIndexOf(",") == areaPath.length() - 1) {
			areaPath = areaPath.substring(0, areaPath.length() - 1);
		}
		return areaPath;
	}
	
	// 获取分类层级（顶级分类：0）
	@Transient
	public Integer getLevel() {
		return path.split(PATH_SEPARATOR).length - 1;
	}
	
}
