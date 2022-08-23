<%@ include file="common/header.jspf" %>

	<!-- Form to add a new book -->
	<div class="container" >
		<H3>Add a book.</H3>
						
			<form:form method="post" modelAttribute="book" > <!-- renders HTML form tag and binds tags  -->
				<form:hidden path="id"/>
				<div class="row">
					<fieldset class="form-group col-5" >
					 	<form:input class="form-control" path="title" type="text" required="required" placeholder="Title"/>
					</fieldset>
					
			 		<fieldset class="form-group col-5">
						<form:input class="form-control" path="author" type="text" required="required" placeholder="Author"/>
					</fieldset>
					
					<fieldset class="form-group col">
						<form:input class="form-control" path="rating" type="number" required="required" placeholder="Rating" min="1" max="5"/>
					</fieldset>
				</div>
				<input type="submit" value="Submit" class="btn btn-success" url="/add-book" >
			</form:form>
	</div>
	<br> 
	<!-- table showing books -->
	<div class="container">
	
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