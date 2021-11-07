package GUI;

import javax.swing.*;
import java.awt.*;

public class Graph extends JPanel {
    JLabel religion1;
    JLabel religion2;
    JLabel religion3;

    JLabel religion1_graph;
    JLabel religion2_graph;
    JLabel religion3_graph;

    public Graph(){
        setLayout(null);
        setBackground(Color.white);
        this.religion1 = new JLabel("개신교");
        this.religion1.setBounds(5,5,50,15);
        this.religion1.setFont(new Font("Monaco", Font.BOLD, 15));
        add(this.religion1);

        this.religion1_graph = new JLabel();
        this.religion1_graph.setBounds(55,5,100, 15 );
        this.religion1_graph.setOpaque(true);
        this.religion1_graph.setBackground(Color.GRAY);
        add(this.religion1_graph);

        this.religion2 = new JLabel("불교");
        this.religion2.setBounds(5,25,50,15);
        this.religion2.setFont(new Font("Monaco", Font.BOLD, 15));
        add(this.religion2);

        this.religion2_graph = new JLabel();
        this.religion2_graph.setBounds(55,25,150, 15 );
        this.religion2_graph.setOpaque(true);
        this.religion2_graph.setBackground(Color.GRAY);
        add(this.religion2_graph);

        this.religion3 = new JLabel("힌두교");
        this.religion3.setBounds(5,45,50,15);
        this.religion3.setFont(new Font("Monaco", Font.BOLD, 15));
        add(this.religion3);

        this.religion3_graph = new JLabel();
        this.religion3_graph.setBounds(55,45,180, 15 );
        this.religion3_graph.setOpaque(true);
        this.religion3_graph.setBackground(Color.GRAY);
        add(this.religion3_graph);
    }
}
