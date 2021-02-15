<%-- 
    Document   : login
    Created on : Jan 28, 2021, 11:05:24 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <style> 
            body {
                background-image:url('https://cdn.pixabay.com/photo/2015/12/24/15/46/hand-1106934_1280.jpg');
                background-position:center;
                background-size:cover;

                /*  -webkit-font-smoothing: antialiased;
                  font: normal 14px Roboto,arial,sans-serif;
                  font-family: 'Dancing Script', cursive!important;*/
            }

            .container {
                /*padding: 110px;*/
            }
            /*::placeholder {  Chrome, Firefox, Opera, Safari 10.1+ 
                color: #ffffff!important;
                opacity: 1;  Firefox 
                font-size:18px!important;
            }*/
            .form-login {
                background-color: rgba(0,0,0,0.55);
                padding-top: 10px;
                padding-bottom: 20px;
                padding-left: 20px;
                padding-right: 20px;
                border-radius: 15px;
                border-color:#d2d2d2;
                border-width: 5px;
                color:white;
                box-shadow:0 1px 0 #cfcfcf;
            }
            .form-control{
                background:transparent!important;
                color:white!important;
                font-size: 18px!important;
            }
            h1{
                color:white!important;
            }
            h4 { 
                border:0 solid #fff; 
                border-bottom-width:1px;
                padding-bottom:10px;
                text-align: center;
            }

            .form-control {
                border-radius: 10px;
            }
            .text-white{
                color: white!important;
            }
            .wrapper {
                text-align: center;
            }

        </style>  


        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>


        <div class="container" >
            <div class="row">
                <div class="col-md-offset-5 col-md-4 text-center">
                    <!--<form method="GET" action="/logininfo.htm">-->
                    <div class="form-login"></br>
                        <h4>Login</h4>
                        </br>
                        <input type="text" id="userName" name="email" class="form-control input-sm chat-input" placeholder="username"/>
                        </br></br>
                        <input type="text" id="userPassword" name="password" class="form-control input-sm chat-input" placeholder="password"/>
                        </br></br>
                        <div class="wrapper">
                            <span class="group-btn">
                                <button type="submit" class="btn-primary">login </button>
                            </span>
                        </div>
                    </div>
                        <!--</form>-->
                </div>
            </div>
        </div>
    </b>




</body>
</html>
