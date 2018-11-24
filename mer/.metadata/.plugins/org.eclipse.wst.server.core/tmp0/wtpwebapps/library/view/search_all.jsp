<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="util.StringUtil" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<meta charset="<%=StringUtil.SET_ENCODING %>">
<title>全件検索画面</title>
</head>
<body background="/library/image/yunpyo.jpg">
<h1>全件検索画面だぞ</h1>
<form method="get" action="<%=StringUtil.DETAILSEARCH + StringUtil.CONTROLLER %>">
<input type="submit" name="submit" value="詳細" />
</form>

<form method="get" action="<%=StringUtil.LENDCHECK + StringUtil.CONTROLLER %>">
<input type="submit" name="submit" value="借りる" />
</form>

<form method="post" action="<%=StringUtil.BACKTOP + StringUtil.CONTROLLER %>">
<a href="BackTop.action" type="submit">めぬーにもどるー</a>
</form>
</body>
</html>
