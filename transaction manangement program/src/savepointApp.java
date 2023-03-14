


import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

import JDBCUTil.JdbcUtil;

public class savepointApp {

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement =null;
		try {

		connection =JdbcUtil.getValues();
		
		connection.setAutoCommit(false);
		statement =connection.createStatement();
		 statement.executeUpdate("insert into bank( id,name,amount) values (1,'vikram',25000)");
		 statement.executeUpdate("insert into bank( id,name,amount)  values (2,'chirag',22000)");
		 statement.executeUpdate("insert into bank ( id,name,amount) values (3,'neha',24000)");
		 Savepoint sp = connection.setSavepoint();
		 statement.executeUpdate("insert into bank ( id,name,amount) values (4,'vikram',28000)");
		 statement.executeUpdate("insert into bank( id,name,amount)  values (5,'vikram',25000)");
		 connection.rollback(sp);
		 connection.commit();
		 
		
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			
				try {
				JdbcUtil.closingSta(connection, statement,null);
				}
				catch(Exception es) {
					es.printStackTrace();
				}
			
		}
			
		}

}
