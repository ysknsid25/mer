<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="util.StringUtil" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<meta charset="<%=StringUtil.SET_ENCODING %>"/>
<title>返却完了画面</title>
</head>
<body background="/library/image/yunpyo.jpg">
<h1>トップに戻ろうね♡</h1>
<form method="post" action="<%=StringUtil.BACKTOP + StringUtil.CONTROLLER %>">
<a href="<%=StringUtil.BACKTOP + StringUtil.CONTROLLER %>" type="submit">ありがとう♡</a>
</form>
</body>
</html>