import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesData {

	public static void main(String[] args) throws IOException {
		FileInputStream FIS = new FileInputStream("appProper");
		Properties properties =  new Properties();
	properties.load(FIS);
	String url= properties.getProperty("url");
	String user=properties.getProperty("user");
	String password=properties.getProperty("password");
	System.out.println(user);

	}

}
