<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="util.StringUtil"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<meta charset="<%=StringUtil.SET_ENCODING %>">
<link href='<%=StringUtil.CONTEXTPATH + StringUtil.SEARCHALLCSS%>'
	rel='stylesheet' type='text/css' />
<script type="text/javascript" src="<%=StringUtil.SEARCHALLJS%>"></script>
<title>全件検索画面</title>
</head>
<body>
	<div class="container">
		<div class="info">
			<h1>Book Search</h1>
			<div id="searchAll-form">
				<form action="searchAll.action" method="get">
					<input type="text" name="booktitle" id="form-userid"
						placeholder="Enter BookTitle" /> <input type="submit"
						name="submit" value="Search" />
				</form>
			</div>
		</div>

		<!-- Normal Demo　ここから-->
		<div class="column">
			<div class="demo-title">
				New&#33;&#33;
				<!--年・月を取得し、今年・今月ならばNEWを表示させる-->
			</div>
			<!-- Post-->
			<div class="post-module">
				<!-- Thumbnail-->
				<div class="thumbnail">
					<div class="date">
						<div class="day">26</div>
						<div class="month">Nov</div>
						<div class="year">2018</div>
					</div>
					<!-- 画像は、乱数を使ってランダムに変える -->
					<img
						src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/169963/photo-1429043794791-eb8f26f44081.jpeg" />
				</div>
				<!-- Post Content-->
				<div class="post-content">
					<div class="category">Category</div>
					<h1 class="title">Title</h1>
					<h2 class="sub_title">Author</h2>
					<div class="post-meta">
					<!-- 詳細画面へのリンク -->
						<span class="timestamp"><i class="fa fa-clock-">>></i>detail</span>
					</div>
				</div>
			</div>
		</div>
		<!-- ここまでで1つのカード -->
</body>
</html>
