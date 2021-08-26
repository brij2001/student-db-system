package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.*;
import java.io.IOException;
import java.sql.*;

public final class OnlyView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String id = request.getParameter("id");
    String driver = "org.apache.derby.jdbc.ClientDriver";
    String connectionUrl = "jdbc:derby://localhost:1527/";
    String database = "StudentDB";
    String userid = "root";
    String password = "root";
    try {
        Class.forName(driver);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

      out.write('\n');

    try {
        connection = DriverManager.getConnection(connectionUrl + database, userid, password);
        statement = connection.createStatement();
        String sql = "select * from STUDENTTABLE ORDER BY UID";
        resultSet = statement.executeQuery(sql);

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We\" crossorigin=\"anonymous\">\n");
      out.write("</head>\n");
      out.write("    <body><center>\n");
      out.write("        <h1>View and Update</h1>\n");
      out.write("        \n");
      out.write("        <table class=\"table table-dark table-striped\">\n");
      out.write("  <thead>\n");
      out.write("                <tr><th>UID</th><th>Student Name</th><th>Address</th><th>Date of Birth</th><th>Edit</th></tr>\n");
      out.write("                </thead>\n");
      out.write("  <tbody>\n");

        while (resultSet.next()) {

      out.write("\n");
      out.write("                <form method=\"post\" action=\"./UpdateStudentServ\">\n");
      out.write("                <input type=\"hidden\" name=\"uid\" value=\"");
      out.print(resultSet.getInt("UID"));
      out.write("\">\n");
      out.write("                   \n");
      out.write("                <tr><td><input type=\"text\" name=\"uid\" value=\"");
      out.print(resultSet.getInt("UID"));
      out.write("\"></td>\n");
      out.write("                    \n");
      out.write("                <td><input type=\"text\" name=\"sname\" value=\"");
      out.print(resultSet.getString("NAME"));
      out.write("\"></td>\n");
      out.write("                   \n");
      out.write("                <td><input type=\"text\" name=\"loc\" value=\"");
      out.print(resultSet.getString("LOCALITY"));
      out.write("\"></td>\n");
      out.write("                 \n");
      out.write("                <td><input type=\"text\" name=\"dob\" value=\"");
      out.print(resultSet.getString("DOB"));
      out.write("\"></td>\n");
      out.write("                            \n");
      out.write("                <td><input class=\"btn btn-primary\" type=\"submit\" value=\"submit\"></td></tr>\n");
      out.write("                </tbody>\n");
      out.write("        </form>\n");
      out.write("                </table>\n");
      out.write("        ");

                }
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        
      out.write("\n");
      out.write("    </body>\n");
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
