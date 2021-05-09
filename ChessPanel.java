import java.awt.*;
import java.lang.*;
import java.util.*;

import javax.swing.*;
public class ChessPanel extends JPanel {
//array
//gInput[] array = new gInput[32]; 

HashMap<String, piece> hmap = new HashMap<String, piece>();
//images
private Image blackpawnIMG = (new ImageIcon("blackpawn.png")).getImage();
private Image blackqueenIMG = (new ImageIcon("blackqueen.png")).getImage();
private Image blackbishopIMG = (new ImageIcon("blackbishop.png")).getImage();
private Image blackrookIMG = (new ImageIcon("blackrook.png")).getImage();
private Image blackknightIMG = (new ImageIcon("blackknight.png")).getImage();
private Image blackkingIMG = (new ImageIcon("blackking.png")).getImage();
private Image whitepawnIMG = (new ImageIcon("whitepawn.png")).getImage();
private Image whitequeenIMG = (new ImageIcon("whitequeen.png")).getImage();
private Image whitebishopIMG = (new ImageIcon("whitebishop.png")).getImage();
private Image whiterookIMG = (new ImageIcon("whiterook.png")).getImage();
private Image whiteknightIMG = (new ImageIcon("whiteknight.png")).getImage();
private Image whitekingIMG = (new ImageIcon("whiteking.png")).getImage();
private Image boardIMG = (new ImageIcon("board.jpg")).getImage();
//pieceimgs (idk why i have these, maybe if i want to add something into PieceIMG)
private PieceIMG blackpawn = new PieceIMG(blackpawnIMG);
private PieceIMG blackqueen = new PieceIMG(blackqueenIMG);
private PieceIMG blackbishop = new PieceIMG(blackbishopIMG);
private PieceIMG blackrook = new PieceIMG(blackrookIMG);
private PieceIMG blackknight = new PieceIMG(blackknightIMG);
private PieceIMG blackking = new PieceIMG(blackkingIMG);
private PieceIMG whitepawn = new PieceIMG(whitepawnIMG);
private PieceIMG whitequeen = new PieceIMG(whitequeenIMG);
private PieceIMG whitebishop = new PieceIMG(whitebishopIMG);
private PieceIMG whiterook = new PieceIMG(whiterookIMG);
private PieceIMG whiteknight = new PieceIMG(whiteknightIMG);
private PieceIMG whiteking = new PieceIMG(whitekingIMG);
private PieceIMG boardpiece = new PieceIMG(boardIMG);
	public ChessPanel() {
		//JPanel
		
		super();
		Image boardImg = (new ImageIcon("")).getImage();
		BoardIMG board = new BoardIMG(boardImg);
		this.setVisible(true);
//		for (int i = 0; i < 32; i++) {
//			array[i] = new gInput("e", "e", true);
//		}

		
	}
//	public void move(String pieceType, String location) {
//		int new_x;
//		int new_y;
//		char temp = location.charAt(0);
//		new_x = ((int)(temp)-'a')*100;
//		new_y = (int)(location.charAt(1)-'1')*100;
//		
//		if (pieceType == "bk1") {
//			//black knight 1 (meaning left side) 2 means right side
//		}
//		//after changed x, y coords of a piece, clear screen and repaint (???)
//	}
//  archived	
//	public void updateArray(gInput[] array) {
//		this.array = array;
//	}
	
	public void updateHMap(HashMap<String, piece> h) {
		hmap = h;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		System.out.println(Integer.toString(blackpawnIMG.getHeight(null)) + "x" + Integer.toString(blackpawnIMG.getWidth(null)));

		System.out.println(Integer.toString(boardIMG.getHeight(null)) + "x" + Integer.toString(boardIMG.getWidth(null)));
		//redraw everything with new coords (get input as )
		boardpiece.draw(g, 0 , 0);
		for (Map.Entry me : hmap.entrySet()) {
			piece bob = (piece) me.getValue();
			String piecename = (bob.color) + "" + (bob.type);
			System.out.println(piecename);
			String chessLoc = (String) me.getKey();
			int new_x = (int)(chessLoc.charAt(0)-'a')*100;
			int new_y = (7-(int)(chessLoc.charAt(1)-'1'))*100;
			System.out.println(chessLoc.charAt(1)-'1');
			if (piecename.equals("bp")) {
				System.out.println("painting blackpawn");
				blackpawn.draw(g, new_x, new_y);

			}
			else if (piecename.equals("bq")) {			
				blackqueen.draw(g, new_x, new_y);

			}
			else if (piecename.equals("bb")) {
				blackbishop.draw(g, new_x, new_y);
			}
			else if (piecename.equals("br")) {
				blackrook.draw(g, new_x, new_y);
			
			}
			else if (piecename.equals("bn")) {
				blackknight.draw(g, new_x, new_y);
			
			}
			else if (piecename.equals("bk")) {
				blackking.draw(g, new_x, new_y);
			
			}
			else if (piecename.equals("wp")) {
				whitepawn.draw(g, new_x, new_y);
			
			}
			else if (piecename.equals("wq")) {
				whitequeen.draw(g, new_x, new_y);
			
			}
			else if (piecename.equals("wb")) {
				whitebishop.draw(g, new_x, new_y);
			
			}
			else if (piecename.equals("wr")) {
				whiterook.draw(g, new_x, new_y);
		
			}
			else if (piecename.equals("wn")) {
				whiteknight.draw(g, new_x, new_y);

			}
			else if (piecename.equals("wk")) {
				whiteking.draw(g, new_x, new_y);

					
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("got into main");
		//the size of the board will be 800 by 800 which a piece will be 100x100
		//pieces will be centered
		JFrame chessBoard = new JFrame("Chess Board");
		chessBoard.setBounds(0, 0, 816, 839);
		
		chessBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ChessPanel panel = new ChessPanel();		
		panel.setBounds(0, 0, 800, 800);
		chessBoard.add(panel);
		chessBoard.setVisible(true);
		chessBoard.repaint();
	}
}
