package db;

import java.sql.*;
import java.util.ArrayList;

public class DAO {
    Connection conn = DBConnect.getDBConnect();

    public void CreateTable() {
        try{
            String sql = "create table country7(" +
                    "  country text, " +
                    "  ISO varchar(10)," +
                    "  capital text," +
                    "  climate text," +
                    "  location text," +
                    "  majorcity text," +
                    "  religion text," +
                    "  ethnicgroup text," +
                    "  media text," +
                    "  area int," +
                    "  areasource text," +
                    "  areadescript text," +
                    "  languages text," +
                    "  baseyear int," +
                    "  PRIMARY KEY(ISO)" +
                    ")ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;";

            Statement stmt = conn.createStatement();

            boolean rs2 = stmt.execute(sql);
            System.out.println("rs2="+rs2);
            System.out.println("=========TEST============");

            if(stmt!=null) stmt.close();
            if(conn!=null) conn.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if( conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public int insertData(DTO dto){
//			StringBuilder sb = new StringBuilder();
//			String sql = sb.append("insert into country7 value(")
//					.append()

        // 현재 country7 table에 임시 데이터를 넣어서 테스트 중
        String sql = "insert into country7 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement pstat = null;
        int result = 0;
        try {
            pstat = conn.prepareStatement(sql);
            pstat.setString(1, dto.country);
            pstat.setString(2, dto.code);
            pstat.setString(3, dto.capital);
            pstat.setString(4, dto.climate);
            pstat.setString(5, dto.location);
            pstat.setString(6, dto.majorcity);
            pstat.setString(7, dto.religion);
            pstat.setString(8, dto.ethnicgroup);
            pstat.setString(9, dto.media);
            pstat.setInt(10, dto.area);
            pstat.setString(11, dto.areasource);
            pstat.setString(12, dto.areadescript);
            pstat.setString(13, dto.languages);
            pstat.setInt(14, dto.baseyear);

            result = pstat.executeUpdate();
            System.out.println("=========TEST============");

        }catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if( conn != null) conn.close();
                if( pstat != null) pstat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;

    }


    public ArrayList<DTO> selectSearchDB(String countryname){
        ArrayList<DTO> resultSet = new ArrayList<>();

        // MYSQL 에서 데이터가 들어있는 테이블 쿼리
        String sql = "select * FROM countryinfo.countryinfo1";
        PreparedStatement pstat = null;
        ResultSet rs = null;

        try {
            //conn = DBConnect.getDBConnect();
            pstat = conn.prepareStatement(sql);
            rs =pstat.executeQuery();

            while(rs.next()) {
                if(rs.getString(1).contains(countryname)){
                    String country = rs.getString(1);
                    resultSet.add(new DTO(country));
                }

            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if( rs != null) rs.close();
                if( conn != null) conn.close();
                if( pstat != null) pstat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return resultSet;
    }

    // 한 개만 출력
    public ArrayList<DTO> selectDB(String countryname){
        ArrayList<DTO> resultSet = new ArrayList<>();

        // MYSQL 에서 데이터가 들어있는 테이블 쿼리
        String sql = "select * FROM countryinfo.countryinfo1";
        PreparedStatement pstat = null;
        ResultSet rs = null;

        try {
            //conn = DBConnect.getDBConnect();
            pstat = conn.prepareStatement(sql);
            rs =pstat.executeQuery();

            while(rs.next()) {
                if(rs.getString(1).equals(countryname)){
                    String country = rs.getString(1);
                    String code =rs.getString(2);
                    String capital =rs.getString(3);
                    String climate = rs.getString(4);
                    resultSet.add(new DTO(country,code,capital,climate));
                }

            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if( rs != null) rs.close();
                if( conn != null) conn.close();
                if( pstat != null) pstat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return resultSet;
    }

    // 전체 출력
    public ArrayList<DTO> selectDBAll(){
        ArrayList<DTO> resultSet = new ArrayList<>();

        String sql = "select * FROM countryinfo.countryinfo1";
        PreparedStatement pstat = null;
        ResultSet rs = null;

        try {
            //conn = DBConnect.getDBConnect();
            pstat = conn.prepareStatement(sql);
            rs =pstat.executeQuery();

            while(rs.next()) {

                String country = rs.getString(1);
                String code =rs.getString(2);
                String capital =rs.getString(3);
                String climate = rs.getString(4);
                resultSet.add(new DTO(country,code,capital,climate));


            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if( rs != null) rs.close();
                if( conn != null) conn.close();
                if( pstat != null) pstat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return resultSet;
    }

}
