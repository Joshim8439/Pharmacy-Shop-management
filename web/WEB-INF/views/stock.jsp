


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <link href="<c:url value="/resources/css/style.css" />" />
    <script src="<c:url value="/resources/js/script.js" />"> </script>
</head>

<!--<div class="row" style="margin: 5px">
    <div class="col-8">
        <div class="row">
            <form>
                <input placeholder="Search" id="search-input" type="search" id="form1" class="form-control" />

            </form>
            <button id="search-button" type="button" class="btn btn-primary">
                <i class="fas fa-search">Search</i>
            </button>
        </div>

    </div>
    <div class="col-4">Category</div>
</div>


<div class="row" style="margin: 5px">
    <div class="col-8">
        <div class="row">
            <form method="GET" action="stockcat.htm">
                <input placeholder="Search" id="search-input" type="search" name="type" id="form1" class="form-control" />

            
            <button id="search-button" type="submit" class="btn btn-primary">Submit
                <i class="fas fa-search">Search</i>
            </button>
            </form>
        </div>

    </div>
    <div class="col-4">Products</div>
</div>-->
<div class="container-fluid" style="margin-top: 6%; margin-left: 6%">
    <div class="row" style="margin-top: 4%; margin-bottom: 2%">
        <div class="col-4"></div>
        <div class="col-4"><h1 style=" font-family: sans-serif;">Stock List</h1></div>
        <div class="col-4"></div>
    </div>
    <div class="row">
<!--    <div class="card col-2" style="margin:5px ;border-color:coral; width: 20%">
        <a href="purchase.htm" style="text-decoration: none"   data-toggle="bcd" title="Add Product"> <img class="card-img-top" src="https://static.addtoany.com/images/icon-200-3.png" alt="Card image" style="width:100%;height: 50%"/>
            <div class="card-body">
                <h4 class="card-title">Add</h4>

            </div>
        </a>
    </div>-->
    <c:forEach items="${products}" var="p">


        <div class="card col-3" style="margin-left: 3%; margin-bottom: 3% ;border-color:coral;">
            <a class="nav-link ${catType == p.category ? 'active' : ''}" href="purchase.htm" style="text-decoration: none" data-toggle="bcd" title="Price: ${p.price} quantity: ${p.quantity}"> <img class="card-img-top" src="${p.image}" alt="Card image" style="width:100%;"/>
                <div class="card-body">
                    <p class="card-title">${p.name}</p>
                    <h4 class="card-title">Price:${p.price}</h4>
                    <h4 class="card-title">Qty: ${p.quantity}</h4>

                </div>
            </a>
        </div>



    </c:forEach>
</div>




</div>
<script>
    $(document).ready(function () {
        $('[data-toggle="tooltip"]').tooltip();
    });
</script>