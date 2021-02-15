
<head>
    <style>
        .my-card
        {
            position:absolute;
            left:40%;
            top:-20px;
            border-radius:50%;

        }


        .price:hover {
            box-shadow: 0 8px 12px 0 rgba(0,0,0,0.2)
        }

        /*user card*/
        .card-counter{
            box-shadow: 2px 2px 10px #DADADA;
            margin: 5px;
            padding: 20px 10px;
            height: 160px;
            width: 450px;
            border-radius: 15px;
            transition: .3s linear all;
        }

        .card-counter .count-numbers{
            position: absolute;
            right: 35px;
            top: 20px;
            font-size: 32px;
            display: block;
        }

        .card-counter .count-name{
            position: absolute;
            right: 35px;
            top: 65px;
            font-style: italic;
            text-transform: capitalize;
            opacity: 0.5;
            display: block;
            font-size: 18px;
        }



        /*        .card-counter.info{
                    background-color: #26c6da;
                    color: #FFF;
                }*/


        .ribbon {
            position: absolute;
            right: -5px;
            top: -5px;
            z-index: 1;
            overflow: hidden;
            width: 75px;
            height: 75px;
            text-align: center;
        }

        .ribbon span {
            font-size: 10px;
            color: #fff;
            text-transform: uppercase;
            text-align: center;
            font-weight: bold;
            line-height: 20px;
            transform: rotate(45deg);
            width: 100px;
            display: block;
            background: #F62459;
            background: linear-gradient(#ff89b1 0%, #ff006e 100%);
            box-shadow: 0 3px 10px -5px rgba(0, 0, 0, 1);
            position: absolute;
            top: 19px;
            right: -21px;
            border: 1px solid #D9D9D9;

        }





    </style>
</head>
<br>
<button type="button" style=" font-family: algerian; font-size: 150%" class="btn btn-hover btn-lg btn-block">Product & Customer</button>
<br><br>
<div class="row">

    <div class="col-4">

        <a href="stock.htm"><div class="card-counter info price">
            <i style="color: #16A085" class="fa fa-users"></i>
            <span class="count-numbers">${products.size()}</span>
            <span class="count-name">Total Products</span>
        </div></a>

    </div>

    <div class="col-4">

        <div class="card-counter info price">
            <i style="color: #16A085"  class="fa fa-shopping-cart"></i>
            <span class="count-numbers">${invoice.size()}</span>
            <span class="count-name">Total Order</span>
        </div>


    </div>

    <div class="col-4">

        <a href="sale.htm" style=" text-decoration: none"><div class="card-counter info price">
            <i style="color: #16A085"></i>
            <h3 style=" margin-top: 6%;color: #16A085; text-align: center; font-style: italic" >Today</h3>
            <span style="color: #16A085" class="count-name"></span>
        </div></a>

    </div>
</div>
<!--//purch-->
<br>
<button type="button" style=" font-family: algerian; font-size: 150%" class="btn btn btn-lg btn-block">Pricing</button>
<br><br>
<div class="row">

    <div class="col-4">
        

        <div class="card border-info mx-sm-1 p-3">
            <div class="card border-info shadow text-info p-3 my-card" ><span class="fa fa-usd" aria-hidden="true"></span></div>
            <div class="text-info text-center mt-3"><h4>Total Purchase</h4></div>
            <div class="text-info text-center mt-2"><h1>250</h1></div>
        </div>
   

    </div>
    <div class="col-4">
        

        <div class="card border-info mx-sm-1 p-3">
            <div class="card border-info shadow text-info p-3 my-card" ><span class="fa fa-usd" aria-hidden="true"></span></div>
            <div class="text-info text-center mt-3"><h4>Total Sale</h4></div>
            <div class="text-info text-center mt-2"><h1>${totSalePrice}</h1></div>
        </div>
   

    </div>
    <div class="col-4">
        

        <div class="card border-info mx-sm-1 p-3">
            <div class="card border-info shadow text-info p-3 my-card" ><span class="fa fa-usd" aria-hidden="true"></span></div>
            <div class="text-info text-center mt-3"><h4>Revenue</h4></div>
            <div class="text-info text-center mt-2"><h1>${totSalePrice-totSalePurch}</h1></div>
        </div>
   

    </div>
        
    

        


    </div>
</div>

<br>
<button type="button" style=" font-family: algerian; font-size: 150%" class="btn btn btn-lg btn-block">Alert Table</button>
<br><br>
<div class="row">

    <div class="col-2"></div>
    <div class="col-4">



        <a style="text-decoration: none"  href="quantitylist.htm"> <div class="card border-danger mb-3" style="max-width: 18rem;">
                <div class="card-header" style=" text-align: center; font-size: 30px">Out of Quantity </div>
            <div class="card-body text-danger">
                <h5 class="card-title " style=" text-align: center; font-size: 30px">${alertList.size()}</h5>

            </div>

           </div></a>
    </div>
    <div class="col-4">

        <a href="list.htm" style=" text-decoration: none"><div class="card border-danger mb-3" style="max-width: 18rem;">
            <div class="card-header" style=" text-align: center; font-size: 30px">Out of Date Products</div>
            <div class="card-body text-danger">
                <h5 class="card-title" style=" text-align: center; font-size: 30px">${expdateList.size()}</h5>

            </div>

        </div></a>
    </div>


<div class="col-2"></div>


</div>





<!--<div class="col-md-3">
    <div class="card">

        <img class="img-fluid" src="http://www.squarepharma.com.bd/products/Product-image_l.jpg">
        <button class="btn view-btn">SEDAN</button>
        <div class="ribbon"><span>Popular</span></div>


    </div>
</div>-->



