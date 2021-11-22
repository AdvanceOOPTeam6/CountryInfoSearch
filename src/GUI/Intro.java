package GUI;
import javax.swing.*;

import GUI.Icon;

import java.awt.*;
import java.net.URL;
import javax.imageio.ImageIO;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

public class Intro extends JFrame{
	private JButton startBtn;
	private JLabel imgLabel;
	public Intro() throws IOException{
		super("나라사랑카드");                // 타이틀
		setLayout(null);
		setSize(1000, 600);
		setVisible(true);
		setResizable(false);                    // 창 크기 변경 불가
        setSize(1000, 600);         // 1000(width) X 600(height)
        setLocationRelativeTo(null);            // 실행시 화면 가운데로 정렬
        setDefaultCloseOperation(EXIT_ON_CLOSE);// 나가면 프로그램 종료
		//ImageIcon img= new ImageIcon(Intro.class.getResource("/image/korea1.png"));
		//imgLabel.setIcon(img);
		//imgLabel.setBounds(0,0,1000,500);
		//add(imgLabel);
        Icon icon_code = new Icon("src/GUI/Icons/location-g200a31666_1280.png",1000,600);
        imgLabel = new JLabel(icon_code.getUpdateIcon());
        imgLabel.setHorizontalAlignment(JLabel.CENTER);
        imgLabel.setBounds(0, 0, 1000, 600);
        add(imgLabel);
		 startBtn= new JButton("시작");
		 startBtn.setFont(new Font("HY엽서M", Font.BOLD, 20));
		 startBtn.setBackground(Color.white);
		 startBtn.setBounds(450,500,100,30);
		 add(startBtn);
		 startBtn.addMouseListener(new MouseListener() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                try {
						new Frame();
						setVisible(false);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
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
