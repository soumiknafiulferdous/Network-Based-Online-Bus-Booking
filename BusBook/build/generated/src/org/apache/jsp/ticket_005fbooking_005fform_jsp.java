package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ticket_005fbooking_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <title>Check Ticket</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <!-- Custom Theme files -->\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("        </script>\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main-w3layouts wrapper\">\n");
      out.write("            <h1>Book Your Ticket</h1>\n");
      out.write("            <div class=\"main-agileinfo\">\n");
      out.write("                <div class=\"agileits-top\">\n");
      out.write("                    <form action=\"book_ticket\" method=\"post\">\n");
      out.write("\n");
      out.write("                        <input class=\"text\" type=\"text\" name=\"bus_id\" placeholder=\"Bus ID\" required=\"\"><br>\n");
      out.write("                        <input class=\"text\" type=\"text\" name=\"passenger_name\" placeholder=\"Passenger's Name\" required=\"\">\n");
      out.write("                        <br> <br>\n");
      out.write("                        <span class=\"label success\" style=\"color:whitesmoke\" name=\"passenger_source\" required=\"\">Boarding from      </span>\t\t\t\t\n");
      out.write("                        <select name=\"passenger_source\">\n");
      out.write("                            <option style=\"color:black\" value=\"Dhaka\" width=\"50px\" padding=\"320px\">Dhaka</option>\n");
      out.write("                            <option style=\"color:black\" value=\"Sylhet\" width=\"50px\" padding=\"320px\">Sylhet</option>\n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                        <br><br>\n");
      out.write("                        <!--</form> -->\n");
      out.write("\n");
      out.write("                        <span class=\"label success\" style=\"color:whitesmoke\" width=\"50px\" name=\"passenger_destination\" required=\"\">Destination     </span>\t\t\t\t\n");
      out.write("                        <select name=\"passenger_destination\">\n");
      out.write("                            <option style=\"color:black\" value=\"Dhaka\">Dhaka</option>\n");
      out.write("                            <option style=\"color:black\" value=\"Sylhet\">Sylhet</option>\n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                        <br>      <font color=\"white\" >No.of Passengers</font>  <input type=\"number\" name=\"passenger_seat_no\" min=\"1\" max=\"5\" required=\"\">\n");
      out.write("\n");
      out.write("                        <br>\t<br>\t\n");
      out.write("                        <font color=\"white\">Travel Date</font> \t\t\t<input class=\"text\" type=\"date\" name=\"travel_date\" placeholder=\"Date\" required=\"\" >\n");
      out.write("\n");
      out.write("                        <div class=\"wthree-text\">\n");
      out.write("\n");
      out.write("                            <div class=\"clear\"> </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <input type=\"submit\" value=\"Check now\" onclick=\"showAlert()\" >\n");
      out.write("                        <h3>\n");
      out.write("\n");
      out.write("                        </h3>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- copyright -->\n");
      out.write("\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
