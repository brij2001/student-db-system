import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 *
 * @author brij-pc
 */
@WebServlet(urlPatterns = {"/UpdateStudentServ"})
public class UpdateStudentServ extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html");  
                PrintWriter out = response.getWriter(); 
            try{
            int uid=Integer.parseInt(request.getParameter("uid"));
            String sn=request.getParameter("sname").toUpperCase();
            String loc=request.getParameter("loc");
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/StudentDB","root","root");
            System.out.println(uid);
            System.out.println(sn);
            System.out.println(loc);
            }catch(Exception e) {
                out.println("ERROR "+ e.getMessage());
            }
    }
}
