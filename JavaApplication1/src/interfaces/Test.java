package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Conexion_bd.Connection_db;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Test extends JFrame {

	Connection_db conn;

	private JPanel contentPane;
	private JTextField textFactura;
	private JTextField textCliente;

	public static void main(String[] args) {
		System.out.println("Conexion a BD facturacion");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
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
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Conectar BD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conn = new Connection_db();
				Connection x = conn.getConnection();
			}
		});
		btnNewButton.setBounds(243, 34, 105, 23);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("Busqueda por factura");
		lblNewLabel.setBounds(35, 138, 156, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Busqueda por cliente");
		lblNewLabel_1.setBounds(35, 187, 156, 14);
		contentPane.add(lblNewLabel_1);

		textFactura = new JTextField();
		textFactura.setBounds(243, 135, 86, 20);
		contentPane.add(textFactura);
		textFactura.setColumns(10);

		textCliente = new JTextField();
		textCliente.setText("");
		textCliente.setBounds(243, 184, 86, 20);
		contentPane.add(textCliente);
		textCliente.setColumns(10);

		JButton btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Connection_db.busqueda_factura(45005);
			}
		});
		btnNewButton_1.setBounds(420, 134, 89, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Buscar");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Connection_db.busqueda_cliente(666);
			}
		});
		btnNewButton_2.setBounds(420, 183, 89, 23);
		contentPane.add(btnNewButton_2);

	}
}
