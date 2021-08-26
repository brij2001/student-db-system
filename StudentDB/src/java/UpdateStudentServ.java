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
            int original_uid=Integer.parseInt(request.getParameter("original_uid"));
            int uid=Integer.parseInt(request.getParameter("new_uid"));
            String sn=request.getParameter("sname").toUpperCase();
            String loc=request.getParameter("loc");
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/StudentDB","root","root");
            PreparedStatement st = con.prepareStatement("UPDATE STUDENTTABLE SET UID=?,NAME=?,LOCALITY=?,DOB=? WHERE UID=?");
            st.setInt(1, uid);
            st.setString(2,sn);
            st.setString(3, loc);
            st.setDate(4, java.sql.Date.valueOf(request.getParameter("dob")));
            st.setInt(5,original_uid);
            st.executeUpdate();
            out.println("<script>");
            out.println("alert('Student Updated.');");
            out.println("window.location.replace('./ViewStudent.jsp');");
            out.println("</script>");
            
            }catch(Exception e) {
                out.println("ERROR "+ e.getMessage());
            }
    }
}
