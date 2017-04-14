<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>景区管理</title>
<#include "/admin/include/head.htm">
</head>
<frameset cols="210,5,*" frameborder="0" border="0" framespacing="0" id="frameset" name="frameset">
	<frame src="${base}/admin/dept/tree.jhtml" scrolling="no" name="leftFrame" noresize="noresize" id="deptTreeFrame" />
	<frame src="${base}/admin/middle.jhtml" id="middleFrame" name="middleFrame" frameborder="no" scrolling="no" noresize="noresize"/>
	<frame src="${base}/admin/dept/add.jhtml" scrolling="no" name="rightFrame" id="rightFrame" />
</frameset>
<noframes><body></body></noframes>
</html>