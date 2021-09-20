<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/main.css"></link>
<title>Edit Listing</title>
</head>
<body>

<h5>Which fields from your listing would you like to update?</h5>

<form action="updatelisting.do?id=${listing.id }" method="POST">
		<h5>To create a listing, provide the following:</h5>
		
		<br>
		Name: <input type="text" name="name" value =${listing.name }><br><br>
		Type: <input type="text" name="type" value =${listing.type }><br><br>
		Condition: <input type="text" name="condition" value =${listing.condition }><br><br>
		Condition Description: <input type="text" name="conditionDescription" value =${listing.conditionDescription }><br><br>
		Card Number: <input type="text" name="cardNumber" value =${listing.cardNumber }><br><br>
		Series: <input type="text" name="series" value =${listing.series }><br><br>
		Rarity: <input type="text" name="rarity" value =${listing.rarity }><br><br>
		Image (Please provide a URL link): <input type="text" name="imageUrl" value =${listing.imageUrl }><br><br>
		
		<input class="btn btn-primary" type="submit" value="Edit Listing"/>
		</form>

<form class="form" action="edit.do"
			method="GET">
			Update Listing: <input type="text" name="id" /> <input
				class="btn btn-primary" type="submit" value="Update Listing" />
		</form>
		
		<form action="home.do" method="GET">
		<input type="hidden" name="home"/>
		<input class="btn btn=primary" type="submit" value="HOME"/>
		</form>
			</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
</body>
</html>