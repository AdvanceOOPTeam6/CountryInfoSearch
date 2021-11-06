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

    private boolean isVisible1 = true;
    private boolean isVisible2 = true;

    public Frame() throws IOException {
        super("나라사랑카드");                 // 타이틀
        getContentPane().setLayout(null);       // Absolute layout
        initComponent();
        setVisible(true);
        setResizable(false);                    // 창 크기 변경 불가
        setSize(1000, 600);        // 1000(width) X 600(height)
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
        cardFront2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isVisible2 = !isVisible2;
                cardFront2.setVisible(isVisible2);
                cardBack2.setVisible(!isVisible2);
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
            cardFront = new CardFront("가나","아프리카","GH","아크라","영어",new Flag());
            cardFront.setBounds(60,100,250,400);
            getContentPane().add(cardFront);

            cardBack = new CardBack();
            cardBack.setBounds(60,100,250,400);
            getContentPane().add(cardBack);

            // 두번째 카드
            cardFront2 = new CardFront("가나","아프리카","GH","아크라","영어",new Flag());
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

        setNewCard("OO","OO","OO","OO","OO","OO","OO","OO","OO", "OO", new Flag());

    }

    public void setNewCard(String countryName, String continent, String countryCode, String capital, String language, String climate, String city, String religion, String ethnic, String area, Flag flag) throws IOException {
        getContentPane().remove(cardFront2);
        getContentPane().remove(cardBack2);
        // 두번째 카드
        cardFront2 = new CardFront(countryName,continent,countryCode,capital,language,flag);
        cardFront2.setBounds(350, 100, 250, 400);
        getContentPane().add(cardFront2);

        cardBack2 = new CardBack(climate,continent,city,religion,ethnic,area);
        cardBack2.setBounds(350, 100, 250, 400);
        getContentPane().add(cardBack2);

        cardFront2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isVisible2 = !isVisible2;
                cardFront2.setVisible(isVisible2);
                cardBack2.setVisible(!isVisible2);
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
