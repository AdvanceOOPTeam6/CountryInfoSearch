package GUI;

import javax.swing.*;

public class CountryListPane extends JScrollPane {
    private JList countryList;
    private String[] countries = {"가나", "가봉", "가이아나","감비아","건지 섬", "과들루프", "과테말라", "괌", "그레나다", "그리스", "그린란드",
            "기니","기니비사우","나미비아","나우루","나이지리아","남극","남수단","남아프리카 공화국","네덜란드","네팔","노르웨이","노퍽 섬",
            "누벨칼레도니","뉴질랜드","니우에","니제르","니카라과","대한민국","덴마크"};

    public CountryListPane() {
        countryList = new JList(countries);
        add(countryList);
        setViewportView(countryList);
    }
}
