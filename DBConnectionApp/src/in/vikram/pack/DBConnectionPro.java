package in.vikram.pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class DBConnectionPro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	Connection connection=null;
static {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver software loaded");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

@Override
public void init() {
	
	
	String url= getInitParameter("url");
	String username= getInitParameter("username") ;
	String password =  getInitParameter("password");
	
	
	System.out.println(url);
	System.out.println(username);
	System.out.println(password);
	
	
		try {
			connection =DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		
	PrintWriter out = null;
	try {
		out = response.getWriter();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		if(connection!= null) {
			System.out.println("Connection is confirmed ");	
			
			
			PreparedStatement PS = null;
			try {
				PS = connection.prepareStatement("select * from player where id = ?");
				int id = 0;
				PS.setInt(1, id);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ResultSet RS = null;
			
			
			
			try {
				RS = PS.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(RS.next())
				{
					int id=RS.getInt(1);
					String name = RS.getString(2);
					String teamname = RS.getString(3);
					int salary = RS.getInt(4);
					
					out.println("<table border='1'>");
					out.println("<tr><td>" +id+ "</td><td>"+name+"</td><td>"+teamname+"</td><td>"+salary+"</td></tr>");
					out.println("</table>");
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	
	

	}

}
