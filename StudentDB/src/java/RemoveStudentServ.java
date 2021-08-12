import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


@WebServlet(urlPatterns = {"/RemoveStudentServ"})
public class RemoveStudentServ extends HttpServlet {
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");  
    PrintWriter out = response.getWriter(); 
            try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/StudentDB","root","root");
                if(request.getParameter("sel").equals("uid")){
                  int uid=Integer.parseInt(request.getParameter("rem_value"));
                  PreparedStatement st = con.prepareStatement("delete from STUDENTTABLE where UID=?");
                  st.setInt(1,uid);
                  st.executeUpdate();
                  out.println("<script>");
                  out.println("alert('Student Removed.');");
                  out.println("window.location.replace('./Home');");
                  out.println("</script>");
                }
                else{
                   //System.out.println("test3");
                  String sn=request.getParameter("rem_value");
                  //System.out.println(sn);
                  PreparedStatement st2 = con.prepareStatement("delete from STUDENTTABLE where NAME like ?");
                  //System.out.println("test3");
                  st2.setString(1,sn+"%");
                  //System.out.println(st2);
                  st2.executeUpdate();
                  out.println("<script>");
                  out.println("alert('Student Removed.');");
                  out.println("window.location.replace('./Home');");
                  out.println("</script>");
                }
           
            }catch(Exception e) {
            out.println("ERROR "+ e.getMessage());

            
            }
    }

}