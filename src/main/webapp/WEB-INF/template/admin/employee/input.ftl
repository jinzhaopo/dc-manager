<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>list</title>
<#include "/admin/include/head.htm">
<script type="text/javascript">
	$(function(){
		var mainform = $("#mainform");  
		//表单底部按钮 
    	LG.setFormDefaultBtn(f_cancel, function(){
			f_save(mainform, "employee_no");
		});
	});
	function selectDept(){
		$.ligerDialog.open({ url: base + '/admin/dept/tree.jhtml?style=2', height: 400, width: 300, 
		buttons: [{ 
			text: '确定', onclick: function (item, dialog) { 
				var selectNode = dialog.frame.getSelectNode();
				if(!selectNode.id){
					LG.showError("请不要选择根景区!");
					return;
				}
				addRelativeToObject({"dept_id": selectNode.id, "dept_name": selectNode.name});
				dialog.close();
			} 
		},{ text: '取消', onclick: function (item, dialog) { dialog.close(); } }
         ], isResize: true
        });
	}
</script>
</head>
<#if !employee??>
	<#assign isAdd = true />
<#else>
	<#assign isEdit = true />
</#if>
<body scroll="no" style="padding:30px;overflow:hidden;">
<form action="<#if isAdd??>${base}/admin/employee/add.jhtml<#else>${base}/admin/employee/edit.jhtml</#if>" method="post" id="mainform" class="validate">
	<#if !isAdd??>
		<input type="hidden" name="id" value="${(employee.id)!''}"/>
	</#if>
	<table class="table">
		<tr>
			<th>姓名:</th>
			<td><input type="text"class="formText {required: true}" 
				name="realName" value="${(employee.realName)!''}" /></td>
		</tr>
		<tr>
			<th>姓别:</th>
			<td><@u.radio  name="sexType" list={"MAN":"男","WOMAN":"女"}  value="${employee.sexType!'MAN'}"/></td>
		</tr>
		<tr>
			<th>身份证:</th>
			<td>
				<input type="text"class="formText {required: true,minlength: 18, maxlength: 19, digits: true, remote: 'checkIdCard.jhtml?oldValue=${(employee.idCard)!}', messages: {remote: '身份证已经存在!'}}" 
					name="idCard" value="${(employee.idCard)!''}" />
			</td>
		</tr>
		<tr>
			<th>电话号码:</th>
			<td>
				<input type="text"class="formText {phone:true ,required: true, remote: 'checkPhone.jhtml?oldValue=${(employee.phone)!}', messages: {remote: '电话号码已经存在!'}}" 
					name="phone" value="${(employee.phone)!''}" />
			</td>
		</tr>
		<#if !isAdd??>
		<tr>
			<th>密码:</th>
			<td><input type="password" class="formText" name="password" id="password"/></td>
		</tr>
		</#if>
		<tr>
			<th>地址:</th>
			<td>
				<input type="text"class="formText {}" name="address" value="${(employee.address)!''}" />
			</td>
		</tr>
		
		
		<tr>
			<th>是否禁用:</th>
			<td><@u.radio name="isAccountEnabled" list={"false":"启用", "true": "禁用"} 
					value="${(employee.isAccountEnabled?string('true', 'false'))!'true'}"/>
			</td>
		</tr>
		<tr>
			<th>是否过滤交班规则:</th>
			<td><@u.radio name="isLoginShift" list={"false":"不过滤", "true": "过滤"} 
					value="${(employee.isLoginShift?string('true', 'false'))!'true'}"/>
			</td>
		</tr>
		<tr>
			<th>是否能够审核游客资质:</th>
			<td><@u.radio name="isReview" list={"false":"不能", "true": "能"} 
					value="${(employee.isReview?string('true', 'false'))!'false'}"/>
			</td>
		</tr>
		<tr>
			<th>是否能打折:</th>
			<td><@u.radio name="isDiscount" list={"false":"不能", "true": "能"} 
					value="${(employee.isDiscount?string('true', 'false'))!'false'}"/>
			</td>
		</tr>
		<#if !user.deptId??>
		<tr>
			<th>景区:</th>
			<td>
				<input type="text" class="formText {required: true}" id="dept_name" value="${(dept.name)!''}" 
						title="点击后弹出" onfocus="selectDept();" readonly="readonly"/>
				<input type="hidden" id="dept_id" name="deptId" value="${(dept.id)!''}" />
			</td>
		</tr>
		</#if>
		<tr>
			<th>描述</th>
			<td>						<textarea name="description" class="text" style="width:300px;height:56px">${(employee.description)!''}</textarea></td>
		</tr>
	</table>
</form>
</body>
</html>