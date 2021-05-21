package chess;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.util.*;

import javax.swing.*;
public class ChessPanel extends MyPanel implements MouseListener{
	
	int currX;
	int currY;
	//create hashmap
	HashMap<String, Piece> hmap = new HashMap<String, Piece>();
	//old stuff
	Map<String, Piece> whitePieces = new HashMap<String, Piece>();
	Map<String, Piece> blackPieces = new HashMap<String, Piece>();

	//variables for special assets
	public boolean whiteMoving = true;
	public boolean whiteWin;
	public boolean blackWin;

	Board board;
	//create all the assets on the board with images
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
	
	private PieceIMG boardPiece = new PieceIMG("board.jpg");
	
	private PieceIMG wwinScreen = new PieceIMG("whitewin.jpg");
	private PieceIMG bwinScreen = new PieceIMG("blackwin.jpg");
	private PieceIMG blackTurn = new PieceIMG("blackturn.jpg");
	private PieceIMG whiteTurn = new PieceIMG("whiteturn.jpg");

	//constructor
	public ChessPanel(HashMap<String, Piece> h) {
		//MyPanel
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
	//send the hashmap to the current hashmap for rendering
	public void updateHMap(HashMap<String, Piece> h) {
		hmap = h;
	}
	//method to manually switch move
	public void switchMove() {
		whiteMoving = !whiteMoving;
	}
	//method to say white won
	public void whiteWon(){
		whiteWin = true;
	}
	//method to say black won
	public void blackWon() {
		blackWin = true;
	}
	//paintComponent will redo everything inside on the same window when repaint is run
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

	//	System.out.println(Integer.toString(blackpawnIMG.getHeight(null)) + "x" + Integer.toString(blackpawnIMG.getWidth(null)));
//
	//	System.out.println(Integer.toString(boardIMG.getHeight(null)) + "x" + Integer.toString(boardIMG.getWidth(null)));
		//redraw everything with new coords (get input as )
	//	boardPiece.draw(g, 0 , 0);
		
	//	g.drawImage((new ImageIcon("wk.png")).getImage(), 0 , 0, 800,800, this);

		//iterate through the hashmap and display all of the pieces
		
		boardPiece.draw(g, 0, 0);
		for (Map.Entry me : hmap.entrySet()) {
			Piece bob = (Piece) me.getValue();
			String Piecename = (bob.getColor()) + "" + (bob.getType());
			
			String chessLoc = (String) me.getKey();
			System.out.println(Piecename + "  " + chessLoc);
			int new_x = (int)(chessLoc.charAt(0)-'a')*100;
			int new_y = (7-(int)(chessLoc.charAt(1)-'1'))*100;
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
		//prints special assets (whiteMoving will display asset that shows which side is moving)
		if (whiteMoving) {
			whiteTurn.draw(g, 800, 700);
		} else {
			blackTurn.draw(g, 800, 0);
		}
		//if one side has won then will display win screen
		if (whiteWin) {
			wwinScreen.draw(g, 200, 300);
		}
		if (blackWin) {
			bwinScreen.draw(g, 200, 300);
		}

	}
	//mouseclicked will select a piece and send information to board if a move is made
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
