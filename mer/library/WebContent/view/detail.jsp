<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="util.StringUtil" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<meta charset="<%=StringUtil.SET_ENCODING %>">
<title>詳細画面</title>
</head>
<body background="/library/image/yunpyo.jpg">
<h1>そんなに詳しく知りたいの？</h1>
<form method="get" action="<%=StringUtil.LENDCHECK + StringUtil.CONTROLLER %>">
<input type="submit" name="submit" value="借りる" />
</form>

<form method="get" action="<%=StringUtil.SEARCHALL + StringUtil.CONTROLLER %>">
<input type="submit" name="submit" value="戻る" />
</form>

</body>
</html>