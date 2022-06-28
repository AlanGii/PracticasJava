package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Conexion_bd.Connection_db;
import Conexion_bd.Guardar_datos;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;

public class Ejecutar extends JFrame {

	Connection_db conn;
	//private static Guardar_datos mostrar_datos;
	

	private JPanel contentPane;
	private JTextField busq_cliente;
	private JTextField busq_fact;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel;
	private JLabel lblBusquedaDeFactura;
	private JButton desconectar;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejecutar frame = new Ejecutar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejecutar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 404, 207);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton conectar = new JButton("Conectar BD");
		conectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				conn = new Connection_db();
				Connection x = conn.getConnection();
			}
		});
		conectar.setBounds(10, 11, 135, 26);
		contentPane.add(conectar);
		
		busq_cliente = new JTextField();
		busq_cliente.setBounds(149, 67, 86, 20);
		contentPane.add(busq_cliente);
		busq_cliente.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cliente = Integer.parseInt(busq_cliente.getText());
				//System.out.println(cliente);
				 Connection_db.busqueda_cliente(cliente);
	
			}
		});
		btnNewButton.setBounds(245, 66, 89, 23);
		contentPane.add(btnNewButton);
		
		busq_fact = new JTextField();
		busq_fact.setBounds(149, 98, 86, 20);
		contentPane.add(busq_fact);
		busq_fact.setColumns(10);
		
		btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int factura = Integer.parseInt(busq_fact.getText());
				Connection_db.busqueda_factura(factura);
			}
		});
		btnNewButton_1.setBounds(245, 100, 89, 23);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel = new JLabel("Busqueda de cliente");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 63, 152, 28);
		contentPane.add(lblNewLabel);
		
		lblBusquedaDeFactura = new JLabel("Busqueda de factura");
		lblBusquedaDeFactura.setHorizontalAlignment(SwingConstants.CENTER);
		lblBusquedaDeFactura.setBounds(10, 98, 152, 28);
		contentPane.add(lblBusquedaDeFactura);
		
		desconectar = new JButton("Desconectar BD");
		desconectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection_db.close_db();
					JOptionPane.showMessageDialog(null,"Se ha desconectado de forma exitosa");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		desconectar.setBounds(199, 13, 135, 26);
		contentPane.add(desconectar);
		
	}
}
