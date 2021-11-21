package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu implements ActionListener { // 메뉴아이템 처리 Action 리스너
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand(); // 사용자가 선택한 메뉴아이템의 문자열 리턴
        switch(cmd) { // 메뉴 아이템의 종류 구분
            case "불러오기" :
                System.out.println("asdfasd");
                break;
            case "숨기기" :
                break;
            case "다시보기" :
                break;
            case "닫기" :
                System.exit(0);
                break;
        }
    }
}