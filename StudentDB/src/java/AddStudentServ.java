import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(urlPatterns = {"/AddStudentServ"})
public class AddStudentServ extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");  
    PrintWriter out = response.getWriter(); 
            try{
            int uid=Integer.parseInt(request.getParameter("uid"));
            String sn=request.getParameter("sname");
            String loc=request.getParameter("loc");
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/StudentDB","root","root");
            PreparedStatement st = con.prepareStatement("insert into STUDENTTABLE values(?,?,?,?)");
            st.setInt(1, uid);
            st.setString(2,sn);
            st.setString(3, loc);
            st.setDate(4, java.sql.Date.valueOf(request.getParameter("dob")));
            st.executeUpdate();
            out.println("<script>");
            out.println("alert('Added.');");
            out.println("window.location.replace('./Home');");
            out.println("</script>");           
            
            }catch(Exception e) {
            out.println("ERROR "+ e.getMessage());


            }
    }

}
