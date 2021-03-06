package GUI;

import javax.swing.*;
import java.io.IOException;

public class Help extends JDialog{
    public Help() throws IOException {
        // 타이틀

        setSize(820, 650);
        setVisible(true);
        setModal(true);
        setResizable(false);                    // 창 크기 변경 불가
        setLocationRelativeTo(null);            // 실행시 화면 가운데로 정렬
        Icon logo = new Icon("src/GUI/Icons/Logo.png");
        setIconImage(logo.getUpdateIcon().getImage());

        Icon project = new Icon("src/GUI/Icons/help.png", 800, 600);
        JLabel imgLabel = new JLabel(project.getUpdateIcon());
        imgLabel.setHorizontalAlignment(JLabel.CENTER);
        imgLabel.setBounds(0,0,800,600);
        add(imgLabel);

    }
}
