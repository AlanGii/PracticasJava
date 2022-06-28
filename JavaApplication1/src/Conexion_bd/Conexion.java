package Conexion_bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexion {
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String user = "root";
	private static final String password = "";
	private static final String url = "jdbc:mysql://localhost/asignacion";
	private static Connection connect;
	
	public static void main(String[] args) {
		Conexion conecta = new Conexion();
		
	}
	
	public Conexion() {
		try {
			Class.forName(driver);
			connect = DriverManager.getConnection(url, user, password);

			JOptionPane.showMessageDialog(null,"La conexion a la BD ah sido exitosa!!!");

		} catch (ClassNotFoundException | SQLException e) {
			System.err.println("Error al conectar..." + e);
		}
	}

	public Connection getConnection() {
		return connect;
	}
}
