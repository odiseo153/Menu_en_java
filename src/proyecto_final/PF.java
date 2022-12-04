package proyecto_final;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class PF extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField Contraseña;

	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PF frame = new PF();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PF() 
	{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 482, 283);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*JLABEL DE INICIAR SESION*/
		
		JLabel lblNewLabel = new JLabel("INICIAR SESION");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(127, 11, 234, 42);
		contentPane.add(lblNewLabel);
		
		/*APARTADO DE USUARIO*/
		JLabel iblUsuario = new JLabel("Usuario");
		iblUsuario.setForeground(new Color(0, 0, 0));
		iblUsuario.setFont(new Font("SansSerif", Font.BOLD, 15));
		iblUsuario.setBounds(10, 88, 69, 14);
		contentPane.add(iblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(118, 87, 109, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		/*FIN DE USARIO*/
		
		/*APARTADO DE CONTRASENA*/
		JLabel iblClave = new JLabel("Contraseña");
		iblClave.setForeground(new Color(0, 0, 0));
		iblClave.setFont(new Font("SansSerif", Font.BOLD, 15));
		iblClave.setBounds(10, 134, 100, 14);
		contentPane.add(iblClave);
		/*FIN DE CONTRASEÑA*/
		
		
		/*BOTON DE INGRESAR*/
		JButton btnIngresar = new JButton("Iniciar Sesion");
		btnIngresar.setForeground(Color.BLACK);
		btnIngresar.setBackground(Color.WHITE);
		btnIngresar.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e) {
				
				String clave = Contraseña.getText();
				String claveFinal = new String (clave);
				JMenu m = new JMenu();
				
				if(txtUsuario.getText().equals("Admin") && claveFinal.equals("Admin")) {
					dispose();
					//JOptionPane.showMessageDialog(null, "Bienvenido al Sistema", "INGRESASTE",
							//JOptionPane.INFORMATION_MESSAGE);
					menu p = new menu();
					p.frame.setVisible(true);
				
					
					
					
				
				}else {
					JOptionPane.showMessageDialog(null, "Usuario o Contraseña son Incorrectos", "ERROR",
							JOptionPane.ERROR_MESSAGE);
					txtUsuario.setText("");
					Contraseña.setText("");
					txtUsuario.requestFocus();
				}
			}
		});
		btnIngresar.setBounds(118, 163, 128, 26);
		contentPane.add(btnIngresar);
		/*FIN DEL BOTON INGRESAR*/
		
		
		/*APARTADO DEL LOGO*/
		JLabel JLLogo = new JLabel("");
		JLLogo.setBounds(288, 64, 160, 162);
	
		contentPane.add(JLLogo);
		
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection conexcion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/usuario","root","");
					
					java.sql.Statement sata = conexcion.createStatement();
					
					String nombre= txtUsuario.getText();
					 String contra=Contraseña.getText();
					
						String con = "INSERT INTO sesion (usuario, contraseña) VALUES  ('"+nombre+"','"+contra+"')";
						
					((java.sql.Statement)sata).executeUpdate(con);
					
				
					conexcion.close();
					
				}catch (ClassNotFoundException o) 
				{
					o.printStackTrace();
					
				}catch (SQLException a) 
				{
					a.printStackTrace();
				}
			
			}
			
		});
		btnRegistrarse.setForeground(Color.black);
		btnRegistrarse.setBackground(Color.white);
		btnRegistrarse.setBounds(118, 199, 128, 26);
		contentPane.add(btnRegistrarse);
		
		Contraseña = new JTextField();
		Contraseña.setColumns(10);
		Contraseña.setBounds(118, 134, 109, 20);
		contentPane.add(Contraseña);
		
	
	}

	public String nombrevendedor() {
		String n = txtUsuario.getText();
		return n;
	}
}