<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>

    .background {
        padding: 0 25px 25px;
        position: relative;
        width: 100%;
    }

    .container {
        margin: 0 auto;
        padding: 50px 0 0;
        max-width: 960px;
        width: 100%;
    }

    .panel {
        background-color: #FFF380;
        border-radius: 10px;
        padding: 15px 25px;
        position: relative;
        width: 100%;
        z-index: 10;
    }

    .pricing-table {
        box-shadow: 0px 10px 13px -6px rgba(0, 0, 0, 0.08), 0px 20px 31px 3px rgba(0, 0, 0, 0.09), 0px 8px 20px 7px rgba(0, 0, 0, 0.02);
        display: flex;
        flex-direction: column;
    }

    .pricing-table * {
        text-align: center;
        text-transform: uppercase;
    }


</style>


<div style=" margin-top: 4%; margin-bottom: 4%">
    <div class="container">
        
        <div class="panel pricing-table">
            <h1 style=" text-align: center; margin-top: 4% ;margin-bottom: 8% ;font-family: Algerian" >Today</h1>

            <div>
                
                <table class="table">
                    <thead>
                    <th>Name</th>
                    <th>Items</th>
                    <th>Qty</th>
                    <th>Total</th>
                    <th>Type</th>
                    
                        
                    </thead>
                    <c:forEach items="${todayOrder}" var="tod">
                        <tr>
                            <td>${tod.name}</td>
                            <td>${tod.productname}</td>
                            <td>${tod.quantity}</td>
                            <td>${tod.totalprice}</td>
                            <td>${tod.type}</td>
                            
                        </tr>
                        
                    </c:forEach>
                    
                </table>
                
            </div>

        </div>
    </div>
</div>