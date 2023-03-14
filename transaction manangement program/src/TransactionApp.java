import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

import JDBCUTil.JdbcUtil;

public class TransactionApp {

	public static void main(String[] args) {
		
		Connection connection = null;
		Statement st = null;
		try {
	connection =JdbcUtil.getValues();
	st=connection.createStatement();
	
	System.out.println("the transation for debting has started ............");
	connection.setAutoCommit(false);
	st.executeUpdate("update  bankstatement set amount=amount-6000 where id=1 ");
	st.executeUpdate("update  bankstatement set amount=amount-4000 where id=2");
	st.executeUpdate("update  bankstatement set amount=amount-3000 where id=3 ");
	st.executeUpdate("update  bankstatement set amount=amount-5000 where id=4");
	System.out.println("the transation for debting has done type ok to contiue with the trancation or else type No ............(ok/no)");
	Scanner scan = new Scanner(System.in);
	     String input =scan.next();
	     
	     if(input.equalsIgnoreCase("ok")) {
	    	 connection.commit();
	     }
	     else {
	    	 System.out.println("you choose to terminate the transcation");
	     }
	
	
	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				JdbcUtil.closingSta(connection, st, null);
			}
			catch(Exception es ) {
				es.printStackTrace();
			}
		}
	}

}
