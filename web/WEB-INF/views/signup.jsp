<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>

    <style>

        .price:hover {
            box-shadow: 2px 8px 12px 4px rgba(0,0,0,0.2)
        }

    </style>


    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<br>
<div class="container-fluid">
    <div class="row">

        <div class="col-8">
            <div class="row">
                <div class="col-2"></div>

                <div class="input-group col-10">
                    <input type="search" placeholder="Search Product" class="input-control" />
                    <div class="input-group-append">
                        <button class="btn btn-outline-secondary" type="button"><span><i class="fa fa-search"></i></span></button>
                    </div>
                </div>
            </div>
            <br>
            <div class="row">

                <c:forEach items="${products}" var="p">
                    <div class="card col-3 price" style="margin:5px ;border-color: #16A085; border-bottom-width: 2px;">
                        <div> <img class="card-img-top" src="${p.image}" alt="Card image" style="width:100%; height: 50%; margin-top: 4%"/></div>
                        <a href="salepass.htm?id=${p.id}&name=${p.name}&price=${p.price+5}&quantity=${p.quantity}" style="text-decoration: none" data-toggle="bcd" title="Price: ${p.price} quantity: ${p.quantity}"> 
                            <div class="card-body">
                                <P style="font-size: 18px">${p.name}</P>
                                <h6>Price ${p.price+5}</h6>
                                <h6>Qty ${p.quantity}</h6>

                            </div>
                        </a>
                    </div>

                </c:forEach>



            </div>


        </div>

        <div class="col-4">
            <form method="GET" action="salepassinforder.htm">
                <div class="row">

                    <div class="input-group">
                        <select name="customertype" class="custom-select" id="inputGroupSelect04">
                            <option selected>General</option>

                            <option>Sohel</option>
                            <option>Tipu</option>

                            <!--                <option value="2">Two</option>
                                            <option value="3">Three</option>-->
                        </select>
                        <div class="input-group-append">
                            <button class="btn btn-outline-secondary" type="button"><span><i class="fa fa-user"></i></span></button>
                        </div>
                    </div>

                </div><br>


                <table class="table">
                    <tr>
                        <th>Items</th>
                        <th>Price</th>
                        <th>Quantity</th>
                    </tr>

                    <c:forEach items="${catList}" var="cat">
                        <tr>
                            
                            <td>${cat.name}</td>
                            <td>${cat.price}</td>


                            <td><input name="quantity" value="${cat.quantity}"/> </td>

                        <input hidden="true" value="${cat.id}" name="id"/>

                        <input hidden="true" value="${cat.price}" name="price"/>

                        <input hidden="true" value="${cat.name}" name="name"/>


                        </tr>
                    </c:forEach>


                </table>
                <input hidden="true" value="${cat.quantity*cat.price}" name="totalprice"/>

                <button class="btn btn-primary" type="submit" >Bill Generate</button>
            </form>

        </div>


    </div>

</div>







