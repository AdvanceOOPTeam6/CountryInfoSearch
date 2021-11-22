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

    public Graph(String religion1){

        // 스트링 나누기
        String[] array = religion1.split("/");
        String[] intStr = new String[array.length];

        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
            intStr[i] = array[i].replaceAll("[^0-9]", "");
//            System.out.println(intStr[i]);
//            try {
//                System.out.println("변환 "+Integer.valueOf(intStr[i]));
//                intStr1[i] = Integer.valueOf(intStr[i]);
//            }catch (Exception e){
//                System.out.println("오류");
//            }
        }

        setLayout(null);
        setBackground(Color.white);

        // 그래프 옆 텍스트
        try{
            array[0] = array[0].substring(0,array[0].indexOf('('));
        }catch (Exception e){
            try {
                array[0] = array[0].substring(0,array[0].indexOf(' '));
            }catch (Exception e2){
                // 비어있음
            }
        }
        this.religion1 = new JLabel(array[0]);
        this.religion1.setBounds(5,5,100,15);
        this.religion1.setFont(new Font("Monaco", Font.BOLD, 15));
        add(this.religion1);

        // 그래프 부분
        this.religion1_graph = new JLabel();
        try {
            this.religion1_graph.setBounds(110,5,Integer.valueOf(intStr[0])+50, 15 );
        }catch (Exception e){
            this.religion1_graph.setBounds(110,5,0, 15 );
        }
        this.religion1_graph.setOpaque(true);
        this.religion1_graph.setBackground(Color.GRAY);
        add(this.religion1_graph);

        // 그래프 옆 텍스트
        try{
            array[1] = array[1].substring(0,array[1].indexOf('('));
        }catch (Exception e){
            try {
                array[1] = array[1].substring(0,array[1].indexOf(' '));
            }catch (Exception e2){
                // 비어있음
            }
        }
        try {
            this.religion2 = new JLabel(array[1]);
        }catch (Exception e){
            this.religion2 = new JLabel(" ");
        }
        this.religion2.setBounds(5,25,100,15);
        this.religion2.setFont(new Font("Monaco", Font.BOLD, 15));
        add(this.religion2);

        // 그래프 부분
        this.religion2_graph = new JLabel();
        try {
            this.religion2_graph.setBounds(110,25,Integer.valueOf(intStr[1])+50, 15 );
        }catch (Exception e){
            this.religion2_graph.setBounds(110,25,0, 15 );
        }
        this.religion2_graph.setOpaque(true);
        this.religion2_graph.setBackground(Color.GRAY);
        add(this.religion2_graph);

        // 그래프 옆 텍스트
        try{
            array[2] = array[2].substring(0,array[2].indexOf('('));
        }catch (Exception e){
            try {
                array[2] = array[2].substring(0,array[2].indexOf(' '));
            }catch (Exception e2){
                // 비어있음
            }
        }
        try {
            this.religion3 = new JLabel(array[2]);
        }catch (Exception e){
            this.religion3 = new JLabel(" ");
        }
        this.religion3.setBounds(5,45,100,15);
        this.religion3.setFont(new Font("Monaco", Font.BOLD, 15));
        add(this.religion3);

        // 그래프 부분
        this.religion3_graph = new JLabel();
        try {
            this.religion3_graph.setBounds(110,45,Integer.valueOf(intStr[2])+50, 15 );
        }catch (Exception e){
            this.religion3_graph.setBounds(110,45,0, 15 );
        }
        this.religion3_graph.setOpaque(true);
        this.religion3_graph.setBackground(Color.GRAY);
        add(this.religion3_graph);
    }
}
