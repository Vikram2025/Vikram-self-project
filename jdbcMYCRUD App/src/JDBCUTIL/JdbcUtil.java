package JDBCUTIL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcUtil {
	private JdbcUtil() {
		
	}

	public static Connection getValues() throws IOException, SQLException {
		
		FileInputStream FIS = new FileInputStream("ApplicationCon.properties");
		Properties Pro = new Properties();
		Pro.load(FIS);
		Connection connection = DriverManager.getConnection(Pro.getProperty("url"),Pro.getProperty("user"),Pro.getProperty("password"));
		System.out.println("connection is ready");
		return connection;

	}
	public static void closingSta(Connection connection,Statement sta,ResultSet res) throws SQLException , IOException {
		if(connection!=null) {
			connection.close();
		}
		if(sta!=null) {
			sta.close();
		}
		if(res!=null) {
			res.close();
		}
	}
	

}
