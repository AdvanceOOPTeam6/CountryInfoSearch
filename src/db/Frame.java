package db;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    private CardFront cardFront;
    private CardBack cardBack;
    private FlagPane[] flagPane;
    private ChartPane chartPane;

    public Frame(){
        cardFront = new CardFront();
        getContentPane().add(cardFront);

        cardBack = new CardBack();
        getContentPane().add(cardBack);

        chartPane = new ChartPane();
        getContentPane().add(chartPane);




        setVisible(true);
        setResizable(false);
        setTitle("나라사랑카드"); // 타이틀
        setSize(1000,600); // 1000 x 600 px
        setLocationRelativeTo(null);
        setBackground(Color.white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
