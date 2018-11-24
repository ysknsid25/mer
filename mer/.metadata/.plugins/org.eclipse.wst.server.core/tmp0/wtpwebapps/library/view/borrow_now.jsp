<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="util.StringUtil" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<meta charset="<%=StringUtil.SET_ENCODING %>">
<title>BorrowNow</title>
</head>
<body background="/library/image/yunpyo.jpg">
<h1>自分が借りてる本が分かるぞ♡</h1>
<form method="get" action="<%=StringUtil.RETURN + StringUtil.CONTROLLER %>">
<input type="submit" name="submit" value="返す" />
</form>
<form method="post" action="<%=StringUtil.BACKTOP + StringUtil.CONTROLLER %>">
<a href="<%=StringUtil.BACKTOP + StringUtil.CONTROLLER %>" type="submit">返すのやーめた！</a>
</form>
</body>
</html>