
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class login extends HttpServlet {

    private static final long serialVersionUID = 1L;
    protected HttpServletRequest request;
    protected HttpServletResponse response;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //  processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // processRequest(request, response);
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        int flag = 0;
        //out.print(username + " " + password);
        if (username.isEmpty() || password.isEmpty()) {
            RequestDispatcher req = request.getRequestDispatcher("login.jsp");
            req.include(request, response);
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }

            Connection conn = null;
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/busticketdb", "root", "");
            } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                Statement st = (Statement) conn.createStatement();

                String sql = "select * from registration where username = '" + username + "' and password = '" + password + "'";
                ResultSet rs = st.executeQuery(sql);
                String user_name = username;

                if (rs.next()) {

                     //    check_login = "true"; 
                    //  request.setAttribute("loginResult",check_login);
                    request.setAttribute("insertvalue", user_name);
                    RequestDispatcher req = request.getRequestDispatcher("ticket_check.jsp");
                    req.include(request, response);
                    
                   // request.setAttribute("source", request.getParameter("source"));
                   // request.setAttribute("destination", request.getParameter("destination"));
                    //request.setAttribute("seat_no", request.getParameter("seat_no"));
                    //request.setAttribute("date", request.getParameter("date"));
                    
                   // RequestDispatcher req = request.getRequestDispatcher("available_ticket_check.jsp");
                   // req.include(request, response);
                    

                } else {

                    RequestDispatcher req = request.getRequestDispatcher("login.jsp");
                    req.include(request, response);
                }

            } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
