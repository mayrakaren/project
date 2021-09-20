package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import config.DBUtil;

@WebServlet("/course")
public class CourseServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   
		PrintWriter out = response.getWriter();
		
		String courseId = request.getParameter("course");
		String course = request.getParameter("coursename");
		String courseDesc = request.getParameter("coursedesc");
		String courseSour = request.getParameter("coursesources");
		String courseFee = request.getParameter("coursefees");
		
		Connection conn = DBUtil.getConnection();
		
		String sql = "insert into course values(?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, courseId);
			ps.setString(2, course);
			ps.setString(3, courseDesc);
			ps.setString(4, courseSour);
			ps.setString(5, courseFee);
			
			ps.executeUpdate(); //insert, update,delete
			out.println("Data Stored Successfully!");
		} catch (SQLException e) {
			out.println("Connection Error!");
			e.printStackTrace();
		}
		
		
	}
		
		

}
