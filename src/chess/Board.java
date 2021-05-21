package chess;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Board{
	
	//Map<String, Piece> whitePieces = new HashMap<String, Piece>();
	HashMap<String, Piece> pieces = new HashMap<String, Piece>();

	public String movedFrom;
	public String movedTo;
	
	String oldLoc;
	boolean refreshReq = false;
	
	JLabel fromLabel = new JLabel("You Select:");
	JLabel toLabel = new JLabel("Next Move");
	
	//JTextField fromField = new JTextField("Current");
	JTextField toField = new JTextField("Next");
	ChessPanel panel;
	
	public matBoard matB = new matBoard(pieces);
	
	char turn = 'w';

	private void setup() {
		
		pieces.clear();
		pieces.put("a8", new Rook('r', 'b'));
		pieces.put("b8", new Knight('n', 'b'));
		pieces.put("c8", new Bishop('b', 'b'));
		pieces.put("d8", new Queen('q', 'b'));
		pieces.put("e8", new King('k', 'b'));
		pieces.put("f8", new Bishop('b', 'b'));
		pieces.put("g8", new Knight('n', 'b'));
		pieces.put("h8", new Rook('r', 'b'));
		
		pieces.put("a7", new Pawn('p', 'b'));
		pieces.put("b7", new Pawn('p', 'b'));
		pieces.put("c7", new Pawn('p', 'b'));
		pieces.put("d7", new Pawn('p', 'b'));
		pieces.put("e7", new Pawn('p', 'b'));
		pieces.put("f7", new Pawn('p', 'b'));
		pieces.put("g7", new Pawn('p', 'b'));
		pieces.put("h7", new Pawn('p', 'b'));
		
		pieces.put("a1", new Rook('r', 'w'));
		pieces.put("b1", new Knight('n', 'w'));
		pieces.put("c1", new Bishop('b', 'w'));
		pieces.put("d1", new Queen('q', 'w'));
		pieces.put("e1", new King('k', 'w'));
		pieces.put("f1", new Bishop('b', 'w'));
		pieces.put("g1", new Knight('n', 'w'));
		pieces.put("h1", new Rook('r', 'w'));
		
		pieces.put("a2", new Pawn('p', 'w'));
		pieces.put("b2", new Pawn('p', 'w'));
		pieces.put("c2", new Pawn('p', 'w'));
		pieces.put("d2", new Pawn('p', 'w'));
		pieces.put("e2", new Pawn('p', 'w'));
		pieces.put("f2", new Pawn('p', 'w'));
		pieces.put("g2", new Pawn('p', 'w'));
		pieces.put("h2", new Pawn('p', 'w'));
	}
	
	private void checkPromotion() {
		
		for (int i = 0; i < 8; i++) {
			char x = (char)(i + 'a');
			String pos = "";
			pos += x;
			pos += 8;
			if (pieces.containsKey(pos)) {
				if (pieces.get(pos).getType().charAt(0) == 'p' &&
					pieces.get(pos).getColor().charAt(0) == 'w') {
					pieces.remove(pos);
					pieces.put(pos, new Queen('q', 'w'));
				}
			}
		}
		for (int i = 0; i < 8; i++) {
			char x = (char)(i + 'a');
			String pos = "";
			pos += x;
			pos += 1;
			if (pieces.containsKey(pos)) {
				if (pieces.get(pos).getType().charAt(0) == 'p' &&
					pieces.get(pos).getColor().charAt(0) == 'b') {
					pieces.remove(pos);
					pieces.put(pos, new Queen('q', 'b'));
				}
			}
		}
		
	}
	
	private void checkCastle(String str, char tempt) {
	if (str.equals("O-O") &&
			 tempt == 'w' &&
			 matB.mat[4][0].getType().charAt(0) == 'k' &&
			 matB.mat[7][0].getType().charAt(0) == 'r' &&
			 matB.mat[5][0].getType().charAt(0) == '0' &&
			 matB.mat[6][0].getType().charAt(0) == '0') {
			 pieces.remove("e1");
			 pieces.remove("h1");
			 pieces.put("g1", new Piece('k', 'w'));
			 pieces.put("f1", new Piece('r', 'w'));
			 turn = 'b';
			 panel.repaint();
		 }
		 if (str.equals("O-O") &&
			 tempt == 'b' &&
			 matB.mat[4][7].getType().charAt(0) == 'k' &&
			 matB.mat[7][7].getType().charAt(0) == 'r' &&
			 matB.mat[5][7].getType().charAt(0) == '0' &&
			 matB.mat[6][7].getType().charAt(0) == '0') {
			 pieces.remove("e8");
			 pieces.remove("h8");
			 pieces.put("g8", new Piece('k', 'b'));
			 pieces.put("f8", new Piece('r', 'b'));
			 turn = 'w';
			 panel.repaint();
		 }
		 if (str.equals("O-O-O") &&
			 tempt == 'w' &&
			 matB.mat[4][0].getType().charAt(0) == 'k' &&
			 matB.mat[0][0].getType().charAt(0) == 'r' &&
			 matB.mat[3][0].getType().charAt(0) == '0' &&
			 matB.mat[2][0].getType().charAt(0) == '0' &&
			 matB.mat[1][0].getType().charAt(0) == '0') {
			 pieces.remove("e1");
			 pieces.remove("a1");
			 pieces.put("c1", new Piece('k', 'w'));
			 pieces.put("d1", new Piece('r', 'w'));
			 turn = 'b';
			 panel.repaint();
			 }
		 if (str.equals("O-O-O") &&
			 tempt == 'b' &&
			 matB.mat[4][7].getType().charAt(0) == 'k' &&
			 matB.mat[0][7].getType().charAt(0) == 'r' &&
			 matB.mat[3][7].getType().charAt(0) == '0' &&
			 matB.mat[2][7].getType().charAt(0) == '0' &&
			 matB.mat[1][7].getType().charAt(0) == '0') {
			 pieces.remove("e8");
			 pieces.remove("a8");
			 pieces.put("c8", new Piece('k', 'b'));
			 pieces.put("d8", new Piece('r', 'b'));
			 turn = 'w';
			 panel.repaint();
		 }
	}
	
	private void checkCheckmate() {
		Iterator it = pieces.entrySet().iterator();
		boolean whitewin = true;
		boolean blackwin = true;
		while (it.hasNext()) {
			Map.Entry mapElement = (Map.Entry)it.next();
			Piece temp = (Piece)mapElement.getValue();
			if (temp.getType().charAt(0) == 'k') {
				if (temp.getColor().charAt(0) == 'b') {
					blackwin = false;
				}
				if (temp.getColor().charAt(0) == 'w') {
					whitewin = false;
				}
			}
		}
		if (whitewin == true) {
			//albert do some shit here
		}
		if (blackwin == true) {
			//albert do some shit here
		}
	}
	
	private void createBoard() {
		JFrame chessBoard = new JFrame("Chess Board");
		chessBoard.setBounds(0, 0, 800, 850);
		
		chessBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		chessBoard.setLayout(new BorderLayout());
		
		JPanel northPanel = new JPanel(new BorderLayout());
	//	JPanel southPanel = new JPanel(new FlowLayout());
		
		//fromField.setMinimumSize(new Dimension(100,30));
		toField.setMinimumSize(new Dimension(100,30));
		toField.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent event) {
				 if(toField.getText() != null){
					 System.out.println(toField.getText());
					 char tempt = turn;
					 checkCastle(toField.getText(), tempt);
				     String[] strs = toField.getText().split(" ");
				     String newLoc = strs[strs.length-1];
				     if (newLoc.length() == 2) {
				    	 checkCheckmate();
					     System.out.println("New Location : " + newLoc);
					     matB.updateMatBoard(pieces);
					     
					     if (pieces.get(oldLoc).isLegal(oldLoc, newLoc, matB.mat, turn) == true) {
					    	 char temp = '0';
						 
					    	 if (turn == 'w') {
					    		 temp = 'b';
					    	 }
					    	 if (turn == 'b') {
					    		 temp = 'w';
					    	 }
						     //update whose turn it is
					    	 turn = temp;
						     Piece p = pieces.get(oldLoc);
						     pieces.remove(oldLoc);
						     pieces.put(newLoc, p);
						     checkPromotion();
						     if(refreshReq) {
						    	panel.repaint();
						    	refreshReq = false;
						     }
					     }
				     }
				     matB.updateMatBoard(pieces);
				     
				 }
			}
		});
		
		northPanel.add(fromLabel, BorderLayout.WEST);
	//	northPanel.add(fromField);
		
		northPanel.add(toLabel,BorderLayout.EAST);
		northPanel.add(toField,BorderLayout.EAST);
		
		panel = new ChessPanel(pieces, this);
		
		panel.setBounds(0, 0, 800, 850);
		chessBoard.add(panel, BorderLayout.CENTER);
		chessBoard.add(northPanel, BorderLayout.NORTH);
	//	chessBoard.add(southPanel, BorderLayout.SOUTH);
		chessBoard.setVisible(true);
		chessBoard.repaint();
	}
	
	public void setFromTextField(String color, String type, String loc) {
		
		String value = "";
		
		if(color.equalsIgnoreCase("b"))
			value += "Black ";
		else
			value += "White";
		if(type.equalsIgnoreCase("b"))
			value += " Bishop";
		else if(type.equalsIgnoreCase("n"))
			value += " Knight";
		else if(type.equalsIgnoreCase("k"))
			value += " King";
		else if(type.equalsIgnoreCase("q"))
			value += " Queen";
		else if(type.equalsIgnoreCase("r"))
			value += " Rook";
		else if(type.equalsIgnoreCase("p"))
			value += " Pawn";

		fromLabel.setText("Current : " + value + " " + loc);
		fromLabel.setFont(new Font("Courier", Font.BOLD,12));
		toField.setText("Next step " + value + "      ");
		oldLoc = loc;
		refreshReq = true;
	}
	
	/*public boolean check() {
		
	}
	
	public boolean checkMate() {
		
	}
	
	public boolean staleMate() {
		
	}*/
	
	public static void main(String[] args) throws Exception{
		Board board = new Board();
		board.setup();
		board.createBoard();
	}
}
