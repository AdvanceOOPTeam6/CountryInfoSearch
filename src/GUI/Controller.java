package GUI;


import db.DAO;
import db.DTO;

import javax.swing.*;
import java.util.ArrayList;

public class Controller {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Frame();
            }
        });


//        DAO testDAO = new DAO();

//        ArrayList<DTO> selected1 = testDAO.selectDBAll();
//        for(DTO tempDTO1 : selected1) {
//            System.out.println(
//                    tempDTO1.getCountry() +" "+
//                            tempDTO1.getCode() +" "+
//                            tempDTO1.getCapital() + " "+
//                            tempDTO1.getClimate()
//            );
//        }

    }
}
