
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Request Info</title>
    <style type="text/css">
      
  input[type=text]{
  padding: 12px 20px;
  margin: 8px 140px;
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

<form action="http://localhost:8081/FinalJuly15/request" method="post">
    SSN ID:<input type="text" name="SSN"/><br/><br/>
    PROCESS YEAR:<input style="margin-left: 72px;" type="text" name="process_year"/><br/><br/>
	
    LOCATION ID:<input style="margin-left: 85px;" type="text" name="location_id"/><br/><br/>
	UID:<input style="margin-left: 155px;" type="text" name="uid"/><br/><br/>
    <button style="margin-left: 182px;" type="submit">Submit</button>
</form>
</body>
</html>
