<%-- 
    Document   : default
    Created on : Jan 15, 2021, 10:13:31 PM
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


        <tiles:insertAttribute  name="header"   />
        <tiles:insertAttribute  name="body"   />

        <div class="row">
<!--            <nav id="sidebarMenu" class="col-3 col-lg-2 d-md-block bg-light sidebar collapse">
                <%--<tiles:insertAttribute  name="menu"   />--%>
            </nav>-->
            <!--<main class="co-9 ms-sm-auto col-lg-10 px-md-4">-->
                
            <!--</main>-->
            <%--<tiles:insertAttribute  name="footer"   />--%>

        </div>


    </body>
</html>
