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

    private boolean isVisible = true;

    public Frame(){
        super("나라사랑카드");                 // 타이틀
        getContentPane().setLayout(null);       // Absolute layout
        initComponent();
        setVisible(true);
        setResizable(false);                    // 창 크기 변경 불가
        setSize(1000, 600);        // 1000(width) X 600(height)
        setLocationRelativeTo(null);            // 실행시 화면 가운데로 정렬
        setDefaultCloseOperation(EXIT_ON_CLOSE);// 나가면 프로그램 종료

        cardBack.setVisible(!isVisible);

        cardFront.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isVisible = !isVisible;
                cardFront.setVisible(isVisible);
                cardBack.setVisible(!isVisible);
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
                isVisible = !isVisible;
                cardFront.setVisible(isVisible);
                cardBack.setVisible(!isVisible);
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
        cardFront2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isVisible = !isVisible;
                cardFront2.setVisible(isVisible);
                cardBack2.setVisible(!isVisible);
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
                isVisible = !isVisible;
                cardFront2.setVisible(isVisible);
                cardBack2.setVisible(!isVisible);
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

    private void initComponent(){
        try {
            // 첫번째 카드
            cardFront = new CardFront("GH","아크라","영어");
            cardFront.setBounds(60,100,250,400);
            getContentPane().add(cardFront);

            cardBack = new CardBack();
            cardBack.setBounds(60,100,250,400);
            getContentPane().add(cardBack);

            // 두번째 카드
            cardFront2 = new CardFront("GH","아크라","영어");
            cardFront2.setBounds(350, 100, 250, 400);
            getContentPane().add(cardFront2);

            cardBack2 = new CardBack();
            cardBack2.setBounds(350, 100, 250, 400);
            getContentPane().add(cardBack2);
        } catch (IOException e) {
            e.printStackTrace();
        }




        countryListPane = new CountryListPane();
        countryListPane.setBounds(640,100,250,400);
        getContentPane().add(countryListPane);

        textInputField = new JTextField();
        textInputField.setBounds(640, 70, 250, 20);
        getContentPane().add(textInputField);

    }

}
