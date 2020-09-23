<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
	<div class="form-area">
        <form:form id="inputForm" action="save-employee" method="post" modelAttribute="employee">
            <form:hidden path="id"/>
            <br style="clear:both">
            <h2 style="margin-bottom: 25px; text-align: center;" class="text-primary">Add/Edit Employees</h2>
			<div class="form-group">
                <label for="title">Name</label>
			    <form:input type="text" path="name" class="form-control" id="name" name="name" placeholder="Enter name" required="true" />
			</div>
			
			<div class="form-group">
                <label for="release_date">Email</label>
			    <form:input type="email" path="email" class="form-control" id="email" name="email" placeholder="Enter email" required="true" />
			</div>
			
			<div class="form-group">
                <label for="price">Phone</label>
			    <form:input type="number" path="phone" class="form-control" id="phone" name="phone" placeholder="Enter phone number" required="true" />
			</div>
			
			<div class="form-group">
                <label for="genre">Password</label>
			    <form:input type="password" path="password" class="form-control" id="password" name="password" placeholder="Enter password" required="true" />
			</div>
			<input type="submit" id="submit" name="submit" value="Save" class="btn btn-success pull-right">
        </form:form>
	</div> 
	</div>           
</body>
</html>