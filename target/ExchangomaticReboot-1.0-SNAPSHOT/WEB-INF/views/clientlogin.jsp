<%-- 
    Document   : clientlogin
    Created on : Dec 28, 2016, 5:33:33 PM
    Author     : Milan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Client Login</title>
    </head>
    <body>
        <c:if test="${outcomeMessage!=null}">
            <p><c:out value="${outcomeMessage}" /></p>
        </c:if>
        <h1>Client Login Page. Please register/login below:</h1>
        <form method="POST" action="clientlogin">
            <input type="text" name="email" placeholder="Your email" /><br>
            <input type="password" name="password" placeholder="Your password" /><br>
            <input type="submit" value="Register/Login" />
        </form>
    </body>
</html>
