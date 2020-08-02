<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
    <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Hello World!</title>
      <style type="text/css">
      
  input[type=text]{
  padding: 12px 20px;
  margin: 8px 495px;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}
input[type=password] {
  padding: 12px 20px;
  margin: 8px 495px;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

  button {
  background-color: #353390;
  color: white;
  padding: 14px 87px;
  margin: 8px 495px;
  border: none;
  cursor: pointer;
}
h2{
margin : 14px 560px;
}
      </style>
    </head>
    <body>
    <div class="container">
       <form action="${contextPath}/login" method="post">
       <h2 class="form-heading">Login</h2>
       	<input type = "text" name="name" placeholder="Enter Username"/>
       	<input type = "password" name="password" placeholder="Enter Password"/>
       	<button type="submit">Login</button>
       </form>
       </div>
       
   

    </body>
</html>