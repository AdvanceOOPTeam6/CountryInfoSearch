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
        CountryFlagAPI abc = new CountryFlagAPI();
        abc.CountryFlag("KR");


        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
					new Intro();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

            }
        });
    }
}
