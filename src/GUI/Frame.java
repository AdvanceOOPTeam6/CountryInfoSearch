package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Frame extends JFrame {
    private CardFront cardFront;
    private CardBack cardBack;
    private FlagPane[] flagPane;
    private ChartPane chartPane;
    private Toolbar toolbar;
    private JButton btn;
    private FormPanel formPanel;

    public Frame(){
        super("나라카드조회");

        setLayout(new BorderLayout());

        btn = new JButton("Random");
        cardFront = new CardFront();
        toolbar = new Toolbar();
        formPanel = new FormPanel();

        toolbar.setStringListener(new StringListener(){

            @Override
            public void textEmitted(String text) {
                cardFront.appendText(text);
            }
        });

        add(formPanel,BorderLayout.WEST);
        add(cardFront, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);
        add(toolbar,BorderLayout.NORTH);

        btn.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent e) {
                cardFront.appendText("hello\n");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        setVisible(true);
        setResizable(false);
        setTitle("나라사랑카드"); // 타이틀
        setSize(1000,600); // 1000 x 600 px
        setLocationRelativeTo(null);
        setBackground(Color.white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
