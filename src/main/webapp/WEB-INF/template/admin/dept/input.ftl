<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<#include "/admin/include/head.htm">
<script type="text/javascript">
	//删除景区
	function deleteDept(){
		LG.ajax({
			url: "delete.jhtml",
			data: {"id": $("#dept_id").val()},
			success: function(result){
				LG.showSuccess("删除景区成功!");
				window.parent.leftFrame.removeNode(result.id);
				if(result.parentId){
					window.location.href="add.jhtml?dept_id=" + result.upDeptId;
				}else{
					window.location.href="add.jhtml";
				}				
			},			
             error: function (message) {
                  LG.showError(message);
              }
		});
	}
	
	//添加景区
	function add(){
		LG.submitForm($("#childForm"), function(data){
			window.parent.leftFrame.addNode(data, false);
			LG.showSuccess("添加景区成功!");
			$("#childForm").clearForm();
		});
	}
	
	//编辑景区
	function edit(){
		LG.submitForm($("#currentDept"), function(data){
			window.parent.leftFrame.updateNode(data);
			LG.showSuccess("修改景区成功!");
			$("#currentDept").clearForm();
		});
	}
</script>
</head>
<#if s_dept??>
	<#assign isAdd = true />
<#else>
	<#assign isEdit = true /> 
</#if>
<body>
<div class="body-box">
<#if isAdd??>
	<div class="currentDept">
		<div class="table_title">
			<img src="${base}/resource/images/communication.gif" />
			<span>修改景区信息 </span>
		</div>
		<form action="update.jhtml" method="post" id="currentDept" class="validate">
			<table class="table">
				<tr>
					<th>上级景区:</th>
					<td>
						<#if s_dept.upDeptId??>
							<@rbac method="getDept" param="{id:"+s_dept.upDeptId+"}">
								<#if tag_bean??>
									${(tag_bean.name)!''}
								</#if>
							</@rbac >
						<#else>
							${(s_dept.genRoot().name)!''}
						</#if>
					</td>
				</tr>
				<tr>
					<th>景区编码:</th>
					<td><input type="text" class="formText {required: true,remote: 'checkCode.jhtml?oldValue=${(s_dept.code)!''}',maxlength:12, minlength:2, messages:{remote: '景区编号不能重复!'}}" 
						name="code" value="${(s_dept.code)!''}"/></td>
				</tr>
				<tr>
					<th>景区名称:</th>
					<td><input type="text" class="formText {required: true,maxlength:12,minlength:2}" value="${(s_dept.name)!''}" 
						name="name"/>
						<input type="hidden" name="id" value="${(s_dept.id)!''}" id="dept_id"/>	
					</td>
				</tr>
				<tr>
					<th>景区地址:</th>
					<td><input type="text" class="formText {required: true}" value="${(s_dept.address)!''}" name="address"/></td>
				</tr>
				<tr>
					<th>联系人:</th>
					<td><input type="text" class="formText {maxlength:12,minlength:2}" value="${(s_dept.linkName)!''}" name="linkName"/></td>
				</tr>
				<tr>
					<th>联系电话:</th>
					<td><input type="text" class="formText {digits:true}" value="${(s_dept.linkPhone)!''}" name="linkPhone"/></td>
				</tr>
				<tr>
					<th>排序:</th>
					<td><input type="text" class="formText {digits:true}" value="${(s_dept.priority)!''}" name="priority"/></td>
				</tr>
				<tr>
					<th></th>
					<td>
						<input type="button" class="button" value="保存" onclick="edit();"/>
						<input type="button" class="button" value="删除" onclick="deleteDept();"/>
					</td>
				</tr>
			</table>
		</form>
	</div>
</#if>

<div class="childChild">
	<div class="table_title">
		<img src="${base}/resource/images/communication.gif" />
		<span>添加下属景区 </span>
	</div>
	<form action="add.jhtml" method="post" id="childForm" class="validate">
		<#if s_dept?? && s_dept.id??>
			<input type="hidden" name="upDeptId" value="${(s_dept.id)!''}"/>
		</#if>
		
		<table class="table">
			<tr>
				<th>景区编码:</th>
				<td><input type="text" class="formText {required: true,remote: 'checkCode.jhtml?oldValue=${(s_dept.code)!''}', maxlength:12, minlength:2, messages:{remote: '景区编号不能重复!'}}" 
					name="code" value="${(s_dept.code)!'001'}"/></td>
			</tr>
			<tr>
				<th>景区名称:</th>
				<td><input type="text" class="formText {required: true,maxlength:12,minlength:2}" name="name"/></td>
			</tr>
				<tr>
					<th>景区地址:</th>
					<td><input type="text" class="formText {required: true}" value="" name="address"/></td>
				</tr>
			<tr>
				<th>联系人:</th>
				<td><input type="text" class="formText {maxlength:12,minlength:2}" value="" name="linkName"/></td>
			</tr>
			<tr>
				<th>联系电话:</th>
				<td><input type="text" class="formText  {digits:true}" value="" name="linkPhone"/></td>
			</tr>
			<tr>
				<th>排序:</th>
				<td><input type="text" class="formText  {digits:true}" value="" name="priority"/></td>
			</tr>
			<tr>
				<th></th>
				<td><input type="button" class="button" value="添加" onclick="add();"/></td>
			</tr>
		</table>
	</form>
</div>
</div>
</body>
</html>