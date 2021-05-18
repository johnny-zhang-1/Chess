package chess;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyPanel extends JPanel{

    private BufferedImage img;
    public static String currentDir = System.getProperty("user.dir");

    public MyPanel(){
        try {
            img = ImageIO.read(new File(currentDir + "/assets/board.jpg" ));
        } catch(IOException e) {
            e.printStackTrace();
        }

    }    

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }

}
