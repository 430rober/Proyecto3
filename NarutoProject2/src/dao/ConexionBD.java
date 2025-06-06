package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexionBD {
	// Atributos
	public static Connection instance = null;
	public static final String JDBC_BDD_URL = "jdbc:mysql://localhost:3306/naruto";

	// métodos
	public static Connection getConnection() throws SQLException {
		if (instance == null) {
			Properties props = new Properties();
			props.put("user", "root");
			props.put("password", "");
			// formato caracteres
			// props.put("charset", "UTF-8");

			instance = DriverManager.getConnection(JDBC_BDD_URL, props);

		}
		return instance;
	}

}
