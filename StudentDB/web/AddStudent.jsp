<%-- 
    Document   : AddStudent
    Created on : 7 Aug, 2021, 6:24:36 PM
    Author     : brij
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Student</title>
    </head>
    <body>
        <form method="post" action="./Home"><input type="submit" value="Home"></form>
    <center>
        <h2>Add New Student</h2>
        <form action="./AddStudentServ" method="POST">
            <table align="center">
			<tr>
				<td>Student Name</td><td><input type="text" name="sname" required></td>
			</tr>
			<tr>
				<td>UID</td><td><input type="number" name="uid" required></td>
			</tr>
                        <tr>
				<td>Locality</td><td><input type="text" name="loc" required></td>
			</tr>
                        <tr>
				<td>Date of Birth</td><td><input type="date" name="dob" required></td>
			</tr>
			<tr>
				<td><input type="submit" name="login" value="submit"></td>
			</tr>
		</table>
            
        </form>
    </center>
    </body>
</html>
