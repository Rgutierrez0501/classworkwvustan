package hrmisapp.utility;

/**
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

public class DBConnectionUtil {
	
	
	public static DataSource getSqlDataSource() {
		Properties props = new Properties();
		FileInputStream fis = null;
		DBConnectionUtil dbConnUtil = null;
		try {
			fis = new FileInputStream("resource/jdbc.properties");
			props.load(fis);
			dbConnUtil = new DBConnectionUtil();
			dbConnUtil.setURL(props.getProperty("Postgres_URL"));
			dbConnUtil.setUser(props.getProperty("Postgres_USERNAME"));
			dbConnUtil.setPassword(props.getProperty("Postgres_PASSWORD"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dbConnUtil;
	}
}
**/