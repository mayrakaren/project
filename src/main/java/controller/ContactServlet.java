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

@WebServlet("/contact")
public class ContactServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		
		String userId = request.getParameter("userid");
		String user = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String message = request.getParameter("message");
		
		Connection conn = DBUtil.getConnection();
		
		String sql = "insert into contact values(?,?,?,?,?,default)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, user);
			ps.setString(3, email);
			ps.setString(4, phone);
			ps.setString(5, message);
			
			ps.executeUpdate(); //insert, update,delete
			out.println("Data Stored Successfully!");
		} catch (SQLException e) {
			out.println("Connection Error!");
			e.printStackTrace();
		}
		
		
	}
}
