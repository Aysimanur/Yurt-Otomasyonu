package Yurt_Otomasyonu;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;

public class AnaMenü extends JFrame {

	private JPanel contentPane;
	DefaultTableModel pers = new DefaultTableModel();
	Object[] kolonlar = { "ogrID", "ogrAd", "ogrSoyad", "ogrTC", "ogrTelefon", "ogrDogum", "ogrBolum", "ogrOdaNo",
			"VeliAdSoyad", "ogrVeliAdres" };
	Object[] satýrlar = new Object[10];

	DefaultTableModel oda = new DefaultTableModel();
	Object[] kolon = { "OdaID", "OdaNo", "OdaKapasite", "OdaDurum" };
	Object[] satýr = new Object[4];

	private JTable table;
	private JTable Odalartable;
	private JTextField oda_1;
	private JTextField odano_1;
	private JTextField odakapasite;
	private JTextField oid;
	private JTextField oad;
	private JTextField osoyad;
	private JTextField otc;
	private JTextField otelefon;
	private JTextField otarih;
	private JTextField obolum;
	private JTextField odano;
	private JTextField oveli;
	private JTextField oveliadres;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnaMenü frame = new AnaMenü();
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
	public AnaMenü() {
		setTitle("Ana Men\u00FC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 710, 489);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.darkShadow"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Image img = new ImageIcon(this.getClass().getResource("/bilim3.png")).getImage();
		Image img3 = new ImageIcon(this.getClass().getResource("/öðrencii.jpg")).getImage();
		Image img4 = new ImageIcon(this.getClass().getResource("/ödeme..png")).getImage();
		Image img5 = new ImageIcon(this.getClass().getResource("/oda.png")).getImage();
		Image img6 = new ImageIcon(this.getClass().getResource("/personel.png")).getImage();
		Image img7 = new ImageIcon(this.getClass().getResource("/giderler.png")).getImage();

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 23, 675, 416);
		contentPane.add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Ana Sayfa", null, panel, null);
		panel.setLayout(null);

		JButton personel_1 = new JButton("PERSONEL");
		personel_1.setBounds(26, 154, 171, 52);
		panel.add(personel_1);
		personel_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form3 personel = new Form3();
				personel.setVisible(true);

			}
		});
		personel_1.setBackground(Color.LIGHT_GRAY);
		personel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		personel_1.setForeground(Color.BLACK);
		personel_1.setIcon(new ImageIcon(img6));

		JButton giderler = new JButton("G\u0130DERLER");
		giderler.setBounds(442, 154, 162, 52);
		panel.add(giderler);
		giderler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Form4 gider = new Form4();
				gider.setVisible(true);

			}
		});
		giderler.setFont(new Font("Tahoma", Font.BOLD, 12));
		giderler.setForeground(Color.BLACK);
		giderler.setBackground(Color.LIGHT_GRAY);
		giderler.setIcon(new ImageIcon(img7));

		JLabel yurttt = new JLabel("");
		yurttt.setBounds(274, 135, 171, 112);
		panel.add(yurttt);
		Image img19 = new ImageIcon(this.getClass().getResource("/bilim2.png")).getImage();
		yurttt.setIcon(new ImageIcon(img19));

		JLabel lblNewLabel = new JLabel("B\u0130L\u0130M KIZ \u00D6\u011ERENC\u0130 YURDU");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setBounds(210, 61, 263, 23);
		panel.add(lblNewLabel);

		JButton izin = new JButton("\u0130Z\u0130NLER");
		izin.setForeground(Color.BLACK);
		izin.setFont(new Font("Tahoma", Font.BOLD, 12));
		izin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form5 izin = new Form5(true);
				izin.setVisible(true);

			}
		});
		izin.setBackground(Color.LIGHT_GRAY);
		izin.setBounds(236, 291, 162, 50);
		panel.add(izin);
		Image img21 = new ImageIcon(this.getClass().getResource("/izin.png")).getImage();
		izin.setIcon(new ImageIcon(img21));

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		tabbedPane.addTab("\u00D6\u011Frenciler", null, panel_1, null);
		panel_1.setLayout(null);

		JScrollPane ogrenci = new JScrollPane();

		ogrenci.setBounds(10, 51, 650, 110);
		panel_1.add(ogrenci);

		table = new JTable();
		ogrenci.setViewportView(table);

		JLabel ogr = new JLabel("\u00D6\u011ERENC\u0130 L\u0130STES\u0130");
		ogr.setBackground(SystemColor.desktop);
		ogr.setForeground(Color.WHITE);
		ogr.setFont(new Font("Tahoma", Font.BOLD, 13));
		ogr.setBounds(274, 26, 121, 14);
		panel_1.add(ogr);

		JLabel lblNewLabel_7 = new JLabel("B\u00F6l\u00FCm:");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(274, 172, 46, 14);
		panel_1.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("Oda No:");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBounds(274, 203, 46, 14);
		panel_1.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("Veli Ad/Soyad:");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setBounds(274, 241, 100, 14);
		panel_1.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("Veli Adres:");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setBounds(275, 278, 78, 14);
		panel_1.add(lblNewLabel_10);

		JButton kaydet = new JButton("KAYDET");
		kaydet.setFont(new Font("Tahoma", Font.BOLD, 12));
		kaydet.setBackground(Color.WHITE);

		kaydet.setForeground(Color.BLACK);
		kaydet.setBounds(532, 191, 128, 39);
		panel_1.add(kaydet);
		Image img10 = new ImageIcon(this.getClass().getResource("/kaydet2.png")).getImage();
		kaydet.setIcon(new ImageIcon(img10));

		JButton güncelle = new JButton("G\u00DCNCELLE");
		güncelle.setBackground(Color.WHITE);
		güncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String ad, soyad, tc, telefon, dogum, bolum, oodano, veliad, veliadres;
				int idögrenci = Integer.valueOf(oid.getText());
				ad = oad.getText();
				soyad = osoyad.getText();
				tc = otc.getText();
				telefon = otelefon.getText();
				dogum = otarih.getText();
				bolum = obolum.getText();
				oodano = odano.getText();
				veliad = oveli.getText();
				veliadres = oveliadres.getText();

				String güncelleogrenci = "UPDATE Ogrenci SET ogrID=" + idögrenci + "," + "ogrAd='" + ad + "',ogrSoyad='"
						+ soyad + "', ogrTC='" + tc + "',ogrTelefon='" + telefon + "', ogrDogum='" + dogum
						+ "',ogrBolum='" + bolum + "', ogrOdaNo='" + oodano + "',VeliAdSoyad='" + veliadres
						+ "' Where ogrID=" + idögrenci;

				baðlantý.güncelleogr(güncelleogrenci);
				baglanlistele5();

			}
		});
		güncelle.setFont(new Font("Tahoma", Font.BOLD, 12));
		güncelle.setForeground(Color.BLACK);
		güncelle.setBounds(532, 241, 128, 39);
		panel_1.add(güncelle);
		Image img11 = new ImageIcon(this.getClass().getResource("/GÜNCELLE.png")).getImage();
		güncelle.setIcon(new ImageIcon(img11));

		JButton sil = new JButton("S\u0130L");
		sil.setBackground(Color.WHITE);
		sil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int idögrenci = Integer.valueOf(oid.getText());

				String silsqlöðrenci = "DELETE  FROM Ogrenci WHERE ogrID=" + idögrenci;
				baðlantý.silogrenci(silsqlöðrenci);

				baglanlistele5();

			}
		});
		sil.setFont(new Font("Tahoma", Font.BOLD, 12));
		sil.setForeground(Color.BLACK);
		sil.setBounds(532, 290, 128, 39);
		panel_1.add(sil);
		Image img12 = new ImageIcon(this.getClass().getResource("/sil.png")).getImage();
		sil.setIcon(new ImageIcon(img12));

		oid = new JTextField();
		oid.setBackground(Color.WHITE);
		oid.setBounds(132, 172, 86, 20);
		panel_1.add(oid);
		oid.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("\u00D6\u011Frenci ID:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(20, 172, 88, 14);
		panel_1.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("\u00D6\u011Frenci Ad:");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(20, 209, 88, 14);
		panel_1.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("\u00D6\u011Frenci Soyad:");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(20, 243, 100, 14);
		panel_1.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("\u00D6\u011Frenci TC:");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(20, 278, 88, 14);
		panel_1.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("\u00D6\u011Frenci Telefon:");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(20, 314, 100, 14);
		panel_1.add(lblNewLabel_6);

		JLabel lblNewLabel_15 = new JLabel("Do\u011Fum Tarihi:");
		lblNewLabel_15.setForeground(Color.WHITE);
		lblNewLabel_15.setBounds(20, 348, 88, 14);
		panel_1.add(lblNewLabel_15);

		oad = new JTextField();
		oad.setBounds(132, 206, 86, 20);
		panel_1.add(oad);
		oad.setColumns(10);

		osoyad = new JTextField();
		osoyad.setBounds(132, 238, 86, 20);
		panel_1.add(osoyad);
		osoyad.setColumns(10);

		otc = new JTextField();
		otc.setBounds(132, 275, 86, 20);
		panel_1.add(otc);
		otc.setColumns(10);

		otelefon = new JTextField();
		otelefon.setBounds(132, 309, 86, 20);
		panel_1.add(otelefon);
		otelefon.setColumns(10);

		otarih = new JTextField();
		otarih.setBounds(132, 345, 86, 20);
		panel_1.add(otarih);
		otarih.setColumns(10);

		obolum = new JTextField();
		obolum.setBounds(370, 169, 86, 20);
		panel_1.add(obolum);
		obolum.setColumns(10);

		odano = new JTextField();
		odano.setBounds(370, 200, 86, 20);
		panel_1.add(odano);
		odano.setColumns(10);

		oveli = new JTextField();
		oveli.setBounds(370, 238, 86, 20);
		panel_1.add(oveli);
		oveli.setColumns(10);

		oveliadres = new JTextField();
		oveliadres.setBounds(370, 275, 137, 70);
		panel_1.add(oveliadres);
		oveliadres.setColumns(10);

		JPanel odapaneli = new JPanel();
		odapaneli.setBackground(Color.DARK_GRAY);
		tabbedPane.addTab("Odalar", null, odapaneli, null);
		odapaneli.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 67, 650, 154);
		odapaneli.add(scrollPane);

		Odalartable = new JTable();
		scrollPane.setViewportView(Odalartable);

		JLabel lblNewLabel_1 = new JLabel("ODALAR");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(301, 40, 76, 23);
		odapaneli.add(lblNewLabel_1);

		JLabel lblNewLabel_11 = new JLabel("Oda ID:");
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setBounds(24, 256, 46, 14);
		odapaneli.add(lblNewLabel_11);

		JLabel lblNewLabel_12 = new JLabel("Oda No:");
		lblNewLabel_12.setForeground(Color.WHITE);
		lblNewLabel_12.setBounds(24, 306, 71, 14);
		odapaneli.add(lblNewLabel_12);

		JLabel lblNewLabel_13 = new JLabel("Oda Kapasite:");
		lblNewLabel_13.setForeground(Color.WHITE);
		lblNewLabel_13.setBounds(255, 256, 86, 14);
		odapaneli.add(lblNewLabel_13);

		oda_1 = new JTextField();
		oda_1.setBounds(105, 253, 86, 20);
		odapaneli.add(oda_1);
		oda_1.setColumns(10);

		odano_1 = new JTextField();
		odano_1.setBounds(105, 303, 86, 20);
		odapaneli.add(odano_1);
		odano_1.setColumns(10);

		odakapasite = new JTextField();
		odakapasite.setBounds(337, 253, 86, 20);
		odapaneli.add(odakapasite);
		odakapasite.setColumns(10);

		JRadioButton odaDurum = new JRadioButton("Oda Durumu");
		odaDurum.setBounds(255, 302, 113, 29);
		odapaneli.add(odaDurum);
		Odalartable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				oda_1.setText(oda.getValueAt(Odalartable.getSelectedRow(), 0).toString());
				odano_1.setText(oda.getValueAt(Odalartable.getSelectedRow(), 1).toString());
				odakapasite.setText(oda.getValueAt(Odalartable.getSelectedRow(), 2).toString());
				String s = oda.getValueAt(Odalartable.getSelectedRow(), 3).toString();
				System.out.println(s);
				if (s == "oda dolu") {
					odaDurum.setSelected(true);
				} else {
					odaDurum.setSelected(false);
				}

			}
		});

		
		JButton KAYDET = new JButton("KAYDET");
		KAYDET.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String oodadurum;
				int odlar = Integer.valueOf(oda_1.getText());
				int oodano = Integer.valueOf(odano_1.getText());
				int oodakapasite = Integer.valueOf(odakapasite.getText());

				if (odaDurum.isSelected()) {
					oodadurum = "true";
				} else {
					oodadurum = "false";
				}

				String kaydetsqloda = "INSERT INTO Odalar (OdaID, OdaNo, OdaKapasite, OdaDurum)" + "VALUES (" + odlar
						+ ", " + oodano + ", " + oodakapasite + ", '" + oodadurum + "')";
				baðlantý.kaydet5(kaydetsqloda);
				baglanlistele6();
			}
		});
		KAYDET.setFont(new Font("Tahoma", Font.BOLD, 12));
		KAYDET.setBackground(Color.WHITE);
		KAYDET.setForeground(Color.BLACK);
		KAYDET.setBounds(533, 232, 127, 38);
		odapaneli.add(KAYDET);
		Image img1 = new ImageIcon(this.getClass().getResource("/kaydet2.png")).getImage();
		KAYDET.setIcon(new ImageIcon(img1));

		JButton GÜNCELLE = new JButton("G\u00DCNCELLE");

		GÜNCELLE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String oodadurum;
				int odlar = Integer.valueOf(oda_1.getText());
				int oodano = Integer.valueOf(odano_1.getText());
				int oodakapasite = Integer.valueOf(odakapasite.getText());

				if (odaDurum.isSelected()) {
					oodadurum = "true";
				} else {
					oodadurum = "false";
				}

				String güncellesql = "UPDATE Odalar SET OdaID=" + odlar + ", " + "OdaNo=" + oodano + " ,OdaKapasite="
						+ oodakapasite + " ,OdaDurum='" + oodadurum + "' WHERE OdaID=" + odlar;

				baðlantý.güncellemeoda(güncellesql);
				baglanlistele6();

			}
		});
		GÜNCELLE.setBackground(Color.WHITE);
		GÜNCELLE.setFont(new Font("Tahoma", Font.BOLD, 12));
		GÜNCELLE.setForeground(Color.BLACK);
		GÜNCELLE.setBounds(533, 281, 127, 39);
		odapaneli.add(GÜNCELLE);

		Image img24 = new ImageIcon(this.getClass().getResource("/GÜNCELLE.png")).getImage();
		GÜNCELLE.setIcon(new ImageIcon(img24));

		JButton SÝL = new JButton("S\u0130L");
		SÝL.setBackground(Color.WHITE);
		SÝL.setFont(new Font("Tahoma", Font.BOLD, 12));
		SÝL.setForeground(Color.BLACK);
		SÝL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int odlar = Integer.valueOf(oda_1.getText());

				String silsqlodalar = "DELETE  FROM Odalar WHERE OdaID=" + odlar;
				baðlantý.silodalar(silsqlodalar);
				baglanlistele6();
				oda_1.setText("");
				odano_1.setText("");
				odakapasite.setText("");

			}
		});
		SÝL.setBounds(533, 331, 127, 38);
		odapaneli.add(SÝL);
		Image img16 = new ImageIcon(this.getClass().getResource("/sil.png")).getImage();
		SÝL.setIcon(new ImageIcon(img16));

		

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				oid.setText(pers.getValueAt(table.getSelectedRow(), 0).toString());
				oad.setText((String) pers.getValueAt(table.getSelectedRow(), 1));
				osoyad.setText((String) pers.getValueAt(table.getSelectedRow(), 2));
				otc.setText(pers.getValueAt(table.getSelectedRow(), 3).toString());
				otelefon.setText(pers.getValueAt(table.getSelectedRow(), 4).toString());
				otarih.setText(pers.getValueAt(table.getSelectedRow(), 5).toString());
				obolum.setText(pers.getValueAt(table.getSelectedRow(), 6).toString());
				odano.setText(pers.getValueAt(table.getSelectedRow(), 7).toString());
				oveli.setText(pers.getValueAt(table.getSelectedRow(), 8).toString());
				oveliadres.setText(pers.getValueAt(table.getSelectedRow(), 9).toString());

			}
		});

		baglanlistele5();

		baglanlistele6();

		kaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String idögrenci, ad, soyad, tc, telefon, dogum, bolum, oodano, veliad, veliadres;
				idögrenci = oid.getText();
				ad = oad.getText();
				soyad = osoyad.getText();
				tc = otc.getText();
				telefon = otelefon.getText();
				dogum = otarih.getText();
				bolum = obolum.getText();
				oodano = odano.getText();
				veliad = oveli.getText();
				veliadres = oveliadres.getText();
				String kaydetsqlogrenci = "INSERT INTO Ogrenci (ogrID, ogrAd, ogrSoyad, ogrTC, ogrTelefon, ogrDogum, ogrBolum, ogrOdaNo, VeliAdSoyad, ogrVeliAdres)"
						+ "VALUES ('" + idögrenci + "', '" + ad + "', '" + soyad + "', '" + tc + "', '" + telefon
						+ "', '" + dogum + "', '" + bolum + "', '" + oodano + "', '" + veliad + "', '" + veliadres
						+ "')";

				baðlantý.kaydet4(kaydetsqlogrenci);
				baglanlistele5();
			}
		});

	}

	void baglanlistele5() {
		baðlantý.baglan();
		String listeleSql = "Select * from Ogrenci";
		ResultSet rs = baðlantý.listele(listeleSql);

		pers.setColumnCount(0);
		pers.setRowCount(0);
		pers.setColumnIdentifiers(kolonlar);

		try {
			while (rs.next()) {
				satýrlar[0] = rs.getInt("ogrID");
				satýrlar[1] = rs.getString("ogrAd");
				satýrlar[2] = rs.getString("ogrSoyad");
				satýrlar[3] = rs.getString("ogrTC");
				satýrlar[4] = rs.getString("ogrTelefon");
				satýrlar[5] = rs.getString("ogrDogum");
				satýrlar[6] = rs.getString("ogrBolum");
				satýrlar[7] = rs.getString("ogrOdaNo");
				satýrlar[8] = rs.getString("VeliAdSoyad");
				satýrlar[9] = rs.getString("ogrVeliAdres");

				pers.addRow(satýrlar);
			}
			table.setModel(pers);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	void baglanlistele6() {
		baðlantý.baglan();
		String listeleSql = "Select * from Odalar";
		ResultSet rs = baðlantý.listele(listeleSql);
		oda.setColumnCount(0);
		oda.setRowCount(0);
		oda.setColumnIdentifiers(kolon);

		try {
			while (rs.next()) {
				satýrlar[0] = rs.getInt("OdaID");
				satýrlar[1] = rs.getInt("OdaNo");
				satýrlar[2] = rs.getInt("OdaKapasite");
				if (Boolean.valueOf(rs.getString("OdaDurum"))) {
					satýrlar[3] = "oda dolu";
				} else {

					satýrlar[3] = "oda boþ";
				}

				oda.addRow(satýrlar);
			}
			Odalartable.setModel(oda);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
}
