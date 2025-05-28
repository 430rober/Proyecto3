package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexionBD {
   
    // ATRIBUTOS
	public static Connection instance = null;
	public static final String JDBC_BDD_URL = "jdbc:mysql://localhost:3306/BDnaruto"; // RUTA BD
	
	// METODOS
	public static Connection getConnection () throws SQLException {
		if (instance== null) {
			Properties props = new Properties();
			// USUARIO Y CONTRASEÑA
			props.put("user", "root");
			props.put("password", "");
			// Formato para asegurar que los caracteres especiales (como tildes o ñ) se manejen correctamente.
			// props.put("charset", "UTF-8");
			
			instance = DriverManager.getConnection(JDBC_BDD_URL, props);
			
		}
		return instance;
	}
    
}