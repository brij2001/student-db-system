<%-- 
    Document   : UpdateStudent
    Created on : 10-Aug-2021, 8:48:14 pm
    Author     : brij-pc
--%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
    String id = request.getParameter("id");
    String driver = "com.mysql.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://localhost:3306/";
    String database = "test";
    String userid = "root";
    String password = "";
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
        String sql = "select * from users where id=" + id;
        resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
%>
<!DOCTYPE html>
<html>
    <body>
        <h1>Update data from database in jsp</h1>
        <form method="post" action="./UpdateStudentServ">
            <input type="hidden" name="id" value="<%=resultSet.getString("id")%>">
            <input type="text" name="id" value="<%=resultSet.getString("id")%>">
            <br>
            First name:<br>
            <input type="text" name="first_name" value="<%=resultSet.getString("first_name")%>">
            <br>
            Last name:<br>
            <input type="text" name="last_name" value="<%=resultSet.getString("last_name")%>">
            <br>
            City name:<br>
            <input type="text" name="city_name" value="<%=resultSet.getString("city_name")%>">
            <br>
            Email Id:<br>
            <input type="email" name="email" value="<%=resultSet.getString("email")%>">
            <br><br>
            <input type="submit" value="submit">
        </form>
        <%
                }
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        %>
    </body>
</html>
update-process.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%! String driverName = "com.mysql.jdbc.Driver";%>
<%!String url = "jdbc:mysql://localhost:3306/test";%>
<%!String user = "root";%>
<%!String psw = "";%>
<%
    //String id = request.getParameter("id");
    String first_name = request.getParameter("first_name");
    String last_name = request.getParameter("last_name");
    String city_name = request.getParameter("city_name");
    String email = request.getParameter("email");
    if (id != null) {
        Connection con = null;
        PreparedStatement ps = null;
        int personID = Integer.parseInt(id);
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(url, user, psw);
            String sql = "Update users set id=?,first_name=?,last_name=?,city_name=?,email=? where id=" + id;
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, first_name);
            ps.setString(3, last_name);
            ps.setString(4, city_name);
            ps.setString(5, email);
            int i = ps.executeUpdate();
            if (i > 0) {
                out.print("Record Updated Successfully");
            } else {
                out.print("There is a problem in updating Record.");
            }
        } catch (SQLException sql) {
            request.setAttribute("error", sql);
            out.println(sql);
        }
    }
%>