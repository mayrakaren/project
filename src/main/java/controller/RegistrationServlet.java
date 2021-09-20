package controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import config.DBUtil;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		
		String user = request.getParameter("username");
		String userId = request.getParameter("userid");
		String email = request.getParameter("email");
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String fecha = formatter.format(date);
		String passwd = request.getParameter("password");
		String phone = request.getParameter("phone");
		String addres = request.getParameter("address");
		String image = request.getParameter("image");
		
		Connection conn = DBUtil.getConnection();
		
		String sql = "insert into user1 values(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, user);
			ps.setString(3, phone);
			ps.setString(4, email);
			ps.setString(5, addres);
			ps.setString(6, passwd);
			ps.setString(7, image);
			ps.setString(8, fecha);
			
			ps.executeUpdate(); //insert, update,delete
			out.println("Data Stored Successfully!");
		} catch (SQLException e) {
			out.println("Connection Error!");
			e.printStackTrace();
		}
		
		
	}
}

