package GUI;

import javax.swing.*;

public class Frame extends JFrame {
    private JButton randomBtn;

    private CardFront cardFront;
    private CardBack cardBack;
    private FlagCard[] flagCard;


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
        cardFront = new CardFront();
        cardFront.setBounds(61,117,188,336);
        getContentPane().add(cardFront);

        cardBack = new CardBack();
        cardBack.setBounds(280, 117, 188, 336);
        getContentPane().add(cardBack);

        flagCard = new FlagCard[9];
        for(int i=0 ; i<9 ; i++){
            flagCard[i] = new FlagCard();
        }

        flagCard[0].setBounds(513,117,145,89);
        flagCard[1].setBounds(668,117,145,89);
        flagCard[2].setBounds(823,117,145,89);
        flagCard[3].setBounds(513,364,145,89);
        flagCard[4].setBounds(668,364,145,89);
        flagCard[5].setBounds(823,364,145,89);
        flagCard[6].setBounds(513,240,145,89);
        flagCard[7].setBounds(668,240,145,89);
        flagCard[8].setBounds(823,240,145,89);
        for(int i=0 ; i<9 ; i++){
            getContentPane().add(flagCard[i]);
        }

        randomBtn = new JButton("Random");
        randomBtn.setBounds(410,484,205,42);
        getContentPane().add(randomBtn);

    }
}
