<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%List<String> searchResult = (List<String>)request.getAttribute("result"); %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/index.css">
<title>出力結果</title>
</head>
<body>

	<% for(int i = 0; i < searchResult.size(); i++){ %>
		<div class="resultOutput">
			<%=searchResult.get(i) %>
		</div>
	<%} %>

</body>
</html>
