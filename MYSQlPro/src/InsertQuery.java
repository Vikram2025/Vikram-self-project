import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertQuery {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url= "jdbc:mysql:///students";
		String username="root";
		String password="Vikram123@";
		Connection connection=DriverManager.getConnection(url, username, password);
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter the name of student === ");
		String Student_name = scanner.next();
		System.out.println("Enter the age of student === ");
		 int Student_age = scanner.nextInt() ;
		 System.out.println("Enter the Gender of student === ");
		String Student_Gender = scanner.next();
		System.out.println("Enter the Roll Number (Primary Key) of student === ");
		int Student_Roll_Number = scanner.nextInt();
		System.out.println("Enter the address of student === ");
		String Student_Address = scanner.next();
		System.out.println("Enter the Father Name of student === ");
		String Student_Father_Name = scanner.next();
		System.out.println("Enter the Mother Name of student === ");
		String Student_Mother_Name = scanner.next();
		System.out.println("Enter the Phone Number of student === ");
		int Student_Phone_Number = scanner.nextInt();
		System.out.println("Enter the email of student === ");
		String Student_email = scanner.next();
		System.out.println("Enter the city of student === ");
		String Student_city = scanner.next();
		
		
		
		//User Values Approach 
		
		
		
		
		Statement statement =connection.createStatement();
//		First approach (easy)
//		int effectedlines =statement.executeUpdate("insert into studentinfo  Values('"+Student_name+"',"+Student_age+",'"+Student_Gender+"',"+Student_Roll_Number+",'"+Student_Address+"','"+Student_Father_Name+"','"+Student_Mother_Name+"',"+Student_Phone_Number+",'"+Student_email+"','"+Student_city+"')");
		  // second approach lengthy 
		String Data =String.format("insert into studentinfo  Values('%s',%d,'%s',%d,'%s','%s','%s',%d,'%s','%s')",Student_name,Student_age,Student_Gender,Student_Roll_Number,Student_Address,Student_Father_Name,Student_Mother_Name,Student_Phone_Number,Student_email,Student_city);
		int effectedlines = statement.executeUpdate(Data);
        System.out.println("the number of changes in effecting lines are ::"+ effectedlines);
        
       statement.close();
       connection.close();
	}

}
