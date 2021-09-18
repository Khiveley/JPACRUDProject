<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ken's Seller Listings</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<link rel="stylesheet" href="css/main.css"></link>
</head>
<body>
<div class="container-fluid">
	<!-- <form class="form" action="getSellerListings.do" method="GET">
		SellerListing ID: <input type="text" name="id" />
		<input class="btn btn-primary" type="submit" value="Show SellerListings" />
	</form> -->
<h1>Welcome to my seller listings!</h1>

<table class="table thead-dark table-striped table-hover">
		<thead>
			<tr>
				<th>Id</th>
				<th>Title</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach var="sellerlisting" items="${listings }">
				<tr>
					<td>${sellerlisting.id }</td>
					<td><a href="getSellerListing.do?id=${sellerlisting.id}"> ${sellerlisting.name} </a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

<%-- <h3>DEBUG:</h3>
${listings } --%>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
</body>
</html>