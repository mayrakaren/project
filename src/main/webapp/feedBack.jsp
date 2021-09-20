<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feedback</title>
</head>
<body style="background:beige;text-align: center">
<h2>Feedback</h2>
<hr>
      <form action="contact" method="post">
        <pre>
         Name       : <input type="text" id="name" name="name" /> <br>
         User id     : <input type="number" id="userid" name="userid" /> <br>
         Email      : <input type="text" id="email" name="email" /><br>
         Feedback    : <input type="text" id="feedback" name="feedback" /> <br>
                      <input type="submit" value="Submit" style="background:lightblue"/>
         </pre>
       </form>
</body>
</html>