<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listing Details</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/main.css"></link>

</head>
<body>
	<div>
		<h5>${listing.name}</h5>
		
		<img class="card-image" src="${ sellerlisting.imageUrl}"></img><br>
		Card Series: ${listing.series}<br>
		Type: ${listing.type }<br>
		Card #: ${listing.cardNumber }<br>
		<br>
		Rarity: ${listing.rarity}<br>
		Condition: ${listing.condition }<br>
		
		<br>
		<h5>Condition Description:</h5>
		<p>${listing.conditionDescription}</p>
	</div>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
</body>
</html> 