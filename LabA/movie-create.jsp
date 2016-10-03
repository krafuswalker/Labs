<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%--
	On this page we have a form to create a movie.
	
	Model:
	- Movie movie ~ a movie with no properties set at all
 --%>
<html>
<head>
<title>Movies</title>
<link href="<c:url value="/resources/main.css"/>" rel="stylesheet" />
</head>
<body>
	<div class="nav">
		<a href="<c:url value="/"/>">Home</a> <a
			href="<c:url value="/movies"/>">Back to Movies List</a>
	</div>
	<h1>Add A Movie</h1>

	<form method="post">
		<div>
			<label>Title</label> <input type="text" name="title"
				value="${movie.title}" />
		</div>
		<div>
			<label>Category</label> <input type="text" name="category"
				value="${movie.category}" />
		</div>
		<div>
			<label>Description</label>
			<textarea name="description">${movie.description}</textarea>
		</div>
		<div>
			<label>Year</label> <input type="number" name="year"
				value="${movie.year}" />
		</div>

		<div class="dropdown">
			<h4>Rating</h4>
			<select id="movieRating">
				<option value="g" selected>G</option>
				<option value="pg">PG</option>
				<option value="pg13">PG-13</option>
				<option value="r">R</option>
			</select>
			<script>
				GetSelectedItem("movieRating");
			</script>


			<script>
				function GetSelectedItem(el) {
					var e = document.getElementById(el);
					movie.rating = e.options[e.selectedIndex].text;
					<td>$
					{
						movie.rating
					}
					</td>
				}
			</script>

			<div>
				<label>Rating</label> <input type="text" name="rating"
					value="${movie.rating}" />
			</div>
		</div>
		<input type="checkbox" onclick=myFunction() id="myCheck">
		name = "Black And White""  value = true

		<script>
			function myFunction() {
				var blackAndWhite = document.getElementById("myCheck");
				blackAndWhite.checked = true;
			}
		</script>

		<div>
			<label>Origin</label><br>
				<input type="radio" name="origin" value="hollywood" checked>
				Hollywood<br> <input type="radio" name="origin" value="foreign">
				Foreign<br> <input type="radio" name="origin"
					value="independent"> Independent<br>
				
			 

		</div>

		<button type="submit">Create</button>
	</form>

</body>
</html>

