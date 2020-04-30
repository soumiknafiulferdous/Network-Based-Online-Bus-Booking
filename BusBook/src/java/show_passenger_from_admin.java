
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

public class show_passenger_from_admin extends HttpServlet {
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //  processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //  processRequest(request, response);
        PrintWriter out = response.getWriter();

        try {
           // dbcon mydb = new dbcon();
            //Connection conn = mydb.getCon();

            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/busticketdb", "root", "");

            Statement st = (Statement) conn.createStatement();

            String sql = "select * from passenger_travel_info";

            st.executeQuery(sql);

            ResultSet rs = st.executeQuery("select * from passenger_travel_info");

            request.setAttribute("show_total_table", rs);
            RequestDispatcher rd
                    = request.getRequestDispatcher("show_passenger_from_admin.jsp");
            rd.include(request, response);
            /* out.println("Data is Successfully Inserted into Passenger Table");
             out.println("<html>");
             out.println("<head>");
             out.println("<body>");
             //out.println("<a href=\"seat_book.html\">link text</a>");
             out.println("</body>");
             out.println("</head>");
            
             out.println("</html>");*/
            //<a href="url">link text</a>
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
