package db;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class CountryFlagAPI {

    public String CountryFlag(String code) throws IOException{
        String flagcode = code;

        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1262000/CountryFlagService2/getCountryFlagList2"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=WbB5cwZvKLInWD4JmJjDBvuuInA6%2B7ufo7RHGngZH7%2BUEAaSVc4x5UsvdFIx4NPg%2BMPlSUvet1IBhzr6Ly6Diw%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("returnType","UTF-8") + "=" + URLEncoder.encode("JSON", "UTF-8")); /*XML 또는 JSON*/
        urlBuilder.append("&" + URLEncoder.encode("cond[country_iso_alp2::EQ]","UTF-8") + "=" + URLEncoder.encode(flagcode, "UTF-8")); /*ISO 2자리코드*/
        URL url = new URL(urlBuilder.toString());

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        //System.out.println(sb.toString());

        String jsondata = sb.toString();
        //System.out.println(jsondata);

        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonArray = null;
            jsonArray = (JSONObject)parser.parse(jsondata);

            JSONArray array = (JSONArray) jsonArray.get("data");
            for(int i=0; i<array.size(); i++) {
                JSONObject result = (JSONObject) array.get(i);
                System.out.println(result.get("download_url"));
                flagcode = (String) result.get("download_url");
            }

        } catch (ParseException e) {
            System.out.println("변환에 실패");
            e.printStackTrace();
            flagcode = "error";
        }
        return flagcode;
    }
}