package exercise;
import java.sql.*;

public class database {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/";
	
	static final String USER = "demo";
	static final String PWD = "Rishita@22";
	
	public static void main(String[] args) {
		Connection con = null;
		Statement statement = null;
		
		try {
			//Register JDBC driver
			Class.forName(JDBC_DRIVER);
			
			// Open a connection
			System.out.println("connecting to database...");
			con=DriverManager.getConnection(DB_URL, USER, PWD); 
			// Execute query
			System.out.println("Creating database...");
			statement = con.createStatement();
			
			String sql = "create database student";
			boolean result = statement.execute(sql);
			System.out.println(result);
			System.out.println("Database created...");
		}catch (SQLException e) {
			
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(statement!=null) {
					statement.close();
				}
				if(con!=null) {
					con.close();
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
