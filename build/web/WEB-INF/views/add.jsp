<%-- 
    Document   : add
    Created on : Jan 17, 2021, 11:43:24 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form method="GET" action="addinfo.htm">
            <table border="1">
                <tr>
                    <td>Name</td>
                    <td>
                        <input name="name" placeholder="Name"/>
                    </td>
                </tr>
                <tr>
                    <td>Price</td>
                    <td>
                        <input name="price" placeholder="Price"/>
                    </td>
                </tr>
                <tr>
                    <td>Quantity</td>
                    <td>
                        <input name="quantity" placeholder="Quantity"/>
                    </td>
                </tr>
                <tr>
                    <td>Image</td>
                    <td>
                        <input name="img" placeholder="Image"/>
                    </td>
                </tr>
            </table>
            <button type="submit">Submit</button>
        </form>
        
    </body>
</html>
