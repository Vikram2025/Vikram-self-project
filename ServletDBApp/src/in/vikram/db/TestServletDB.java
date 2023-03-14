package in.vikram.db;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/Test" }, initParams = { @WebInitParam(name = "url", value = "jdbc:mysql:///students"),
		@WebInitParam(name = "user", value = "root"), @WebInitParam(name = "password", value = "Vikram123@") },loadOnStartup = 10)
public class TestServletDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connection= null;
	

	
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver is ready");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void init() {

		String jdbcurl = "jdbc:mysql:///students";
		String username = "root";
		String mypassword = "Vikram123@";

		try {
			connection = DriverManager.getConnection(jdbcurl, username, mypassword);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");
		String userteamname=request.getParameter("userteamname");
		String usersalary=request.getParameter("usersalary");
		PrintWriter out = response.getWriter();
		
		try {
			PreparedStatement PS = null;
			PS=connection.prepareStatement("insert into player(name,teamname,salary) values(?,?,?)");
			
			if(PS!=null) {
				PS.setString(1, username);
				PS.setString(2, userteamname);
				PS.setInt(3, Integer.parseInt(usersalary));
				
					
			}
			if(PS!=null) {
			int lineupdated = PS.executeUpdate();
			if(lineupdated==1) {
				out.println("<h1 style=' color:red;'>Player record inserted succefully</h1>");
			}
			else {
				out.println("<h1 style=' color:blue;'>Player record inserted failed click on the link</h1>");
				out.println("<a href='./reg.html'>|RECORD AGAIN|</a>");
			}
			 
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void destroy() {
		
	}

}
