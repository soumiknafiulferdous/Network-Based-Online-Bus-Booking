
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Passenger Table</title>
    </head>
    <body>
        <h1></h1>
        
               <% String bus_id = null;
          String bus_from = null;
          String bus_to = null;
           String seat_no = null;
           String dates = null;
           //String passenger_source = null;
           //String passenger_destination = null;
           //String no_of_seats = null;
           //String passenger_seat_no = null;
           //String travel_date = null;
       %>
                           <%
ResultSet rs = (ResultSet)request.getAttribute("info");
                     
                           %>


     
        
       <h1>Your Booked Tickets</h1> 
      <table border ="1" width="500" align="center"> 
         <tr bgcolor="00FF7F"> 
             <th><b>Bus Id </d></th>
          <th><b>Passenger Name</b></th> 
          <th><b>Starts From</b></th> 
          <th><b>Destination</b></th> 
          <th><b>Number of Available Seats</b></th> 
          <th><b>Date</b></th> 
          <th><b>Total Cost</b></th>
         </tr> 


         <tr>

               		              <%
while(rs.next()){ %>
 <td> <%= bus_id = rs.getString(1)%> </td>
<td> <%=  rs.getString(2) 
        %> </td>
<td> <%=  rs.getString(4) %> </td>

<td> <%=  rs.getString(3) %> </td>

<td> <%=  rs.getInt(5) %> </td>

<td> <%=  rs.getString(6) %> </td>

<td> <%=  rs.getInt(7) %> </td>
                
            </tr> 
            <%

}
%>
      </table> 
    </body>
</html>
