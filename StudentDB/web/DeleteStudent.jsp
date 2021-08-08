<%-- 
    Document   : DeleteStudent
    Created on : 7 Aug, 2021, 9:12:35 PM
    Author     : brij
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remove Student</title>
    </head>
    <body>
        <form method="post" action="./Home"><input type="submit" value="Home"></form>
    <center>
        <h2>Remove Student</h2>
        <form action="./RemoveStudentServ" method="POST">
        <table align="center">
     
            <tr><td>
                Remove via:<select name="sel">
                            <option value="uid">UID</option>
                            <option value="name">Name</option>
                          </select>
            
            
            
            <input type="text" name="rem_value" required>
                </td></tr>
            
            <tr align="right">
                <td>
            <input type="submit" value="Remove">
                </td>
            </tr>
        </table>
        </form>
        
    </center>
    </body>
</html>
