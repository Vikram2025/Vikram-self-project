import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class LauchMysql {

	public static void main(String[] args) throws SQLException {
		Connection connection= null;
	Statement statement = null;
	ResultSet resultset =null;

		
		try {
			
			// step1 loading and registering the driver class 
//			
//    Class.forName("com.mysql.cj.jdbc.Driver");
//    System.out.println("driver loaded sucessful");
//    
//    step 2 connect to MYsql DB
    
    
    String url ="jdbc:mysql:///students";
    String user="root";
    String password="Vikram123@";
    connection = DriverManager.getConnection(url, user, password);
    System.out.println("the implemeting class name is"+ connection.getClass().getName());
    //step 3 create a statement and then carry it in a result to transfere from mysql to jdbc
//    String VIK = "select * from  studentinfo"
                statement =connection.createStatement();
                resultset =statement.executeQuery("select * from studentinfo");
            	System.out.println("Student_name\tStudent_age\tStudent_Gender" );
                
              while(resultset.next()) {
                	
                
                		
                	String Student_name = resultset.getString(1);
                	 Integer Student_age= resultset.getInt(2);
                	 String Student_Gender = resultset.getString(3);
                	 
                	System.out.println(Student_name + "\t" + Student_age + "\t" + Student_Gender );
                	
                	
                }
    
		}
		catch (SQLException se) {
			
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		resultset.close();
		statement.close();  
		connection.close();
		
		
	}

}
