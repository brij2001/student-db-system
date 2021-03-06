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
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="style.css">
</head>
    <body><div class="box_table">
        <form method="post" action="./Home"><input class="blubtn" type="submit" value="Home"></form>
    <center>
        <h1>Update</h1>
        
        <table id="tableID" class="centertab table table-dark table-striped table-hover table-bordered" >
  <thead>
                <tr><th>UID</th><th>Student Name</th><th>Address</th><th>Date of Birth</th><th>Edit</th></tr>
                </thead>
  <tbody>
<%
        while (resultSet.next()) {
%>
                <form method="post" action="./UpdateStudentServ">
                <input type="hidden" name="original_uid" value="<%=resultSet.getInt("UID")%>">
                   
                <tr><td><input type="text" name="new_uid" value="<%=resultSet.getInt("UID")%>"></td>
                    
                <td><input type="text" name="sname" value="<%=resultSet.getString("NAME")%>"></td>
                   
                <td><input type="text" name="loc" value="<%=resultSet.getString("LOCALITY")%>"></td>
                 
                <td><input type="text" name="dob" value="<%=resultSet.getString("DOB")%>"></td>
                            
                <td><input class="btn btn-primary" type="submit" value="Submit"></td></tr>
                
        </form>
                
        <%
                }
        %>
            </tbody>
            </table>
       
          <%
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        %>
        </div>
    
    </body>
</html>