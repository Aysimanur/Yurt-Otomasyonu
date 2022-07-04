package Yurt_Otomasyonu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class baðlantý {

	static String url ="jdbc:sqlite:C://Sqlite/Yurt_Otomasyonu.db";
	static Connection conn =null;
	
	static boolean baglan() {
		try {
			
			conn = DriverManager.getConnection(url);
			System.out.println("Veri tabanýna baðlandýnýz");
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
			return false;
		}
		
			
	}
	static ResultSet listele(String sorgu) {
		Statement st;
		ResultSet rs;
		
		try {
			st=conn.createStatement();
			rs=st.executeQuery(sorgu);
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	 static void kaydet(String sorgu) {
    	 Statement st;
    	 try {
    		
			st= conn.createStatement();
			st.executeUpdate(sorgu);
			System.out.println("Kayýt baþarýlý");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
	 static void kaydet2(String sorgu2) {
    	 Statement st2;
    	 try {
    		
			st2= conn.createStatement();
			st2.executeUpdate(sorgu2);
			System.out.println("Kayýt baþarýlý");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
	 static void kaydet3(String sorgu2) {
    	 Statement st3;
    	 try {
    		
			st3= conn.createStatement();
			st3.executeUpdate(sorgu2);
			System.out.println("Kayýt baþarýlý");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
	 static void kaydet4(String sorgu2) {
    	 Statement st4;
    	 try {
    		
			st4= conn.createStatement();
			st4.executeUpdate(sorgu2);
			System.out.println("Kayýt baþarýlý");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
	 static void kaydet5(String sorgu2) {
    	 Statement st5;
    	 try {
    		
			st5= conn.createStatement();
			st5.executeUpdate(sorgu2);
			System.out.println("Kayýt baþarýlý");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
	 static void kaydet6(String sorgu3) {
    	 Statement st6;
    	 try {
    		
			st6= conn.createStatement();
			st6.executeUpdate(sorgu3);
			System.out.println("Güncelleme yapýldý");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
	
}
	 static void kaydet7(String sorgu3) {
    	 Statement st7;
    	 try {
    		
			st7= conn.createStatement();
			st7.executeUpdate(sorgu3);
			System.out.println("Güncelleme yapýldý");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
	 }
    	 static void kaydet8(String sorgu3) {
        	 Statement st8;
        	 try {
        		
    			st8= conn.createStatement();
    			st8.executeUpdate(sorgu3);
    			System.out.println("Güncelleme yapýldý");
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		
    	 
}
}
    	 static void silpersonel(String sorgu3) {
        	 Statement st8;
        	 try {
        		
    			st8= conn.createStatement();
    			st8.executeUpdate(sorgu3);
    			System.out.println("Silme iþlemi yapýldý.");
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		
    	 
}
}
    	 static void silgiderler(String sorgu3) {
        	 Statement st9;
        	 try {
        		
    			st9= conn.createStatement();
    			st9.executeUpdate(sorgu3);
    			System.out.println("Silme iþlemi yapýldý.");
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		
    	 
    		}
}
    	 static void silizinler(String sorgu3) {
        	 Statement st10;
        	 try {
        		
    			st10= conn.createStatement();
    			st10.executeUpdate(sorgu3);
    			System.out.println("Silme iþlemi yapýldý.");
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace(); 
    	 
    		}
    	 }

    	 static void güncellemeoda(String sorgu3) {
        	 Statement st8;
        	 try {
        		
    			st8= conn.createStatement();
    			st8.executeUpdate(sorgu3);
    			System.out.println("Güncelleme yapýldý");
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		
    	 
}
}
    	 static void silodalar(String sorgu3) {
        	 Statement st10;
        	 try {
        		
    			st10= conn.createStatement();
    			st10.executeUpdate(sorgu3);
    			System.out.println("Silme iþlemi yapýldý.");
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace(); 
    	 
    		}
    	 }
    	 static void silogrenci(String sorgu3) {
        	 Statement st10;
        	 try {
        		
    			st10= conn.createStatement();
    			st10.executeUpdate(sorgu3);
    			System.out.println("Silme iþlemi yapýldý.");
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace(); 
    	 
    		}
    	 }
    	 static void güncelleogr(String sorgu3) {
        	 Statement st8;
        	 try {
        		
    			st8= conn.createStatement();
    			st8.executeUpdate(sorgu3);
    			System.out.println("Güncelleme yapýldý");
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		
    	 
}
    	 
}
}

