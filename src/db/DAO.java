package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {
	Connection conn = DBConnect.getDBConnect();
	
	// �� ���� ��� 
   	public ArrayList<DTO> selectDB(String countryname){
	   ArrayList<DTO> resultSet = new ArrayList<>();
	   
	   // MYSQL ���� �����Ͱ� ����ִ� ���̺� ����
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
   	
   	// ��ü ���
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
