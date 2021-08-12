<%-- 
    Document   : ViewStudent
    Created on : 11-Aug-2021, 11:29:01 am
    Author     : brij-pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.servlet.*"%>
<%@page import="java.io.IOException"%>
<%@page import="java.sql.*"%>
<%
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
%>
<%
    try {
        connection = DriverManager.getConnection(connectionUrl + database, userid, password);
        statement = connection.createStatement();
        String sql = "select * from STUDENTTABLE ORDER BY UID";
        resultSet = statement.executeQuery(sql);
%>
<!DOCTYPE html>
<html>
    <body><center>
        <h1>View and Update</h1>
        
            <table border=1 width=40% height=20%>
                <tr><th>UID</th><th>Student Name</th><th>Address</th><th>Date of Birth</th><th>Edit</th></tr>
<%
        while (resultSet.next()) {
%>
                <form method="post" action="./UpdateStudentServ">
                <center><input type="hidden" name="uid" value="<%=resultSet.getInt("UID")%>"></center>
                   
                <tr><td><input type="text" name="uid" value="<%=resultSet.getInt("UID")%>"></td>
                    
                <td><input type="text" name="sname" value="<%=resultSet.getString("NAME")%>"></td>
                   
                <td><input type="text" name="loc" value="<%=resultSet.getString("LOCALITY")%>"></td>
                 
                <td><input type="text" name="dob" value="<%=resultSet.getString("DOB")%>"></td>
                            
                <td><input type="submit" value="submit"></td></tr>
        </form></center>
        <%
                }
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        %>
    </body>
</html>