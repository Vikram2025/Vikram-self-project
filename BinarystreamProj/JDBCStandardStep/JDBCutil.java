package JDBCStandardStep;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCutil {
	
	private JDBCutil() {
		
	}

		
			public static Connection getJDBConnection() throws IOException,SQLException {
				FileInputStream FIS = new FileInputStream("appProper");
				Properties properties =  new Properties();
			properties.load(FIS);
//			String url= properties.getProperty("url");
//			String user=properties.getProperty("user");
//			String password=properties.getProperty("password");
			    Connection connection = DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("user"),properties.getProperty("password"));
				return connection;
		}
				
	public  static void closed(Connection con,Statement sta, ResultSet res) throws SQLException {
		
	if(con!= null) {
		con.close();
	}
	if(sta != null) {
		sta.close();
	}
if(res != null) {
		res.close();
	}
	}

}
