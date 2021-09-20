<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Listing</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/main.css"></link>

</head>
<body>
	<div>

		<h1>Seller Portal</h1>
		<br>
		<br>


		<h3>New Listing</h3>
		<br>
		<form action="show.do" method="POST">
			<h5>To create a listing, provide the following:</h5>

			<br> Name: <input type="text" name="name"><br>
			<br> Type: <input type="text" name="type"><br>
			<br> Condition: <input type="text" name="condition"><br>
			<br> Condition Description: <input type="text"
				name="conditionDescription"><br>
			<br> Card Number: <input type="text" name="cardNumber"><br>
			<br> Series: <input type="text" name="series"><br>
			<br> Rarity: <input type="text" name="rarity"><br>
			<br> Image (Please provide a URL link): <input type="text"
				name="imageUrl"><br>
			<br> <input class="btn btn-primary" type="submit"
				value="Submit Listing" /><br> <br>
		</form>

		<div class="container-fluid">
			<form class="form" action="delete.do?id=${sellerlisting.id}"
				method="GET">
				Delete Listing ID: <input type="text" name="id" /> <input
					class="btn btn-primary" type="submit" value="Delete Listing" />
			</form>
			<br>
			<form class="form" action="edit.do?id=${sellerlisting.id}"
				method="GET">
				Update Listing: <input type="text" name="id" /> <input
					class="btn btn-primary" type="submit" value="Update Listing" />
			</form>
			<br> <br>

			<form action="home.do" method="GET">
				<input type="hidden" name="home" /> <input class="btn btn=primary"
					type="submit" value="HOME" />
			</form>

		</div>

		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ"
			crossorigin="anonymous"></script>
</body>
</html>