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
							name="booktitle" id="form-userid" placeholder="BookTitle"
							value="<%if (request.getAttribute(StringQuery.BOOKTITLE) != null)
				out.println(request.getAttribute(StringQuery.BOOKTITLE));%>" />
						<p class="note">Please enter BookTitle.</p>
					</div>
					<div>
						<%
							if (request.getAttribute(StringQuery.BOOKTITLE_CK) != null) {
								if ((int) request.getAttribute(StringQuery.BOOKTITLE_CK) == StringUtil.BOOKTITLE_NULL) {

									out.println("<p id=" + "error_message" + ">" + StringUtil.BOOKTITLE_IS_NULL + "</p>");

								} else if ((int) request.getAttribute(StringQuery.BOOKTITLE_CK) == StringUtil.BOOKTITLE_LENGTH) {

									out.println("<p id=" + "error_message" + ">" + StringUtil.BOOKTITLE_OVER_LENGTH + "</p>");

								}
							}
						%>
					</div>

					

					<div>
						<label for="form-userid">Author</label> <input type="text"
							name="author" id="form-userid" placeholder="author"
							value="<%if (request.getAttribute(StringQuery.AUTHOR) != null)
				out.println(request.getAttribute(StringQuery.AUTHOR));%>" />
						<p class="note">Please enter author.</p>
					</div>
					<div>
						<%
							if (request.getAttribute(StringQuery.AUTHOR_CK) != null) {
								if ((int) request.getAttribute(StringQuery.AUTHOR_CK) == StringUtil.AUTHOR_NULL) {

									out.println("<p id=" + "error_message" + ">" + StringUtil.AUTHOR_IS_NULL + "</p>");

								}
							}
						%>
					</div>

					<div>
						<label for="form-userid">Publisher</label> <input type="text"
							name="publisher" id="form-userid" placeholder="publisher"
							value="<%if (request.getAttribute(StringQuery.PUBLISHER) != null)
				out.println(request.getAttribute(StringQuery.PUBLISHER));%>" />
						<p class="note">Please enter Publisher.</p>
					</div>


					<div>
						<label for="form-userid">PublishDay</label> <input type="text"
							name="publishday" id="form-userid" placeholder="published Year"
							value="<%if (request.getAttribute(StringQuery.PUBLISHDAY) != null)
				out.println(request.getAttribute(StringQuery.PUBLISHDAY));%>" />
						<p class="note">Please enter published Year.</p>
					</div>
					<div>
						<%
							if (request.getAttribute(StringQuery.PUBLISHDAY_CK) != null) {
								if ((int) request.getAttribute(StringQuery.PUBLISHDAY_CK) == StringUtil.YEAR_OVER) {

									out.println("<p id=" + "error_message" + ">" + StringUtil.PUBLISHYEAR_FUTURE + "</p>");

								} else if ((int) request.getAttribute(StringQuery.PUBLISHDAY_CK) == StringUtil.NOT_NUMBER) {

									out.println("<p id=" + "error_message" + ">" + StringUtil.PUBLISHYEAR_INVALIDATE + "</p>");

								}
							}
						%>
					</div>
					
					<div>
						<span>Category:</span><select name=”category”>
							<option value=”7” selected></option>
							<option value=”1”>漫画</option>
							<option value=”2”>文庫</option>
							<option value=”3”>大型本</option>
							<option value=”4”>雑誌</option>
							<option value=”5”>参考書</option>
							<option value=”6”>新書</option>
						</select>
					</div>
					
					<br/>

					<input type="submit" name="submit" value="Regist" />



					<%--String errorMessage(int checkNum){

		if (checkNum == StringUtil.BOOKTITLE_NULL) {

			return StringUtil.BOOKTITLE_IS_NULL;

		} else if (checkNum == StringUtil.BOOKTITLE_LENGTH) {

			return StringUtil.BOOKTITLE_OVER_LENGTH;

		} else if (checkNum == StringUtil.AUTHOR_NULL) {

			return StringUtil.AUTHOR_IS_NULL;

		} else if (checkNum == StringUtil.YEAR_OVER) {

			return StringUtil.PUBLISHYEAR_FUTURE;

		} else if (checkNum == StringUtil.NOT_NUMBER) {

			return StringUtil.PUBLISHYEAR_INVALIDATE;

		}

		return "";

	}--%>




				</form>

			</div>
		</div>
	</div>

</body>
</html>
