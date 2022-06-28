package Conexion_bd;

import java.awt.Container;
import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Connection_db {

	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String user = "root";
	private static final String password = "";
	private static final String url = "jdbc:mysql://localhost/facturacion";
	private static Connection connect;

	public static java.sql.Statement st;
	public static ResultSet rs;
	
	private static Guardar_datos datos;

	public Connection_db() {
		try {
			Class.forName(driver);
			connect = DriverManager.getConnection(url, user, password);

			JOptionPane.showMessageDialog(null,"La conexion a la BD ah sido exitosa!!!");
			
			datos=new Guardar_datos();
			

		} catch (ClassNotFoundException | SQLException e) {
			System.err.println("Error al conectar..." + e);
		}
	}

	public Connection getConnection() {
		return connect;
	}

	/*
	 * public static void formas_pago() { System.out.println();
	 * System.out.println("Tabla Tipo de Pago"); try { st =
	 * Connection_db.connect.createStatement(); rs = ((java.sql.Statement)
	 * st).executeQuery("select * from pago"); while (rs.next()) {
	 * System.out.println(rs.getInt("id_pago") + " " + rs.getString("tipo_pago")); }
	 * Connection_db.connect.close(); } catch (Exception e) {
	 * 
	 * } }
	 */

	public static Guardar_datos busqueda_cliente(int id_cliente) {
		System.out.println("");
		try {
			st = Connection_db.connect.createStatement();
			rs = ((java.sql.Statement) st).executeQuery("select * from cliente where id_cliente = " + id_cliente);
			while (rs.next()) {
				System.out.println("Datos del Cliente");
				System.out.println("Numero de cliente: " + rs.getInt("id_cliente"));
				//datos.setNum_cliente("Numero de cliente: " + rs.getInt("id_cliente"));
				System.out.println("Nombre: " + rs.getString("nombre") + " " + rs.getNString("apellido_p") + " "
						+ rs.getString("apellido_m"));
				//datos.setNombre("Nombre: " + rs.getString("nombre") + " " + rs.getNString("apellido_p") + " "
					//	+ rs.getString("apellido_m"));
				//datos.setApellido_p(rs.getNString("apellido_p"));
				System.out.println("Correo Electronico: " + rs.getString("mail"));
				datos.setCorreo("Correo Electronico: " + rs.getString("mail"));
			}

			rs = ((java.sql.Statement) st).executeQuery("select RFC from facturacion where id_cliente = " + id_cliente);
			rs.next();
			System.out.println("RFC: " + rs.getString("RFC"));
			//datos.setRfc("RFC: " + rs.getString("RFC"));
			
			System.out.println("\nFacturas del cliente: " + id_cliente);
			//datos.setInfo2("Facturas del cliente: " + id_cliente);

			rs = ((java.sql.Statement) st).executeQuery(
					"select fecha_fac, id_factura, RFC from facturacion where id_cliente = " + id_cliente);
			System.out.println("Fechas \t ID Factura \t RFC");
			//datos.setInfo3("Fechas \t ID Factura \t RFC");
			while (rs.next()) {
				System.out.println(rs.getDate("fecha_fac") + "\t" + rs.getInt("id_factura") + "\t" + rs.getString("RFC"));
			}
			//Connection_db.connect.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"No existe este cliente");
		}
		
		return datos;
	}

	public static void busqueda_factura(int id_factura) {
		System.out.println("");
		try {
			st = Connection_db.connect.createStatement();
			rs = ((java.sql.Statement) st).executeQuery(
					"select cliente.id_cliente, cliente.nombre, cliente.apellido_p, cliente.apellido_m, cliente.mail, facturacion.id_factura, facturacion.RFC, facturacion.fecha_fac from cliente, facturacion where cliente.id_cliente = facturacion.id_cliente and id_factura = "
							+ id_factura);
			int aux = 0;
			while (rs.next()) {
				System.out.println("Datos del cliente");
				System.out.println("Numero de cliente: " + rs.getInt("id_cliente"));
				aux = rs.getInt("id_cliente");
				System.out.println("Nombre: " + rs.getString("nombre") + " " + rs.getNString("apellido_p") + " "
						+ rs.getString("apellido_m"));
				System.out.println("Correo Electronico: " + rs.getString("mail"));
				System.out.println("Fecha de facturacion: " + rs.getDate("fecha_fac"));
				System.out.println("RFC: " + rs.getNString("RFC"));
				System.out.println("Numero de Factura: " + rs.getInt("id_factura"));
			//}
			//if (aux != 0) {
				rs = ((java.sql.Statement) st)
						.executeQuery("select fecha_fac, id_factura, RFC from facturacion where id_cliente = " + aux);
				System.out.println("\nFacturas del cliente: " + aux);
				System.out.println("Fechas \t ID Factura \t RFC");
				while (rs.next()) {
					System.out.println(
							rs.getDate("fecha_fac") + "\t" + rs.getInt("id_factura") + "\t" + rs.getString("RFC"));
				}
				System.out.println("\nDetalle de la factura: " + id_factura);
				rs = ((java.sql.Statement) st).executeQuery(
						"select detalle_fac.id_producto, producto.producto, producto.precio, detalle_fac.cantidad, detalle_fac.sub_total from detalle_fac, producto where producto.id_producto = detalle_fac.id_producto and id_factura = "
								+ id_factura);
				System.out.println("ID Producto \t Nombre del Producto \t\t\t\t\t\t precio \t cantidad \t subtotal");
				while (rs.next()) {
					System.out.println(rs.getInt("id_producto") + "\t\t" + rs.getNString("producto") + "\t"
							+ rs.getFloat("precio") + "\t\t\t" + rs.getInt("cantidad") + "\t\t" + rs.getFloat("sub_total"));
				}
				rs = ((java.sql.Statement) st).executeQuery("select * from facturacion where id_factura = " + id_factura);
				System.out.println("");
				while(rs.next()) {
					System.out.println("Subtotal: " + rs.getFloat("sub_total"));
					System.out.println("Descuento: " + rs.getFloat("descuento"));
					System.out.println("IVA 16%: " + rs.getFloat("IVA"));
					System.out.println("TOTAL NETO: " + rs.getFloat("total_neto"));
				}
			}

			//Connection_db.connect.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"No existe este numero de factura");
		}
	}
	
	public static void close_db() throws SQLException {
		Connection_db.connect.close();
	}
}

