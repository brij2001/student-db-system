import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(urlPatterns = {"/AdminLogin"})
public class AdminLogin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        boolean status=false;  
        try{
            String u=request.getParameter("uname");
            String p=request.getParameter("pass");  


            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/StudentDB","root","root");
            PreparedStatement st=con.prepareStatement("select * from ADMINTABLE where username=? and password=?");
            st.setString(1,u);
            st.setString(2, p);
            
            ResultSet rs=st.executeQuery();
            status=rs.next();
            
        }catch (Exception e) {
            out.println("ERROR "+ e.getMessage());
        }
        if(status){
         RequestDispatcher rd=request.getRequestDispatcher("./Home");  
        rd.forward(request,response);  
        }
        else{
        out.print("Sorry username or password error"); 
        RequestDispatcher rd=request.getRequestDispatcher("index.html");  
        rd.include(request,response);  
        }
    }
}
