package GUI;

import db.DAO;
import db.DBConnect;
import db.DTO;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SetData extends JFrame{
    public SetData(){

        FileDialog csvFile = new FileDialog(this, "test",FileDialog.LOAD);
        csvFile.setDirectory(".");
        csvFile.setVisible(true);

        // csvFile이 비정상 종료시
        if(csvFile.getFile() == null) {
            return;
        }

        // csvFile 불러올 파일의 경로명 저장
        String cfName = csvFile.getDirectory() + csvFile.getFile();

        //파일 열기
        try {

            //확장자 체크
            if(!cfName.substring(cfName.lastIndexOf(".") + 1).equals("csv")) {
                throw new Exception("올바른 확장자가 아닙니다.");
            }

            //csv 파일을 UFT-8형식으로 가져옴
            BufferedReader reader = null;
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(cfName),"UTF-8"));
            String line = "";

            DAO dao = new DAO();

            boolean i = true;

            while ((line = reader.readLine()) != null) {
                String[] token = line.split(",");
                List<String> tempList = new ArrayList<String>(Arrays.asList(token));
                //맨 윗줄 삭제
                if (i) {
                    i = false;
                    dao.deleteData();
                    continue;
                }
                DTO data = new DTO(
                        tempList.get(0),
                        tempList.get(1),
                        tempList.get(2),
                        tempList.get(3),
                        tempList.get(4),
                        tempList.get(5),
                        tempList.get(6),
                        tempList.get(7),
                        tempList.get(8),
                        Integer.valueOf(tempList.get(9)),
                        tempList.get(10),
                        tempList.get(11),
                        tempList.get(12),
                        Integer.valueOf(tempList.get(13))
                        );
                dao.insertData(data);
            }

/*리스트 저장
            //csv 파일 정보를 저장할 리스트 선언
            java.util.List<java.util.List<String>> list = new ArrayList<java.util.List<String>>();

            //csv 파일 저장
            while ((line = reader.readLine()) != null) {
                String[] token = line.split(",");
                List<String> tempList = new ArrayList<String>(Arrays.asList(token));
                list.add(tempList);
            }

 */

        } catch (Exception e2) {
            JOptionPane.showMessageDialog(this,e2);
            System.out.println(e2);
            System.exit(0);
        }
    }
}
