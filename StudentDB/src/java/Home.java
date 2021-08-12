import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/Home"})
public class Home extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    
    out.print("<center><h1>Welcome");
    out.print("</h1><br><br><form method=\"post\" action=\"./View\"><input type=\"submit\" value=\"View Students\"></form>");
    out.print("</h1><br><br><form method=\"post\" action=\"./ViewStudent.jsp\"><input type=\"submit\" value=\"View and Update Students\"></form>");
    out.print("<br><form method=\"post\" action=\"./AddStudent.jsp\"><input type=\"submit\" value=\"Add Students\"></form>");
    out.print("<br><form method=\"post\" action=\"./DeleteStudent.jsp\"><input type=\"submit\" value=\"Remove Students\"></form>");
    
    
    out.print("</center>");
    out.close();  
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    
    out.print("<center><h1>Welcome");
    out.print("</h1><br><br><form method=\"post\" action=\"./View\"><input type=\"submit\" value=\"View Students\"></form>");
    out.print("</h1><br><br><form method=\"post\" action=\"./ViewStudent.jsp\"><input type=\"submit\" value=\"View and Update Students\"></form>");
    out.print("<br><form method=\"post\" action=\"./AddStudent.jsp\"><input type=\"submit\" value=\"Add Students\"></form>");
    out.print("<br><form method=\"post\" action=\"./DeleteStudent.jsp\"><input type=\"submit\" value=\"Remove Students\"></form>");
    
    
    out.print("</center>");
    out.close(); 
    }

}
