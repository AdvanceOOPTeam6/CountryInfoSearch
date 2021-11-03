package GUI;

import db.CountryFlagAPI;
import db.DAO;
import db.DTO;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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

        // 국가 이미지 불러오기
        CountryFlagAPI flag = new CountryFlagAPI();
        String a = flag.CountryFlag("GH");
        System.out.println(a);

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame = new Frame();

            }
        });
    }
}
