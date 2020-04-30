
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Check Ticket</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!-- Custom Theme files -->
        <script type="text/javascript">
        </script>
        <link href="style.css" rel="stylesheet" type="text/css" media="all" />
        <style>
            ul {
                list-style-type: none;
                margin: 0;
                padding: 0;
                overflow: hidden;
                background-color: #333;
            }

            li {
                float: left;
            }

            li a {
                display: block;
                color: white;
                text-align: center;
                padding: 14px 16px;
                text-decoration: none;
                margin-left: 20px;
            }

            /* Change the link color to #111 (black) on hover */
            li a:hover {
                background-color: green;
            }
            .active {
                background-color: green;
            }
        </style>
    </head>
    <body>
        <div class="main-w3layouts wrapper">


            <ul>
                <li>
                    <form action="show_passenger_info" method="Post">

                        <input type="submit" value="Show Bookings"><br>
                    </form>
                </li>
                <li><a href="index.html">Logout</a></li>

            </ul>
            <h1>Book Your Ticket</h1><h1><%String name = (String) request.getAttribute("insertvalue");%><%=name%></h1>
            <div class="main-agileinfo">
                <div class="agileits-top">
                    <form action="available_ticket_check" method="post">

                        <br> </br>
                        <span class="label success" style="color:whitesmoke" name="source" required="">Boarding from      </span>				
                        <select name="source">
                            <option style="color:black" value="Dhaka" width="50px" padding="320px">Dhaka</option>
                            <option style="color:black" value="Sylhet" width="50px" padding="320px">Sylhet</option>
                            <option style="color:black" value="Rajshahi" width="50px" padding="320px">Rajshahi</option>
                            <option style="color:black" value="Khulna" width="50px" padding="320px">Khulna</option>
                            <option style="color:black" value="Chittagong" width="50px" padding="320px">Chittagong</option>
                            <option style="color:black" value="Barisal" width="50px" padding="320px">Barisal</option>
                            <option style="color:black" value="Rangpur" width="50px" padding="320px">Rangpur</option>
                            <option style="color:black" value="Mymensing" width="50px" padding="320px">Mymensing</option>

                        </select>
                        <br><br>
                        <!--</form> -->

                        <span class="label success" style="color:whitesmoke" width="50px" name="destination" required="">Destination     </span>				
                        <select name="destination">
                            <option style="color:black" value="Dhaka">Dhaka</option>
                            <option style="color:black" value="Sylhet">Sylhet</option>
                            <option style="color:black" value="Rajshahi">Rajshahi</option>
                            <option style="color:black" value="Khulna">Khulna</option>
                            <option style="color:black" value="Chittagong">Chittagong</option>
                            <option style="color:black" value="Barisal">Barisal</option>
                            <option style="color:black" value="Rangpur">Rangpur</option>
                            <option style="color:black" value="Mymensing">Mymensing</option>
                          

                        </select>
                        <br>      <font color="white" >No.of Passengers</font>  <input type="number" name="seat_no" min="1" max="5" required="">

                        <br>	<br>	
                        <font color="white">Travel Date</font> 			<input class="text" type="date" name="date" placeholder="Date" required="" >

                        <div class="wthree-text">

                            <div class="clear"> </div>
                        </div>

                        <input type="submit" value="Check now" onclick="showAlert()" >
                        <h3>

                        </h3>

                    </form>

                </div>
            </div>
            <!-- copyright -->

           
        </div>
    </body>
</html>
