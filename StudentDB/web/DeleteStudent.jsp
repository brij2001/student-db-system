<%-- 
    Document   : DeleteStudent
    Created on : 7 Aug, 2021, 9:12:35 PM
    Author     : brij
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Admin Panel</title>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href="style.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
    </head>
    <body><div class="box">
            <form method="post" action="./Home"><input type="submit" value="Home"></form>
            <br>
            <center>
                <h2>Remove Student</h2>
                <form action="./RemoveStudentServ" method="POST" >
                    <table align="center">

                        <tr><td>
                                <p style="color:white;"> Remove via :</p><!--<select name="sel">
                                        <option value="uid">UID</option>
                                        <option value="name">Name</option>
                                      </select>-->
                                
                                    <select class="form-select btn btn-secondary dropdown-toggle" name="sel" aria-label="Default select example">                                      
                                        <option value="uid">UID</option>
                                        <option value="name">Name</option>                                      
                                    </select>
                                

                                <br><br>
                                <input class="form-control" type="text" name="rem_value" required>
                            </td></tr>

                        <tr align="right">
                            <td>
                                <input type="submit" value="Remove">
                            </td>
                        </tr>
                    </table>
                </form>

            </center>
        </div>
    </body>
</html>
