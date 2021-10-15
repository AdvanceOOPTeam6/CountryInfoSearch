package db;

import java.util.ArrayList;

public class DBtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DAO testDAO = new DAO();

		ArrayList<DTO> selected1 = testDAO.selectDBAll();
		for(DTO tempDTO1 : selected1) {
			System.out.println(
					tempDTO1.getCountry() +" "+
					tempDTO1.getCode() +" "+
					tempDTO1.getCapital() + " "+
					tempDTO1.getClimate()
			);
		}
			
			
//		String countryname = "����";
//		ArrayList<DTO> selected2 = testDAO.selectDB(countryname);
//		for(DTO tempDTO2 : selected2) {
//			System.out.println(
//					tempDTO2.getCountry() +" "+
//					tempDTO2.getCode() +" "+
//					tempDTO2.getCapital() + " "+ 
//					tempDTO2.getClimate()
//			);
//		}
		
	}

}



