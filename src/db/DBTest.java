//package db;
//
//import java.io.IOException;
//import java.util.ArrayList;
//
//import static db.ReadCSV.listCSV;
//
//public class DBTest {
//
//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//
//		DAO testDAO = new DAO();
//		ArrayList<DTO> search = testDAO.selectSearchDB("가");
//		for(DTO tempDTO1 : search) {
//			System.out.println(
//					tempDTO1.getCountry()
//			);
//		}


//		ArrayList<DTO> selected1 = testDAO.selectDBAll();
//		for(DTO tempDTO1 : selected1) {
//			System.out.println(
//					tempDTO1.getCountry() +" "+
//					tempDTO1.getCode() +" "+
//					tempDTO1.getCapital() + " "+
//					tempDTO1.getClimate()
//			);
//		}
//
//		// 국가 이미지 불러오기
//		CountryFlagAPI flag = new CountryFlagAPI();
//		String a = flag.CountryFlag("GH");
//		System.out.println(a);
//	}
//}