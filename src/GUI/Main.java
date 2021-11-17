package GUI;

import db.CountryFlagAPI;
import db.DAO;
import db.DTO;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    private static Frame frame;


    public static void main(String[] args) throws IOException {
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

//        System.out.println("=========================================");
//
//        ArrayList<DTO> search = testDAO.selectDB("그리스");
//        for(DTO tempDTO1 : search) {
//            System.out.println(
//                    tempDTO1.getCountry() +" 국가"+
//                            tempDTO1.getCode() +" 코드 "+
//                            tempDTO1.getCapital() + " 수도 "+
//                            tempDTO1.getClimate()  + " 기후 "+
//                            tempDTO1.getLocation()+ " 지역 "+
//                            tempDTO1.getLanguages()+ " 언어 "+
//                            tempDTO1.getMajorcity()+ " 주요도시 "+
//                            tempDTO1.getReligion() + " 종교 "+
//                            tempDTO1.getEthnicgroup() + " 인종 "+
//                            Integer.toString(tempDTO1.getArea())
//            );
//        }

//        국가 이미지 불러오기
//        CountryFlagAPI flag = new CountryFlagAPI();
//        String a = flag.CountryFlag("GH");
//        System.out.println(a);

        CountryFlagAPI abc = new CountryFlagAPI();
        abc.CountryFlag("KR");


        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Frame();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
    }
}
