package db;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLEncoder;

import javax.swing.ImageIcon;

public class GoogleAPI {
    private String serviceKey = "AIzaSyDMMCfQgLnLEM-s_ZkXnB56cs7Z1QQOguc";
    public void downloadMap(String location) {
        try {
            String imageURL = "https://maps.googleapis.com/maps/api/staticmap?center=서울" +
                    "&zoom=1&size=500x300&maptype=roadmap&markers=color:blue%7C"+URLEncoder.encode(location, "UTF-8")+"&key="+serviceKey;
            URL url = new URL(imageURL);
            InputStream is = url.openStream();
            OutputStream os = new FileOutputStream(location);
            byte[] b = new byte[2048];
            int length;
            while((length = is.read(b)) != -1) {
                os.write(b,0,length);
            }
            is.close();
            os.close();

        }catch(Exception e) {
            e.printStackTrace();
        }

    }

    public ImageIcon getMap(String location) {
        return new ImageIcon((new ImageIcon(location)).getImage().getScaledInstance(500, 300, java.awt.Image.SCALE_SMOOTH));
    }

    public void fileDelete(String filename) {
        File f = new File(filename);
        f.delete();
    }

}