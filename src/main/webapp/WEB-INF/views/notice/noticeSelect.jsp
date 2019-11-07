<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../layout/bootStrap/bootStrap.jsp"/>
</head>
<body>
<c:import url="../layout/nav.jsp" />
		<H1>notice Select Page</H1>
		
		<div class="container">
  			<div>
    
    			<table class="table">
    				<tr>
						<td>NUM</td>
						<td>Title</td>
						<td>Writer</td>
						<td>Date</td>
						<td>Hit</td>
					</tr>
					<tr>
						<td>${requestScope.dto.num}</td>
    					<td>${requestScope.dto.title}</td>
    					<td>${requestScope.dto.writer}</td>
    					<td>${requestScope.dto.reg_date}</td>
    					<td>${requestScope.dto.hit}</td>
    				</tr>
    			</table>  
    				<div>Contents: ${requestScope.dto.contents}</div>
    			<br> 
    				    			 
  				</div>
  			</div>
  			
		
</body>
</html>