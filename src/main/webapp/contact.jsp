<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact</title>
</head>
<body style="background:beige;text-align: center">
<h2>Contact</h2>
<hr>
   <form action="contact" method="post">
        <pre>
         User id    : <input type="number" id="userid" name="userid" /> <br>
         Name       : <input type="text" id="name" name="name" /> <br>
         Email      : <input type="text" id="email" name="email" /><br>
         Phone      : <input type="number" id="phone" name="phone" /><br>
         Message    : <input type="text" id="message" name="message" /> <br>
                      <input type="submit" value="Submit" style="background:lightblue"/>
         </pre>
     </form>
</body>
</html>