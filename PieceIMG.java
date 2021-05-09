import java.util.*;
import java.awt.*;
public class PieceIMG {
	private Image piece;
//	private int x = 0;
//	private int y = 0;
	private int w;
	private int h;
	private boolean visible;
	public PieceIMG(Image img) {
		piece = img;	
		w = img.getWidth(null);
		h = img.getHeight(null);
	}
//	public void setLocation(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//	public void toggleVisible() {
//		visible = !visible;
//	}
	public void draw(Graphics g, int x, int y) {
		g.drawImage(piece, x, y, w, h, null);
	}
}