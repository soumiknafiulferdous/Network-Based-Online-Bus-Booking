
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class available_ticket_check extends HttpServlet {

    private static final long serialVersionUID = 1L;
    protected HttpServletRequest request;
    protected HttpServletResponse response;
    String name = null;

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
         name = (String) request.getAttribute("insertvalue");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
        //ArrayList<String> ticket_check_information = new ArrayList<String>();

        String source = request.getParameter("source");
        String destination = request.getParameter("destination");
        String date = request.getParameter("date");
        String seat_num = request.getParameter("seat_no");
        int seat_number1 = Integer.parseInt(seat_num);
        PrintWriter out = response.getWriter();

        try {
          //  dbcon mydb = new dbcon();
            // Connection conn = mydb.getCon();

            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/busticketdb", "root", "");

            Statement st = (Statement) conn.createStatement();

           // String sql = "select * from bus_info where bus_from="+source+"and bus_to="+destination+"";
            // String sql = "select * from bus_info where bus_from = "+source+"";
            // out.print(source);
            String sql = "select * from bus_info where (seat_number - '" + seat_number1 + "') >=0 and bus_from = '" + source + "' and bus_to= '" + destination + "' and date = '" + date + "'";
        //  st.executeUpdate("UPDATE bus_info set seat_number = 10 where seat_number = 20 ");
            // out.print("done done done   ");
            ResultSet rs = st.executeQuery(sql);

            request.setAttribute("data", rs);
            RequestDispatcher rd
                    = request.getRequestDispatcher("show_available_tickets.jsp");
            rd.include(request, response);

        } catch (ClassNotFoundException e) {

            e.printStackTrace();

        } catch (SQLException e) {

            e.printStackTrace();

        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
