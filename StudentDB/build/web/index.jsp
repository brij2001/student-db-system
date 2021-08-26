<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Admin Panel</title>
	<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<div class="box">
	<h2 align="center">Admin Login</h2>
	<form method="post" action="./AdminLogin">
		<div class="inputBox">
                <input type="text" name="uname" required="">
                <label>Username</label>
            </div>
            <div class="inputBox">
                <input type="password" name="pass" required="">
                <label>Password</label>
            </div>
                ${auth}
            <input type="submit" name="login" value="Login">
	</form>
       
	</div>
</body>
</html>
