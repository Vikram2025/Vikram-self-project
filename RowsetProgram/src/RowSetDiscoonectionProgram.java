
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class RowSetDiscoonectionProgram {

	public static void main(String[] args) throws SQLException {

		Connection connection = DriverManager.getConnection("jdbc:mysql:///students", "root", "Vikram123@");
		Statement stmt = connection.createStatement();
		ResultSet resultSet = stmt.executeQuery("select id,name,age,address from studentdata");
		
		RowSetFactory rsf = RowSetProvider.newFactory();
		CachedRowSet crs = rsf.createCachedRowSet();//disconnected rowset
		crs.populate(resultSet);
		
		connection.close();//Operation not allowed after ResultSet closed
		System.out.println("ID\tNAME\tAGE\tADDRESS");
		while (crs.next()) {
			System.out.println(crs.getInt(1) + "\t" + crs.getString(2) + "\t" + crs.getInt(3) + "\t"
					+ crs.getString(4));

	}

}
}
