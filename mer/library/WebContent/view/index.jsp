<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="util.StringUtil"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<title>Top</title>

<link href='<%=StringUtil.CONTEXTPATH + StringUtil.LOGINCSS%>' rel='stylesheet' type='text/css' />
<script type="text/javascript" src="<%=StringUtil.MAINJS%>"></script>
<meta charset="<%=StringUtil.SET_ENCODING%>" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

</head>

<body>
	<div class="container">
		<div id="login-form">
			<div id="box">

				<form action="<%=StringUtil.FULL_PATH%>" method="post">

					<div>
						<label for="form-userid">userID</label> <input type="text"
							name="userid" id="form-userid" placeholder="userID" />
						<p class="note">Please your ID.</p>
					</div>

					<div>
						<label for="form-password">PassWord</label> <input type="password"
							name="password" id="form-password" placeholder="PassWord" />
						<p class="note">Please your Pass.</p>
					</div>

					<div class="btn">

						<input type="submit" name="submit" value="Login" />
					</div>

					 <%
						if (request.getAttribute(StringUtil.SCOPE_IDPASS_ERROR)!=null) {

							out.println("<p id=" + "error_message" + ">" + StringUtil.IDPASS_ERROR + "</p>");

						}
					%>




				</form>

			</div>
		</div>
	</div>

</body>
</html>