<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Accounts List</title>
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



	<div class="container">

		<div align="right">
			<a href="${pageContext.servletContext.contextPath}/mvc/new"><input
				type="button" class="btn btn-primary" value="CREATE ACCOUNT">
			</a>

		</div>

		<table border="1">
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
