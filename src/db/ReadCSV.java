package db;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadCSV  {
    public static List<List<String>> listCSV = new ArrayList<List<String>>();

    public static void LoadFile(String locationFilePath){
        //반환용 리스트
        List<List<String>> ret = new ArrayList<List<String>>();
        BufferedReader br = null;

        try{
            br = Files.newBufferedReader(Paths.get("C:\\Users\\H\\Desktop\\csv2.csv"));
            //Charset.forName("UTF-8");
            String line = "";
            System.out.println(br);

            while((line = br.readLine()) != null){
                //CSV 1행을 저장하는 리스트
                List<String> tmpList = new ArrayList<String>();
                String array[] = line.split(",");
                //배열에서 리스트 반환
                tmpList = Arrays.asList(array);
                //System.out.println(tmpList.get(1));
                //System.out.println(tmpList);
                ret.add(tmpList);
                listCSV.add(tmpList);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(br != null){
                    br.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        for(int i = 1; i<listCSV.size(); i++)
        System.out.println(listCSV.get(i).get(9));


    }


}
