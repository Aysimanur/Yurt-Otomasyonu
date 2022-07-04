package Yurt_Otomasyonu;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;

public class Giriþ extends JFrame {

	private JPanel contentPane;
	private JTextField kullanýcýAdý;
	private JPasswordField rename;
	private JTextField kullanýcýAdý2;
	private JTextField rename2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Giriþ frame = new Giriþ();
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
	public Giriþ() {
		setTitle("G\u0130R\u0130\u015E");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 621, 382);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(new Color(105, 105, 105));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(70, 150, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u015E\u0130fre:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(77, 201, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		kullanýcýAdý = new JTextField();
		kullanýcýAdý.setBounds(133, 144, 110, 28);
		contentPane.add(kullanýcýAdý);
		kullanýcýAdý.setColumns(10);
		
		
		JLabel kullanýcý = new JLabel("");
		kullanýcý.setForeground(Color.WHITE);
		kullanýcý.setBounds(411, 28, 63, 64);
		contentPane.add(kullanýcý);
		Image img9 =new ImageIcon(this.getClass().getResource("/kullanýcýýý.png")).getImage();
		kullanýcý.setIcon(new ImageIcon(img9));
		
		JButton giriþ = new JButton("G\u0130R\u0130\u015E");
		
		giriþ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String kullanýcý="admin";
				String þifre="507873";
				
				if(kullanýcýAdý.getText().equals(kullanýcý) && rename.getText().equals(þifre)) {
					JOptionPane.showMessageDialog(null," Giriþ Baþarýlý");
					
					AnaMenü ana=new AnaMenü();
					ana.setVisible(true);
					
				}
				else {
					JOptionPane.showMessageDialog(null," Kullanýcý Adý veya Þifre Hatalý");
				}
			}
		});
			
		
		
		
		
		
		
			
		giriþ.setBackground(SystemColor.activeCaption);
		giriþ.setFont(new Font("Tahoma", Font.BOLD, 12));
		giriþ.setForeground(Color.BLACK);
		giriþ.setBounds(107, 265, 86, 28);
		contentPane.add(giriþ);
		
		rename = new JPasswordField();
		rename.setBounds(133, 194, 110, 30);
		contentPane.add(rename);
		
		JLabel lblNewLabel_2 = new JLabel("Kullan\u0131c\u0131 Giri\u015Fi");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(388, 103, 97, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(118, 28, 75, 64);
		contentPane.add(lblNewLabel_3);
		Image foto =new ImageIcon(this.getClass().getResource("/aadmin.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(foto));
		
		JLabel lblNewLabel_4 = new JLabel("Admin Giri\u015Fi");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(107, 103, 79, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Kullan\u0131c\u0131 Ad\u0131:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(348, 150, 86, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u015Eifre:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(388, 201, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		kullanýcýAdý2 = new JTextField();
		kullanýcýAdý2.setBounds(448, 143, 110, 31);
		contentPane.add(kullanýcýAdý2);
		kullanýcýAdý2.setColumns(10);
		
		rename2 = new JTextField();
		rename2.setBounds(448, 201, 110, 30);
		contentPane.add(rename2);
		rename2.setColumns(10);
		
		JButton giriþþ = new JButton("G\u0130R\u0130\u015E");
		giriþþ.setForeground(SystemColor.desktop);
		giriþþ.setBackground(SystemColor.activeCaption);
		giriþþ.setFont(new Font("Tahoma", Font.BOLD, 12));
		giriþþ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String kullanýcý2="aysima";
				String þifre2="507873";
				
				if(kullanýcýAdý2.getText().equals(kullanýcý2) && rename2.getText().equals(þifre2)) {
					JOptionPane.showMessageDialog(null," Giriþ Baþarýlý");
					
					
					Form5 anaa=new Form5(false);
					dispose();
					anaa.setVisible(true);
					
				}
				else {
					JOptionPane.showMessageDialog(null," Kullanýcý Adý veya Þifre Hatalý");
				}
				
				
			}
		});
		
		
		
		
		
		giriþþ.setBounds(411, 265, 86, 28);
		contentPane.add(giriþþ);
		
		
		
		
		
		
	}
}
