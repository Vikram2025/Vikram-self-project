import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class RowSetAppProg1 {

	public static void main(String[] args) throws SQLException {

		RowSetFactory rsf = RowSetProvider.newFactory();
		JdbcRowSet jrs = rsf.createJdbcRowSet();// same as resultSet(connected),but it is scrollable and updatable.

		// setting url,username,password
		jrs.setUrl("jdbc:mysql:///students");
		jrs.setUsername("root");
		jrs.setPassword("Vikram123@");

		// setting a command for execution
		jrs.setCommand("select id,name,age,address from studentdata");
		jrs.execute();

		System.out.println("Retreiveing the records in forward direction...");
		System.out.println("ID\tNAME\tAGE\tADDRESS");
		while (jrs.next()) {
			System.out
					.println(jrs.getInt(1) + "\t" + jrs.getString(2) + "\t" + jrs.getInt(3) + "\t" + jrs.getString(4));
		}
		System.out.println();

		System.out.println("Retreiveing the records in backward direction...");
		System.out.println("ID\tNAME\tAGE\tADDRESS");
		while (jrs.previous()) {
			System.out
					.println(jrs.getInt(1) + "\t" + jrs.getString(2) + "\t" + jrs.getInt(3) + "\t" + jrs.getString(4));
		}

		System.out.println();

		// accessing the record randomly
		jrs.absolute(4);
		System.out.println(jrs.getInt(1) + "\t" + jrs.getString(2) + "\t" + jrs.getInt(3) + "\t" + jrs.getString(4));

		jrs.relative(-2);
		System.out.println(jrs.getInt(1) + "\t" + jrs.getString(2) + "\t" + jrs.getInt(3) + "\t" + jrs.getString(4));
		
		jrs.absolute(1);
		System.out.println(jrs.getInt(1) + "\t" + jrs.getString(2) + "\t" + jrs.getInt(3) + "\t" + jrs.getString(4));
		
		jrs.relative(+3);
		System.out.println(jrs.getInt(1) + "\t" + jrs.getString(2) + "\t" + jrs.getInt(3) + "\t" + jrs.getString(4));
		

	}

}
