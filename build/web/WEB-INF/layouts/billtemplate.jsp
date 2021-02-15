<%-- 
    Document   : billtemplate
    Created on : Feb 5, 2021, 9:00:10 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@include file="bootstrap.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <tiles:insertAttribute name="invoice" />
    </body>
</html>
