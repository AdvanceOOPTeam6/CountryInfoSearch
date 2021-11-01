package GUI;

import org.apache.batik.swing.JSVGCanvas;
import org.apache.batik.transcoder.TranscoderException;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscodingHints;
import org.apache.batik.transcoder.image.ImageTranscoder;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class CardFront extends JPanel {

    private Flag flag;
    private String countryName;
    private String capital;
    private String language;

    private JLabel cardTitle;
    private JLabel continent;
    private JLabel countryCode;
    private JLabel cardCapital;
    private JLabel cardLanguage;

    private JLabel cardCapital_Icon;
    private Icon icon;
    private Image image;
    private URL url;



    private Font titleFont;
    private Font contentFont;

    public CardFront() throws IOException, TranscoderException {

        setLayout(null);
        setBackground(Color.white);

        // 국기
        flag = new Flag();
        flag.setBounds(0,0,250, 130);
        add(flag);


        // 국가 이름
        titleFont = new Font("Monaco", Font.BOLD, 30);
        cardTitle = new JLabel("Ghana");
        cardTitle.setFont(titleFont);
        cardTitle.setBounds(25, 150, 240, 30);
        add(cardTitle);


        // 대륙
        titleFont = new Font("Monaco", Font.PLAIN, 15);
        continent = new JLabel("Africa");
        continent.setFont(titleFont);
        continent.setBounds(30,180,240,30);
        add(continent);

        // 아이콘
        icon = new Icon("/Users/kimbohyeon/IdeaProjects/CountryInfoSearch/src/GUI/Icons/flag-outline.png");
        cardCapital_Icon = new JLabel(icon.getUpdateIcon());
        cardCapital_Icon.setHorizontalAlignment(JLabel.CENTER);
        cardCapital_Icon.setBounds(30,220,40,40);
        add(cardCapital_Icon);
    }

    public CardFront(String countryName, String capital, String language) throws IOException {
        this.countryName = countryName;
        this.capital = capital;
        this.language = language;


        flag = new Flag();
        flag.setBounds(0,0,250, 130);
        add(flag);


        titleFont = new Font("Monaco", Font.BOLD, 20);
        cardTitle = new JLabel("가나");
        cardTitle.setFont(titleFont);
        cardTitle.setBounds(0, 140, 240, 30);
        add(cardTitle);
    }


}
