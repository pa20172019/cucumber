package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {

	public String getData(String columnName) throws SQLException   {
		Connection connection = null;
		Statement statement;
		ResultSet rs = null;
		String colunmValue = null;
		// Setting properties for mySQL
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String sqlUrl = "jdbc:mysql://localhost:3306/september2021";
			String sqlUsername = "root";
			String sqlPassword = "root";
			String query = "select * from users";
			// create connection to local db
			connection = DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);

			// Empower the connection reference to execute queries
			statement = connection.createStatement();
			// Delivering the query
			rs = statement.executeQuery(query);
			
			while(rs.next()) {
			colunmValue = rs.getString(columnName);
			return colunmValue;
				
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (rs != null);{
				rs.close();
			}
			if(connection != null) {
			   connection.close();	
			}
		}

		return colunmValue;

	}

}
