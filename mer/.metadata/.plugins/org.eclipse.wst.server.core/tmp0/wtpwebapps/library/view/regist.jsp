<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="util.StringUtil"%>
<%@page import="util.StringQuery"%>




<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<title>Top</title>

<link href='<%=StringUtil.CONTEXTPATH + StringUtil.INPUTCSS%>'
	rel='stylesheet' type='text/css' />
<script type="text/javascript" src="<%=StringUtil.MAINJS%>"></script>
<meta charset="<%=StringUtil.SET_ENCODING%>" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

</head>

<body>
	<div class="container">
		<div id="login-form">
			<div id="box">

				<form action="<%=StringUtil.REGISTCHECK + StringUtil.CONTROLLER%>"
					method="post">

					<div>
						<label for="form-userid">BoolTitle</label> <input type="text"
							name="booktitle" id="form-userid" placeholder="BookTitle" />
						<p class="note">Please enter BookTitle.</p>
					</div>

					<div><%--out.println("<p id=" + "error_message" + ">" + errorMessage(booktitleVerify) + "</p>");--%></div>

					<div>
						<label for="form-userid">Author</label> <input type="text"
							name="author" id="form-userid" placeholder="author" />
						<p class="note">Please enter author.</p>
					</div>
					<div></div>

					<div>
						<label for="form-userid">Publisher</label> <input type="text"
							name="publisher" id="form-userid" placeholder="publisher" />
						<p class="note">Please enter Publisher.</p>
					</div>


					<div>
						<label for="form-userid">PublishDay</label> <input type="text"
							name="publishday" id="form-userid" placeholder="published Year" />
						<p class="note">Please enter published Year.</p>
					</div>
					<div></div>

					<input type="submit" name="submit" value="Regist" />



					<%! private String errorMessage(int checkNum){

						if(checkNum == StringUtil.BOOKTITLE_NULL){

							return StringUtil.BOOKTITLE_IS_NULL;

						}else if(checkNum == StringUtil.BOOKTITLE_LENGTH){

							return StringUtil.BOOKTITLE_OVER_LENGTH;

						}else if(checkNum == StringUtil.AUTHOR_NULL){

							return StringUtil.AUTHOR_IS_NULL;

						}else if(checkNum == StringUtil.YEAR_OVER){

							return StringUtil.PUBLISHYEAR_FUTURE;

						}else if(checkNum == StringUtil.NOT_NUMBER){

							return StringUtil.PUBLISHYEAR_INVALIDATE;

						}

					return "";

					}%>




				</form>

			</div>
		</div>
	</div>

</body>
</html>