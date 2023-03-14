import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class RowSetDelete {

	public static void main(String[] args) throws SQLException {
		RowSetFactory rsf = RowSetProvider.newFactory();
		JdbcRowSet jrs = rsf.createJdbcRowSet();// same as resultSet(connected),but it is scrollable and updatable.

		// setting url,username,password and getting connection object..
		jrs.setUrl("jdbc:mysql:///students");
		jrs.setUsername("root");
		jrs.setPassword("Vikram123@");

		// setting a command for execution
		jrs.setCommand("select id,name,age,address from student");
		jrs.execute();

		while (jrs.next()) {
			int actualage = jrs.getInt(5);
			if (actualage < 25) {
				jrs.deleteRow();
			}
		}
		System.out.println("Records deleted succesfully....");
		jrs.close();

	}

}
