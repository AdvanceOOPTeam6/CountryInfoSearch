package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	public static Connection getDBConnect() {
		Connection conn = null;
		// DB���� ������ ���̺� �̸�, ����, ��й�ȣ
		String url = "jdbc:mysql://localhost/countryinfo";
	    String id = "root";
 	    String pw = "asdf1234";
	    
		try{
		   	Class.forName("com.mysql.cj.jdbc.Driver");
	        conn = DriverManager.getConnection(url, id, pw);
	        System.out.println("���� ����");
	        return conn;
	   }
	   catch(ClassNotFoundException e){
	       System.out.println("����̹� �ε� ����");
	   }
	   catch(SQLException e){
	       System.out.println("����: " + e);
	   }
		return null;
	}
}
