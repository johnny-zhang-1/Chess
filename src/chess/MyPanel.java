package chess;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
    
    
    private BufferedImage img;
    
    //sets the correct directory to look for the image of the board
    public static String currentDir = System.getProperty("user.dir");

    //assigns the board image into the variable img
    public MyPanel(){
        try {
            img = ImageIO.read(new File(currentDir + "/assets/board.jpg" ));
        } catch(IOException e) {
            e.printStackTrace();
        }

    }    
    
    //draws out the chess board
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }

}
