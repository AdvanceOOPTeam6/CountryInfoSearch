package GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Icon extends JPanel{
    private URL url;
    private Image image;


    public Icon(String url) throws IOException {
        this.url = new URL("file://" + url);
        image = ImageIO.read(this.url);
        ImageIcon icon = new ImageIcon(image);
        Image toResize = icon.getImage();
        Image updateImg = toResize.getScaledInstance(512,512,Image.SCALE_SMOOTH);

        ImageIcon updateIcon = new ImageIcon(updateImg);

        JLabel label = new JLabel(updateIcon);
        label.setHorizontalAlignment(JLabel.CENTER);
        add(label);
    }

}
