package tools;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCconn {

	public static void main(String[] argv) {

		tools.console.println("-------- PostgreSQL "
				+ "JDBC Connection Testing ------------");

		try {

			Class.forName("org.postgresql.Driver");

		} catch (ClassNotFoundException e) {

			tools.console.println("Where is your PostgreSQL JDBC Driver? "
					+ "Include in your library path!");
			e.printStackTrace();
			return;

		}

		tools.console.println("PostgreSQL JDBC Driver Registered!");

		Connection connection = null;

		try {

			connection = DriverManager.getConnection(
					"jdbc:postgresql://127.0.0.1:5432/testdb", "mkyong",
					"123456");

		} catch (SQLException e) {

			tools.console.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;

		}

		if (connection != null) {
			tools.console.println("You made it, take control your database now!");
		} else {
			tools.console.println("Failed to make connection!");
		}
	}

}