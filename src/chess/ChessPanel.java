package chess;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.util.*;

import javax.swing.*;
public class ChessPanel extends MyPanel implements MouseListener{
//array
//gInput[] array = new gInput[32]; 
	
	int currX;
	int currY;

	HashMap<String, Piece> hmap = new HashMap<String, Piece>();
	Map<String, Piece> whitePieces = new HashMap<String, Piece>();
	Map<String, Piece> blackPieces = new HashMap<String, Piece>();
	
	Board board;

	//images
//	private Image blackpawnIMG = (new ImageIcon("blackpawn.png")).getImage();
//	private Image blackqueenIMG = (new ImageIcon("blackqueen.png")).getImage();
//	private Image blackbishopIMG = (new ImageIcon("blackbishop.png")).getImage();
//	private Image blackrookIMG = (new ImageIcon("blackrook.png")).getImage();
//	private Image blackknightIMG = (new ImageIcon("blackknight.png")).getImage();
//	private Image blackkingIMG = (new ImageIcon("blackking.png")).getImage();
//	private Image whitepawnIMG = (new ImageIcon("whitepawn.png")).getImage();
//	private Image whitequeenIMG = (new ImageIcon("whitequeen.png")).getImage();
//	private Image whitebishopIMG = (new ImageIcon("whitebishop.png")).getImage();
//	private Image whiterookIMG = (new ImageIcon("whiterook.png")).getImage();
//	private Image whiteknightIMG = (new ImageIcon("whiteknight.png")).getImage();
//	private Image whitekingIMG = (new ImageIcon("whiteking.png")).getImage();
//	private Image boardIMG = (new ImageIcon("board.jpg")).getImage();
	
//	private Image blackpawnIMG = (new ImageIcon("bp.png")).getImage();
//	private Image blackqueenIMG = (new ImageIcon("bq.png")).getImage();
//	private Image blackbishopIMG = (new ImageIcon("bb.png")).getImage();
//	private Image blackrookIMG = (new ImageIcon("br.png")).getImage();
//	private Image blackknightIMG = (new ImageIcon("bn.png")).getImage();
//	private Image blackkingIMG = (new ImageIcon("bk.png")).getImage();
//	private Image whitepawnIMG = (new ImageIcon("wp.png")).getImage();
//	private Image whitequeenIMG = (new ImageIcon("wq.png")).getImage();
//	private Image whitebishopIMG = (new ImageIcon("wb.png")).getImage();
//	private Image whiterookIMG = (new ImageIcon("wr.png")).getImage();
//	private Image whiteknightIMG = (new ImageIcon("wn.png")).getImage();
//	private Image whitekingIMG = (new ImageIcon("wk.png")).getImage();
	//private Image boardIMG = (new ImageIcon("board.jpg")).getImage();
	
	//Pieceimgs (idk why i have these, maybe if i want to add something into PieceIMG)
	
//	private PieceIMG blackpawn = new PieceIMG(blackpawnIMG);
//	private PieceIMG blackqueen = new PieceIMG(blackqueenIMG);
//	private PieceIMG blackbishop = new PieceIMG(blackbishopIMG);
//	private PieceIMG blackrook = new PieceIMG(blackrookIMG);
//	private PieceIMG blackknight = new PieceIMG(blackknightIMG);
//	private PieceIMG blackking = new PieceIMG(blackkingIMG);
//	private PieceIMG whitepawn = new PieceIMG(whitepawnIMG);
//	private PieceIMG whitequeen = new PieceIMG(whitequeenIMG);
//	private PieceIMG whitebishop = new PieceIMG(whitebishopIMG);
//	private PieceIMG whiterook = new PieceIMG(whiterookIMG);
//	private PieceIMG whiteknight = new PieceIMG(whiteknightIMG);
//	private PieceIMG whiteking = new PieceIMG(whitekingIMG);
//	private PieceIMG boardPiece = new PieceIMG(boardIMG);   


	private PieceIMG blackpawn = new PieceIMG("blackpawn.png");
	private PieceIMG blackqueen = new PieceIMG("blackqueen.png");
	private PieceIMG blackbishop = new PieceIMG("blackbishop.png");
	private PieceIMG blackrook = new PieceIMG("blackrook.png");
	private PieceIMG blackknight = new PieceIMG("blackknight.png");
	private PieceIMG blackking = new PieceIMG("blackking.png");
	private PieceIMG whitepawn = new PieceIMG("whitepawn.png");
	private PieceIMG whitequeen = new PieceIMG("whitequeen.png");
	private PieceIMG whitebishop = new PieceIMG("whitebishop.png");
	private PieceIMG whiterook = new PieceIMG("whiterook.png");
	private PieceIMG whiteknight = new PieceIMG("whiteknight.png");
	private PieceIMG whiteking = new PieceIMG("whiteking.png");
//	private PieceIMG boardPiece = new PieceIMG("board.jpg");

	public ChessPanel(HashMap<String, Piece> h) {

		super();
		hmap = h;
		
		Image boardImg = (new ImageIcon("")).getImage();
	//	BoardIMG board = new BoardIMG(boardImg);
		this.setVisible(true);
//		for (int i = 0; i < 32; i++) {
//			array[i] = new gInput("e", "e", true);
//		}
		
		this.addMouseListener(this);
	}

	public ChessPanel(HashMap<String, Piece> h, Board board) {
		this(h);
		this.board = board;
	}
//	public void move(String PieceType, String location) {
//		int new_x;
//		int new_y;
//		char temp = location.charAt(0);
//		new_x = ((int)(temp)-'a')*100;
//		new_y = (int)(location.charAt(1)-'1')*100;
//		
//		if (PieceType == "bk1") {
//			//black knight 1 (meaning left side) 2 means right side
//		}
//		//after changed x, y coords of a Piece, clear screen and repaint (???)
//	}
//  archived	
//	public void updateArray(gInput[] array) {
//		this.array = array;
//	}


	public void updateHMap(HashMap<String, Piece> h) {
		hmap = h;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

	//	System.out.println(Integer.toString(blackpawnIMG.getHeight(null)) + "x" + Integer.toString(blackpawnIMG.getWidth(null)));
//
	//	System.out.println(Integer.toString(boardIMG.getHeight(null)) + "x" + Integer.toString(boardIMG.getWidth(null)));
		//redraw everything with new coords (get input as )
	//	boardPiece.draw(g, 0 , 0);
		
	//	g.drawImage((new ImageIcon("wk.png")).getImage(), 0 , 0, 800,800, this);
		
		for (Map.Entry me : hmap.entrySet()) {
			Piece bob = (Piece) me.getValue();
			String Piecename = (bob.getColor()) + "" + (bob.getType());
			
			String chessLoc = (String) me.getKey();
			System.out.println(Piecename + "  " + chessLoc);
			int new_x = (int)(chessLoc.charAt(0)-'a')*100;
			int new_y = (7-(int)(chessLoc.charAt(1)-'1'))*95;
			System.out.println(chessLoc.charAt(1)-'1');
			if (Piecename.equals("bp")) {
				System.out.println("painting blackpawn");
				blackpawn.draw(g, new_x, new_y);

			}
			else if (Piecename.equals("bq")) {			
				blackqueen.draw(g, new_x, new_y);

			}
			else if (Piecename.equals("bb")) {
				blackbishop.draw(g, new_x, new_y);
			}
			else if (Piecename.equals("br")) {
				blackrook.draw(g, new_x, new_y);
			
			}
			else if (Piecename.equals("bn")) {
				blackknight.draw(g, new_x, new_y);
			
			}
			else if (Piecename.equals("bk")) {
				blackking.draw(g, new_x, new_y);
			
			}
			else if (Piecename.equals("wp")) {
				whitepawn.draw(g, new_x, new_y);
			
			}
			else if (Piecename.equals("wq")) {
				whitequeen.draw(g, new_x, new_y);
			
			}
			else if (Piecename.equals("wb")) {
				whitebishop.draw(g, new_x, new_y);
			
			}
			else if (Piecename.equals("wr")) {
				whiterook.draw(g, new_x, new_y);
		
			}
			else if (Piecename.equals("wn")) {
				whiteknight.draw(g, new_x, new_y);

			}
			else if (Piecename.equals("wk")) {
				whiteking.draw(g, new_x, new_y);

					
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
        currX = e.getX();
        currY = e.getY();
        
        char firstL = (char)('a' + currX/100);
        int secondL = (8-currY/100);
        System.out.println("Click Current position " + firstL + secondL);
        String loc = String.valueOf(firstL) + String.valueOf(secondL);
        
        if(hmap.containsKey(loc)) {
        		
        		Piece p = (Piece)hmap.get(loc);
        		System.out.println("Occupied by Color=" + p.getColor() + " type=" + p.getType());
        		board.setFromTextField(p.getColor(),p.getType(), loc);
        }

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
     /*   currX = e.getX();
        currY = e.getY();
        
        char firstL = (char)('a' + currX/100);
        int secondL = (currY/100 + 1);
        System.out.println("Pressed Current position " + firstL + secondL);
        String loc = String.valueOf(firstL) + String.valueOf(secondL);
        
        if(hmap.containsKey(loc)) {
	    		Piece p = (Piece)hmap.get(loc);
	    		System.out.println("Occupied by Color=" + p.getColor() + " type=" + p.getType());
	    		board.setFromTextField(p.getColor(),p.getType(), loc);
        }*/
      //  repaint(); 
      /*  Square sq = (Square) this.getComponentAt(new Point(e.getX(), e.getY()));

        if (sq.isOccupied()) {
            currPiece = sq.getOccupyingPiece();
            if (currPiece.getColor() == 0 && whiteTurn)
                return;
            if (currPiece.getColor() == 1 && !whiteTurn)
                return;
            sq.setDisplay(false);
        }
        repaint();*/
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
