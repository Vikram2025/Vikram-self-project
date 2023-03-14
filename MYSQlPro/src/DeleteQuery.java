import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteQuery {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
String url="jdbc:mysql:///students";
String username="root";
String password="Vikram123@";
Connection connection =DriverManager.getConnection(url, username, password);

Statement statement =connection.createStatement();
      int deletedline    = statement.executeUpdate("delete from studentinfo where Student_Phone_Number = 778999031 ");


System.out.println("the deleted no of lines are : "+ deletedline  );

statement.close();
connection.close();


	}

}
