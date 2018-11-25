<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="util.StringUtil"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<title>RegistComplete</title>
<link href='<%=StringUtil.CONTEXTPATH + StringUtil.INPUTCSS%>'
	rel='stylesheet' type='text/css' />
<meta charset="<%=StringUtil.SET_ENCODING%>" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
</head>


<body>
	<div class="container">
		<div id="login-form">
			<div id="box">


				<div>
					<p>Conmlete Regist</p>
				</div>

				<div class="btn">
				<form method="post" action="<%=StringUtil.BACKTOP + StringUtil.CONTROLLER %>">
					<a href="<%=StringUtil.BACKTOP + StringUtil.CONTROLLER%>" type="submit">To menu</a>
					</form>
				</div>


			</div>
		</div>
	</div>

</body>
</html>
