package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CardFront extends JPanel {
    private JTextArea textArea;

    CardFront(){
        textArea = new JTextArea();
        setLayout(new BorderLayout());

        add(new JScrollPane(textArea),BorderLayout.CENTER);

    }

    public void appendText(String text){
        textArea.append(text);
    }

}
