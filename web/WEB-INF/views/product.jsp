<%-- 
    Document   : product
    Created on : Jan 13, 2021, 11:39:25 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        <a href="add.htm">Add</a>
        
        <h4>List Of products ${products.size()}</h4>
        <table class="table table-hover">
            
            <thead class="table">
                <th>ID</th>
                <th>Name</th>
                <th>Price</th>
                <th>Quantity</th>
                <th colspan="2">Action</th>
                
            </thead>
            <c:forEach items="${products}" var="p">
                <tr>
                <td>${p.id}</td>
                <td>${p.name}</td>
                <td>${p.price}</td>
                <td>${p.quantity}</td>
<!--                <td>
                    <a href="edit.htm?id=${p.id}&name=${p.name}&price=${p.price}&quantity=${p.quantity}"><button class="btn btn-info">⏎</button></a>
                </td>-->
                <td>
<!--                    <a href="delete.htm?id=${p.id}"><button class="btn btn-danger">✖</button></a>-->
                </td>
            </tr>
            
            </c:forEach>
            
        </table>
        
        
        
    </body>
</html>
