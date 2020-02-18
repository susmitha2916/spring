<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="saveEmployee" method="post" modelAttribute="employee">
       <table  border="1px">
            <tr>
              <td>name</td>
              <td><form:input  path="name"/></td>
           </tr>
           <tr>
              <td>id</td>
              <td><form:input path="id"/></td>
           </tr>
           <tr>
              <td>Age</td>
              <td><form:input path="age"/></td>
           </tr>           
           <tr><td><input type="submit"  value="SUBMIT"/></td></tr>           
       </table>
   </form:form>   
</body>
</html>