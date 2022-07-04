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

public class Giri� extends JFrame {

	private JPanel contentPane;
	private JTextField kullan�c�Ad�;
	private JPasswordField rename;
	private JTextField kullan�c�Ad�2;
	private JTextField rename2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Giri� frame = new Giri�();
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
	public Giri�() {
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
		
		kullan�c�Ad� = new JTextField();
		kullan�c�Ad�.setBounds(133, 144, 110, 28);
		contentPane.add(kullan�c�Ad�);
		kullan�c�Ad�.setColumns(10);
		
		
		JLabel kullan�c� = new JLabel("");
		kullan�c�.setForeground(Color.WHITE);
		kullan�c�.setBounds(411, 28, 63, 64);
		contentPane.add(kullan�c�);
		Image img9 =new ImageIcon(this.getClass().getResource("/kullan�c���.png")).getImage();
		kullan�c�.setIcon(new ImageIcon(img9));
		
		JButton giri� = new JButton("G\u0130R\u0130\u015E");
		
		giri�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String kullan�c�="admin";
				String �ifre="507873";
				
				if(kullan�c�Ad�.getText().equals(kullan�c�) && rename.getText().equals(�ifre)) {
					JOptionPane.showMessageDialog(null," Giri� Ba�ar�l�");
					
					AnaMen� ana=new AnaMen�();
					ana.setVisible(true);
					
				}
				else {
					JOptionPane.showMessageDialog(null," Kullan�c� Ad� veya �ifre Hatal�");
				}
			}
		});
			
		
		
		
		
		
		
			
		giri�.setBackground(SystemColor.activeCaption);
		giri�.setFont(new Font("Tahoma", Font.BOLD, 12));
		giri�.setForeground(Color.BLACK);
		giri�.setBounds(107, 265, 86, 28);
		contentPane.add(giri�);
		
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
		
		kullan�c�Ad�2 = new JTextField();
		kullan�c�Ad�2.setBounds(448, 143, 110, 31);
		contentPane.add(kullan�c�Ad�2);
		kullan�c�Ad�2.setColumns(10);
		
		rename2 = new JTextField();
		rename2.setBounds(448, 201, 110, 30);
		contentPane.add(rename2);
		rename2.setColumns(10);
		
		JButton giri�� = new JButton("G\u0130R\u0130\u015E");
		giri��.setForeground(SystemColor.desktop);
		giri��.setBackground(SystemColor.activeCaption);
		giri��.setFont(new Font("Tahoma", Font.BOLD, 12));
		giri��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String kullan�c�2="aysima";
				String �ifre2="507873";
				
				if(kullan�c�Ad�2.getText().equals(kullan�c�2) && rename2.getText().equals(�ifre2)) {
					JOptionPane.showMessageDialog(null," Giri� Ba�ar�l�");
					
					
					Form5 anaa=new Form5(false);
					dispose();
					anaa.setVisible(true);
					
				}
				else {
					JOptionPane.showMessageDialog(null," Kullan�c� Ad� veya �ifre Hatal�");
				}
				
				
			}
		});
		
		
		
		
		
		giri��.setBounds(411, 265, 86, 28);
		contentPane.add(giri��);
		
		
		
		
		
		
	}
}
