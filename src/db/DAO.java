package db;

import java.sql.*;
import java.util.ArrayList;

public class DAO {
    Connection conn = DBConnect.getDBConnect();

    private String country;
    private String code;
    private String capital;
    private String climate;
    private String location;
    private String majorcity;
    private String religion;
    private String ethnicgroup;
    private String media;
    private int area;
    private String areasource;
    private String areadescript;
    private String languages;
    private int baseyear;

    public void CreateTable() {
        try{
            String sql = "create table country6(" +
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

    public int deleteData() {

        String sql = "TRUNCATE TABLE countryinfo1";
        PreparedStatement pstat = null;
        int result = 0;

        try {
            pstat = conn.prepareStatement(sql);
            result = pstat.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }
        return result;
    }

    public int insertData(DTO dto){
//			StringBuilder sb = new StringBuilder();
//			String sql = sb.append("insert into country7 value(")
//					.append()

        // 생성 경로를 countryinfo1으로 변경 후 사용
        String sql = "insert into countryinfo1 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

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
//            try {
//                if( conn != null) conn.close();
//                if( pstat != null) pstat.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
        }
        return result;

    }

    public ArrayList<DTO> searchDB(String countryname){
        ArrayList<DTO> resultSet = new ArrayList<>();

        // MYSQL 에서 데이터가 들어있는 테이블 쿼리
//        String sql = "select * FROM countryinfo.countryinfo1";
        String sql = "select * FROM countryinfo.country6 order by country";
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
//                if( conn != null) conn.close();
                if( pstat != null) pstat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return resultSet;
    }

    public ArrayList<DTO> selectSearchDB(String countryname){
        ArrayList<DTO> resultSet = new ArrayList<>();

        // MYSQL 에서 데이터가 들어있는 테이블 쿼리
        String sql = "select * FROM countryinfo.countryinfo6";
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
//                if( conn != null) conn.close();
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
//        String sql = "select * FROM countryinfo.countryinfo1";
        String sql = "select * FROM countryinfo.country6";
        PreparedStatement pstat = null;
        ResultSet rs = null;

        try {
            //conn = DBConnect.getDBConnect();
            pstat = conn.prepareStatement(sql);
            rs =pstat.executeQuery();

            while(rs.next()) {
                if(rs.getString(1).equals(countryname)){
                    country = rs.getString(1);
                    code =rs.getString(2);
                    capital =rs.getString(3);
                    climate = rs.getString(4);
                    location = rs.getString(5);
                    majorcity =rs.getString(6);
                    religion =rs.getString(7);
                    ethnicgroup = rs.getString(8);
//                    media = rs.getString(9);
                    area =rs.getInt(10);
//                    areasource =rs.getString(11);
//                    areadescript = rs.getString(12);
                    languages =rs.getString(13);
//                    baseyear = rs.getInt(14);
                    resultSet.add(new DTO(country,location,code,capital,languages,climate,majorcity,religion,ethnicgroup,area));
//                    System.out.println("country: " +country +"\ncode: " + code + "\ncapital: "+capital + "\nmajorcity: " + majorcity + "\nlanguages:" + languages +"\n\n");
                }

            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if( rs != null) rs.close();
//                if( conn != null) conn.close();
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
//        String sql = "select * FROM countryinfo.countryinfo1";
        String sql = "select * FROM countryinfo.country6";
        PreparedStatement pstat = null;
        ResultSet rs = null;

        try {
            conn = DBConnect.getDBConnect();
            pstat = conn.prepareStatement(sql);
            rs =pstat.executeQuery();

            while(rs.next()) {

                country = rs.getString(1);
                code =rs.getString(2);
                capital =rs.getString(3);
                climate = rs.getString(4);
                location = rs.getString(5);
                majorcity =rs.getString(6);
                religion =rs.getString(7);
                ethnicgroup = rs.getString(8);
                media = rs.getString(9);
                area =rs.getInt(10);
                areasource =rs.getString(11);
                areadescript = rs.getString(12);
                languages =rs.getString(13);
                baseyear = rs.getInt(14);
                resultSet.add(new DTO(country,code,capital,climate,location,majorcity,religion,ethnicgroup,media,area,areasource,areadescript,languages,baseyear));


            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if( rs != null) rs.close();
//                if( conn != null) conn.close();
                if( pstat != null) pstat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return resultSet;
    }
}
