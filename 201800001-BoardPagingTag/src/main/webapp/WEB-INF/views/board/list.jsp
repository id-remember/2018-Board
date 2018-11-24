<!DOCTYPE=HTML>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="jk" tagdir="/WEB-INF/tags"%>
<html>
	<head>
		<meta charset="UTF-8">
		<!-- Bootstrap -->
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link href="/resources/dist/css/bootstrap.min.css" rel="stylesheet">
		<link href="/resources/dist/css/starter-template.css" rel="stylesheet">
	</head>
	<body>
		<jsp:include page="../include/header.jsp"/>
		<div class="container">
		<table class="table table-striped">
		<thead>
			<tr>
				<th>번호</th>
				<th>작성자</th>
				<th>제목</th>
				<th>내용</th>
				<th>작성일</th>
				<th>조회수</th>
			</tr>
		</thead>
		<c:forEach var="item" items="${items}">
			<tr>
				<td>${item.no}</td>
				<td>${item.writer}
				<td><a href='<c:url value="/board/read?no=${item.no}"/>'>${item.title}</a></td>
				<td>${item.content}</td>
				<td>${item.createDate}</td>
				<td>${item.readCount}</td>
			</tr>
		</c:forEach>
		</table>
		<jk:paging totalPageCount="${totalPageCount}" nowPage="${page}"/><br>
		<a href='<c:url value="/board/create"/>'>CREATE | </a>
		<a href='<c:url value="/member/logout"/>'>LOGOUT</a>
		</div>
		<!-- Bootstrap -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
		<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
	</body>
</html>