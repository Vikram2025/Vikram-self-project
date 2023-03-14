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

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class JdbcUtil {
	private JdbcUtil() {
		
	}


	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
			
		}
	}

	public static Connection getValues() throws IOException, SQLException {
		String Config ="D:\\java app\\javaapplication\\FullWebProj\\src\\JDBCUTIL\\vikram.properties";
	HikariConfig HC = new HikariConfig(Config);
	HikariDataSource DS=new HikariDataSource(HC);
	
		return DS.getConnection();
	}
	

}
