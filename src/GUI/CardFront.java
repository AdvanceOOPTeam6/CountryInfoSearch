package GUI;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class CardFront extends JPanel {

    private Flag flag;
    private String countryName;
    private String capital;
    private String language;

    public CardFront() throws IOException {
        setLayout(null);
        setBackground(Color.black);
        flag = new Flag();
        flag.setBounds(0,0,250, 130);
        add(flag);
    }

    public CardFront(String countryName, String capital, String language) throws IOException {
        this.countryName = countryName;
        this.capital = capital;
        this.language = language;
        flag = new Flag();
        flag.setBounds(0,0,250, 130);
        add(flag);
    }
}
