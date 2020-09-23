<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.techpassel.smhpc.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page isELIgnored="false"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
		<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
		<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
        <title>Employee List</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
            <h2 class="text-primary" style="text-align:center">Employee List</h2>
            	<div class="col-12">
                    <div class="card">
                        <div class="card-body p-0">
                            <div class="row p-5">
                  <div class="col-md-12">
         
                      <table class="table">
                          <thead>
                              <tr>
                                  <!--<th class="border-0 text-uppercase small font-weight-bold">Title</th>-->
                                  <th class="border-0 font-weight-bold">Name</th>
                                  <th class="border-0 font-weight-bold">Email</th>
                                  <th class="border-0 font-weight-bold">Phone</th>
                                  <th class="border-0 font-weight-bold">Active Status</th>
                                  <th class="border-0 font-weight-bold">Edit</th>
                                  <th class="border-0 font-weight-bold">Delete</th>
                              </tr>
                          </thead>
                          <tbody>
                              <c:forEach var="emp" items="${employees}">
								  <tr>
                                      <td>${emp.name}</td>
                                      <td>${emp.email}</td>
                                      <td>${emp.phone}</td>
                                      <td>${emp.isActive()}</td>
                                      <td><a href="edit-employee?id=${emp.id}"><button class="btn btn-success">Edit</button></a></td>
                                      <td><a href="delete-employee?id=${emp.id}"><button class="btn btn-danger">Delete</button></a></td>
                                  </tr>
                              </c:forEach> 
                          </tbody>
                      </table>
                      <p>Register new employee&nbsp;<a href="add-employee" class="text-primary"><b>here<b></b></a><p>
                  </div>
             </div>
         </div>
         </div>
         </div>
         </div>
         </div>
    </body>
</html>