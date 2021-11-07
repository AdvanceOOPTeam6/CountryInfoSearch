package GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class CardFront extends JPanel {

    private Flag flag;

    private JLabel cardTitle;
    private JLabel continent;
    private JLabel countryCode;
    private JLabel capital;
    private JLabel language;

    private JLabel capital_icon;
    private JLabel countryCode_icon;
    private JLabel language_icon;

    private Font titleFont;
    private Font subTitleFont;
    private Font contentFont;

    public CardFront() throws IOException{

        setLayout(null);
        setBackground(Color.white);

        ////////////////////////////////////////////////////////////////
        /////// 이미지 출력단
        // 국기
        flag = new Flag();
        flag.setBounds(0, 0, 250, 130);
        add(flag);

        // 아이콘
        Icon icon_code = new Icon("src/GUI/Icons/code-working-outline.png");
        countryCode_icon = new JLabel(icon_code.getUpdateIcon());
        countryCode_icon.setHorizontalAlignment(JLabel.CENTER);
        countryCode_icon.setBounds(30, 220, 40, 40);
        add(countryCode_icon);

        Icon icon_capital = new Icon("src/GUI/Icons/flag-outline.png");
        capital_icon = new JLabel(icon_capital.getUpdateIcon());
        capital_icon.setHorizontalAlignment(JLabel.CENTER);
        capital_icon.setBounds(30, 280, 40, 40);
        add(capital_icon);

        Icon icon_lang = new Icon("src/GUI/Icons/chatbubbles-outline.png");
        language_icon = new JLabel(icon_lang.getUpdateIcon());
        language_icon.setHorizontalAlignment(JLabel.CENTER);
        language_icon.setBounds(30, 340, 40, 40);
        add(language_icon);

        ////////////////////////////////////////////////////////////////
        /////// 텍스트 출력단

        // 국가 이름
        titleFont = new Font("Monaco", Font.BOLD, 30);
        cardTitle = new JLabel("Ghana");
        cardTitle.setFont(titleFont);
        cardTitle.setBounds(25, 150, 240, 30);
        add(cardTitle);


        // 대륙
        subTitleFont = new Font("Monaco", Font.PLAIN, 15);
        continent = new JLabel("Africa");
        continent.setFont(subTitleFont);
        continent.setBounds(30, 180, 240, 30);
        add(continent);

        // 국가 코드
        contentFont = new Font("Monaco", Font.PLAIN, 20);
        countryCode = new JLabel("GH");
        countryCode.setFont(contentFont);
        countryCode.setBounds(80, 220, 100, 40);
        add(countryCode);

        // 국가 수도
        capital = new JLabel("아크라");
        capital.setFont(contentFont);
        capital.setBounds(80, 280, 100, 40);
        add(capital);

        // 국가 언어
        language = new JLabel("영어");
        language.setFont(contentFont);
        language.setBounds(80, 340, 100, 40);
        add(language);
    }

    public CardFront(String countryName, String continent, String countryCode, String capital, String language, Flag flag) throws IOException {
        setLayout(null);
        setBackground(Color.white);

        ////////////////////////////////////////////////////////////////
        /////// 이미지 출력단
        // 국기
        this.flag = flag;
        this.flag.setBounds(0, 0, 250, 130);
        add(this.flag);

        // 아이콘
        Icon icon_code = new Icon("src/GUI/Icons/code-working-outline.png");
        countryCode_icon = new JLabel(icon_code.getUpdateIcon());
        countryCode_icon.setHorizontalAlignment(JLabel.CENTER);
        countryCode_icon.setBounds(30, 220, 40, 40);
        add(countryCode_icon);

        Icon icon_capital = new Icon("src/GUI/Icons/flag-outline.png");
        capital_icon = new JLabel(icon_capital.getUpdateIcon());
        capital_icon.setHorizontalAlignment(JLabel.CENTER);
        capital_icon.setBounds(30, 280, 40, 40);
        add(capital_icon);

        Icon icon_lang = new Icon("src/GUI/Icons/chatbubbles-outline.png");
        language_icon = new JLabel(icon_lang.getUpdateIcon());
        language_icon.setHorizontalAlignment(JLabel.CENTER);
        language_icon.setBounds(30, 340, 40, 40);
        add(language_icon);

        ////////////////////////////////////////////////////////////////
        /////// 텍스트 출력단

        // 국가 이름
        titleFont = new Font("Monaco", Font.BOLD, 30);
        cardTitle = new JLabel(countryName);
        cardTitle.setFont(titleFont);
        cardTitle.setBounds(25, 150, 240, 30);
        add(cardTitle);


        // 대륙
        subTitleFont = new Font("Monaco", Font.PLAIN, 15);
        this.continent = new JLabel(continent);
        this.continent.setFont(subTitleFont);
        this.continent.setBounds(30, 180, 240, 30);
        add(this.continent);

        // 국가 코드
        contentFont = new Font("Monaco", Font.PLAIN, 20);
        this.countryCode = new JLabel(countryCode);
        this.countryCode.setFont(contentFont);
        this.countryCode.setBounds(80, 220, 100, 40);
        add(this.countryCode);

        // 국가 수도
        this.capital = new JLabel(capital);
        this.capital.setFont(contentFont);
        this.capital.setBounds(80, 280, 100, 40);
        add(this.capital);

        // 국가 언어
        this.language = new JLabel(language);
        this.language.setFont(contentFont);
        this.language.setBounds(80, 340, 100, 40);
        add(this.language);
    }
}