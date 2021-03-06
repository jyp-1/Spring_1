<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../layout/bootStrap/bootStrap.jsp" />
</head>
<body>
	<c:import url="../layout/nav.jsp" />

	<h1>Notice List Page</h1>

	<div>
		<div class="container">
		<h1>Notice List</h1>
		<table class="table">
			<tr>
				<td>NUM</td>
				<td>Title</td>
				<td>Writer</td>
				<td>Date</td>
				<td>Hit</td>
			</tr>
			<c:forEach items="${requestScope.list}" var="dto" varStatus="st">
				<tr>
					<td>${pageScope.dto.num}</td>
					<td><a href="noticeSelect?num=${pageScope.dto.num}">${pageScope.dto.title}</td>
					<td>${pageScope.dto.writer}</td>
					<td>${pageScope.dto.reg_date}</td>
					<td>${pageScope.dto.hit}</td>
				</tr>
			</c:forEach>

		</table>

	</div>
	</div>
</body>
</html>