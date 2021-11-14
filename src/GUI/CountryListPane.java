package GUI;

import db.DAO;
import db.DTO;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.ArrayList;

public class CountryListPane extends JScrollPane {
    private JList countryList;
    private String clickedValue;

    public CountryListPane() {
        ArrayList<String> temp = new ArrayList<String>();
        DAO searchDAO = new DAO();
        ArrayList<DTO> searchinit = searchDAO.searchDB("");
        for(DTO tempDTO1 : searchinit) {
            temp.add(tempDTO1.getCountry());
        }
        String[] countries = new String[temp.size()];
        int size=0;
        for(String country: temp) {
            countries[size++] = country;
        }
        countryList = new JList(countries);
        add(countryList);
        setViewportView(countryList);

        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(!e.getValueIsAdjusting()) {
                    setClickedValue((String) countryList.getSelectedValue());
                    //System.out.println(clickedValue);
                    searchDAO.selectDB(clickedValue);
                }
            }
        });

    }
    private void setClickedValue(String clickedValue){
        this.clickedValue = clickedValue;
    }

    public String getClickedValue() {
        return clickedValue;
    }
}
