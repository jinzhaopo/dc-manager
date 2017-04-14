<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>菜单管理</title>
<#include "/admin/include/treeHead.htm">
<script type="text/javascript" src="${base}/resource/js/dept/deptTree${(RequestParameters["style"])!''}.js"></script>
</head>
<body>
	<div id="deptTree" style="overflow-x:auto;overflow-y:auto;">
		<ul id="treeDemo" class="ztree" style="overflow:hidden;"></ul>
	</div>
</body>
</html>