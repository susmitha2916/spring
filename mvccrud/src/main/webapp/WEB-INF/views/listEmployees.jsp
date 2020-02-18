<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="index.jsp">HOME</a><br><br>
	<table align="center" border="1px">
	    <tr>
	       <th>NAME</th>
	       <th>ID</th>	       
	       <th>AGE</th>
	    </tr>
	    
	    <c:forEach var="Employee" items="${list}">
	    	<tr>
	    	   <td>${Employee.name}</td>	          
	           <td>${Employee.id}</td>
	           <td>${Employee.age}</td>
           </tr>
	    </c:forEach>    
	</table>
	
</body>
</html>