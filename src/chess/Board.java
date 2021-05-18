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
					 
				     String[] strs = toField.getText().split(" ");
				     String newLoc = strs[strs.length-1];
				     System.out.println("New Location : " + newLoc);
				     matB.updateMatBoard(pieces);
				     if (pieces.get(oldLoc).isLegal(oldLoc, newLoc, matB.mat) == true) {
				    	 
					     Piece p = pieces.get(oldLoc);
					     pieces.remove(oldLoc);
					     pieces.put(newLoc, p);
					     if(refreshReq) {
					    	 	panel.repaint();
					    	 	refreshReq = false;
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
