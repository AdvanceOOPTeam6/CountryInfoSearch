package GUI;
import db.DAO;
import db.DTO;
import db.GoogleAPI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.Map.Entry;


public class Frame extends JFrame {

    private CardFront cardFront;
    private CardBack cardBack;
    private CardFront cardFront2;
    private CardBack cardBack2;
    private CountryListPane countryListPane;
    private JTextField textInputField;
    private JButton searchBtn;
    private JButton goBackBtn;
    private Intro intro;
    private GoogleAPI googleAPI = new GoogleAPI();
    private JLabel googleMap;

    private boolean isVisible1 = true;
    private boolean isVisible2 = true;

    public Frame() throws IOException {
        super("나라사랑카드");                // 타이틀
        Icon logo = new Icon("src/GUI/Icons/Logo.png");
        setIconImage(logo.getUpdateIcon().getImage());
        new SetData();                          // csv파일 받기
        getContentPane().setLayout(null);       // Absolute layout
        initComponent();
        createMenu();                           // 메뉴생성
        setVisible(true);
        setResizable(false);                    // 창 크기 변경 불가
        setSize(950, 920);          // 950(width) X 900(height)
        setLocationRelativeTo(null);            // 실행시 화면 가운데로 정렬
        setMap("가나");                          // 초기 세계지도 이미지 띄우기
        setDefaultCloseOperation(EXIT_ON_CLOSE);// 나가면 프로그램 종료

        cardFront.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isVisible1 = !isVisible1;
                cardFront.setVisible(isVisible1);
                cardBack.setVisible(!isVisible1);
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
        cardBack.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isVisible1 = !isVisible1;
                cardFront.setVisible(isVisible1);
                cardBack.setVisible(!isVisible1);
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
        searchBtn.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	String searchValue= textInputField.getText();
            	if(searchValue.isEmpty()) { //입력안됐을경우
            		JOptionPane.showMessageDialog(null, "나라를 입력해주세요", "알림 메시지", JOptionPane.INFORMATION_MESSAGE);
            	}
            	else {
            		HashMap<String, String> searchMap = new HashMap<String, String>();
                	DAO searchDAO = new DAO();
                    ArrayList<DTO> searchinit = searchDAO.searchDB("");
                    for(DTO tempDTO1 : searchinit) {
                        searchMap.put(tempDTO1.getCountry(),tempDTO1.getCountry());
                    }

                    countryListPane.setClear(); //list를 클리어
                    List<String> containValue = new ArrayList<>();
                    for (Entry<String,String> entry : searchMap.entrySet()) {
                        if(entry.getValue().contains(searchValue)) {
                            containValue.add(entry.getValue());
                            countryListPane.setSearch(containValue); //검색한값만 나오게
                        }
                    }
                    System.out.print(searchMap.get(searchValue));

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
        goBackBtn.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	 countryListPane.setBack(); //목록으로
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

    private void initComponent() throws IOException {
        try {
            // 첫번째 카드
            cardFront = new CardFront("한국","아시아","KR","서울","한국어",new Flag(250,130,"https://opendata.mofa.go.kr:8444/fileDownload/images/country_images/flags/241/20201125_220348799.gif"));
            cardFront.setBounds(60,50,250,400);
            getContentPane().add(cardFront);

            cardBack = new CardBack("한국","대륙성기후","아시아","서울,인천,부산","기독교","한민족","100188",new Flag(125,80,"https://opendata.mofa.go.kr:8444/fileDownload/images/country_images/flags/241/20201125_220348799.gif"));
            cardBack.setBounds(60,50,250,400);
            getContentPane().add(cardBack);

        } catch (IOException e) {
            e.printStackTrace();
        }

        countryListPane = new CountryListPane(this);
        countryListPane.setBounds(640,50,250,750);
        getContentPane().add(countryListPane);

        textInputField = new JTextField();
        textInputField.setBounds(640, 20, 190, 26);
        getContentPane().add(textInputField);
        
        searchBtn= new JButton("검색");
        searchBtn.setBounds(830, 20, 60, 25);
        getContentPane().add(searchBtn);
        
        goBackBtn= new JButton("초기화");
        goBackBtn.setBounds(640, 800, 250, 25);
        getContentPane().add(goBackBtn);
        
        setNewCard("가나","아프리카","GH","아크라","영어","열대성","쿠마시(Kumasi)","기독교(71%)","아칸족", "227540", "https://opendata.mofa.go.kr:8444/fileDownload/images/country_images/flags/15/20201125_211109671.gif");

        googleMap = new JLabel();
        googleMap.setBounds(70, 500, 800, 300);
        getContentPane().add(googleMap);
    }

    public void setNewCard(String countryName, String continent, String countryCode, String capital, String language, String climate, String city, String religion, String ethnic, String area, String flagUrl) throws IOException {
        isVisible2 = true;

        if(cardFront != null && cardBack2 != null) {
            getContentPane().remove(cardFront2);
            getContentPane().remove(cardBack2);
        }
//         두번째 카드
        cardFront2 = new CardFront(countryName,continent,countryCode,capital,language,new Flag(250,130,flagUrl));
        cardFront2.setBounds(350, 50, 250, 400);
        getContentPane().add(cardFront2);

        cardBack2 = new CardBack(countryName ,climate,continent,city,religion,ethnic,area,new Flag(125,80,flagUrl));
        cardBack2.setBounds(350, 50, 250, 400);
        getContentPane().add(cardBack2);

        cardFront2.setVisible(isVisible2);
        cardBack2.setVisible(isVisible2);
        cardFront2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isVisible2 = !isVisible2;
                cardFront2.setVisible(isVisible2);
                cardBack2.setVisible(!isVisible2);
                System.out.println("Front is clicked");
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
        cardBack2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isVisible2 = !isVisible2;
                cardFront2.setVisible(isVisible2);
                cardBack2.setVisible(!isVisible2);
                System.out.println("Back is clicked");
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

    private void createMenu() {
        JMenuBar mb = new JMenuBar(); // 메뉴바 생성
        JMenu screenMenu = new JMenu("파일");
        JMenuItem[] menuItem = new JMenuItem[2];
        String[] itemTitle = {"CSV 파일 불러오기", "프로그램 종료"};

        JMenu screenMenu2 = new JMenu("기능");
        JMenuItem[] menuItem2 = new JMenuItem[5];
        String[] itemTitle2 = {"나라 검색", "나라 리스트 초기화", "카드 앞면 보기", "카드 뒷면 보기","세계 지도 보기"};

        JMenu screenMenu3 = new JMenu("정보");
        JMenuItem[] menuItem3 = new JMenuItem[2];
        String[] itemTitle3 = {"프로젝트", "도움말"};


        Menu listener = new Menu(); // Action 리스너 생성
        for (int i = 0; i < menuItem.length; i++) {
            menuItem[i] = new JMenuItem(itemTitle[i]); // 메뉴아이템 생성
            menuItem[i].addActionListener(listener); // 메뉴아이템에 Action 리스너 등록
            screenMenu.add(menuItem[i]); // 메뉴아이템을 Screen 메뉴에 삽입
        }

        for (int i = 0; i < menuItem2.length; i++) {
            menuItem2[i] = new JMenuItem(itemTitle2[i]); // 메뉴아이템 생성
            menuItem2[i].addActionListener(listener); // 메뉴아이템에 Action 리스너 등록
            screenMenu2.add(menuItem2[i]); // 메뉴아이템을 Screen 메뉴에 삽입
        }

        for (int i = 0; i < menuItem3.length; i++) {
            menuItem2[i] = new JMenuItem(itemTitle3[i]); // 메뉴아이템 생성
            menuItem2[i].addActionListener(listener); // 메뉴아이템에 Action 리스너 등록
            screenMenu3.add(menuItem2[i]); // 메뉴아이템을 Screen 메뉴에 삽입
        }


        mb.add(screenMenu);  // 메뉴바에 메뉴 삽입
        mb.add(screenMenu2); // 보기 메뉴 삽입
        mb.add(screenMenu3); // 정보 메뉴 삽입


        // 메뉴바를 프레임에 부착
        setJMenuBar(mb);
    }

    class Menu implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand(); // 사용자가 선택한 메뉴아이템의 문자열 리턴
            System.out.println(cmd);
            switch(cmd) {
                // 메뉴 아이템의 종류 구분
                case "CSV 파일 불러오기" :
                    new SetData();
                    break;
                case "프로그램 종료" :
                    System.exit(0);
                    break;
                case "나라 검색" :
                    String id = JOptionPane.showInputDialog(null, "검색할 나라를 입력해주세요", "나라이름 검색", JOptionPane.OK_CANCEL_OPTION);
                    if(id != null){
                        HashMap<String, String> searchMap = new HashMap<String, String>();
                        DAO searchDAO = new DAO();
                        ArrayList<DTO> searchinit = searchDAO.searchDB("");
                        for(DTO tempDTO1 : searchinit) {
                            searchMap.put(tempDTO1.getCountry(),tempDTO1.getCountry());
                        }

                        List<String> containValue = new ArrayList<>();
                        for (Entry<String,String> entry : searchMap.entrySet()) {
                            if(entry.getValue().contains(id)) {
                                containValue.add(entry.getValue());
                                countryListPane.setSearch(containValue); //검색한값만 나오게
                            }
                        }
                    }
                    break;
                case "나라 리스트 초기화" :
                    countryListPane.setBack();
                    break;
                case "카드 앞면 보기":
                    isVisible1 = true;
                    cardFront.setVisible(isVisible1);
                    cardBack.setVisible(!isVisible1);

                    isVisible2 = true;
                    cardFront2.setVisible(isVisible2);
                    cardBack2.setVisible(!isVisible2);
                    break;
                case "카드 뒷면 보기":
                    isVisible1 = false;
                    cardFront.setVisible(isVisible1);
                    cardBack.setVisible(!isVisible1);

                    isVisible2 = false;
                    cardFront2.setVisible(isVisible2);
                    cardBack2.setVisible(!isVisible2);
                    break;
                case "세계 지도 보기":
                    String id2 = JOptionPane.showInputDialog(null, "검색할 나라를 입력해주세요", "세계지도 검색", JOptionPane.OK_CANCEL_OPTION);
                    if(id2 != null){
                        setMap(id2);
                    }
                    break;
                case "프로젝트":
                    try {
                        new Project();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                        System.out.println(ex);
                    }
                    break;
                case "도움말":
                    try {
                        new Help();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    break;
            }

        }
    }

    // 세계지도 그리기
    public void setMap(String location) {
        googleAPI.downloadMap(location);
        googleMap.setIcon(googleAPI.getMap(location));
        googleAPI.fileDelete(location);
        googleMap.setBounds(60,500,540,300);
        getContentPane().add(googleMap);
    }
}
