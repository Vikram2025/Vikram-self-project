



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class HikariAppLauchPro {

	public static void main(String[] args) throws Exception {

		String configFile = "src\\DB.properties";
		HikariConfig config = new HikariConfig(configFile);

		try (HikariDataSource dataSource = new HikariDataSource(config)) {
			
			// Getting the connection object from conenction pool
			Connection connection = dataSource.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select id,name,age,address from studentdata");
			System.out.println("ID\tNAME\tAGE\tADDRESS");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getInt(3)
						+ "\t" + resultSet.getString(4));

	}

		}
	}
}
	
