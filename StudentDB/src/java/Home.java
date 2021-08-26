
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
         
    out.println("<html lang=\"en\">\n" +
"<head>\n" +
"	<meta charset=\"UTF-8\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
"	<title>Admin Panel</title>\n" +
"	<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n" +
"</head>\n" +
"<body>");
    
    out.print("<div class=\"box\">");
    out.print("<center><h1 style='color:white;'>Welcome");
    out.print("</h1><br><br><form method=\"post\" action=\"./OnlyView.jsp\"><input type=\"submit\" value=\"View Students\"></form>");
    out.print("</h1><br><form method=\"post\" action=\"./ViewStudent.jsp\"><input type=\"submit\" value=\"Update Students\"></form>");
    out.print("<br><form method=\"post\" action=\"./AddStudent.jsp\"><input type=\"submit\" value=\"Add Students\"></form>");
    out.print("<br><form method=\"post\" action=\"./DeleteStudent.jsp\"><input type=\"submit\" value=\"Remove Students\"></form>");
    
    
    out.print("</center>");
    out.print("</div>");
    out.close();  
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
        out.println("<html lang=\"en\">\n" +
"<head>\n" +
"	<meta charset=\"UTF-8\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
"	<title>Admin Panel</title>\n" +
"	<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n" +
"</head>\n" +
"<body>");
    
    out.print("<div class=\"box\">");
    out.print("<center><h1 style='color:white;'>Welcome");
    out.print("</h1><br><br><form method=\"post\" action=\"./OnlyView.jsp\"><input type=\"submit\" value=\"View Students\"></form>");
    out.print("</h1><br><form method=\"post\" action=\"./ViewStudent.jsp\"><input type=\"submit\" value=\"Update Students\"></form>");
    out.print("<br><form method=\"post\" action=\"./AddStudent.jsp\"><input type=\"submit\" value=\"Add Students\"></form>");
    out.print("<br><form method=\"post\" action=\"./DeleteStudent.jsp\"><input type=\"submit\" value=\"Remove Students\"></form>");
    
    
    out.print("</center>");
    out.print("</div>");
    out.close();  
    
    }

}
