import java.awt.*;
import java.lang.*;
import java.util.*;

import javax.swing.*;
public class ChessPanel extends JPanel {

piece[][]mat = new piece[9][9];

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

	public void updateMatrix(piece[][] m) {
		mat = m;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		boardpiece.draw(g, 0 , 0);
		for (int i = 1; i < 9; i++) {
			for (int j = 1; j < 9; j++) {
				piece bob = mat[i][j];
				
				if (bob == null) continue;
				System.out.println(bob.color + "" + bob.type);
				String piecename = (bob.color) + "" + (bob.type);		
				int new_y = (i-1)*100;
				int new_x = (j-1)*100;
				if (piecename.equals("bp")) {
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
