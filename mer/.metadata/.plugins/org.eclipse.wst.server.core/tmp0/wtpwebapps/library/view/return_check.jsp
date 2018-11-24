<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="util.StringUtil" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<meta charset="<%=StringUtil.SET_ENCODING %>">
<title>返却確認画面</title>
</head>
<body background="/library/image/yunpyo.jpg">
<h1>返していいの？</h1>
<form method="get" action="<%=StringUtil.RETURNCHECK + StringUtil.CONTROLLER %>">
<input type="submit" name="submit" value="返す" />
</form>
</body>
</html>
