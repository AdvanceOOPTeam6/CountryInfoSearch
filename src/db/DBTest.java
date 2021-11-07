package db;

import java.io.IOException;
import java.util.ArrayList;

import static db.ReadCSV.listCSV;

public class DBTest {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        String []countries = new String[]
        DAO testDAO = new DAO();
		ArrayList<DTO> search = testDAO.selectSearchDB("");
		for(DTO tempDTO1 : search) {
			System.out.println(
					tempDTO1.getCountry()
			);
		}
        for


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
//        CountryFlagAPI flag = new CountryFlagAPI();
//        String a = flag.CountryFlag("GH");
//        System.out.println(a);



        // CSV 파일 불러오기
//        ReadCSV.LoadFile("1");
//        for (int i = 1; i < listCSV.size(); i++) {
//            String country = listCSV.get(i).get(0);
//            String code = listCSV.get(i).get(1);
//            String capital = listCSV.get(i).get(2);
//            String climate = listCSV.get(i).get(3);
//            String location = listCSV.get(i).get(4);
//            String majorcity = listCSV.get(i).get(5);
//            String religion = listCSV.get(i).get(6);
//            String ethnicgroup = listCSV.get(i).get(7);
//            String media = listCSV.get(i).get(8);  // 숫자
//            String area1 = listCSV.get(i).get(9);
//            int area = Integer.parseInt(area1);
//            String areasource = listCSV.get(i).get(10);
//            String areadescript = listCSV.get(i).get(11);
//            String languages = listCSV.get(i).get(12); //숫자
//            String baseyear1 = listCSV.get(i).get(13); //숫자
//            int baseyear = Integer.parseInt(baseyear1);
//
//                DTO dto = new DTO( country,  code,  capital,  climate,  location,  majorcity,  religion,  ethnicgroup,  media,  area,  areasource,  areadescript,  languages,  baseyear);
//                int count = testDAO.insertData(dto);
//                System.out.print(count + "============");
//                if(count > 0){
//                    System.out.println("=========성공============");
//                }else{
//                    System.out.println("=========실패============");
//                }
//        }


        // CSV 데이터 테스트
//		System.out.println(listCSV.get(1).get(1));
//		// 테스트 데이터
//		String a1 = "a11";
//		String a2 = "a21";
//		String a3 = "a31";
//		String a4 = "a41";
//		String a5 = "a51";
//		String a6 = "a61";
//		String a7 = "a71";
//		String a8 = "a81";
//		String a9 = "a91";
//		int a10 = 11;
//		String a11 = "a111";
//		String a12 = "a121";
//		String a13 = "a131";
//		int a14 = 1231;

        // 테이블 만들기
//		testDAO.CreateTable();

        // 데이터를 db에 넣기기
//		DTO dto = new DTO(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14);
//		int count = testDAO.insertData(dto);
//		if(count > 0){
//			System.out.println("=========성공============");
//		}else{
//			System.out.println("=========실패============");
//		}


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