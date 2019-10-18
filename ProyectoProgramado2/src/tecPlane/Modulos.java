package tecPlane;

import tecPlane.ConfiguracionInicial;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Modulos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	
	public Modulos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 955, 693);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblModulos = new JLabel("Modulos");
		lblModulos.setBounds(428, 25, 71, 14);
		lblModulos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblModulos);
		
		JLabel lblAsignacionDeFichas = new JLabel("Registro de pasajeros");
		lblAsignacionDeFichas.setBounds(131, 82, 105, 14);
		contentPane.add(lblAsignacionDeFichas);
		
		JLabel lblVip = new JLabel("Oro");
		lblVip.setBounds(453, 82, 46, 14);
		contentPane.add(lblVip);
		
		JLabel lblEconomico = new JLabel("Preferencial");
		lblEconomico.setBounds(131, 357, 71, 14);
		contentPane.add(lblEconomico);
		
		JLabel lblSalidas = new JLabel("Salidas");
		lblSalidas.setBounds(685, 357, 46, 14);
		contentPane.add(lblSalidas);
		
		JLabel lblPlatino = new JLabel("Platino");
		lblPlatino.setBounds(758, 82, 46, 14);
		contentPane.add(lblPlatino);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(25, 114, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento:");
		lblFechaDeNacimiento.setBounds(25, 139, 105, 14);
		contentPane.add(lblFechaDeNacimiento);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad:");
		lblNacionalidad.setBounds(25, 164, 64, 14);
		contentPane.add(lblNacionalidad);
		
		JLabel lblLugarDeOrigen = new JLabel("Origen:");
		lblLugarDeOrigen.setBounds(25, 189, 84, 14);
		contentPane.add(lblLugarDeOrigen);
		
		JLabel lblNewLabel = new JLabel("Destino:");
		lblNewLabel.setBounds(25, 214, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblTipoDeUsuario = new JLabel("Tipo de usuario:");
		lblTipoDeUsuario.setBounds(25, 239, 84, 14);
		contentPane.add(lblTipoDeUsuario);
		
		JLabel lblPasaporte = new JLabel("Pasaporte:");
		lblPasaporte.setBounds(25, 264, 64, 14);
		contentPane.add(lblPasaporte);
		
		textField = new JTextField();
		textField.setBounds(141, 111, 132, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JList list = new JList();
		list.setBounds(309, 107, 156, 224);
		contentPane.add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(617, 107, 156, 224);
		contentPane.add(list_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(475, 111, 132, 17);
		contentPane.add(comboBox);
		
		JButton btnAtender = new JButton("Atender");
		btnAtender.setBounds(499, 185, 89, 23);
		contentPane.add(btnAtender);
		
		JButton button = new JButton("Atender");
		button.setBounds(811, 185, 89, 23);
		contentPane.add(button);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(783, 111, 132, 17);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(212, 402, 132, 17);
		contentPane.add(comboBox_2);
		
		JButton button_1 = new JButton("Atender");
		button_1.setBounds(236, 476, 89, 23);
		contentPane.add(button_1);
		
		JList list_2 = new JList();
		list_2.setBounds(46, 387, 156, 224);
		contentPane.add(list_2);
		
		JList list_3 = new JList();
		list_3.setBounds(499, 387, 416, 224);
		contentPane.add(list_3);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(811, 620, 89, 23);
		contentPane.add(btnSalir);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(141, 136, 132, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(141, 161, 132, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(141, 186, 132, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(141, 211, 132, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(141, 236, 132, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(141, 261, 132, 20);
		contentPane.add(textField_6);
		
		
	}
	
	
	
	
			
		
		
		
		
		
}
