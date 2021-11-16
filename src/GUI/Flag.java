package GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Flag extends JPanel {


    URL url;
    Image image;
    public Flag() throws IOException {
         url = new URL("https://opendata.mofa.go.kr:8444/fileDownload/images/country_images/flags/15/20201125_211109671.gif");
         image = ImageIO.read(url);
         ImageIcon icon = new ImageIcon(image);
         Image toResize = icon.getImage();
         Image updateImg = toResize.getScaledInstance(250,130, Image.SCALE_SMOOTH);

         ImageIcon updateIcon = new ImageIcon(updateImg);



         JLabel label = new JLabel(updateIcon);
         label.setHorizontalAlignment(JLabel.CENTER);
         add(label);
    }

    public Flag(int width, int height, String url) throws IOException {
        this.url = new URL(url);
        image = ImageIO.read(this.url);
        ImageIcon icon = new ImageIcon(image);
        Image toResize = icon.getImage();
        Image updateImg = toResize.getScaledInstance(width,height, Image.SCALE_SMOOTH);

        ImageIcon updateIcon = new ImageIcon(updateImg);



        JLabel label = new JLabel(updateIcon);
        label.setHorizontalAlignment(JLabel.CENTER);
        add(label);
    }
    public Flag(int width, int height) throws IOException {
        url = new URL("https://opendata.mofa.go.kr:8444/fileDownload/images/country_images/flags/15/20201125_211109671.gif");
        image = ImageIO.read(url);
        ImageIcon icon = new ImageIcon(image);
        Image toResize = icon.getImage();
        Image updateImg = toResize.getScaledInstance(width,height, Image.SCALE_SMOOTH);

        ImageIcon updateIcon = new ImageIcon(updateImg);



        JLabel label = new JLabel(updateIcon);
        label.setHorizontalAlignment(JLabel.CENTER);
        add(label);
    }
}
