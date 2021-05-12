

import javax.imageio.ImageIO;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PieceIMG {
	
	private Image piece;
//	private int x = 0;
//	private int y = 0;
	private int w;
	private int h;
	private boolean visible;
	
	public BufferedImage image;
	
	public PieceIMG(Image img) {
		piece = img;	
		w = img.getWidth(null);
		h = img.getHeight(null);
	}
	
	public PieceIMG(String imagePath) {

	    try
	    {               
	      image = ImageIO.read(new File(MyPanel.currentDir + "/assets/" + imagePath));
	    }
	    catch (IOException e)
	    {
	    	e.printStackTrace();
	    }
	}	
//	public void setLocation(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//	public void toggleVisible() {
//		visible = !visible;
//	}
	public void draw(Graphics g, int x, int y) {
	//	g.drawImage(piece, x, y, w, h, null);
		g.drawImage(image, x, y, image.getWidth(), image.getHeight(), null);
	}
}