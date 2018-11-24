<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="util.StringUtil" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<meta charset="<%=StringUtil.SET_ENCODING %>">
<title>貸出確認画面</title>
</head>
<body background="/library/image/yunpyo.jpg">
<h1>この本を借りるの？</h1>
<form method="get" action="<%=StringUtil.LENDCOMPLETE + StringUtil.CONTROLLER %>">
<input type="submit" name="submit" value="うん！" />
</form>

<form method="get" action="<%=StringUtil.SEARCHALL + StringUtil.CONTROLLER %>">
<input type="submit" name="submit" value="かりない！" />
</form>
</body>
</html>