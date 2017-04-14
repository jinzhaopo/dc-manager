<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>list</title>
<#include "/admin/include/head.htm">
<script type="text/javascript">
    var grid;
	/**
	 * 新增员工
	 */
	function addEmployee(){
		top.f_addTab(null, '新增员工', base + '/admin/employee/add.jhtml');
	}
	
    $(function () {
        grid = $("#maingrid").ligerGrid({
            columns: [
			{name: 'id', hide: true, width:0, isAllowHide: false},
			{display: '姓名', name: 'realName', align: 'left', width: 120 },
			{display: '电话', name: 'phone', align: 'left', minWidth: 60 },
            {display: '身份证', name: 'idCard', align: 'left', width: 150 },
            {display: '地址', name: 'address', align: 'left', width: 250 },
            {display: '性别', name: 'sex', align: 'left', width: 50 },
			{display: '是否禁用', name: 'isAccountEnabled', align: 'center', dict:'common', width: 60 },
			{display: '是否能够审核游客资质', name: 'isReview', align: 'center', dict:'common', width: 120 },
			{display: '是否锁定', name: 'isAccountLocked', align: 'center', dict:'common', width: 60 }
			],  pageSize:20, url: '${base}/admin/employee/queryData.jhtml',
			toolbar: {}, width: '100%', height:'100%', enabledSort: true
        });
        $("#pageloading").hide();
		LG.loadToolbar(grid);
		
		//绑定搜索按钮
		LG.search(grid);
    });
	
	function f_delete() {
		var selected = grid.getSelected();
      	if (selected) {
          	LG.ajax({
              	url: base + '/admin/employee/delete.jhtml',
              	loading: '正在删除中...',
              	data: { ids: selected.id },
              	success: function () {
                  	LG.showSuccess('删除成功');
                  	f_reload();
              	},
              	error: function (message) {
                  	LG.showError(message);
              	}
          	});
      	} else {
          	LG.tip('请选择行!');
      	}
  	}
  	
  	function f_cleanLock() {
		var selected = grid.getSelected();
      	if (selected) {
          	LG.ajax({
              	url: base + '/admin/employee/cleanLock.jhtml',
              	loading: '正在解锁中...',
              	data: { ids: selected.id },
              	success: function () {
                  	LG.showSuccess('解锁成功');
                  	f_reload();
              	},
              	error: function (message) {
                  	LG.showError(message);
              	}
          	});
      	} else {
          	LG.tip('请选择行!');
      	}
  	}
  	
  	function f_resetPassword() {
		var selected = grid.getSelected();
      	if (selected) {
          	LG.ajax({
              	url: base + '/admin/employee/resetPassword.jhtml',
              	loading: '正在重置密码中...',
              	data: { ids: selected.id },
              	success: function () {
                  	LG.showSuccess('密码重置成功');
                  	f_reload();
              	},
              	error: function (message) {
                  	LG.showError(message);
              	}
          	});
      	} else {
          	LG.tip('请选择行!');
      	}
  	}
</script>
</head>
<body style="padding:10px; overflow:hidden;">
	<div id="functions">
		<div class="clearfix">
			<div style="float:left;">
				<span id="searchDefault">
					电话号码:<input type="text" class="formText" name="search_EQ_phnoe"/>
				</span>
				<input type="button" id="search" class="button" value="搜索"/>
				<a href="#" id="search_btn_reset" face="Wingdings 3">解除搜索,显示全部数据</a>
			</div>
		</div>
	</div>
	<div id="maingrid" style="margin:0; padding:0"></div>
</body>
</html>