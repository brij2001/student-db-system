import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(urlPatterns = {"/View"})
public class View extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
            try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/StudentDB","root","root");
            PreparedStatement st=con.prepareStatement("select * from STUDENTTABLE");
            out.print("<br><form method=\"post\" action=\"./Home\"><input type=\"submit\" value=\"Home\"></form>");
            ResultSet rs=st.executeQuery();
            out.println("<center><table border=1 width=40% height=20%>");  
             out.println("<tr><th>UID</th><th>Student Name</th><th>Locality</th><th>Date of Birth</th></tr>");  
             while (rs.next()) 
             {  
                 int u = rs.getInt("UID");  
                 String nm = rs.getString("name");  
                 String locality = rs.getString("locality");
                 Date dob=rs.getDate("dob");
                 out.println("<tr><td><center>" + u + "</td><td><center>" + nm + "</td><td><center>" + locality + "</td><td><center>"+dob+"</td></tr>");   
             }  
             out.println("</table>");  
             out.println("</html></body>");  
             con.close();  
            
            
        }catch (Exception e) {
            out.println("ERROR "+ e.getMessage());
        }
    
    
    
    }

}
