package Yurt_Otomasyonu;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;

public class Form4 extends JFrame {

	private JPanel contentPane;
	DefaultTableModel �demeler = new DefaultTableModel();
	Object[] kolonlar = { "OdemeID", "Su", "Elektrik", "Do�algaz", "�nternet", "G�da", "Personel", "Di�er" };
	Object[] sat�rlar = new Object[8];
	private JTable table;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JTextField odeme�d;
	private JTextField su;
	private JTextField elektrik;
	private JTextField dogalgaz;
	private JTextField �nternet;
	private JTextField g�da;
	private JTextField personel;
	private JTextField d�ger;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form4 frame = new Form4();
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
	public Form4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 484);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 98, 667, 158);
		contentPane.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		lblNewLabel = new JLabel("G\u0130DERLER");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(300, 54, 64, 20);
		contentPane.add(lblNewLabel);

		btnNewButton = new JButton("GER\u0130");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				AnaMen� ana5 = new AnaMen�();
				ana5.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(10, 11, 89, 23);
		contentPane.add(btnNewButton);
		Image img16 = new ImageIcon(this.getClass().getResource("/geri.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(img16));

		JLabel lblNewLabel_1 = new JLabel("\u00D6deme ID:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 284, 69, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Su:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 321, 46, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Elektrik:");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(10, 357, 69, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Do\u011Falgaz:");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(10, 399, 89, 14);
		contentPane.add(lblNewLabel_4);

		odeme�d = new JTextField();
		odeme�d.setBounds(103, 281, 86, 20);
		contentPane.add(odeme�d);
		odeme�d.setColumns(10);

		su = new JTextField();
		su.setBounds(103, 318, 86, 20);
		contentPane.add(su);
		su.setColumns(10);

		elektrik = new JTextField();
		elektrik.setBounds(103, 354, 86, 20);
		contentPane.add(elektrik);
		elektrik.setColumns(10);

		dogalgaz = new JTextField();
		dogalgaz.setBounds(103, 396, 86, 20);
		contentPane.add(dogalgaz);
		dogalgaz.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("\u0130nternet:");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(266, 284, 71, 14);
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("G\u0131da:");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(266, 321, 64, 14);
		contentPane.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Personel:");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(266, 357, 64, 14);
		contentPane.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("Di\u011Fer:");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBounds(266, 399, 64, 14);
		contentPane.add(lblNewLabel_8);

		�nternet = new JTextField();
		�nternet.setBounds(347, 281, 86, 20);
		contentPane.add(�nternet);
		�nternet.setColumns(10);

		g�da = new JTextField();
		g�da.setBounds(347, 318, 86, 20);
		contentPane.add(g�da);
		g�da.setColumns(10);

		personel = new JTextField();
		personel.setBounds(347, 354, 86, 20);
		contentPane.add(personel);
		personel.setColumns(10);

		d�ger = new JTextField();
		d�ger.setBounds(347, 396, 86, 20);
		contentPane.add(d�ger);
		d�ger.setColumns(10);

		JButton kaydet = new JButton("KAYDET");
		kaydet.setBackground(Color.WHITE);
		kaydet.setFont(new Font("Tahoma", Font.BOLD, 12));

		kaydet.setForeground(Color.BLACK);
		kaydet.setBounds(546, 272, 131, 38);
		contentPane.add(kaydet);
		Image img10 = new ImageIcon(this.getClass().getResource("/kaydet2.png")).getImage();
		kaydet.setIcon(new ImageIcon(img10));

		JButton g�ncelle = new JButton("G\u00DCNCELLE");
		g�ncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				g�ncelle();

			}
		});
		g�ncelle.setBackground(Color.WHITE);
		g�ncelle.setFont(new Font("Tahoma", Font.BOLD, 12));
		g�ncelle.setForeground(Color.BLACK);
		g�ncelle.setBounds(546, 331, 131, 40);
		contentPane.add(g�ncelle);
		Image img11 = new ImageIcon(this.getClass().getResource("/G�NCELLE.png")).getImage();
		g�ncelle.setIcon(new ImageIcon(img11));

		JButton sil = new JButton("S\u0130L");
		sil.setBackground(Color.WHITE);
		sil.setFont(new Font("Tahoma", Font.BOLD, 12));
		sil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String odeme;
				odeme = odeme�d.getText();
				
				String silsql2= "DELETE  FROM Personel WHERE PersonelID="+odeme;
				ba�lant�.silgiderler(silsql2);
				
			}
		});
		
		sil.setForeground(Color.BLACK);
		sil.setBounds(546, 392, 131, 42);
		contentPane.add(sil);
		Image img12 = new ImageIcon(this.getClass().getResource("/sil.png")).getImage();
		sil.setIcon(new ImageIcon(img12));

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				odeme�d.setText(�demeler.getValueAt(table.getSelectedRow(), 0).toString());
				su.setText(�demeler.getValueAt(table.getSelectedRow(), 1).toString());
				elektrik.setText(�demeler.getValueAt(table.getSelectedRow(), 2).toString());
				dogalgaz.setText(�demeler.getValueAt(table.getSelectedRow(), 3).toString());
				�nternet.setText(�demeler.getValueAt(table.getSelectedRow(), 4).toString());
				g�da.setText(�demeler.getValueAt(table.getSelectedRow(), 5).toString());
				personel.setText(�demeler.getValueAt(table.getSelectedRow(), 6).toString());
				d�ger.setText(�demeler.getValueAt(table.getSelectedRow(), 7).toString());

			}
		});

		baglanlistele4();

		kaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String odeme, tsu, telektrik, tdogalgaz, tinternet, tg�da, tpersonel, tdi�er;
				odeme = odeme�d.getText();
				tsu = su.getText();
				telektrik = elektrik.getText();
				tdogalgaz = dogalgaz.getText();
				tinternet = �nternet.getText();
				tg�da = g�da.getText();
				tpersonel = personel.getText();
				tdi�er = d�ger.getText();

				String kaydetsql2 = "INSERT INTO �demeler (OdemeID, Su, Elektrik, Do�algaz, �nternet, G�da, Personel, Di�er)"
						+ "VALUES ('" + odeme + "',  '" + tsu + "', ' " + telektrik + "',  '" + tdogalgaz + "',  '"
						+ tinternet + "',  '" + tg�da + "',  '" + tpersonel + "',  '" + tdi�er + "')";

				// System.out.println(kaydetsql2);
				ba�lant�.kaydet2(kaydetsql2);
				baglanlistele4();
			}
		});
	}

	void baglanlistele4() {
		ba�lant�.baglan();
		String listeleSql = "Select * from �demeler";
		ResultSet rs = ba�lant�.listele(listeleSql);

		�demeler.setColumnCount(0);
		�demeler.setRowCount(0);
		�demeler.setColumnIdentifiers(kolonlar);

		try {
			while (rs.next()) {
				sat�rlar[0] = rs.getInt("OdemeID");
				sat�rlar[1] = rs.getInt("Su");
				sat�rlar[2] = rs.getInt("Elektrik");
				sat�rlar[3] = rs.getInt("Do�algaz");
				sat�rlar[4] = rs.getInt("�nternet");
				sat�rlar[5] = rs.getInt("G�da");
				sat�rlar[6] = rs.getInt("Personel");
				sat�rlar[7] = rs.getInt("Di�er");

				�demeler.addRow(sat�rlar);
			}
			table.setModel(�demeler);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void g�ncelle() {
		String odeme, tsu, telektrik, tdogalgaz, tinternet, tg�da, tpersonel, tdi�er;
		odeme = odeme�d.getText();
		tsu = su.getText();
		telektrik = elektrik.getText();
		tdogalgaz = dogalgaz.getText();
		tinternet = �nternet.getText();
		tg�da = g�da.getText();
		tpersonel = personel.getText();
		tdi�er = d�ger.getText();

		String g�ncelle = "UPDATE �demeler SET OdemeID=" + odeme + "," + "Su='" + tsu + "',Elektrik='" + telektrik
				+ "'," + "Do�algaz='" + tdogalgaz + "',�nternet='" + tinternet + "',G�da='" + tg�da + "',Personel='"
				+ tpersonel + "',Di�er='" + tdi�er + "' WHERE OdemeID=" + odeme;

		ba�lant�.kaydet7(g�ncelle);
		baglanlistele4();

	}

}
