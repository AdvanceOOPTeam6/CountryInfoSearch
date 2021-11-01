package GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Icon{
    private Image image;
    private ImageIcon updateIcon;


    public Icon(String url) throws IOException {
        image = ImageIO.read(new URL("file://" + url));
        ImageIcon imageicon = new ImageIcon(image);
        Image toResize = imageicon.getImage();
        Image updateImg = toResize.getScaledInstance(40,40,Image.SCALE_SMOOTH);

        updateIcon = new ImageIcon(updateImg);

    }

    public ImageIcon getUpdateIcon() {
        return updateIcon;
    }
}
