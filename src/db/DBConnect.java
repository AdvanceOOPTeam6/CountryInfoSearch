package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

    public static Connection getDBConnect() {
        Connection conn = null;
        // DB에서 가져올 테이블 이름, 계정, 비밀번호
        String url = Setting.URL.toString();
        String id = Setting.USERNAME.toString();
        String pw = Setting.PASSWORD.toString();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, id, pw);
            System.out.println("연결 성공");
            return conn;
        }
        catch(ClassNotFoundException e){
            System.out.println("드라이버 로딩 실패");
        }
        catch(SQLException e){
            System.out.println("애러: " + e);
        }
        return null;
    }
}