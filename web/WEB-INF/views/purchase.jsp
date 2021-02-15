<%-- 
    Document   : product
    Created on : Jan 13, 2021, 11:39:25 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
    <style>

        /*        body {
                    background: #ffc107;
                    font-family: Arial, Helvetica, sans-serif
                }*/
        /*        li {
                    list-style: none;
                    line-height: 50px;
                    color: #000
                }
        
                .col-md-2 {
                    padding-bottom: 20px;
                    font-weight: bold
                }
        
                .col-md-2 a {
                    text-decoration: none;
                    color: #000
                }*/
        .price:hover {
            box-shadow: 0 8px 12px 0 rgba(0,0,0,0.2)
        }


    </style>
</head>
<div class="container-fluid" style="margin-left: 5%">
    <br>
    <div class="row">
        <div class="col"></div>
        <div class="col">
            <div class="row">
                <div class="input-group col-12">
                    <input type="search" placeholder="Search Product" class="input-control input-lg" />
                    <div class="input-group-append">
                        <button class="btn btn-outline-secondary" type="button"><span><i class="fa fa-search"></i></span></button>
                    </div>
                </div>
                <!--            <form>
                                <input id="search-input" type="search" id="form1" class="form-control rounded-pill" />
                
                            </form>
                            <button id="search-button" type="button" class="btn btn-primary rounded-pill">
                                <i class="fas fa-search">Search</i>
                            </button>-->
            </div>

        </div>
        <div class="col"></div>

    </div>
    <br>
    <div class="row">
        <div class="card col-2" style="margin:10px ;border-color: #16A085; width: 20%;background-color: cornsilk">
            <a href="purchase.htm" data-toggle="modal" data-target="#myModa" style="text-decoration: none"   data-toggle="bcd" title="Add Product"> <img class="card-img-top" src="https://static.addtoany.com/images/icon-200-3.png" alt="Card image" style="width:100%;height: 50%"/>
                <div class="card-body">
                    <p class="card-title font-weight-bold" style=" text-align: center">New Item</p>

                </div>
                <!--<div class="card-footer"><button class="btn btn-primary rounded-pill btn-outline-warning">New Item</button></div>-->
            </a>
        </div>
        <c:forEach items="${products}" var="p">


            <div class="card col-2 price" style="margin:10px ;border-color: #16A085; background-color: cornsilk">

                <a href="purchaseinfo.htm?id=${p.id}&name=${p.name}&price=${p.price}&quantity=${p.quantity}&image=${p.image}" style="text-decoration: none" data-toggle="bcd" title="Price: ${p.price} quantity: ${p.quantity}"> <img class="card-img-top" src="${p.image}" alt="Card image" style="width:100%;"/></a>
                <div class="card-body">
                    <p class="card-title font-weight-bold" style=" text-align: center">Item ${p.name}</p>
                    <p class="card-title font-weight-bold" style=" text-align: center">Price ${p.price}</p>
                    
                    <center><button class="btn btn-primary"  data-toggle="modal" data-target="#myModal">Purchase</button></center>


                </div>

                <!--            <div class="card-footer">Purchase</a></div>-->
                    <!--<a href="delete.htm?id=${p.id}"><button>✖</button></a>-->

            </div>



        </c:forEach>
    </div>



    <!--puchase existing-->
    <div class="modal fade" id="myModal">
        <div class="modal-dialog modal-dialog-centered modal-lg">
            <div class="modal-content">

                <!-- Modal Header -->
                <div class="modal-header bg-info">
                    <h4 class="modal-title">Purchase Item</h4>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                </div>

                <!-- Modal body -->
                <div class="row modal-body">


                    <div class="col-4">
                        <img src="${image}" class="card-img-top h-100" alt="...">

                    </div>
                    <div class="col-8">

                        <form method="GET" action="editinfo.htm">


                            <div class="form-group">
                                <label for="inputlg" class="font-weight-bold">Supplier</label>
                                <!--<input class="form-control input-lg" id="inputlg" type="text">-->
                                <select name="supplier" class="form-control" id="sel1">
                                    <option>Sohel</option>
                                    <option>Dipu</option>
                                    <option>Tipu</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <input hidden="true" name="id" value="${id}" class="form-control input-lg" id="inputlg" type="text">
                            </div>
                            <div class="form-group">
                                <label for="inputlg" class="font-weight-bold">Item Name</label>
                                <input name="name" value="${name}" class="form-control input-lg" id="inputlg" type="text">
                            </div>
                            <div class="form-group">
                                <label for="inputlg" class="font-weight-bold">Price</label>
                                <input name="price" value="${price}" class="form-control input-lg" id="inputlg" type="text">
                            </div>
                            <div class="form-group">
                                <label for="inputlg" class="font-weight-bold">Quantity</label>
                                <input name="quantity" value="${0}" class="form-control input-lg" id="inputlg" type="text">
                            </div>
                            <div class="form-group">

                                <input hidden="true" name="image" value="${image}" class="form-control input-lg" id="inputlg" type="text">
                            </div>


                            <br>
                            <button type="submit" style="color: coral; background-color: #16A085" class="btn btn-hover btn-lg btn-block">Submit</button>
                        </form>
                    </div>
                    <!--                        <div class="col-4"> 
                                                <div class="form-group">
                                                <label for="inputlg" class="font-weight-bold">Item Name</label>
                                                <input name="name" value="${name}" class="form-control input-lg" id="inputlg" type="text">
                                            </div>
                                            </div>-->


                </div>

                <!-- Modal footer -->
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </div>


    <div class="modal fade" id="myModa">
        <div class="modal-dialog modal-dialog-centered modal-lg">
            <div class="modal-content">

                <!-- Modal Header -->
                <div class="modal-header bg-info">
                    <h4 class="modal-title ">Purchase New Item</h4>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                </div>

                <!-- Modal body -->
                <div class="modal-body">
                    <div class="row">
                        <div class="col-4">
                            <img src="https://static.addtoany.com/images/icon-200-3.png" class="card-img-top h-100" alt="...">

                        </div>
                        <div class="col-8">

                            <form class="form-group" method="GET" action="addinfo.htm">

                                <div class="form-group">
                                    <label for="inputlg" class="font-weight-bold">Supplier</label>
                                    <select name="supplier"  class="form-control" id="sel1">
                                        <option>Sohel</option>
                                        <option>Dipu</option>
                                        <option>Kamal</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label for="inputlg" class="font-weight-bold">Item Name</label>
                                    <input name="name" class="form-control input-lg" id="inputlg" type="text">
                                </div>
                                <div class="form-group">
                                    <label for="inputlg" class="font-weight-bold">Price</label>

                                    <input class="form-control input-lg"  name="price"/>
                                </div>
                                <div class="form-group">
                                    <label for="inputlg"  class="font-weight-bold">Quantity</label>

                                    <input name="quantity" class="form-control input-lg" />
                                </div>
                                <div class="form-group">
                                    <label for="inputlg" class="font-weight-bold">Image</label>

                                    <input name="img" class="form-control input-lg" value="http://www.squarepharma.com.bd/products/B-50-FORTE-SYRUP-200ML_l1.jpg" name="img"/>
                                </div>

                                <br>
                                <button type="submit" style="background-color: #16A085" class="btn btn-hover btn-outline-warning btn-lg btn-block">Submit</button>
                            </form>

                        </div>

                    </div>


                </div>

                <!-- Modal footer -->
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </div>
</div>





<br>




<!--        <table class="table table-hover">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Price</th>
                <th>Quantity</th>
                <th>Total Price</th>
                <th>Product Name</th>
                <th>Product Id</th>
                <th>Type</th>
            </tr>
<c:forEach items="${invoice}" var="v">
<tr>
    <td>${v.id}</td>
    <td>${v.name}</td>
    <td>${v.price}</td>
    <td>${v.quantity}</td>
    <td>${v.totalprice}</td>
    <td>${v.productname}</td>
    <td>${v.productid}</td>
    <td>${v.type}</td>
    
    
    
</tr>
</c:forEach>

</table>-->




</div>









</div>



</body>
</html>

