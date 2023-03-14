
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import JDBCStandardStep.JDBCutil;

public class MySqlReadAllDataWithCommonStatement {
	
	public static void main(String[] args) {
		Connection connection= null;
		Statement statement=null;
		ResultSet resultset = null;
		
		
		
	try {
       connection= JDBCutil.getJDBConnection();
 
        if(connection != null)
statement = connection.createStatement();       
		if(statement !=null) 
        		 resultset=statement.executeQuery("select * from studentinfo");
        		 		       			
        	
        		if(resultset !=null) 
        			
        			System.out.println("Student_name\tStudent_age\tStudent_Gender\tStudent_Roll_Number\tStudent_Address\tStudent_Father_Name"
        					+ "\tStudent_Mother_Name\tStudent_Phone_Number\tStudent_email\tStudent_city");
        			while(resultset.next()) {
        			System.out.printf(resultset.getString(1),resultset.getInt(2),resultset.getString(3),resultset.getInt(4),
        					resultset.getString(5),resultset.getString(6),resultset.getString(7)
        					,resultset.getInt(8),resultset.getString(9),resultset.getString(10)   );
        		
        			}
        		
        
        
        
        
        
        
	}
catch(SQLException se){
	se.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}finally {
	try {
	JDBCutil.closed(connection, statement, resultset);
	}
	catch(SQLException se){
		se.printStackTrace();
	}
}

	

}
}