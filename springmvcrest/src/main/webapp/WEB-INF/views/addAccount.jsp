<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>New Account</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<i> ${pageContext.servletContext.contextPath} </i>



	<div>
		<marquee>
			<h2>Account CRUD Application</h2>
		</marquee>
	</div>

	<div>

		<form:form modelAttribute="account"   action="${pageContext.servletContext.contextPath}/mvc/add"   method="post">

			<table border="1">
				<tr>
					<td><form:label path="accno">ACCOUNT NO</form:label></td>
					<td><form:input path="accno" /></td>
				</tr>

				<tr>
					<td><form:label path="name">ACCOUNT NAME</form:label></td>
					<td><form:input path="name" /></td>
				</tr>

				<tr>
					<td><form:label path="balance">ACCOUNT BALANCE</form:label></td>
					<td><form:input path="balance" /></td>
				</tr>

				<tr>
					<td><form:label path="doc">ACCOUNT DOC</form:label></td>
					<td><form:input path="doc" /></td>
				</tr>


				<tr>
					<td><form:label path="type">ACCOUNT TYPE</form:label></td>
					<td><form:input path="type" /></td>
				</tr>


				<tr>
					<td><input type="submit" class="btn btn-info"
						value="ADD ACCOUNT"></td>
					<td>
					
					<input
				type="reset" class="btn btn-primary" value="RESET">
					
					</td>

				</tr>


			</table>




		</form:form>



	</div>

	<div class="container">

		<div align="right">
			<a href="${pageContext.servletContext.contextPath}/mvc/new"><input
				type="button" class="btn btn-primary" value="CREATE ACCOUNT">
			</a>

		</div>

		<table>
			<thead>
				<tr>
					<th>ACCOUNT NO</th>
					<th>ACCOUNT NAME</th>
					<th>ACCOUNT BALANCE</th>
					<th>ACCOUNT DOC</th>
					<th>ACCOUNT TYPE</th>
					<th>EDIT ACCOUNT</th>
					<th>DELETE ACCOUNT</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach items="${accounts}" var="c">
					<tr>
						<td>${c.accno}</td>
						<td>${c.name}</td>
						<td>${c.balance}</td>
						<td>${c.doc}</td>
						<td>${c.type}</td>
						<td><a
							href="${pageContext.servletContext.contextPath}/mvc/edit/${c.accno}">
								<input type="button" class="btn btn-info" value="EDIT ACCOUNT">
						</a></td>
						<td><a
							href="${pageContext.servletContext.contextPath}/mvc/delete?accno=${c.accno}">
								<input type="button" class="btn btn-danger"
								value="DELETE ACCOUNT">
						</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>






	</div>
</body>
</html>
