<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="util.StringUtil"%>
<%@page import="util.StringQuery"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<title>Mer</title>
<link href='<%=StringUtil.MENUCSS%>' rel='stylesheet' type='text/css' />
<meta charset="<%=StringUtil.SET_ENCODING %>" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
</head>
<body>
	<div class="container">

		<div class="btn-user">
			<a><%=session.getAttribute(StringQuery.USERNAME) %></a>
		</div>

		<ul class="btn-tab">
			<li class="btn"><a
				href="<%=StringUtil.KASHIDASHI + StringUtil.CONTROLLER %>">Borrow
					Now</a></li>
			<li class="btn"><a
				href="<%=StringUtil.SEARCHALL + StringUtil.CONTROLLER %>">Lend</a></li>
			<li class="btn"><a
				href="<%=StringUtil.REGIST + StringUtil.CONTROLLER %>">Regist</a></li>
			<li class="btn"><a
				href="<%=StringUtil.REGIST + StringUtil.CONTROLLER %>">Setting</a></li>
				<li class="btn"><a
				href="<%=StringUtil.LOGOUT + StringUtil.CONTROLLER %>">LogOut</a></li>
		</ul>


		<br />

		<!--
    <div>
    <form action="<%=StringUtil.TWITTER_SEARCH + StringUtil.CONTROLLER %>" method="post">
      <input type="text" name="searchTarget" />
      <input type="submit" name="submit" name="検索" />
      </form>
    </div>
-->
</body>
</html>
