<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
		<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
		<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
        <title>Add Employee</title>
    </head>
	<body>
	<div class="container">
	<div style="text-align:center">
		<h2>Welcome to Simple SpringMVC Project</h2><br>
		<a href="<c:url value="/add-employee" />"><button class="btn btn-primary">Go To Employee Section</button></a>
	</div>
	</div>
	</body>
</html>
