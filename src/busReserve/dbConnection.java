package busReserve;
import java.sql.*;

public class dbConnection {
	private static final String url = "jdbc:mysql://localhost:3306/busreserve";
	private static final String userName = "root";
	private static final String passWord = "toorMysql1234@";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, userName, passWord);
	}

}
