


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h3>Exp Date size ${expdateList.size()}</h3>
<table class="table">
    <tr>
    <th>Id</th>
    <th>Name</th>
    <th>Price</th>
    <th>MfgDate</th>
    <th>ExpDate</th>
    </tr>
    
    <c:forEach items="${expdateList}" var="exp">
        <tr>
            <td>${exp.id}</td>
            <td>${exp.name}</td>
            <td>${exp.price}</td>
            <td>${exp.mfgdate}</td>
            <td>${exp.expdate}</td>
        </tr>
    </c:forEach>
</table>
<h3>Out of Quantity ${alertList.size()}</h3>
<table class="table">
    <tr>
    <th>Id</th>
    <th>Name</th>
    <th>Price</th>
    <th>MfgDate</th>
    <th>ExpDate</th>
    </tr>
    
    <c:forEach items="${alertList}" var="exp">
        <tr>
            <td>${exp.id}</td>
            <td>${exp.name}</td>
            <td>${exp.price}</td>
            <td>${exp.mfgdate}</td>
            <td>${exp.expdate}</td>
        </tr>
    </c:forEach>
</table>