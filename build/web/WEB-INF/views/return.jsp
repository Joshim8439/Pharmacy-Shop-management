<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<br>
<div class="row">
    <div class="col">

        <form method="GET" action="returninfo.htm">
            <input placeholder="Seearch By Name" value="" name="ordername" id="search-input" type="search" id="form1" class="form-control rounded-pill" />


            <button id="search-button" type="submit" class="btn btn-primary rounded-pill">
                <i class="fas fa-search">Search</i>
            </button>
        </form>

    </div>
    <div class="col">
        <div class="row">
            <form method="GET" action="returntod.htm">



                <a type="button" ><button id="search-button" type="submit" class="btn btn-primary rounded-pill">
                        <i class="fas fa-search">Today</i>
                    </button></a>
            </form>
            
            <form method="GET" action="returnbetween.htm">
            <div class="input-group col-12">
                <input type="date" name="todate" />
                <input type="date" name="fromdate" />
                <div class="input-group-append">
                    <button class="btn btn-outline-secondary" type="submit"><span><i class="fa fa-search"></i></span></button>
                </div>
            </div>
            </form>
            

            <a href="user.htm"><button id="search-button" type="submit" class="btn btn-primary rounded-pill">
                    <i class="fas fa-search">Customer</i>
                </button></a>
            <a href="user.htm"><button id="search-button" type="submit" class="btn btn-primary rounded-pill">
                <i class="fas fa-search">Supplier</i>
            </button></a>
            <button id="search-button" type="submit" class="btn btn-primary rounded-pill">
                <i class="fas fa-search">General</i>
            </button>
        </div>

    </div>

</div>
<div class="row">

</div>


<center><h3>Order List Of ${UserAllOrder[0].name}</h3></center>
${todayOrder.size()}


<table class="table">
    <tr>
        <th>Item</th>
        <th>Name</th>
        <th>Price</th>
        <th>Quantity</th>
        <th>Total Price</th>
        <th>Type</th>
        <th>Date</th>
    </tr>
    <c:forEach items="${UserAllOrder}" var="uorder">
        <tr>
            <td>${uorder.productname}</td>
            <td>${uorder.name}</td>
            <td>${uorder.price}</td>
            <td>${uorder.quantity}</td>
            <td>${uorder.totalprice}</td>
            <td>${uorder.type}</td>
            <td>${uorder.saledate}</td>
        </tr>
    </c:forEach>
        
        <c:forEach items="${todayOrder}" var="tod">
                        <tr>
                            <td>${tod.name}</td>
                            <td>${tod.productname}</td>
                            <td>${tod.price}</td>
                            <td>${tod.quantity}</td>
                            <td>${tod.totalprice}</td>
                            <td>${tod.type}</td>
                            <td>${tod.saledate}</td>
                        </tr>
                    </c:forEach>
        
    <c:forEach items="${betweenDate}" var="betweenDate">
        <tr>
            <td>${betweenDate.productname}</td>
            <td>${betweenDate.name}</td>
            <td>${betweenDate.price}</td>
            <td>${betweenDate.quantity}</td>
            <td>${betweenDate.totalprice}</td>
            <td>${betweenDate.type}</td>
            <td>${betweenDate.saledate}</td>
        </tr>
    </c:forEach>

</table>

<!--<button type="button" class="btn btn-primary" >
    Open modal
</button>

 The Modal 
<div class="modal fade" id="myModal">
    <div class="modal-dialog modal-dialog-centered">
        <div class="modal-content">

             Modal Header 
            <div class="modal-header">
                <h4 class="modal-title">Modal Heading</h4>
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>

             Modal body 
            <div class="modal-body">
                Modal body..
            </div>

             Modal footer 
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
            </div>-->


<!--data-toggle="modal" data-target="#myModal"-->

<div class="modal fade" id="myModal">
    <div class="modal-dialog modal-dialog-centered modal-xl">
        <div class="modal-content">


            <div class="modal-header bg-info">
                <h4 class="modal-title">Today's Details</h4>
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>


            <div class="row modal-body">
                

                <table class="table">
                    <tr>
                        <th>Name</th>
                        <th>Item</th>
                        <th>Price</th>
                        <th>Quantity</th>
                        <th>Total Price</th>
                        <th>Type</th>
                        <th>Date</th>
                    </tr>
                    <c:forEach items="${todayOrder}" var="tod">
                        <tr>
                            <td>${tod.name}</td>
                            <td>${tod.productname}</td>
                            <td>${tod.price}</td>
                            <td>${tod.quantity}</td>
                            <td>${tod.totalprice}</td>
                            <td>${tod.type}</td>
                            <td>${tod.saledate}</td>
                        </tr>
                    </c:forEach>
                </table>


            </div>

            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>
