package proyecto_final;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JSpinner;
import java.awt.Font;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;


import javax.swing.JButton;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;


public class menu extends JFrame{

	JFrame frame;
	private JTextField numeroCliente;
	private JTextField cliente;
	private JTextField textField_2;
	JSpinner spinner,spinner_1,spinner_2,spinner_3,spinner_4,spinner_5,spinner_6,spinner_7,spinner_8,spinner_9,spinner_10,spinner_11,spinner_12,spinner_13,spinner_14,spinner_15,spinner_16;
	JCheckBox HC_check,HC_check1,HC_check2,HC_check3,HD_check,HD_check1,HD_check2,HD_check3;
	JCheckBox PQ_check,PQ_check1,PQ_check2,PQ_check3;
	JLabel imagen;
	public JLabel vendedor;
	public String no = "";
	JLabel precio1;
	int totalBurger=0;
	int itibi;
	int to;
	//hamburguesa
	
	int subSum1 = 0;
	int subSum2 = 0;
    int subSum3 = 0;
    int subSum4 = 0;
    
    //hot dogs
    int subSum5 = 0;
    int subSum6 = 0;
    int subSum7 = 0;
    int subSum8 = 0;
    
    //pizza
    int subSum9 = 0;
    int subSum10 = 0;
    int subSum11 = 0;
    int subSum12 = 0;
    
    //bebidas
    int subSum13 = 0;
    int subSum14 = 0;
    int subSum15 = 0;
    
    //postres
    int subSum16 = 0;
    int subSum17 = 0;
    
    int qty = 0;
    int qty1 = 0;
    int qty2 = 0;
    int qty3 = 0;
    int qty4 = 0;
    int qty5 = 0;
    int qty6 = 0;
    int qty7 = 0;
    int qty8 = 0;
    int qty9 = 0;
    int qty10 = 0;
    int qty11 = 0;
    int qty12 = 0;
    int qty13 = 0;
    int qty14 = 0;
    int qty15 = 0;
    int qty16 = 0;
    
    public principal p = new principal("C:\\Users\\Emerido Rincon\\Desktop\\proyecto java\\proyecto_final\\src\\angel.wav");
    
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() 
			{
				/*
				PF m = new PF();
				m.setVisible(true);
				*/
				
				
				try {
					UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
					menu window = new menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				
				}
			
			}
		});
	}

	/**
	 * Create the application.
	 */
	public menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 997, 786);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		PF v = new PF();
		no = v.nombrevendedor(); 
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 163, 963, 466);
		 panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.gray),"Pedido "));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 943, 465);
		panel.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Hamburguesa", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel H_label1 = new JLabel("");
		H_label1.setBounds(43, 11, 119, 98);
		panel_1.add(H_label1);
		
		HC_check = new JCheckBox("");
		HC_check.setBounds(16, 50, 21, 23);
		panel_1.add(HC_check);
		
		precio1 = new JLabel("$170");
		precio1.setFont(new Font("Wide Latin", Font.PLAIN, 13));
		precio1.setBounds(43, 159, 69, 24);
		panel_1.add(precio1);
		
		JLabel nombreh2 = new JLabel("clasica");
		nombreh2.setFont(new Font("Monospaced", Font.BOLD, 19));
		nombreh2.setBounds(43, 135, 100, 21);
		panel_1.add(nombreh2);
		
		JLabel nombreh = new JLabel("Hamburguesa");
		nombreh.setFont(new Font("Monospaced", Font.BOLD, 19));
		nombreh.setBounds(43, 115, 150, 21);
		panel_1.add(nombreh);
		
	    spinner = new JSpinner();
		spinner.setBounds(115, 161, 49, 20);
		panel_1.add(spinner);
		spinner.setValue(1);
		
		JLabel lblNewLabel = new JLabel("doble");
		lblNewLabel.setFont(new Font("Monospaced", Font.BOLD, 19));
		lblNewLabel.setBounds(249, 135, 100, 21);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("$250");
		lblNewLabel_1.setFont(new Font("Wide Latin", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(249, 159, 69, 24);
		panel_1.add(lblNewLabel_1);
		
		JLabel HD = new JLabel("Hamburguesa");
		HD.setFont(new Font("Monospaced", Font.BOLD, 19));
		HD.setBounds(249, 115, 150, 21);
		panel_1.add(HD);
		
		JLabel H_label2 = new JLabel("");
		H_label2.setBounds(249, 11, 119, 98);
		panel_1.add(H_label2);
		
		HC_check1 = new JCheckBox("");
		HC_check1.setBounds(222, 50, 21, 23);
		panel_1.add(HC_check1);
		
		 spinner_1 = new JSpinner();
		spinner_1.setBounds(328, 161, 49, 20);
		panel_1.add(spinner_1);
		spinner_1.setValue(1);
		
		JLabel H_label3 = new JLabel("");
		H_label3.setBounds(455, 11, 119, 98);
		panel_1.add(H_label3);
		
		JLabel lblNewLabel_4 = new JLabel("Hamburguesa");
		lblNewLabel_4.setFont(new Font("Monospaced", Font.BOLD, 19));
		lblNewLabel_4.setBounds(455, 115, 150, 21);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("con papas");
		lblNewLabel_5.setFont(new Font("Monospaced", Font.BOLD, 19));
		lblNewLabel_5.setBounds(455, 135, 150, 21);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("$300");
		lblNewLabel_6.setFont(new Font("Wide Latin", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(455, 159, 69, 24);
		panel_1.add(lblNewLabel_6);
		
	    spinner_2 = new JSpinner();
		spinner_2.setBounds(534, 161, 49, 20);
		panel_1.add(spinner_2);
		spinner_2.setValue(1);
		
		HC_check2 = new JCheckBox("");
		HC_check2.setBounds(428, 50, 21, 23);
		panel_1.add(HC_check2);
		
		JLabel lblNewLabel_3 = new JLabel("combos");
		lblNewLabel_3.setFont(new Font("Wide Latin", Font.BOLD, 20));
		lblNewLabel_3.setBounds(25, 204, 150, 35);
		panel_1.add(lblNewLabel_3);
		
		JLabel H_label4 = new JLabel("");
		H_label4.setBounds(43, 250, 119, 98);
		panel_1.add(H_label4);
		
		JLabel lblNewLabel_8 = new JLabel("Combo 1");
		lblNewLabel_8.setFont(new Font("Monospaced", Font.BOLD, 19));
		lblNewLabel_8.setBounds(43, 352, 100, 21);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("$400");
		lblNewLabel_9.setFont(new Font("Wide Latin", Font.PLAIN, 13));
		lblNewLabel_9.setBounds(43, 377, 69, 24);
		panel_1.add(lblNewLabel_9);
		
	    spinner_3 = new JSpinner();
		spinner_3.setBounds(115, 377, 49, 20);
		panel_1.add(spinner_3);
		spinner_3.setValue(1);
		
		HC_check3 = new JCheckBox("");
		HC_check3.setBounds(16, 280, 21, 23);
		panel_1.add(HC_check3);

		Image imagenH1 = new ImageIcon("C:\\Users\\Emerido Rincon\\Desktop\\proyecto java\\proyecto_final\\src\\comida rapida\\hamburguesa.jpg").getImage();
		ImageIcon ham1 = new ImageIcon((imagenH1.getScaledInstance(H_label1.getWidth(),H_label1.getHeight(),imagenH1.SCALE_SMOOTH)));
		H_label1.setIcon(ham1);
		
		Image imagenH2 = new ImageIcon("C:\\Users\\Emerido Rincon\\Desktop\\proyecto java\\proyecto_final\\src\\comida rapida\\hamburguesa doble.jpg").getImage();
		ImageIcon ham2 = new ImageIcon((imagenH2.getScaledInstance(H_label2.getWidth(),H_label2.getHeight(),imagenH2.SCALE_SMOOTH)));
		H_label2.setIcon(ham2);
		
		Image imagenH3 = new ImageIcon("C:\\Users\\Emerido Rincon\\Desktop\\proyecto java\\proyecto_final\\src\\comida rapida\\hamburguesa con papa.jpg").getImage();
		ImageIcon ham3 = new ImageIcon((imagenH3.getScaledInstance(H_label3.getWidth(),H_label3.getHeight(),imagenH3.SCALE_SMOOTH)));
		H_label3.setIcon(ham3);
		
		Image imagenH4 = new ImageIcon("C:\\Users\\Emerido Rincon\\Desktop\\proyecto java\\proyecto_final\\src\\comida rapida\\combo1.jpg").getImage();
		ImageIcon ham4 = new ImageIcon((imagenH4.getScaledInstance(H_label4.getWidth(),H_label4.getHeight(),imagenH4.SCALE_SMOOTH)));
		H_label4.setIcon(ham4);
		
	
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Hot Dog", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel HD_label1 = new JLabel("");
		HD_label1.setBounds(43, 11, 119, 98);
		panel_2.add(HD_label1);
		
		JLabel lblNewLabel_10 = new JLabel("Hot Dog");
		lblNewLabel_10.setFont(new Font("Monospaced", Font.BOLD, 19));
		lblNewLabel_10.setBounds(43, 115, 119, 21);
		panel_2.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("clasico");
		lblNewLabel_11.setFont(new Font("Monospaced", Font.BOLD, 19));
		lblNewLabel_11.setBounds(43, 135, 100, 21);
		panel_2.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("$100");
		lblNewLabel_12.setFont(new Font("Wide Latin", Font.PLAIN, 13));
		lblNewLabel_12.setBounds(43, 159, 69, 24);
		panel_2.add(lblNewLabel_12);
		
	    spinner_4 = new JSpinner();
		spinner_4.setBounds(115, 162, 49, 20);
		panel_2.add(spinner_4);
		spinner_4.setValue(1);
		
		spinner.setEnabled(false);
		spinner_1.setEnabled(false);
		spinner_2.setEnabled(false);
		spinner_3.setEnabled(false);
		
	    HD_check = new JCheckBox("");
		HD_check.setBounds(16, 50, 21, 23);
		panel_2.add(HD_check);
		
        HD_check1 = new JCheckBox("");
		HD_check1.setBounds(222, 50, 21, 23);
		panel_2.add(HD_check1);
		
		
		JLabel lblNewLabel_7g = new JLabel("Hot Dog");
		lblNewLabel_7g.setFont(new Font("Monospaced", Font.BOLD, 19));
		lblNewLabel_7g.setBounds(249, 115, 125, 21);
		panel_2.add(lblNewLabel_7g);
		
		JLabel lblNewLabel_7 = new JLabel("Hot Dog");
		lblNewLabel_7.setFont(new Font("Monospaced", Font.BOLD, 19));
		lblNewLabel_7.setBounds(455, 115, 125, 21);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_13 = new JLabel("Special");
		lblNewLabel_13.setFont(new Font("Monospaced", Font.BOLD, 19));
		lblNewLabel_13.setBounds(249, 135, 119, 21);
		panel_2.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("$160");
		lblNewLabel_14.setFont(new Font("Wide Latin", Font.PLAIN, 13));
		lblNewLabel_14.setBounds(249, 159, 69, 24);
		panel_2.add(lblNewLabel_14);
		
	    spinner_5 = new JSpinner();
		spinner_5.setBounds(317, 162, 49, 20);
		panel_2.add(spinner_5);
		spinner_5.setValue(1);
		
		JLabel HD_label2 = new JLabel("");
		HD_label2.setBounds(249, 11, 119, 98);
		panel_2.add(HD_label2);
		
	    HD_check2 = new JCheckBox("");
		HD_check2.setBounds(428, 50, 21, 23);
		panel_2.add(HD_check2);
		
		JLabel lblNewLabel_7s = new JLabel("Hot Dog");
		lblNewLabel_7s.setFont(new Font("Monospaced", Font.BOLD, 19));
		panel_2.add(lblNewLabel_7s);
		
		JLabel lblNewLabel_132 = new JLabel("Con Papas");
		lblNewLabel_132.setFont(new Font("Monospaced", Font.BOLD, 19));
		lblNewLabel_132.setBounds(455, 135, 119, 21);
		panel_2.add(lblNewLabel_132);
		
		JLabel lblNewLabel_142 = new JLabel("$160");
		lblNewLabel_142.setFont(new Font("Wide Latin", Font.PLAIN, 13));
		lblNewLabel_142.setBounds(455, 159, 69, 24);
		panel_2.add(lblNewLabel_142);
		
	   spinner_6 = new JSpinner();
		spinner_6.setBounds(525, 162, 49, 20);
		panel_2.add(spinner_6);
		spinner_6.setValue(1);
		
		JLabel HD_label3 = new JLabel("");
		HD_label3.setBounds(455, 11, 119, 98);
		panel_2.add(HD_label3);
		
		JLabel lblNewLabel_3r = new JLabel("combos");
		lblNewLabel_3r.setFont(new Font("Wide Latin", Font.BOLD, 20));
		lblNewLabel_3r.setBounds(25, 204, 150, 35);
		panel_2.add(lblNewLabel_3r);
		
		JLabel HD_label4 = new JLabel("");
		HD_label4.setBounds(43, 250, 119, 98);
		panel_2.add(HD_label4);
		
		JLabel HDD_label4 = new JLabel("Combo 1");
		HDD_label4.setFont(new Font("Monospaced", Font.BOLD, 19));
		HDD_label4.setBounds(43, 350, 100, 21);
		panel_2.add(HDD_label4);
		
		JLabel lblNewLabel_92 = new JLabel("$400");
		lblNewLabel_92.setFont(new Font("Wide Latin", Font.PLAIN, 13));
		lblNewLabel_92.setBounds(43, 377, 69, 24);
		panel_2.add(lblNewLabel_92);
		
	   spinner_7 = new JSpinner();
		spinner_7.setBounds(115, 377, 49, 20);
		panel_2.add(spinner_7);
		spinner_7.setValue(1);
		
	    HD_check3 = new JCheckBox("");
		HD_check3.setBounds(16, 280, 21, 23);
		panel_2.add(HD_check3);
		
		Image imagenHD1 = new ImageIcon("C:\\Users\\Emerido Rincon\\Desktop\\proyecto java\\proyecto_final\\src\\comida rapida\\hot dog.jpg").getImage();
		ImageIcon hd1 = new ImageIcon((imagenHD1.getScaledInstance(H_label1.getWidth(),H_label1.getHeight(),imagenHD1.SCALE_SMOOTH)));
		HD_label1.setIcon(hd1);
		
		Image imagenHD2 = new ImageIcon("C:\\Users\\Emerido Rincon\\Desktop\\proyecto java\\proyecto_final\\src\\comida rapida\\hot dog especial.jpg").getImage();
		ImageIcon hd2 = new ImageIcon((imagenHD2.getScaledInstance(HD_label2.getWidth(),HD_label2.getHeight(),imagenHD2.SCALE_SMOOTH)));
		HD_label2.setIcon(hd2);
		
		Image imagenHD3 = new ImageIcon("C:\\Users\\Emerido Rincon\\Desktop\\proyecto java\\proyecto_final\\src\\comida rapida\\hot dogs con papa.jpg").getImage();
		ImageIcon hd3 = new ImageIcon((imagenHD3.getScaledInstance(HD_label3.getWidth(),HD_label3.getHeight(),imagenHD3.SCALE_SMOOTH)));
		HD_label3.setIcon(hd3);
		
		Image imagenHD4 = new ImageIcon("C:\\Users\\Emerido Rincon\\Desktop\\proyecto java\\proyecto_final\\src\\comida rapida\\combo de HotDog.jpg").getImage();
		ImageIcon hd4 = new ImageIcon((imagenHD4.getScaledInstance(HD_label4.getWidth(),HD_label4.getHeight(),imagenHD4.SCALE_SMOOTH)));
		HD_label4.setIcon(hd4);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Pizza ", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel P_label1 = new JLabel("");
		P_label1.setBounds(43, 11, 119, 98);
		panel_3.add(P_label1);
		
		JLabel lblNewLabel_10P = new JLabel("Pizza de");
		lblNewLabel_10P.setFont(new Font("Monospaced", Font.BOLD, 19));
		lblNewLabel_10P.setBounds(43, 115, 119, 21);
		panel_3.add(lblNewLabel_10P);
		
		JLabel lblNewLabel_11P = new JLabel("queso");
		lblNewLabel_11P.setFont(new Font("Monospaced", Font.BOLD, 19));
		lblNewLabel_11P.setBounds(43, 135, 100, 21);
		panel_3.add(lblNewLabel_11P);
		
		JLabel lblNewLabel_123 = new JLabel("$400");
		lblNewLabel_123.setFont(new Font("Wide Latin", Font.PLAIN, 13));
		lblNewLabel_123.setBounds(43, 159, 69, 24);
		panel_3.add(lblNewLabel_123);
		
		spinner_8 = new JSpinner();
		spinner_8.setBounds(122, 162, 49, 20);
		panel_3.add(spinner_8);
		spinner_8.setValue(1);
		
		 PQ_check = new JCheckBox("");
		PQ_check.setBounds(16, 50, 21, 23);
		panel_3.add(PQ_check);
		
		 PQ_check1 = new JCheckBox("");
		PQ_check1.setBounds(222, 50, 21, 23);
		panel_3.add(PQ_check1);
		
		JLabel lblNewLabel_7g3 = new JLabel("Pizza de");
		lblNewLabel_7g3.setFont(new Font("Monospaced", Font.BOLD, 19));
		lblNewLabel_7g3.setBounds(249, 115, 125, 21);
		panel_3.add(lblNewLabel_7g3);
		
		JLabel lblNewLabel_133 = new JLabel("jamon y queso");
		lblNewLabel_133.setFont(new Font("Monospaced", Font.BOLD, 19));
		lblNewLabel_133.setBounds(249, 135, 119, 21);
		panel_3.add(lblNewLabel_133);
		
		JLabel lblNewLabel_143 = new JLabel("$450");
		lblNewLabel_143.setFont(new Font("Wide Latin", Font.PLAIN, 13));
		lblNewLabel_143.setBounds(249, 159, 69, 24);
		panel_3.add(lblNewLabel_143);
		
		 spinner_9 = new JSpinner();
		spinner_9.setBounds(317, 162, 49, 20);
		panel_3.add(spinner_9);
		spinner_9.setValue(1);
		
		JLabel P_label2 = new JLabel("");
		P_label2.setBounds(249, 11, 119, 98);
		panel_3.add(P_label2);
		
	    PQ_check2 = new JCheckBox("");
		PQ_check2.setBounds(428, 50, 21, 23);
		panel_3.add(PQ_check2);
		
		JLabel lblNewLabel_7s3 = new JLabel("Pizza de");
		lblNewLabel_7s3.setFont(new Font("Monospaced", Font.BOLD, 19));
		panel_3.add(lblNewLabel_7s3);
		
		JLabel lblNewLabel_1323 = new JLabel("peperoni");
		lblNewLabel_1323.setFont(new Font("Monospaced", Font.BOLD, 19));
		lblNewLabel_1323.setBounds(455, 135, 119, 21);
		panel_3.add(lblNewLabel_1323);
		
		JLabel lblNewLabel_1423 = new JLabel("$450");
		lblNewLabel_1423.setFont(new Font("Wide Latin", Font.PLAIN, 13));
		lblNewLabel_1423.setBounds(455, 159, 69, 24);
		panel_3.add(lblNewLabel_1423);
		
	    spinner_10 = new JSpinner();
		spinner_10.setBounds(534, 161, 49, 20);
		panel_3.add(spinner_10);
		spinner_10.setValue(1);
		
		JLabel P_label3 = new JLabel("");
		P_label3.setBounds(455, 11, 119, 98);
		panel_3.add(P_label3);
		
		JLabel lblNewLabel_3r3 = new JLabel("combos");
		lblNewLabel_3r3.setFont(new Font("Wide Latin", Font.BOLD, 20));
		lblNewLabel_3r3.setBounds(25, 204, 150, 35);
		panel_3.add(lblNewLabel_3r3);
		
		JLabel P_label4 = new JLabel("");
		P_label4.setBounds(43, 250, 119, 98);
		panel_3.add(P_label4);
		
		JLabel HDD_label43 = new JLabel("Combo 1");
		HDD_label43.setFont(new Font("Monospaced", Font.BOLD, 19));
		HDD_label43.setBounds(43, 350, 100, 21);
		panel_3.add(HDD_label43);
		
		JLabel lblNewLabel_923 = new JLabel("$700");
		lblNewLabel_923.setFont(new Font("Wide Latin", Font.PLAIN, 13));
		lblNewLabel_923.setBounds(43, 377, 69, 24);
		panel_3.add(lblNewLabel_923);
		
	    spinner_11 = new JSpinner();
		spinner_11.setBounds(115, 377, 49, 20);
		panel_3.add(spinner_11);
		spinner_11.setValue(1);
		
		
		PQ_check3 = new JCheckBox("");
		PQ_check3.setBounds(16, 280, 21, 23);
		panel_3.add(PQ_check3);
		
		Image imagenP1 = new ImageIcon("C:\\Users\\Emerido Rincon\\Desktop\\proyecto java\\proyecto_final\\src\\comida rapida\\pizza de queso.jpg").getImage();
		ImageIcon P1 = new ImageIcon((imagenP1.getScaledInstance(P_label1.getWidth(),P_label1.getHeight(),imagenP1.SCALE_SMOOTH)));
		P_label1.setIcon(P1);
		
		Image imagenP2 = new ImageIcon("C:\\Users\\Emerido Rincon\\Desktop\\proyecto java\\proyecto_final\\src\\comida rapida\\pizza de jamon y queso.jpg").getImage();
		ImageIcon P2 = new ImageIcon((imagenP2.getScaledInstance(P_label2.getWidth(),P_label2.getHeight(),imagenP2.SCALE_SMOOTH)));
		P_label2.setIcon(P2);
		
		Image imagenP3 = new ImageIcon("C:\\Users\\Emerido Rincon\\Desktop\\proyecto java\\proyecto_final\\src\\comida rapida\\pizza de peperoni.jpg").getImage();
		ImageIcon P3 = new ImageIcon((imagenP3.getScaledInstance(P_label3.getWidth(),P_label3.getHeight(),imagenP3.SCALE_SMOOTH)));
		P_label3.setIcon(P3);
		
		Image imagenP4 = new ImageIcon("C:\\Users\\Emerido Rincon\\Desktop\\proyecto java\\proyecto_final\\src\\comida rapida\\combo de pizza.jpg").getImage();
		ImageIcon P4 = new ImageIcon((imagenP4.getScaledInstance(P_label4.getWidth(),P_label4.getHeight(),imagenP4.SCALE_SMOOTH)));
		P_label4.setIcon(P4);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Bebidas", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel B_label1 = new JLabel("");
		B_label1.setBounds(43, 11, 119, 98);
		panel_4.add(B_label1);
		
		JLabel lblNewLabel_10P9 = new JLabel("Cocca Cola");
		lblNewLabel_10P9.setFont(new Font("Monospaced", Font.BOLD, 19));
		lblNewLabel_10P9.setBounds(43, 115, 119, 21);
		panel_4.add(lblNewLabel_10P9);
		
		JLabel lblNewLabel_123i = new JLabel("$60");
		lblNewLabel_123i.setFont(new Font("Wide Latin", Font.PLAIN, 13));
		lblNewLabel_123i.setBounds(43, 135, 69, 24);
		panel_4.add(lblNewLabel_123i);
		
	    spinner_12 = new JSpinner();
		spinner_12.setBounds(104, 138, 49, 20);
		panel_4.add(spinner_12);
		spinner_12.setValue(1);
		
		
		JCheckBox A_check = new JCheckBox("");
		A_check.setBounds(16, 50, 21, 23);
		panel_4.add(A_check);
		
		JCheckBox A_check1 = new JCheckBox("");
		A_check1.setBounds(222, 50, 21, 23);
		panel_4.add(A_check1);
		
		JLabel lblNewLabel_7g3f = new JLabel("Red Rock");
		lblNewLabel_7g3f.setFont(new Font("Monospaced", Font.BOLD, 19));
		lblNewLabel_7g3f.setBounds(249, 115, 125, 21);
		panel_4.add(lblNewLabel_7g3f);
		
		JLabel lblNewLabel_143k = new JLabel("$50");
		lblNewLabel_143k.setFont(new Font("Wide Latin", Font.PLAIN, 13));
		lblNewLabel_143k.setBounds(249, 135, 69, 24);
		panel_4.add(lblNewLabel_143k);
		
	    spinner_13 = new JSpinner();
		spinner_13.setBounds(305, 138, 49, 20);
		panel_4.add(spinner_13);
		spinner_13.setValue(1);
		
		
		JLabel B_label2 = new JLabel("");
		B_label2.setBounds(249, 11, 119, 98);
		panel_4.add(B_label2);
		
		JCheckBox A_check2 = new JCheckBox("");
		A_check2.setBounds(428, 50, 21, 23);
		panel_4.add(A_check2);
		
		JLabel agua = new JLabel("Agua");
		agua.setFont(new Font("Monospaced", Font.BOLD, 19));
		agua.setBounds(455, 115, 125, 21);
		panel_4.add(agua);
		
		JLabel lblNewLabel_1423n = new JLabel("$30");
		lblNewLabel_1423n.setFont(new Font("Wide Latin", Font.PLAIN, 13));
		lblNewLabel_1423n.setBounds(455, 135, 69, 24);
		panel_4.add(lblNewLabel_1423n);
		
		spinner_14 = new JSpinner();
		spinner_14.setBounds(511, 138, 49, 20);
		panel_4.add(spinner_14);
		spinner_14.setValue(1);
		
		
		JLabel B_label3 = new JLabel("");
		B_label3.setBounds(455, 11, 119, 98);
		panel_4.add(B_label3);
		
		Image imagenB1 = new ImageIcon("C:\\Users\\Emerido Rincon\\Desktop\\proyecto java\\proyecto_final\\src\\comida rapida\\coca cola.jpg").getImage();
		ImageIcon B1 = new ImageIcon((imagenB1.getScaledInstance(B_label1.getWidth(),B_label1.getHeight(),imagenB1.SCALE_SMOOTH)));
		B_label1.setIcon(B1);
		
		Image imagenB2 = new ImageIcon("C:\\Users\\Emerido Rincon\\Desktop\\proyecto java\\proyecto_final\\src\\comida rapida\\red rock.jpg").getImage();
		ImageIcon B2 = new ImageIcon((imagenB2.getScaledInstance(B_label2.getWidth(),B_label2.getHeight(),imagenB2.SCALE_SMOOTH)));
		B_label2.setIcon(B2);
		
		Image imagenB3 = new ImageIcon("C:\\Users\\Emerido Rincon\\Desktop\\proyecto java\\proyecto_final\\src\\comida rapida\\Agua.jpg").getImage();
		ImageIcon B3 = new ImageIcon((imagenB3.getScaledInstance(B_label3.getWidth(),B_label3.getHeight(),imagenB3.SCALE_SMOOTH)));
		B_label3.setIcon(B3);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Postres ", null, panel_5, null);
		panel_5.setLayout(null);
		
		JLabel h_label1 = new JLabel("");
		h_label1.setBounds(43, 11, 119, 98);
		panel_5.add(h_label1);
		
		JLabel gffv = new JLabel("Muffin");
		gffv.setFont(new Font("Monospaced", Font.BOLD, 19));
		gffv.setBounds(43, 115, 119, 21);
		panel_5.add(gffv);
		
		JLabel lblNewLabel_123ih = new JLabel("$80");
		lblNewLabel_123ih.setFont(new Font("Wide Latin", Font.PLAIN, 13));
		lblNewLabel_123ih.setBounds(43, 135, 69, 24);
		panel_5.add(lblNewLabel_123ih);
		
		spinner_15 = new JSpinner();
		spinner_15.setBounds(98, 138, 49, 20);
		panel_5.add(spinner_15);
		spinner_15.setValue(1);
		
		
		JCheckBox P_check = new JCheckBox("");
		P_check.setBounds(16, 50, 21, 23);
		panel_5.add(P_check);
		
		JCheckBox P_check1 = new JCheckBox("");
		P_check1.setBounds(222, 50, 21, 23);
		panel_5.add(P_check1);
		
		JLabel h_label2 = new JLabel("");
		h_label2.setBounds(249, 11, 119, 98);
		panel_5.add(h_label2);
		
		JLabel lblNewLabel_7g3f5= new JLabel("Helados");
		lblNewLabel_7g3f5.setFont(new Font("Monospaced", Font.BOLD, 19));
		lblNewLabel_7g3f5.setBounds(249, 115, 125, 21);
		panel_5.add(lblNewLabel_7g3f5);
		
		JLabel lblNewLabel_143k5 = new JLabel("$125");
		lblNewLabel_143k5.setFont(new Font("Wide Latin", Font.PLAIN, 13));
		lblNewLabel_143k5.setBounds(249, 135, 69, 24);
		panel_5.add(lblNewLabel_143k5);
		
		spinner_16 = new JSpinner();
		spinner_16.setBounds(315, 138, 49, 20);
		panel_5.add(spinner_16);
		spinner_16.setValue(1);
		
		
		Image imagenh1 = new ImageIcon("C:\\Users\\Emerido Rincon\\Desktop\\proyecto java\\proyecto_final\\src\\comida rapida\\muffin.jpg").getImage();
		ImageIcon h1 = new ImageIcon((imagenh1.getScaledInstance(h_label1.getWidth(),h_label1.getHeight(),imagenh1.SCALE_SMOOTH)));
		h_label1.setIcon(h1);
		
		Image imagenh2 = new ImageIcon("C:\\Users\\Emerido Rincon\\Desktop\\proyecto java\\proyecto_final\\src\\comida rapida\\helado.jpg").getImage();
		ImageIcon h2 = new ImageIcon((imagenh2.getScaledInstance(h_label2.getWidth(),h_label2.getHeight(),imagenh2.SCALE_SMOOTH)));
		h_label2.setIcon(h2);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(10, 10, 963, 143);
		frame.getContentPane().add(panel_6);
		 panel_6.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.gray),"Datos"));
		panel_6.setLayout(null);
		
		numeroCliente = new JTextField();
		numeroCliente.setEnabled(false);
		numeroCliente.setBounds(172, 71, 354, 19);
		panel_6.add(numeroCliente);
		numeroCliente.setColumns(10);
		
		cliente = new JTextField();
		cliente.setBounds(172, 48, 354, 19);
		panel_6.add(cliente);
		cliente.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Numero De Orden:");
		lblNewLabel_15.setForeground(new Color(255, 0, 0));
		lblNewLabel_15.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblNewLabel_15.setBounds(28, 73, 131, 13);
		panel_6.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Nombre del Cliente:");
		lblNewLabel_16.setForeground(new Color(255, 0, 0));
		lblNewLabel_16.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblNewLabel_16.setBounds(28, 48, 134, 13);
		panel_6.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Fecha de Pedido");
		lblNewLabel_17.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		lblNewLabel_17.setBounds(221, 10, 109, 13);
		panel_6.add(lblNewLabel_17);
		
		textField_2 = new JTextField();
		textField_2.setBounds(340, 7, 78, 19);
		panel_6.add(textField_2);
		textField_2.setColumns(10);
		textField_2.setEnabled(false);
		
		textField_2.setText(LocalDate.now().toString());
		
		JLabel imagenes = new JLabel(" ");
		imagenes.setBackground(new Color(255, 0, 0));
		imagenes.setForeground(Color.BLACK);
		imagenes.setBounds(536, 10, 417, 123);
		panel_6.add(imagenes);
		Image imagenpk = new ImageIcon("C:\\Users\\Emerido Rincon\\Desktop\\proyecto java\\proyecto_final\\src\\comida rapida\\restaurante.png").getImage();
		ImageIcon hpk = new ImageIcon((imagenpk.getScaledInstance(imagenes.getWidth(),imagenes.getHeight(),imagenpk.SCALE_SMOOTH)));
		imagenes.setIcon(hpk);
		
		JLabel lblNewLabel_20 = new JLabel("vendedor:");
		lblNewLabel_20.setForeground(Color.RED);
		lblNewLabel_20.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblNewLabel_20.setBounds(31, 97, 79, 13);
		panel_6.add(lblNewLabel_20);
		
		vendedor = new JLabel("New label");
		vendedor.setBounds(115, 97, 181, 14);
		panel_6.add(vendedor);
		vendedor.setText(no);
		
		JButton boton = new JButton("Cambiar Imagen");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				JFileChooser f = new JFileChooser();
				String ruta="";
				int a=0;
			
			FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JPEG,PNG & GIF","jpeg","png","gif"); 
			f.setFileFilter(filtrado);
				
		    a = f.showOpenDialog(boton);
				
				
				
				if(a == f.APPROVE_OPTION) 
				{
					ruta=f.getSelectedFile().getPath();
					
					Image imagen = new ImageIcon(ruta).getImage();
					ImageIcon mi = new ImageIcon(imagen.getScaledInstance(imagenes.getWidth(),imagenes.getHeight(), imagen.SCALE_SMOOTH));
					imagenes.setIcon(mi);
				}
			}
		});
		/*boton.setBounds(606, 112, 144, 21);
		panel_6.add(boton);
		
		JButton btnNewButton = new JButton("Iniciar Sesion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				PF usuario= new PF();
				usuario.setVisible(true);
			}
		});
		btnNewButton.setBounds(846, 20, 107, 21);
		panel_6.add(btnNewButton);*/
		
		cliente.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) 
            {
            	Random r = new Random();
				int k = r.nextInt(1*10000);
				
				numeroCliente.setText(Integer.toString(k));
                
            }
        });
		
			
		spinner.setEnabled(false);
		spinner_1.setEnabled(false);
		spinner_2.setEnabled(false);
		spinner_3.setEnabled(false);
		spinner_4.setEnabled(false);
		spinner_5.setEnabled(false);
		spinner_6.setEnabled(false);
		spinner_7.setEnabled(false);
		spinner_8.setEnabled(false);
		spinner_9.setEnabled(false);
		spinner_10.setEnabled(false);
		spinner_11.setEnabled(false);
		spinner_12.setEnabled(false);
		spinner_13.setEnabled(false);
		spinner_14.setEnabled(false);
		spinner_15.setEnabled(false);
		spinner_16.setEnabled(false);
		
		JLabel lblNewLabel_2 = new JLabel("SubTotal:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(641, 662, 77, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_18 = new JLabel("ITIBIS");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_18.setBounds(641, 682, 45, 13);
		frame.getContentPane().add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("TOTAL");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_19.setBounds(641, 705, 45, 13);
		frame.getContentPane().add(lblNewLabel_19);
		
		JButton enviar = new JButton("Guardar datos");
		enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String c = cliente.getText();
				String l = numeroCliente.getText();
				String orden;
				
				if(c!="") 
				{
				orden ="Nombre: "+cliente.getText()+"\n Numero de Orden: "+l;
				File archivo = new File("orden.txt");
				
				try {
					PrintWriter p = new PrintWriter(archivo);
					p.print(orden);
					
					p.close();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				}
				else 
				{
					JOptionPane.showMessageDialog(enviar, "debe llenar el cuadro de cliente");
				}
				
				
				
				
			}
		});
		enviar.setBounds(20, 662, 119, 48);
		frame.getContentPane().add(enviar);
		enviar.setFont(new Font("Gill Sans MT", Font.ITALIC, 16));
		enviar.setBackground(new Color(255, 255, 255));
		enviar.setForeground(new Color(255, 0, 0));
		
		JLabel subtotal = new JLabel("");
		subtotal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		subtotal.setBounds(708, 663, 77, 13);
		frame.getContentPane().add(subtotal);
		
		JLabel itibis = new JLabel("");
		itibis.setFont(new Font("Tahoma", Font.PLAIN, 13));
		itibis.setBounds(708, 685, 77, 13);
		frame.getContentPane().add(itibis);
		
		JLabel total = new JLabel("");
		total.setFont(new Font("Tahoma", Font.PLAIN, 13));
		total.setBounds(708, 706, 77, 13);
		frame.getContentPane().add(total);
		
		JButton botonPlay = new JButton("play");
		botonPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				p.loop();
			}
		});
		botonPlay.setBounds(214, 679, 85, 21);
		frame.getContentPane().add(botonPlay);
		
		
		
		/* CONEXION A LA BASE DE DATOS
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conexcion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/universidad","root","");
			
			java.sql.Statement sata = conexcion.createStatement();
			
			String nombre=cuadro.getText();
		String fecha =  dia.getSelectedItem()+"/"+ mes.getSelectedItem() +"/"+ an.getText();
			int hora = (int) hora1.getSelectedItem();
			
			String lugar = lugarCuadro.getText();
			
			
			if(cuadro.getText().isEmpty() || lugarCuadro.getText().isEmpty() || an.getText().isEmpty()) 
			{
				JOptionPane.showMessageDialog(null, "todos los campo tiene que llenarlos obligatoriamente");
			}
			else 
			{
				JOptionPane.showMessageDialog(null, "los datos se guardaron correctamente");
				((java.sql.Statement)sata).executeUpdate("insert into alumno(Nombre_de_evento,hora,fecha,lugar) values('"+nombre+"' ,"+hora+",'"+fecha+"' ,'"+lugar+"')");
				
			}
			
				conexcion.close();
			
		}catch (ClassNotFoundException o) 
		{
			o.printStackTrace();
			
		}catch (SQLException a) 
		{
			a.printStackTrace();
		}
	}
		*/
		
		HC_check.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(HC_check.isSelected()) 
				{
					
					spinner.setEnabled(true);
					
					subSum1 = subSum1 + 170;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		           itibi=(int) (totalBurger*0.18);
		           to=subSum1+itibi;
		        
					subtotal.setText(Integer.toString(totalBurger));
					itibis.setText(Integer.toString(itibi));
					  total.setText(Integer.toString(to));
				}
				else 
				{
					spinner.setEnabled(false);
					spinner.setValue(1);
					subSum1 = 0;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
			           
			           
		            subtotal.setText(Integer.toString(totalBurger));
		            itibis.setText(Integer.toString(itibi));
		            total.setText(Integer.toString(to));
				}
			}
			
		         
		});
		
		 spinner.addChangeListener(new ChangeListener() {
		    	public void stateChanged(ChangeEvent e) 
		    	{
		    		int spinRate3 = 170;
		            if(HC_check.isSelected()){
		            int preQty1;
		            preQty1 = (Integer)spinner.getValue();
		            if(preQty1 > qty2){
		                qty2 = preQty1;
		                subSum1 = spinRate3 * preQty1;
		                itibi=(int) (totalBurger*0.18);
		                to=subSum1+itibi;
		                
		                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
		               
		            }
		            else if(preQty1<=qty2){
		                qty2 = preQty1;
		                subSum3 = spinRate3 * preQty1;
		                itibi=(int) (totalBurger*0.18);
		                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
		            }
		            subtotal.setText(String.valueOf(totalBurger));
		            itibis.setText(Integer.toString(itibi));
		            total.setText(Integer.toString(to));
		           }
		    	}
		    });
		
		HC_check1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(HC_check1.isSelected()) 
				{
					
					spinner_1.setEnabled(true);
					
					subSum1 = subSum1 + 250;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
		        
					subtotal.setText(Integer.toString(totalBurger));
					itibis.setText(Integer.toString(itibi));
					  total.setText(Integer.toString(to));
				}
				else 
				{
					spinner_1.setEnabled(false);
					spinner_1.setValue(1);
					subSum1 = 0;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
			           
			           
		            subtotal.setText(Integer.toString(totalBurger));
		            itibis.setText(Integer.toString(itibi));
		            total.setText(Integer.toString(to));
				}
			}
			
		         
		});
			
		 spinner_1.addChangeListener(new ChangeListener() {
		    	public void stateChanged(ChangeEvent e) 
		    	{
		    		int spinRate3 = 250;
		            if(HC_check1.isSelected()){
		            int preQty1;
		            preQty1 = (Integer)spinner_1.getValue();
		            if(preQty1 > qty2){
		                qty2 = preQty1;
		                subSum1 = spinRate3 * preQty1;
		                itibi=(int) (totalBurger*0.18);
		                to=subSum1+itibi;
		                
		                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
		               
		            }
		            else if(preQty1<=qty2){
		                qty2 = preQty1;
		                subSum3 = spinRate3 * preQty1;
		                itibi=(int) (totalBurger*0.18);
		                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
		            }
		            subtotal.setText(String.valueOf(totalBurger));
		            itibis.setText(Integer.toString(itibi));
		            total.setText(Integer.toString(to));
		           }
		    	}
		    });
		
		HC_check2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(HC_check2.isSelected()) 
				{
					
					spinner_2.setEnabled(true);
					
					subSum1 = subSum1 + 300;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
		        
					subtotal.setText(Integer.toString(totalBurger));
					itibis.setText(Integer.toString(itibi));
					  total.setText(Integer.toString(to));
				}
				else 
				{
					spinner_2.setEnabled(false);
					spinner_2.setValue(1);
					subSum1 = 0;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
			           
			           
		            subtotal.setText(Integer.toString(totalBurger));
		            itibis.setText(Integer.toString(itibi));
		            total.setText(Integer.toString(to));
				}
			}
		});
		
		spinner_2.addChangeListener(new ChangeListener() {
	    	public void stateChanged(ChangeEvent e) 
	    	{
	    		int spinRate3 = 300;
	            if(HC_check2.isSelected()){
	            int preQty1;
	            preQty1 = (Integer)spinner_2.getValue();
	            if(preQty1 > qty2){
	                qty2 = preQty1;
	                subSum1 = spinRate3 * preQty1;
	                itibi=(int) (totalBurger*0.18);
	                to=subSum1+itibi;
	                
	                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
	               
	            }
	            else if(preQty1<=qty2){
	                qty2 = preQty1;
	                subSum3 = spinRate3 * preQty1;
	                itibi=(int) (totalBurger*0.18);
	                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
	            }
	            subtotal.setText(String.valueOf(totalBurger));
	            itibis.setText(Integer.toString(itibi));
	            total.setText(Integer.toString(to));
	           }
	    	}
	    });
		
		HC_check3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(HC_check3.isSelected()) 
				{
					
					spinner_3.setEnabled(true);
					
					subSum1 = subSum1 + 400;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
		        
					subtotal.setText(Integer.toString(totalBurger));
					itibis.setText(Integer.toString(itibi));
					  total.setText(Integer.toString(to));
				}
				else 
				{
					spinner_3.setEnabled(false);
					spinner_3.setValue(1);
					subSum1 = 0;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
			           
			           
		            subtotal.setText(Integer.toString(totalBurger));
		            itibis.setText(Integer.toString(itibi));
		            total.setText(Integer.toString(to));
				}
			}
			
		         
		});
		
		spinner_3.addChangeListener(new ChangeListener() {
	    	public void stateChanged(ChangeEvent e) 
	    	{
	    		int spinRate3 = 400;
	            if(HC_check3.isSelected()){
	            int preQty1;
	            preQty1 = (Integer)spinner_3.getValue();
	            if(preQty1 > qty2){
	                qty2 = preQty1;
	                subSum1 = spinRate3 * preQty1;
	                itibi=(int) (totalBurger*0.18);
	                to=subSum1+itibi;
	                
	                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
	               
	            }
	            else if(preQty1<=qty2){
	                qty2 = preQty1;
	                subSum3 = spinRate3 * preQty1;
	                itibi=(int) (totalBurger*0.18);
	                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
	            }
	            subtotal.setText(String.valueOf(totalBurger));
	            itibis.setText(Integer.toString(itibi));
	            total.setText(Integer.toString(to));
	           }
	    	}
	    });
		
		HD_check.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(HD_check.isSelected()) 
				{
					
					spinner_4.setEnabled(true);
					
					subSum1 = subSum1 + 100;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
		        
					subtotal.setText(Integer.toString(totalBurger));
					itibis.setText(Integer.toString(itibi));
					  total.setText(Integer.toString(to));
				}
				else 
				{
					spinner_4.setEnabled(false);
					spinner_4.setValue(1);
					subSum1 = 0;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
			           
			           
		            subtotal.setText(Integer.toString(totalBurger));
		            itibis.setText(Integer.toString(itibi));
		            total.setText(Integer.toString(to));
				}
			}
			
		         
		});
		
		spinner_4.addChangeListener(new ChangeListener() {
	    	public void stateChanged(ChangeEvent e) 
	    	{
	    		int spinRate3 = 100;
	            if(HD_check.isSelected()){
	            int preQty1;
	            preQty1 = (Integer)spinner_4.getValue();
	            if(preQty1 > qty2){
	                qty2 = preQty1;
	                subSum1 = spinRate3 * preQty1;
	                itibi=(int) (totalBurger*0.18);
	                to=subSum1+itibi;
	                
	                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
	               
	            }
	            else if(preQty1<=qty2){
	                qty2 = preQty1;
	                subSum3 = spinRate3 * preQty1;
	                itibi=(int) (totalBurger*0.18);
	                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
	            }
	            subtotal.setText(String.valueOf(totalBurger));
	            itibis.setText(Integer.toString(itibi));
	            total.setText(Integer.toString(to));
	           }
	    	}
	    });
		
		HD_check1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(HD_check1.isSelected()) 
				{
					
					spinner_5.setEnabled(true);
					
					subSum1 = subSum1 + 160;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
		        
					subtotal.setText(Integer.toString(totalBurger));
					itibis.setText(Integer.toString(itibi));
					  total.setText(Integer.toString(to));
				}
				else 
				{
					spinner_5.setEnabled(false);
					spinner_5.setValue(1);
					subSum1 = 0;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
			           
			           
		            subtotal.setText(Integer.toString(totalBurger));
		            itibis.setText(Integer.toString(itibi));
		            total.setText(Integer.toString(to));
				}
			}
			
		         
		});
		
		spinner_5.addChangeListener(new ChangeListener() {
	    	public void stateChanged(ChangeEvent e) 
	    	{
	    		int spinRate3 = 160;
	            if(HC_check.isSelected()){
	            int preQty1;
	            preQty1 = (Integer)spinner_5.getValue();
	            if(preQty1 > qty2){
	                qty2 = preQty1;
	                subSum1 = spinRate3 * preQty1;
	                itibi=(int) (totalBurger*0.18);
	                to=subSum1+itibi;
	                
	                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
	               
	            }
	            else if(preQty1<=qty2){
	                qty2 = preQty1;
	                subSum3 = spinRate3 * preQty1;
	                itibi=(int) (totalBurger*0.18);
	                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
	            }
	            subtotal.setText(String.valueOf(totalBurger));
	            itibis.setText(Integer.toString(itibi));
	            total.setText(Integer.toString(to));
	           }
	    	}
	    });
		
		
		HD_check2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(HD_check2.isSelected()) 
				{
					
					spinner_6.setEnabled(true);
					
					subSum1 = subSum1 + 160;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
		        
					subtotal.setText(Integer.toString(totalBurger));
					itibis.setText(Integer.toString(itibi));
					  total.setText(Integer.toString(to));
				}
				else 
				{
					spinner_6.setEnabled(false);
					spinner_6.setValue(1);
					subSum1 = 0;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
			           
			           
		            subtotal.setText(Integer.toString(totalBurger));
		            itibis.setText(Integer.toString(itibi));
		            total.setText(Integer.toString(to));
				}
			}
			
		         
		});
		
		spinner_6.addChangeListener(new ChangeListener() {
	    	public void stateChanged(ChangeEvent e) 
	    	{
	    		int spinRate3 = 160;
	            if(HD_check2.isSelected()){
	            int preQty1;
	            preQty1 = (Integer)spinner_6.getValue();
	            if(preQty1 > qty2){
	                qty2 = preQty1;
	                subSum1 = spinRate3 * preQty1;
	                itibi=(int) (totalBurger*0.18);
	                to=subSum1+itibi;
	                
	                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
	               
	            }
	            else if(preQty1<=qty2){
	                qty2 = preQty1;
	                subSum3 = spinRate3 * preQty1;
	                itibi=(int) (totalBurger*0.18);
	                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
	            }
	            subtotal.setText(String.valueOf(totalBurger));
	            itibis.setText(Integer.toString(itibi));
	            total.setText(Integer.toString(to));
	           }
	    	}
	    });
		
		HD_check3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(HD_check3.isSelected()) 
				{
					
					spinner_7.setEnabled(true);
					
					subSum1 = subSum1 + 400;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
		        
					subtotal.setText(Integer.toString(totalBurger));
					itibis.setText(Integer.toString(itibi));
					  total.setText(Integer.toString(to));
				}
				else 
				{
					spinner_7.setEnabled(false);
					spinner_7.setValue(1);
					subSum1 = 0;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
			           
			           
		            subtotal.setText(Integer.toString(totalBurger));
		            itibis.setText(Integer.toString(itibi));
		            total.setText(Integer.toString(to));
				}
			}
			
		         
		});
		
		spinner_7.addChangeListener(new ChangeListener() {
	    	public void stateChanged(ChangeEvent e) 
	    	{
	    		int spinRate3 = 400;
	            if(HD_check2.isSelected()){
	            int preQty1;
	            preQty1 = (Integer)spinner_7.getValue();
	            if(preQty1 > qty2){
	                qty2 = preQty1;
	                subSum1 = spinRate3 * preQty1;
	                itibi=(int) (totalBurger*0.18);
	                to=subSum1+itibi;
	                
	                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
	               
	            }
	            else if(preQty1<=qty2){
	                qty2 = preQty1;
	                subSum3 = spinRate3 * preQty1;
	                itibi=(int) (totalBurger*0.18);
	                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
	            }
	            subtotal.setText(String.valueOf(totalBurger));
	            itibis.setText(Integer.toString(itibi));
	            total.setText(Integer.toString(to));
	           }
	    	}
	    });
		
		PQ_check.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(PQ_check.isSelected()) 
				{
					
					spinner_8.setEnabled(true);
					
					subSum1 = subSum1 + 400;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
		        
					subtotal.setText(Integer.toString(totalBurger));
					itibis.setText(Integer.toString(itibi));
					  total.setText(Integer.toString(to));
				}
				else 
				{
					spinner_8.setEnabled(false);
					spinner_8.setValue(1);
					subSum1 = 0;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
			           
			           
		            subtotal.setText(Integer.toString(totalBurger));
		            itibis.setText(Integer.toString(itibi));
		            total.setText(Integer.toString(to));
				}
			}
			
		         
		});
		
		spinner_8.addChangeListener(new ChangeListener() {
	    	public void stateChanged(ChangeEvent e) 
	    	{
	    		int spinRate3 = 400;
	            if(PQ_check.isSelected()){
	            int preQty1;
	            preQty1 = (Integer)spinner_8.getValue();
	            if(preQty1 > qty2){
	                qty2 = preQty1;
	                subSum1 = spinRate3 * preQty1;
	                itibi=(int) (totalBurger*0.18);
	                to=subSum1+itibi;
	                
	                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
	               
	            }
	            else if(preQty1<=qty2){
	                qty2 = preQty1;
	                subSum3 = spinRate3 * preQty1;
	                itibi=(int) (totalBurger*0.18);
	                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
	            }
	            subtotal.setText(String.valueOf(totalBurger));
	            itibis.setText(Integer.toString(itibi));
	            total.setText(Integer.toString(to));
	           }
	    	}
	    });
		
		PQ_check1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(PQ_check1.isSelected()) 
				{
					
					spinner_9.setEnabled(true);
					
					subSum1 = subSum1 + 450;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
		        
					subtotal.setText(Integer.toString(totalBurger));
					itibis.setText(Integer.toString(itibi));
					  total.setText(Integer.toString(to));
				}
				else 
				{
					spinner_9.setEnabled(false);
					spinner_9.setValue(1);
					subSum1 = 0;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
			           
			           
		            subtotal.setText(Integer.toString(totalBurger));
		            itibis.setText(Integer.toString(itibi));
		            total.setText(Integer.toString(to));
				}
			}
			
		         
		});
		
		spinner_9.addChangeListener(new ChangeListener() {
	    	public void stateChanged(ChangeEvent e) 
	    	{
	    		int spinRate3 = 450;
	            if(PQ_check1.isSelected()){
	            int preQty1;
	            preQty1 = (Integer)spinner_9.getValue();
	            if(preQty1 > qty2){
	                qty2 = preQty1;
	                subSum1 = spinRate3 * preQty1;
	                itibi=(int) (totalBurger*0.18);
	                to=subSum1+itibi;
	                
	                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
	               
	            }
	            else if(preQty1<=qty2){
	                qty2 = preQty1;
	                subSum3 = spinRate3 * preQty1;
	                itibi=(int) (totalBurger*0.18);
	                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
	            }
	            subtotal.setText(String.valueOf(totalBurger));
	            itibis.setText(Integer.toString(itibi));
	            total.setText(Integer.toString(to));
	           }
	    	}
	    });
		
		
		PQ_check2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(PQ_check2.isSelected()) 
				{
					
					spinner_10.setEnabled(true);
					
					subSum1 = subSum1 +450;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
		        
					subtotal.setText(Integer.toString(totalBurger));
					itibis.setText(Integer.toString(itibi));
					  total.setText(Integer.toString(to));
				}
				else 
				{
					spinner_10.setEnabled(false);
					spinner_10.setValue(1);
					subSum1 = 0;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
			           
			           
		            subtotal.setText(Integer.toString(totalBurger));
		            itibis.setText(Integer.toString(itibi));
		            total.setText(Integer.toString(to));
				}
			}
			
		         
		});
		
		spinner_10.addChangeListener(new ChangeListener() {
	    	public void stateChanged(ChangeEvent e) 
	    	{
	    		int spinRate3 = 450;
	            if(PQ_check2.isSelected()){
	            int preQty1;
	            preQty1 = (Integer)spinner_10.getValue();
	            if(preQty1 > qty2){
	                qty2 = preQty1;
	                subSum1 = spinRate3 * preQty1;
	                itibi=(int) (totalBurger*0.18);
	                to=subSum1+itibi;
	                
	                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
	               
	            }
	            else if(preQty1<=qty2){
	                qty2 = preQty1;
	                subSum3 = spinRate3 * preQty1;
	                itibi=(int) (totalBurger*0.18);
	                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
	            }
	            subtotal.setText(String.valueOf(totalBurger));
	            itibis.setText(Integer.toString(itibi));
	            total.setText(Integer.toString(to));
	           }
	    	}
	    });
		
		
		PQ_check3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(PQ_check3.isSelected()) 
				{
					
					spinner_11.setEnabled(true);
					
					subSum1 = subSum1 + 700;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
		        
					subtotal.setText(Integer.toString(totalBurger));
					itibis.setText(Integer.toString(itibi));
					  total.setText(Integer.toString(to));
				}
				else 
				{
					spinner_11.setEnabled(false);
					spinner_11.setValue(1);
					subSum1 = 0;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
			           
			           
		            subtotal.setText(Integer.toString(totalBurger));
		            itibis.setText(Integer.toString(itibi));
		            total.setText(Integer.toString(to));
				}
			}
			
		         
		});
		
		spinner_11.addChangeListener(new ChangeListener() {
	    	public void stateChanged(ChangeEvent e) 
	    	{
	    		int spinRate3 = 700;
	            if(PQ_check3.isSelected()){
	            int preQty1;
	            preQty1 = (Integer)spinner_11.getValue();
	            if(preQty1 > qty2){
	                qty2 = preQty1;
	                subSum1 = spinRate3 * preQty1;
	                itibi=(int) (totalBurger*0.18);
	                to=subSum1+itibi;
	                
	                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
	               
	            }
	            else if(preQty1<=qty2){
	                qty2 = preQty1;
	                subSum3 = spinRate3 * preQty1;
	                itibi=(int) (totalBurger*0.18);
	                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
	            }
	            subtotal.setText(String.valueOf(totalBurger));
	            itibis.setText(Integer.toString(itibi));
	            total.setText(Integer.toString(to));
	           }
	    	}
	    });
		
		
		A_check.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(A_check.isSelected()) 
				{
					
					spinner_12.setEnabled(true);
					
					subSum1 = subSum1 + 60;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
		        
					subtotal.setText(Integer.toString(totalBurger));
					itibis.setText(Integer.toString(itibi));
					  total.setText(Integer.toString(to));
				}
				else 
				{
					spinner_12.setEnabled(false);
					spinner_12.setValue(1);
					subSum1 = 0;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
			           
			           
		            subtotal.setText(Integer.toString(totalBurger));
		            itibis.setText(Integer.toString(itibi));
		            total.setText(Integer.toString(to));
				}
			}
			
		         
		});
		
		spinner_12.addChangeListener(new ChangeListener() {
	    	public void stateChanged(ChangeEvent e) 
	    	{
	    		int spinRate3 = 60;
	            if(A_check.isSelected()){
	            int preQty1;
	            preQty1 = (Integer)spinner_12.getValue();
	            if(preQty1 > qty2){
	                qty2 = preQty1;
	                subSum1 = spinRate3 * preQty1;
	                itibi=(int) (totalBurger*0.18);
	                to=subSum1+itibi;
	                
	                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
	               
	            }
	            else if(preQty1<=qty2){
	                qty2 = preQty1;
	                subSum3 = spinRate3 * preQty1;
	                itibi=(int) (totalBurger*0.18);
	                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
	            }
	            subtotal.setText(String.valueOf(totalBurger));
	            itibis.setText(Integer.toString(itibi));
	            total.setText(Integer.toString(to));
	           }
	    	}
	    });
		
		A_check1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(A_check1.isSelected()) 
				{
					
					spinner_13.setEnabled(true);
					
					subSum1 = subSum1 + 50;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
		        
					subtotal.setText(Integer.toString(totalBurger));
					itibis.setText(Integer.toString(itibi));
					  total.setText(Integer.toString(to));
				}
				else 
				{
					spinner_13.setEnabled(false);
					spinner_13.setValue(1);
					subSum1 = 0;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
			           
			           
		            subtotal.setText(Integer.toString(totalBurger));
		            itibis.setText(Integer.toString(itibi));
		            total.setText(Integer.toString(to));
				}
			}
			
		         
		});
		
		spinner_13.addChangeListener(new ChangeListener() {
	    	public void stateChanged(ChangeEvent e) 
	    	{
	    		int spinRate3 = 50;
	            if(A_check.isSelected()){
	            int preQty1;
	            preQty1 = (Integer)spinner_13.getValue();
	            if(preQty1 > qty2){
	                qty2 = preQty1;
	                subSum1 = spinRate3 * preQty1;
	                itibi=(int) (totalBurger*0.18);
	                to=subSum1+itibi;
	                
	                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
	               
	            }
	            else if(preQty1<=qty2){
	                qty2 = preQty1;
	                subSum3 = spinRate3 * preQty1;
	                itibi=(int) (totalBurger*0.18);
	                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
	            }
	            subtotal.setText(String.valueOf(totalBurger));
	            itibis.setText(Integer.toString(itibi));
	            total.setText(Integer.toString(to));
	           }
	    	}
	    });
		
		A_check2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(A_check2.isSelected()) 
				{
					
					spinner_14.setEnabled(true);
					
					subSum1 = subSum1 + 30;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
		        
					subtotal.setText(Integer.toString(totalBurger));
					itibis.setText(Integer.toString(itibi));
					  total.setText(Integer.toString(to));
				}
				else 
				{
					spinner_14.setEnabled(false);
					spinner_14.setValue(1);
					subSum1 = 0;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
			           
			           
		            subtotal.setText(Integer.toString(totalBurger));
		            itibis.setText(Integer.toString(itibi));
		            total.setText(Integer.toString(to));
				}
			}
			
		         
		});
		
		spinner_14.addChangeListener(new ChangeListener() {
	    	public void stateChanged(ChangeEvent e) 
	    	{
	    		int spinRate3 = 30;
	            if(A_check.isSelected()){
	            int preQty1;
	            preQty1 = (Integer)spinner_14.getValue();
	            if(preQty1 > qty2){
	                qty2 = preQty1;
	                subSum1 = spinRate3 * preQty1;
	                itibi=(int) (totalBurger*0.18);
	                to=subSum1+itibi;
	                
	                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
	               
	            }
	            else if(preQty1<=qty2){
	                qty2 = preQty1;
	                subSum3 = spinRate3 * preQty1;
	                itibi=(int) (totalBurger*0.18);
	                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
	            }
	            subtotal.setText(String.valueOf(totalBurger));
	            itibis.setText(Integer.toString(itibi));
	            total.setText(Integer.toString(to));
	           }
	    	}
	    });
		
		P_check.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(P_check.isSelected()) 
				{
					
					spinner_15.setEnabled(true);
					
					subSum1 = subSum1 + 80;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
		        
					subtotal.setText(Integer.toString(totalBurger));
					itibis.setText(Integer.toString(itibi));
					  total.setText(Integer.toString(to));
				}
				else 
				{
					spinner_15.setEnabled(false);
					subSum1 = 0;
					spinner_15.setValue(1);
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
			           
			           
		            subtotal.setText(Integer.toString(totalBurger));
		            itibis.setText(Integer.toString(itibi));
		            total.setText(Integer.toString(to));
				}
			}
			
		         
		});
		
		spinner_15.addChangeListener(new ChangeListener() {
	    	public void stateChanged(ChangeEvent e) 
	    	{
	    		int spinRate3 = 80;
	            if(A_check.isSelected()){
	            int preQty1;
	            preQty1 = (Integer)spinner_15.getValue();
	            if(preQty1 > qty2){
	                qty2 = preQty1;
	                subSum1 = spinRate3 * preQty1;
	                itibi=(int) (totalBurger*0.18);
	                to=subSum1+itibi;
	                
	                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
	               
	            }
	            else if(preQty1<=qty2){
	                qty2 = preQty1;
	                subSum3 = spinRate3 * preQty1;
	                itibi=(int) (totalBurger*0.18);
	                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
	            }
	            subtotal.setText(String.valueOf(totalBurger));
	            itibis.setText(Integer.toString(itibi));
	            total.setText(Integer.toString(to));
	           }
	    	}
	    });
		
		P_check1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(P_check1.isSelected()) 
				{
					
					spinner_16.setEnabled(true);
					
					subSum1 = subSum1 + 125;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
		        
					subtotal.setText(Integer.toString(totalBurger));
					itibis.setText(Integer.toString(itibi));
					  total.setText(Integer.toString(to));
				}
				else 
				{
					spinner_16.setEnabled(false);
					 spinner_16.setValue(1);
					subSum1 = 0;
		            totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12+subSum13+subSum14+subSum15+subSum16+subSum17;
		            itibi=(int) (totalBurger*0.18);
		            to=subSum1+itibi;
			           
			           
		            subtotal.setText(Integer.toString(totalBurger));
		            itibis.setText(Integer.toString(itibi));
		            total.setText(Integer.toString(to));
				}
			}
		});
		
		spinner_16.addChangeListener(new ChangeListener() {
	    	public void stateChanged(ChangeEvent e) 
	    	{
	    		int spinRate3 = 125;
	            if(A_check.isSelected()){
	            int preQty1;
	            preQty1 = (Integer)spinner_16.getValue();
	            if(preQty1 > qty2){
	                qty2 = preQty1;
	                subSum1 = spinRate3 * preQty1;
	                itibi=(int) (totalBurger*0.18);
	                to=subSum1+itibi;
	                
	                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
	               
	            }
	            else if(preQty1<=qty2){
	                qty2 = preQty1;
	                subSum3 = spinRate3 * preQty1;
	                itibi=(int) (totalBurger*0.18);
	                totalBurger = subSum2 + subSum1 + subSum3 + subSum4 + subSum5 + subSum6 + subSum7 + subSum8 + subSum9 + subSum10 + subSum11 + subSum12;
	            }
	            subtotal.setText(String.valueOf(totalBurger));
	            itibis.setText(Integer.toString(itibi));
	            total.setText(Integer.toString(to));
	           }
	    	}
	    });
		
		


		
	}

	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
	
		
		
	
		
	}
}