<%-- 
    Document   : stest
    Created on : Jan 17, 2021, 11:43:52 AM
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

        <div class="row">
            <div class="col-8">
                
                <div class="row">
                    <form>
                        <label>Name</label>
                        <input type="text" placeholder="Name" />
                    </form>
                    
                </div>
                
                 <div class="row">
                <table class="table table-hover">

                    <thead class="table-dark">
                    <th>ID</th>
                    <th>Name</th>
                    <th>Price</th>
                    <th>Quantity</th>

                    </thead>
                    <c:forEach items="${products}" var="p">
                        <tr>
                            <td>${p.id}</td>
                            <td>${p.name}</td>
                            <td>${p.price}</td>
                            <td>${p.quantity}</td>

                        </tr>
                    </c:forEach>

                </table>

                </div>

            </div>
            <div class="col-4">


                <h4 class="d-flex justify-content-between align-items-center mb-3">
                    <span class="text-muted">Order No</span>
                    <span class="badge bg-secondary rounded-pill">3</span>
                </h4>
                <ul class="list-group mb-3">
                    <!--          <li class="list-group-item d-flex justify-content-between lh-sm">
                                <div>
                                  <h6 class="my-0">Customer name</h6>
                                  <small class="text-muted">Brief description</small>
                                </div>
                                <span class="text-muted">Abc</span>
                              </li>-->
                    <li class="list-group-item d-flex justify-content-between lh-sm">
                        <div>
                            <h6 class="my-0">Total</h6>
                            <!--<small class="text-muted">Brief description</small>-->
                        </div>
                        <span class="text-muted">$8</span>
                    </li>
                    <li class="list-group-item d-flex justify-content-between lh-sm">
                        <div>
                            <h6 class="my-0">Return</h6>
                            <!--<small class="text-muted">Brief description</small>-->
                        </div>
                        <span class="text-muted">$5</span>
                    </li>
                    <li class="list-group-item d-flex justify-content-between bg-light">
                        <div class="text-success">
                            <h6 class="my-0">Due</h6>
                            <!--<small>EXAMPLECODE</small>-->
                        </div>
                        <span class="text-success">?$5</span>
                    </li>
                    <li class="list-group-item d-flex justify-content-between">
                        <span>Payable Total</span>
                        <strong>$20</strong>
                    </li>
                </ul>

                <!--<form class="card p-2">-->
                <div class="input-group pull-right">

                    <div class="col-9"></div>
                    <button type="submit" class="btn btn-secondary ">Save</button>
                </div>
                <!--</form>-->


            </div>

        </div>



    </body>
</html>
