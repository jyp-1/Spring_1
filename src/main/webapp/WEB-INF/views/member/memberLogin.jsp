<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../layout/bootStrap/bootStrap.jsp"/>
</head>
<body>
<c:import url="../layout/nav.jsp" />
		<h1>Member Login Page</h1>
		
		<div class="container">
  			<form action="./memberLogin" method="POST">
  		
    		<div class="form-group">
      			<label for="id">id:</label>
      			<input type="text" class="form-control" id="id" placeholder="Enter id" name="id">
    		</div><br>
    		
    		<div class="password">
      			<label for="password">password:</label>
      			<input type="text" class="form-control" id="password" placeholder="Enter password" name="password">
    		</div><br>
    		    		
    			<button type="submit" class="btn btn-default">Submit</button>
    			<a href="../home" class="btn btn-info">Go Home</a>
  			</form>
				</div>
		
</body>
</html>