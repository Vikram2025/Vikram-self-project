import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class updateRowset {

	public static void main(String[] args) throws SQLException {
	

		RowSetFactory rsf = RowSetProvider.newFactory();
		JdbcRowSet jrs = rsf.createJdbcRowSet();// same as resultSet(connected),but it is scrollable and updatable.

		// setting url,username,password and getting connection object..
		jrs.setUrl("jdbc:mysql:///students");
		jrs.setUsername("root");
		jrs.setPassword("Vikram123@");

		// setting a command for execution
		jrs.setCommand("select id,name,age,address from studentdata");
		jrs.execute();

		while (jrs.next()) {
			int actualage = jrs.getInt(3);
			if (actualage < 25) {
				int updatedage = actualage + 3;
				jrs.updateInt(3, updatedage);
				jrs.updateRow();
			}
		}
		System.out.println("Records updated succesfully....");
		jrs.close();
	}

}
