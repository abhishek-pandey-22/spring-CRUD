<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import = "java.sql.*" %>
 <%@ page isELIgnored="false" %>
    
    <!DOCTYPE html>
<html>
<head>
<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
<meta name='viewport' content='width=device-width, initial-scale=1'>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body{
background-color: #8f6a0d;
padding-top: 50px;
}
table{
margin: 0 auto;
background-color: #11252e;
color: white;
}
th{
font-size: 20px;
}

.new{
margin: 3px;
padding-left: 100px;}
button{
 background-color: yellow; 
  border: none;
  color: black;
  padding: 5px 3px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 15px;
  cursor: pointer;
}
button:hover {
  opacity: 1.2;
  color: white;
}

</style>
</head>
<body>

<div class="main">


<table class="table" border=1>

  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Blog</th>
      <th scope="col">Tag</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${product}" var="p" >
  
    <tr>
    <td scope="row">${p.id}</td>
    <td><c:out value="${p.name}"></c:out></td>
    <td><c:out value="${p.tag}"></c:out></td>
    <td><button><a href="delete/${p.id }"><i class="fa fa-trash" style="font-size: 30px"></i></a></button>
   <button><a href="update/${p.id }"><i class="fas fa-edit" style="font-size: 27px"></i></a></button>
   <button><a href="addProduct"><i class="fa fa-file" style="font-size: 30px"></i></a></button>
    <button><a href="read/${p.id }"><i class="fas fa-edit" style="font-size: 27px"></i></a></button></td>
  
    </tr>
    
    </c:forEach>
    </tbody>
   
    </table>
 
    </div>


</div>
</body>
</html>
