<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <style>

        body {
            background-color:  #eee;
        }
        .title {

            margin-bottom: 50px;
            text-transform: uppercase;
        }

        .card-block {
            font-size: 1em;
            position: relative;
            margin: 0;
            padding: 1em;
            border: none;
            border-top: 1px solid rgba(34, 36, 38, .1);
            box-shadow: none;

        }
        .card {
            font-size: 1em;
            overflow: hidden;
            padding: 5;
            border: none;
            border-radius: .28571429rem;
            box-shadow: 0 1px 3px 0 #d4d4d5, 0 0 0 1px #d4d4d5;
            margin-top:20px;
        }

        .carousel-indicators li {
            border-radius: 12px;
            width: 12px;
            height: 12px;
            background-color: #404040;
        }
        .carousel-indicators li {
            border-radius: 12px;
            width: 12px;
            height: 12px;
            background-color: #404040;
        }
        .carousel-indicators .active {
            background-color: white;
            max-width: 12px;
            margin: 0 3px;
            height: 12px;
        }
        
        
        /*invoice*/

            #invoice-POS{
                box-shadow: 0 0 1in -0.25in rgba(0, 0, 0, 0.5);
                padding:2mm;
                margin: 0 auto;
                width: 44mm;
                background: #FFF;


/*                ::selection {background: #f31544; color: #FFF;}
                ::moz-selection {background: #f31544; color: #FFF;}*/
                h1{
                    font-size: 1.5em;
                    color: #222;
                }
                h2{font-size: .9em;}
                h3{
                    font-size: 1.2em;
                    font-weight: 300;
                    line-height: 2em;
                }
                p{
                    font-size: .7em;
                    color: #666;
                    line-height: 1.2em;
                }

                #top, #mid,#bot{ /* Targets all id with 'col-' */
                    border-bottom: 1px solid #EEE;
                }

                #top{min-height: 100px;}
                #mid{min-height: 80px;} 
                #bot{ min-height: 50px;}


                .info{
                    display: block;
                    //float:left;
                    margin-left: 0;
                }
                .title{
                    float: right;
                }
                .title p{text-align: right;} 
                table{
                    width: 100%;
                    border-collapse: collapse;
                }
                td{
                    //padding: 5px 0 5px 15px;
                    //border: 1px solid #EEE
                }
                .tabletitle{
                    //padding: 5px;
                    font-size: .5em;
                    background: #EEE;
                }
                .service{border-bottom: 1px solid #EEE;}
                .item{width: 24mm;}
                .itemtext{font-size: .5em;}

                #legalcopy{
                    margin-top: 5mm;
                }



            }

        
        
        


    </style>
</head>

<!--<h3>This is bill ${catList.size()}</h3>-->
<%--<c:forEach items="${catList}" var="cat">--%>
<!--    <h4>Id ${cat.id}</h4>
    <h4>Name ${cat.name}</h4>
    <h4>Price ${cat.price}</h4>
    <h4>quantity ${cat.quantity}</h4>-->

<%--</c:forEach>--%>





    



<div class="container-fluid" style="margin-top: 4%; margin-left: 6%">
    <div class="card float-left">


        <div class="row">
            <div class="col-sm-5">
                <img class="d-block w-100" src="https://cdn.pixabay.com/photo/2020/04/04/04/23/money-5000789_960_720.png" alt="">
            </div>
            <div class="col-sm-7">
                <div class="card-block">
                    <!--           <h4 class="card-title">Small card</h4> -->
                    <h3 style="text-align: center">Billing Summary</h3>
                    <table class="table" style="border: none">
                        <tr>
                            <th>Item</th>
                            <th>Price</th>
                            <th>Quantity</th>
                            <th>Total</th>
                        </tr>
                        <tr>
                            <td>${catList[0].name}</td>
                            <td>${price}</td>
                            <td>${quantity}</td>
                            <td>${price*quantity}</td>
                        </tr>
                        <%--<c:forEach items="${catList}" var="cat">--%>
                        <tr>
                            <td>${catList[1].name}</td>
                            <td>${catList[1].price}</td>
                            <td>${catList[1].quantity}</td>
                            <td>${catList[1].quantity*catList[1].price}</td>
                        </tr>
                        
                        

                        <%--</c:forEach>--%>
                    </table>
                    <hr>
                    <div class="row">
                        <div class="col-7">
                            
                        </div>
                        <div class="col-5">
                            <h4 style=" color: #16A085">Payable: ${price*quantity+catList[1].quantity*catList[1].price}</h4>
                        </div>
                            
                        
                    </div>
<!--                        <form method="GET" action="salepassinfo">
                            <input hidden="true" name="id" value="${catList[1].id}" />
                            <input hidden="true" name="id" value="${catList[1].name}" />
                            <input hidden="true" name="price" value="${catList[1].price}" />
                            <input hidden="true" name="quantity" value="${catList[1].quantity-5}" />
                            
                            <button type="submit">Submit</button>-->
        
                            <a data-toggle="modal" data-target="#myModal" type="button" class="btn btn-primary btn-outline-warning rounded-pill">Invoice</a>
                    <!--</form>-->
                </div>
            </div>

        </div>
    </div>
</div>


<div class="modal fade" id="myModal">
    <div class="modal-dialog modal-lg">
      <div class="modal-content">
      
        <!-- Modal Header -->
        <div class="modal-header">
            <center><h4 class="modal-title">Pharmacy</h4></center>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        
        <!-- Modal body -->
        <div class="modal-body">
          <div id="invoice-POS" style="width: 550px">

            <center id="top">
                <div class="logo"></div>
                <div class="info"> 
                    <h5>Customer Type</h5>
                </div><!--End Info-->
            </center><!--End InvoiceTop-->

            <div id="mid">
                <div class="info">
                    
                    <p style=" text-align: center">${customertype}</p>
                    <h5 style="text-align: right">Date: ${date}</h5>
                </div>
                
            </div><!--End Invoice Mid-->

            <div id="bot">

                <div id="table">
                    <table class="table">
                        <tr class="tabletitle">
                            <td class="item"><h2>Item</h2></td>
                            <td class="Hours"><h2>Price</h2></td>
                            <td class="Hours"><h2>Qty</h2></td>
                            <td class="Rate"><h2>Total</h2></td>
                        </tr>

                        <tr class="service">
                            <td class="tableitem"><p class="itemtext">${catList[0].name}</p></td>
                            <td class="tableitem"><p class="itemtext">${price}</p></td>
                            <td class="tableitem"><p class="itemtext">${quantity}</p></td>
                            <td class="tableitem"><p class="itemtext">${price*quantity}</p></td>
                        </tr>

                        <tr class="service">
                            <td class="tableitem"><p class="itemtext">${catList[1].name}</p></td>
                            <td class="tableitem"><p class="itemtext">${catList[1].price}</p></td>
                            <td class="tableitem"><p class="itemtext">${catList[1].quantity}</p></td>
                            <td class="tableitem"><p class="itemtext">${catList[1].quantity*catList[1].price}</p></td>
                        </tr>

                        


<!--                        <tr class="tabletitle">
                            <td></td>
                            <td class="Rate"><h2>tax</h2></td>
                            <td class="payment"><h2>$419.25</h2></td>
                        </tr>-->

                        <tr class="tabletitle">
                            <td></td>
                            <td class="Rate"><h2>Payable</h2></td>
                            <td class="payment"><h2>${price*quantity+catList[1].quantity*catList[1].price}</h2></td>
                        </tr>

                    </table>
                </div><!--End Table-->

                <div id="legalcopy">
                    <p class="legal" style=" text-align: center"><strong>Thank you!
                    </p>
                </div>

            </div><!--End InvoiceBot-->
        </div><!--End Invoice-->
        </div>







