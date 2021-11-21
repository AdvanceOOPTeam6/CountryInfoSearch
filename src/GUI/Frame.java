package GUI;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;



public class Frame extends JFrame {

    private CardFront cardFront;
    private CardBack cardBack;
    private CardFront cardFront2;
    private CardBack cardBack2;
    private CountryListPane countryListPane;
    private JTextField textInputField;
    private Intro intro;

    private boolean isVisible1 = true;
    private boolean isVisible2 = true;

    public Frame() throws IOException {

        super("나라사랑카드");                // 타이틀
        new SetData();                          // csv파일 받기
        getContentPane().setLayout(null);       // Absolute layout
        initComponent();
        setVisible(true);
        setResizable(false);                    // 창 크기 변경 불가
        setSize(1000, 600);         // 1000(width) X 600(height)
        setLocationRelativeTo(null);            // 실행시 화면 가운데로 정렬
        setDefaultCloseOperation(EXIT_ON_CLOSE);// 나가면 프로그램 종료
        
        cardFront.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isVisible1 = !isVisible1;
                cardFront.setVisible(isVisible1);
                cardBack.setVisible(!isVisible1);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // 비어있음
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // 비어있음
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // 비어있음
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // 비어있음
            }
        });
        cardBack.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isVisible1 = !isVisible1;
                cardFront.setVisible(isVisible1);
                cardBack.setVisible(!isVisible1);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // 비어있음
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // 비어있음
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // 비어있음
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // 비어있음
            }
        });
    }

    private void initComponent() throws IOException {
        try {
            // 첫번째 카드
            cardFront = new CardFront("한국","아시아","KR","서울","한국어",new Flag(250,130,"https://opendata.mofa.go.kr:8444/fileDownload/images/country_images/flags/241/20201125_220348799.gif"));
            cardFront.setBounds(60,100,250,400);
            getContentPane().add(cardFront);

            cardBack = new CardBack("대륙성기후","아시아","서울,인천,부산","기독교","한민족","1,004만 128.5㏊",new Flag(125,80,"https://opendata.mofa.go.kr:8444/fileDownload/images/country_images/flags/241/20201125_220348799.gif"));
            cardBack.setBounds(60,100,250,400);
            getContentPane().add(cardBack);

        } catch (IOException e) {
            e.printStackTrace();
        }

        countryListPane = new CountryListPane(this);
        countryListPane.setBounds(640,100,250,400);
        getContentPane().add(countryListPane);

        textInputField = new JTextField();
        textInputField.setBounds(640, 70, 250, 20);
        getContentPane().add(textInputField);

        setNewCard("가나","아프리카","GH","아크라","영어","OO","OO","OO","OO", "OO", "https://opendata.mofa.go.kr:8444/fileDownload/images/country_images/flags/15/20201125_211109671.gif");

    }

    public void setNewCard(String countryName, String continent, String countryCode, String capital, String language, String climate, String city, String religion, String ethnic, String area, String flagUrl) throws IOException {
        isVisible2 = true;

        if(cardFront != null && cardBack2 != null) {
            getContentPane().remove(cardFront2);
            getContentPane().remove(cardBack2);
        }
//         두번째 카드
        cardFront2 = new CardFront(countryName,continent,countryCode,capital,language,new Flag(250,130,flagUrl));
        cardFront2.setBounds(350, 100, 250, 400);
        getContentPane().add(cardFront2);

        cardBack2 = new CardBack(climate,continent,city,religion,ethnic,area,new Flag(125,80,flagUrl));
        cardBack2.setBounds(350, 100, 250, 400);
        getContentPane().add(cardBack2);

        cardFront2.setVisible(isVisible2);
        cardBack2.setVisible(isVisible2);
        cardFront2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isVisible2 = !isVisible2;
                cardFront2.setVisible(isVisible2);
                cardBack2.setVisible(!isVisible2);
                System.out.println("Front is clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // 비어있음
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // 비어있음
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // 비어있음
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // 비어있음
            }
        });
        cardBack2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isVisible2 = !isVisible2;
                cardFront2.setVisible(isVisible2);
                cardBack2.setVisible(!isVisible2);
                System.out.println("Back is clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // 비어있음
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // 비어있음
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // 비어있음
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // 비어있음
            }
        });
    }

}
