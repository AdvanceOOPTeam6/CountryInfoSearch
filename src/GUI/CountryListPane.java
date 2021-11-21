package GUI;

import db.CountryFlagAPI;
import db.DAO;
import db.DTO;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CountryListPane extends JScrollPane {
    private Frame frame;
    private CountryFlagAPI flagApi;

    private JList countryList;
    private String clickedValue;

    public CountryListPane(Frame frame) {
        this.frame = frame;
        flagApi = new CountryFlagAPI();
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
                    System.out.println("클릭함 "+clickedValue);
                    ArrayList<DTO> search = searchDAO.selectDB(clickedValue);
                    for(DTO tempDTO1 : search) {
                        System.out.println(tempDTO1.getCountry());
                        try {
                            frame.setNewCard(tempDTO1.getCountry(),tempDTO1.getLocation(),tempDTO1.getCode(),
                                    tempDTO1.getCapital(),tempDTO1.getLanguages(),
                                    tempDTO1.getClimate(),tempDTO1.getMajorcity(),
                                    tempDTO1.getReligion(),tempDTO1.getEthnicgroup(),Integer.toString(tempDTO1.getArea()),
                                    flagApi.CountryFlag(tempDTO1.getCode()));
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            }
        });

    }
    private void setClickedValue(String clickedValue){
        this.clickedValue = clickedValue;
    }
    public void setClear() {
    	countryList = new JList();
        add(countryList);
        setViewportView(countryList);
    }
    public void setSearch(List<String> s) { //리스트형식으로 받아오게 변경
        int size = 0;
        String[] temp= new String[s.size()];
        for(String contry: s) {
            temp[size++] = contry;
        }
    	countryList = new JList(temp);
        add(countryList);
        setViewportView(countryList);
        DAO searchDAO = new DAO();

        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(!e.getValueIsAdjusting()) {
                    setClickedValue((String) countryList.getSelectedValue());
                    System.out.println("클릭함 "+clickedValue);
                    ArrayList<DTO> search = searchDAO.selectDB(clickedValue);
                    for(DTO tempDTO1 : search) {
                        System.out.println(tempDTO1.getCountry());
                        try {
                            frame.setNewCard(tempDTO1.getCountry(),tempDTO1.getLocation(),tempDTO1.getCode(),
                                    tempDTO1.getCapital(),tempDTO1.getLanguages(),
                                    tempDTO1.getClimate(),tempDTO1.getMajorcity(),
                                    tempDTO1.getReligion(),tempDTO1.getEthnicgroup(),Integer.toString(tempDTO1.getArea()),
                                    flagApi.CountryFlag(tempDTO1.getCode()));
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            }
        });
    }
    public void setBack() {
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
                     System.out.println("클릭함 "+clickedValue);
                     ArrayList<DTO> search = searchDAO.selectDB(clickedValue);
                     for(DTO tempDTO1 : search) {
                         System.out.println(tempDTO1.getCountry());
                         try {
                             frame.setNewCard(tempDTO1.getCountry(),tempDTO1.getLocation(),tempDTO1.getCode(),
                                     tempDTO1.getCapital(),tempDTO1.getLanguages(),
                                     tempDTO1.getClimate(),tempDTO1.getMajorcity(),
                                     tempDTO1.getReligion(),tempDTO1.getEthnicgroup(),Integer.toString(tempDTO1.getArea()),
                                     flagApi.CountryFlag(tempDTO1.getCode()));
                         } catch (IOException ex) {
                             ex.printStackTrace();
                         }
                     }
                 }
             }
         });
    }

    public String getClickedValue() {
        return clickedValue;
    }
}
