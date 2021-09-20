<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course</title>
</head>
<body style="background:beige;text-align: center">
<h2>Course</h2>
<hr>
   <form action="addcourse" method="post">
        <pre>
         CourseId          : <input type="number" id="course" name="course" /> <br>
         CourseName        : <input type="text" id="coursename" name="coursename" /> <br>
         CourseDescription : <input type="text" id="coursedesc" name="coursedesc" /><br>
         CourseResources   : <input type="text" id="courseresources" name="courseresources" /> <input type="submit" value="Upload" /> <br>
         CourseFees        : <input type="number" id="coursefees" name="coursefees" /><br>
         
                      <input type="submit" value="Sumit" style="background:lightblue"/>
         </pre>
    </form>
</body>
</html>