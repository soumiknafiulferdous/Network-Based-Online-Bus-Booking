
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class book_ticket extends HttpServlet {

    /* protected void processRequest(HttpServletRequest request, HttpServletResponse response)
     throws ServletException, IOException {
     response.setContentType("text/html;charset=UTF-8");
     try (PrintWriter out = response.getWriter()) {
     /* TODO output your page here. You may use following sample code. */
    /*   out.println("<!DOCTYPE html>");
     out.println("<html>");
     out.println("<head>");
     out.println("<title>Servlet book_ticket</title>");            
     out.println("</head>");
     out.println("<body>");
     out.println("<h1>Servlet book_ticket at " + request.getContextPath() + "</h1>");
     out.println("</body>");
     out.println("</html>");
     }
     }*/
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      //  processRequest(request, response);
PrintWriter out = response.getWriter();
        
        try {
            
            
        //out.println("Welcome");

        String bus_id = request.getParameter("bus_id");
        String passenger_name = request.getParameter("passenger_name");
        String passenger_source = request.getParameter("passenger_source");
        String passenger_destination = request.getParameter("passenger_destination");
        String travel_date = request.getParameter("travel_date");
        String passenger_seat_num = request.getParameter("passenger_seat_no");

        int passenger_seat_no = Integer.parseInt(passenger_seat_num);
        double cost = 50.0 * passenger_seat_no;
        int updated_seat_no = 0;
        int updated_seat_no1 = 0;

           
            
            
            Class.forName("com.mysql.jdbc.Driver");
            //  out.print("abar o pari na1 ");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/busticketdb", "root", "");

            Statement st = (Statement) conn.createStatement();

            String sql = "insert into passenger_travel_info (passenger_name,passenger_dest,passenger_src,no_of_seats,total_cost,travel_date) values('" + passenger_name + "','" + passenger_source + "','" + passenger_destination + "','" + passenger_seat_num + "','" + cost + "','" + travel_date + "')";
          //  String sql = "insert into bus_info (bus_from) values('Rajshahi')";
            // String sql = "insert into bus (busname) values('mai')";

            st.executeUpdate(sql);
            
            ResultSet rs = st.executeQuery("select seat_number from bus_info where bus_ID = '" + Integer.parseInt(bus_id) + "'");
             
            while (rs.next()) {
                int seatnum = rs.getInt(1);
                updated_seat_no1 = seatnum - passenger_seat_no;
            }
            updated_seat_no = updated_seat_no1;
            st.executeUpdate("UPDATE bus_info set seat_number = '" + updated_seat_no + "' where bus_ID = '" + Integer.parseInt(bus_id) + "' ");
            
            
//            RequestDispatcher req = request.getRequestDispatcher("ticket_booking_form.jsp");
//            req.forward(request, response);
         

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        out.println("<html><head>");
            out.println("</head>");
            out.println("<body> <img src=\"main.jpg\" alt=\"Cinque Terre\" width=\"1200\" height=\"500\">");
            out.println(" <h1>  Your booking has confirmed </h1>");
            out.println("<a href='ticket_booking_form.jsp'><button type=\"button\">Book again!</button></a>");
            out.println("<a href='index.html'><button type=\"button\">Homepage</button></a>");
            out.println("</body></html>");
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
