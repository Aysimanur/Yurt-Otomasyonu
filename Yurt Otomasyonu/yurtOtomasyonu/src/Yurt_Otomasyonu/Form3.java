package Yurt_Otomasyonu;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Form3 extends JFrame {

	private JPanel contentPane;
	DefaultTableModel pers = new DefaultTableModel();
	Object[] kolonlar= {"PersonelID","PersonelAd","PersonelSoyad","PersonelDepartman"};
	Object[] satýrlar= new Object[4];
	private JTable table;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JTextField pad;
	private JTextField psoyad;
	private JTextField pdepartman;
	private JLabel lblNewLabel_1;
	private JTextField sayý;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form3 frame = new Form3();
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
	public Form3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 688, 478);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		JScrollPane scrollPane = new JScrollPane();
			
		scrollPane.setBounds(10, 80, 652, 170);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		lblNewLabel = new JLabel("PERSONEL");
		lblNewLabel.setBackground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(265, 49, 99, 19);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("GER\u0130");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AnaMenü ana3=new AnaMenü();
				ana3.setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(10, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		Image img19 =new ImageIcon(this.getClass().getResource("/geri.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(img19));
		
		JButton KAYDET = new JButton("KAYDET");
		KAYDET.setFont(new Font("Tahoma", Font.BOLD, 12));
		KAYDET.setBackground(Color.WHITE);
		KAYDET.setForeground(Color.BLACK);
		
		
	
		KAYDET.setBounds(536, 280, 126, 39);
		contentPane.add(KAYDET);
		Image img10 =new ImageIcon(this.getClass().getResource("/kaydet2.png")).getImage();
		KAYDET.setIcon(new ImageIcon(img10));
		
		JButton güncelle = new JButton("G\u00DCNCELLE");
		güncelle.setFont(new Font("Tahoma", Font.BOLD, 12));
		güncelle.setBackground(Color.WHITE);
		güncelle.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				
				String id, ad,soyad,departman;
				id=sayý.getText();
				ad= pad.getText();
				soyad= psoyad.getText();
				departman=pdepartman.getText();
				
				 String güncellesql="UPDATE Personel SET PersonelID="+id+","+
						"PersonelAd='"+ad+"',PersonelSoyad='"+soyad+
						"',PersonelDepartman='"+departman+"' WHERE PersonelID="+id;
						
			
				 baðlantý.kaydet6(güncellesql);
				 baglanlistele();
			}
			
			
		});
		
		
		güncelle.setForeground(Color.BLACK);
		güncelle.setBounds(536, 330, 126, 38);
		contentPane.add(güncelle);
		Image img11 =new ImageIcon(this.getClass().getResource("/GÜNCELLE.png")).getImage();
		güncelle.setIcon(new ImageIcon(img11));
		
		JLabel lblNewLabel_2 = new JLabel("Personel Ad:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(24, 308, 75, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Personel Departman:");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(24, 388, 121, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Personel Soyad:");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(24, 350, 108, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton sil = new JButton("S\u0130L");
		sil.setFont(new Font("Tahoma", Font.BOLD, 12));
		sil.setBackground(Color.WHITE);
		sil.setForeground(Color.BLACK);
		sil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id;
				id=sayý.getText();
				
				String silsql= "DELETE  FROM Personel WHERE PersonelID="+id;
				baðlantý.silpersonel(silsql);
				
				
			}
		});
		sil.setBounds(536, 379, 126, 38);
		contentPane.add(sil);
		Image img12 =new ImageIcon(this.getClass().getResource("/sil.png")).getImage();
		sil.setIcon(new ImageIcon(img12));
		
		pad = new JTextField();
		pad.setBounds(149, 303, 86, 20);
		contentPane.add(pad);
		pad.setColumns(10);
		
		psoyad = new JTextField();
		psoyad.setBounds(149, 347, 86, 20);
		contentPane.add(psoyad);
		psoyad.setColumns(10);
		
		pdepartman = new JTextField();
		pdepartman.setBounds(149, 385, 86, 20);
		contentPane.add(pdepartman);
		pdepartman.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Personel ID:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(24, 275, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		sayý = new JTextField();
		sayý.setBounds(149, 269, 86, 20);
		contentPane.add(sayý);
		sayý.setColumns(10);
		
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sayý.setText( pers.getValueAt(table.getSelectedRow(), 0).toString());
				pad.setText((String) pers.getValueAt(table.getSelectedRow(), 1));
				psoyad.setText((String) pers.getValueAt(table.getSelectedRow(), 2));
				pdepartman.setText ((String) pers.getValueAt(table.getSelectedRow(), 3));
				
				
			}
		});
		
		
		
		baglanlistele();
		
		
		
		KAYDET.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String id, ad,soyad,departman;
				id=sayý.getText();
				ad= pad.getText();
				soyad= psoyad.getText();
				departman=pdepartman.getText();
				
				String kaydetSQL="INSERT INTO Personel (PersonelID, PersonelAd, PersonelSoyad, PersonelDepartman)"+
						" VALUES (  '"+id+"', '"+ad+"',  '"+soyad+"',  '"+departman+"')";
				baðlantý.kaydet(kaydetSQL);
				baglanlistele();
				
			
				
				}
		});
		
	}
	void baglanlistele() {
		baðlantý.baglan();
		String listeleSql="Select * from Personel";
		ResultSet rs=baðlantý.listele(listeleSql);
		pers.setColumnCount(0);
		pers.setRowCount(0);
		pers.setColumnIdentifiers(kolonlar);
		
		try {
			while (rs.next()) {
			satýrlar [0]=rs.getInt("PersonelID");
			satýrlar [1]=rs.getString("PersonelAd");
			satýrlar [2]=rs.getString("PersonelSoyad");
			satýrlar [3]=rs.getString("PersonelDepartman");
			pers.addRow(satýrlar);
		}
		table.setModel(pers);
		
			
	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		
	}
		}
        
		

