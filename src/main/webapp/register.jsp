<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body style="background:beige;text-align: center">
<h2>Register</h2>
<hr>
 <form action="register" method="post">
        <pre>
         UserId     : <input type="number" id="userid" name="userid" /> <br>
         Name       : <input type="text" id="username" name="username" /> <br>
         Email      : <input type="text" id="email" name="email" /> <br>
         Password   : <input type="password" id="password" name="password" /><br>
         Phone      : <input type="number" id="phone" name="phone" /><br>
         Address    : <input type="text" id="address" name="address" /> <br>
         UploadImag : <input type="text" id="image" name="image" /> <input type="submit" value="Upload" /> <br>
                      <input type="submit" value="Register" style="background:lightblue"/>
         </pre>
       </form>
</body>
</html>