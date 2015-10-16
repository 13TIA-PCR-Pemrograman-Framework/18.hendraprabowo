<%-- 
    Document   : NameView
    Created on : Oct 16, 2015, 7:54:40 AM
    Author     : LabGSG-27
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enter Name</title>
    </head>
    <body>
        <spring:nestedPath path="name">
            <form action="" method="post">
                Name :
                <spring:bind path="value">
                    <input type="text" name="${status.expression}" value="${status.value}"/>
                    </spring:bind>
                    <input type="submit" value="OK">
            </form>
        </spring:nestedPath>

        <h1></h1>
    </body>
</html>
