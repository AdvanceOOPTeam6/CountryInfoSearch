package GUI;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class CardBack extends JPanel {
    private Flag flag;

    private JLabel cardTitle;
    private JLabel continent;
    private JLabel countryCode;
    private JLabel capital;
    private JLabel language;
    private JLabel climate;
    private JLabel location;
    private JLabel city;
    private JLabel religion;
    private JLabel ethnic;
    private JLabel area;

    private JLabel capital_icon;
    private JLabel countryCode_icon;
    private JLabel language_icon;
    private JLabel climate_icon;
    private JLabel city_icon;
    private JLabel religion_icon;
    private JLabel ethnic_icon;
    private JLabel area_icon;
    private JLabel location_icon;

    private Font titleFont;
    private Font subTitleFont;
    private Font contentFont;

    public CardBack() throws IOException {
        setLayout(null);
        setBackground(Color.white);
        setVisible(false);

        ////////////////////////////////////////////////////////////////
        /////// 이미지 출력단
        // 국기
        flag = new Flag(125,80);
        flag.setBounds(0, 0, 125, 80);
        add(flag);

        // 아이콘
        // 수도
//        Icon icon_capital = new Icon("src/GUI/Icons/flag-outline.png",30,30);
//        capital_icon = new JLabel(icon_capital.getUpdateIcon());
//        capital_icon.setHorizontalAlignment(JLabel.CENTER);
//        capital_icon.setBounds(10, 90, 30, 30);
//        add(capital_icon);

        // 기후
        Icon icon_climate = new Icon("src/GUI/Icons/sunny-outline.png",30,30);
        climate_icon = new JLabel(icon_climate.getUpdateIcon());
        climate_icon.setHorizontalAlignment(JLabel.CENTER);
        climate_icon.setBounds(10, 90, 30, 30);
        add(climate_icon);

        // 위치
        Icon icon_location = new Icon("src/GUI/Icons/earth-outline.png",30,30);
        location_icon = new JLabel(icon_location.getUpdateIcon());
        location_icon.setHorizontalAlignment(JLabel.CENTER);
        location_icon.setBounds(10, 130, 30, 30);
        add(location_icon);

        // 주요도시
        Icon icon_city= new Icon("src/GUI/Icons/business-outline.png",30,30);
        city_icon = new JLabel(icon_city.getUpdateIcon());
        city_icon.setHorizontalAlignment(JLabel.CENTER);
        city_icon.setBounds(10, 170, 30, 30);
        add(city_icon);

        // 종교
        Icon icon_religion= new Icon("src/GUI/Icons/peace.png",30,30);
        religion_icon = new JLabel(icon_religion.getUpdateIcon());
        religion_icon.setHorizontalAlignment(JLabel.CENTER);
        religion_icon.setBounds(10, 210, 30, 30);
        add(religion_icon);

        // 주요민족
        Icon icon_ethnic= new Icon("src/GUI/Icons/person-outline.png",30,30);
        ethnic_icon = new JLabel(icon_ethnic.getUpdateIcon());
        ethnic_icon.setHorizontalAlignment(JLabel.CENTER);
        ethnic_icon.setBounds(10, 250, 30, 30);
        add(ethnic_icon);

        //면적
        Icon icon_area= new Icon("src/GUI/Icons/layers-outline.png",30,30);
        area_icon = new JLabel(icon_area.getUpdateIcon());
        area_icon.setHorizontalAlignment(JLabel.CENTER);
        area_icon.setBounds(10, 290, 30, 30);
        add(area_icon);

        //언어
//        Icon icon_language= new Icon("src/GUI/Icons/earth-outline.png",30,30);
//        language_icon = new JLabel(icon_language.getUpdateIcon());
//        language_icon.setHorizontalAlignment(JLabel.CENTER);
//        language_icon.setBounds(10, 370, 30, 30);
//        add(language_icon);


        ////////////////////////////////////////////////////////////////
        /////// 텍스트 출력단

        // 국가 이름
        titleFont = new Font("Monaco", Font.BOLD, 20);
        cardTitle = new JLabel("Ghana");
        cardTitle.setFont(titleFont);
        cardTitle.setBounds(140, 20, 80, 30);
        add(cardTitle);

        // 대륙
        subTitleFont = new Font("Monaco", Font.PLAIN, 13);
        continent = new JLabel("Africa");
        continent.setFont(subTitleFont);
        continent.setBounds(144, 50, 80, 20);
        add(continent);

        // 기후
        contentFont = new Font("Monaco", Font.PLAIN, 20);
        climate = new JLabel("열대우림기후");
        climate.setFont(contentFont);
        climate.setBounds(50, 85, 200, 40);
        add(climate);

        // 위치
        location = new JLabel("아프리카");
        location.setFont(contentFont);
        location.setBounds(50, 125, 200, 40);
        add(location);

        // 주요 도시
        city = new JLabel("아크라");
        city.setFont(contentFont);
        city.setBounds(50, 165, 200, 40);
        add(city);

        // 종교
        religion= new JLabel("기독교");
        religion.setFont(contentFont);
        religion.setBounds(50, 205, 200, 40);
        add(religion);

        // 주요 민족
        ethnic= new JLabel("아칸족");
        ethnic.setFont(contentFont);
        ethnic.setBounds(50, 245, 200, 40);
        add(ethnic);

        // 면적
        area= new JLabel("2,385만 3천ha");
        area.setFont(contentFont);
        area.setBounds(50, 285, 200, 40);
        add(area);
    }

}
