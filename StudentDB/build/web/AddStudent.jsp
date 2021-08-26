<%-- 
    Document   : AddStudent
    Created on : 7 Aug, 2021, 6:24:36 PM
    Author     : brij
--%>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Student</title>
        
    </head>
    <body><div class="box" style="width:30%;">
        <form method="post" action="./Home"><input type="submit" value="Home"></form>
        
    <center>
        <h2>Add New Student</h2>
        <div class="cont" align="center">
        <form action="./AddStudentServ" method="post" >
            
            <div class="inputBox">
                    
                        <input type="text"  name="sname" required placeholder="Student Name">
            </div>
                    
                  
            <div class="inputBox">    
                      <input type="number"  name="uid" required placeholder="UID">
            </div>        
                  
            <div class="inputBox">      
                        <input type="text" " name="loc" required placeholder="Address">
            </div>

                 
            <div class="inputBox">      
                      <input style="color:white;"type="date" name="dob" required>
            </div>       
                      
            <div class="inputBox">        
                  <input type="submit" class="btn btn-primary" name="login" value="submit">
            </div>

<!--            <table align="center">
            <tr>
                <td>Student Name</td><td><input type="text" name="sname" required></td>
            </tr>
            <tr>
                <td>UID</td><td><input type="number" name="uid" required></td>
            </tr>
                        <tr>
                <td>Address</td><td><input type="text" name="loc" required></td>
            </tr>
                        <tr>
                <td>Date of Birth</td><td><input type="date" name="dob" required></td>
            </tr>
            <tr>
                <td><input type="submit" name="login" value="submit"></td>
            </tr>
        </table>-->

        </form>
    </div>
    </center>
        </div>
    </body>
</html>
