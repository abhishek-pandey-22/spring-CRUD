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
    <title>Contact us</title>
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet">
    <style>
      * {
      box-sizing: border-box;
      }
      html, body {
      min-height: 100vh;
      padding: 0;
      margin: 0;
      font-family: Roboto, Arial, sans-serif;
      font-size: 14px; 
      color: black;
      }
      input, textarea { 
      outline: none;
      }
      body {
      display: flex;
      justify-content: center;
      align-items: center;
      padding: 20px;
      background-color: #3b110a
      }
      h1 {
      margin-top: 0;
      font-weight: 500;
      }
      h2{
      color: blue;}
      h3{
      color: green;}
      form {
      position: relative;
      width: 80%;
      border-radius: 30px;
      background-color: white;
      }
      .form-left-decoration,
      .form-right-decoration {
      content: "";
      position: absolute;
      width: 50px;
      height: 20px;
      border-radius: 20px;
      background: #3b110a;
      }
      .form-left-decoration {
      bottom: 60px;
      left: -30px;
      }
      .form-right-decoration {
      top: 60px;
      right: -30px;
      }
      .form-left-decoration:before,
      .form-left-decoration:after,
      .form-right-decoration:before,
      .form-right-decoration:after {
      content: "";
      position: absolute;
      width: 50px;
      height: 20px;
      border-radius: 30px;
      background: white;
      }
      .form-left-decoration:before {
      top: -20px;
      }
      .form-left-decoration:after {
      top: 20px;
      left: 10px;
      }
      .form-right-decoration:before {
      top: -20px;
      right: 0;
      }
      .form-right-decoration:after {
      top: 20px;
      right: 10px;
      }
      .circle {
      position: absolute;
      bottom: 80px;
      left: -55px;
      width: 20px;
      height: 20px;
      border-radius: 50%;
      background: #fff;
      }
      .form-inner {
      padding: 40px;
      }
      .form-inner input,
      .form-inner textarea {
      display: block;
      width: 100%;
      padding: 15px;
      margin-bottom: 10px;
      border: none;
      border-radius: 20px;
      background: #d0dfe8;
      }
      .form-inner textarea {
      resize: none;
      }
      button {
      width: 45%;
      padding: 10px;
      margin-top: 20px;
      border-radius: 20px;
      border: none;
      border-bottom: 4px solid #3e4f24;
      background-color: #3b110a; 
      font-size: 13px;
      font-weight: 400;
      color: white;
      }
      button:hover {
      background: #3e4f24;
      } 
      @media (min-width: 568px) {
      form {
      width: 90%;
      }
      }
    </style>
  </head>
  <body>
    <form action="${pageContext.request.contextPath}/dashboard" class="decor" method="post">
      <div class="form-left-decoration"></div>
      <div class="form-right-decoration"></div>
      <div class="circle"></div>
      <div class="form-inner">
        <h1>${product.name }</h1><hr>
        
        
       <h2>${product.description }</h2><hr>
       <h3> Comments</h3>
      <h3>product.comment </h3>
       <br>
        
           
        
        <button><a href="/crudmvc/update/${product.id }">Comment</a></button>
        <button type="submit" href="/dashboard">Back</button>
      </div>
    </form>
  </body>
</html>