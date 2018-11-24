<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="util.StringUtil"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<meta charset="UTF-8">
<title>エラーだぞ♡</title>
</head>
<body background="/library/image/yunpyo.jpg">
	<h1>エラーだぞ♡</h1>
	<%if(request.getAttribute(StringUtil.SCOPE_LOGOUT_ERROR) != null){

	out.println("<p id=" + "error_message" + ">" + StringUtil.LOGOUT_ERROR + "</p>");


	}%>

</body>
</html>