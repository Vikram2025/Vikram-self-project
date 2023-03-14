
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateQuery {

	public static void main(String[] args) throws SQLException {
		String url ="jdbc:mysql:///students";
		String user ="root";
		String password = "Vikram123@";
		
	  Connection connection =DriverManager.getConnection(url, user, password);
	  
	Statement statement = connection.createStatement();
	int updatedline =statement.executeUpdate("UPDATE studentinfo set Student_Gender ='Male',Student_Address='12/26 railway road adoni' where Student_name= 'ramesh' ");
	
System.out.println("no of line updated are ::"+ updatedline);

statement.close();
connection.close();
	}

}
