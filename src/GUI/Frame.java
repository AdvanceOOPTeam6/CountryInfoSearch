package GUI;

import javax.swing.*;
import java.io.IOException;

public class Frame extends JFrame {

    private CardFront cardFront;
    private CardBack cardBack;
    private CountryListPane countryListPane;
    private JTextField textInputField;



    public Frame(){
        super("나라사랑카드");                 // 타이틀
        getContentPane().setLayout(null);       // Absolute layout
        initComponent();
        setVisible(true);
        setResizable(false);                    // 창 크기 변경 불가
        setSize(1000, 600);        // 1000(width) X 600(height)
        setLocationRelativeTo(null);            // 실행시 화면 가운데로 정렬
        setDefaultCloseOperation(EXIT_ON_CLOSE);// 나가면 프로그램 종료
    }

    private void initComponent(){
        try {
            cardFront = new CardFront();
        } catch (IOException e) {
            e.printStackTrace();
        }
        cardFront.setBounds(60,100,250,400);
        getContentPane().add(cardFront);

        cardBack = new CardBack();
        cardBack.setBounds(350, 100, 250, 400);
        getContentPane().add(cardBack);

        countryListPane = new CountryListPane();
        countryListPane.setBounds(640,100,250,400);
        getContentPane().add(countryListPane);

        textInputField = new JTextField();
        textInputField.setBounds(640, 70, 250, 20);
        getContentPane().add(textInputField);

    }
}
