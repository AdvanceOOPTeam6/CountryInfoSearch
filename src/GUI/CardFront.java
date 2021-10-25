package GUI;

import javax.swing.*;
import java.awt.*;

public class CardFront extends JPanel {

    private Flag flag;
    private String countryName;
    private String capital;
    private String language;

    public CardFront() {
        setLayout(null);
        setBackground(Color.black);
        flag = new Flag();
        flag.setBounds(0,0,188, 110);
        add(flag);
    }

    public CardFront(String countryName, String capital, String language) {
        this.countryName = countryName;
        this.capital = capital;
        this.language = language;
        flag = new Flag();
        flag.setBounds(0,0,188, 110);
        add(flag);
    }
}
