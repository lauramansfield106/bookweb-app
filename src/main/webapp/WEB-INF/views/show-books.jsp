<%@ include file="common/header.jspf" %>

	<!-- Form to add a new book -->
	<div class="container" >

						
	<a href="add-book" class="btn btn-success">Add a book.</a>
	</div>
	<br> 
	<!-- table showing books -->
	<div class="container">
	<H3>Your Book List</H3>
						
		<table class="table table-striped">
		
			<thead>
				<tr>
					<th>Title</th>
					<th>Author</th>
					<th>Rating</th>

					<th><th>
				</tr>
			</thead>
			
			<tbody>
				<core:forEach items="${books}" var="book">
					<tr >
						
						<td>${book.title}</td>
						<td>${book.author}</td>
						<td>${book.rating}</td>

						<td class="text-right">							
							<a class="btn btn-success" href="/edit-book?id=${book.id}">Edit</a>
							<a class="btn btn-danger" href="/remove-book?id=${book.id}">Remove</a>
						</td>
					</tr>
					
				
				</core:forEach>

			</tbody>
		
		</table>
	</div>		
<script src="webjars/jquery/3.3.1-1/jquery.min.js"></script>
<script src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>