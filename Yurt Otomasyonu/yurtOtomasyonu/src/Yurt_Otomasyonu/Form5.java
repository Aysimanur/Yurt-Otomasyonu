package Yurt_Otomasyonu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Form5 extends JFrame {

	private JPanel contentPane;
	DefaultTableModel izinler = new DefaultTableModel();
	Object[] kolonlar= {"�zinID","OgrID","OgrAd","Giri�Tarihi","��k��Tarihi"};
	Object[] sat�rlar= new Object[5];
	private JTable table;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField tizin;
	private JTextField togrid;
	private JTextField ograd;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField tgiri�;
	private JTextField t��k��;
	private JButton KAYDET;
	private JButton G�NCELLE;
	private JButton S�L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form5 frame = new Form5(false);
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
	public Form5(boolean durum) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 492);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		
		
	
		scrollPane.setBounds(10, 85, 681, 173);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		lblNewLabel = new JLabel("\u0130Z\u0130NLER");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(300, 47, 71, 27);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("GER\u0130");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AnaMen� ana5=new AnaMen�();
				ana5.setVisible(true);
					dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(10, 11, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.setVisible(durum);
		Image img16 =new ImageIcon(this.getClass().getResource("/geri.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(img16));
		
		
		
		lblNewLabel_1 = new JLabel("\u0130zin ID:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(53, 291, 71, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("\u00D6\u011Frenci ID:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(53, 333, 92, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("\u00D6\u011Frenci Ad:");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(53, 381, 92, 14);
		contentPane.add(lblNewLabel_3);
		
		tizin = new JTextField();
		tizin.setBounds(134, 288, 86, 20);
		contentPane.add(tizin);
		tizin.setColumns(10);
		
		togrid = new JTextField();
		togrid.setBounds(134, 330, 86, 20);
		contentPane.add(togrid);
		togrid.setColumns(10);
		
		ograd = new JTextField();
		ograd.setBounds(134, 378, 86, 20);
		contentPane.add(ograd);
		ograd.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Giri\u015F Tarihi:");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(348, 291, 77, 14);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("\u00C7\u0131k\u0131\u015F Tarihi:");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(348, 333, 77, 14);
		contentPane.add(lblNewLabel_5);
		
		tgiri� = new JTextField();
		tgiri�.setBounds(435, 288, 86, 20);
		contentPane.add(tgiri�);
		tgiri�.setColumns(10);
		
		t��k�� = new JTextField();
		t��k��.setBounds(435, 330, 86, 20);
		contentPane.add(t��k��);
		t��k��.setColumns(10);
		
		KAYDET = new JButton("KAYDET");
		KAYDET.setBackground(Color.WHITE);
		KAYDET.setForeground(Color.BLACK);
		KAYDET.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		
		
		
		KAYDET.setBounds(569, 284, 122, 39);
		contentPane.add(KAYDET);
		Image img10 =new ImageIcon(this.getClass().getResource("/kaydet2.png")).getImage();
		KAYDET.setIcon(new ImageIcon(img10));
		
		G�NCELLE = new JButton("G\u00DCNCELLE");
		G�NCELLE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String  ogridd,ad,giri�,��k��;
				int id;
				id=Integer.valueOf(tizin.getText().toString());
				ogridd= togrid.getText().toString();
				ad= ograd.getText();
				giri�=tgiri�.getText();
				��k��=t��k��.getText();
				
				 String g�ncellesql="UPDATE �zinler SET �zinID="+id+","+
						"OgrID='"+ogridd+"',OgrAd='"+ad+
					    "', Giri�Tarihi='"+giri�+"',��k��Tarihi='"+��k��+"' Where �zinID="+id;
						System.out.println(g�ncellesql);
			
				 ba�lant�.kaydet8(g�ncellesql);
				 baglanlistele4();
					
				
			}
		});
		G�NCELLE.setBackground(Color.WHITE);
		G�NCELLE.setForeground(Color.BLACK);
		G�NCELLE.setFont(new Font("Tahoma", Font.BOLD, 12));
		G�NCELLE.setBounds(568, 333, 123, 37);
		contentPane.add(G�NCELLE);
		Image img11 =new ImageIcon(this.getClass().getResource("/G�NCELLE.png")).getImage();
		G�NCELLE.setIcon(new ImageIcon(img11));
		
		S�L = new JButton("S\u0130L");
		S�L.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String izin;
				izin=tizin.getText();
				
				String silsql3= "DELETE  FROM �zinler WHERE �zinID="+izin;
				ba�lant�.silizinler(silsql3);
				
				
			}
		});
		S�L.setBackground(Color.WHITE);
		S�L.setForeground(Color.BLACK);
		S�L.setFont(new Font("Tahoma", Font.BOLD, 12));
		S�L.setBounds(569, 382, 122, 39);
		contentPane.add(S�L);
		Image img12 =new ImageIcon(this.getClass().getResource("/sil.png")).getImage();
		S�L.setIcon(new ImageIcon(img12));
		
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				tizin.setText( izinler.getValueAt(table.getSelectedRow(), 0).toString());
				togrid.setText( izinler.getValueAt(table.getSelectedRow(), 1).toString());
				ograd.setText( izinler.getValueAt(table.getSelectedRow(), 2).toString());
				tgiri�.setText( izinler.getValueAt(table.getSelectedRow(), 3).toString());
				t��k��.setText( izinler.getValueAt(table.getSelectedRow(), 4).toString());
				
			}
		});
		
		
		baglanlistele4();
		
		KAYDET.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String izin,ogrenci,ogrenciad,giri�,��k��;
				izin=tizin.getText();
				ogrenci=togrid.getText();
				ogrenciad=ograd.getText();
				giri�=tgiri�.getText();
				��k��=t��k��.getText();
				
				String kaydetsql5="INSERT INTO �zinler (�zinID,  OgrID, OgrAd, Giri�Tarihi, ��k��Tarihi)"+
						"VALUES ('"+izin+"', '"+ogrenci+"', '"+ogrenciad+"', '"+giri�+"', '"+��k��+"')";
				
				
				ba�lant�.kaydet(kaydetsql5);
				baglanlistele4();
			}
		});
		
	}

       void baglanlistele4() {
	     ba�lant�.baglan();
	  String listeleSql="Select * from �zinler";
	  ResultSet rs=ba�lant�.listele(listeleSql);
	  
	  izinler.setColumnCount(0);
	  izinler.setRowCount(0);
	  izinler.setColumnIdentifiers(kolonlar);
	
	   try {
		while (rs.next()) {
		sat�rlar [0]=rs.getInt("�zinID");
		sat�rlar [1]=rs.getInt("OgrID");
		sat�rlar [2]=rs.getString("OgrAd");
		sat�rlar [3]=rs.getString("Giri�Tarihi");
		sat�rlar [4]=rs.getString("��k��Tarihi");
		
		
		
		izinler.addRow(sat�rlar);
	}
	table.setModel(izinler);
	
		
}      catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
}
		
	}
}
