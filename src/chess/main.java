package chess;
import java.util.*;

import javax.swing.JFrame;
public class main {
	public static void main(String[] args) {
//		System.out.println("ran main");
//		HashMap<String, Piece> testmap = new HashMap<String, Piece>();
//		Piece bpawn = new Piece('p','b');
//		Piece wpawn = new Piece('p','w');
//		Piece brook = new Piece('r','b');
//		Piece wrook = new Piece('r','w');
//		Piece bknight = new Piece('n','b');
//		Piece wknight = new Piece('n','w');
//		Piece bbishop = new Piece('b','b');
//		Piece wbishop = new Piece('b','w');
//		Piece bqueen = new Piece('q','b');
//		Piece wqueen = new Piece('q','w');
//		Piece bking = new Piece('k','b');
//		Piece wking = new Piece('k','w');
//		testmap.put("a2", bpawn);
//		testmap.put("b2", bpawn);
//		testmap.put("c2", bpawn);
//		testmap.put("d2", bpawn);
//		testmap.put("e2", bpawn);
//		testmap.put("f2", bpawn);
//		testmap.put("g2", bpawn);
//		testmap.put("h2", bpawn);
//		testmap.put("a7", wpawn);
//		testmap.put("b7", wpawn);
//		testmap.put("c7", wpawn);
//		testmap.put("d7", wpawn);
//		testmap.put("e7", wpawn);
//		testmap.put("f7", wpawn);
//		testmap.put("g7", wpawn);
//		testmap.put("h7", wpawn);
//		
//		testmap.put("a1", brook);
//		testmap.put("h1", brook);
//		testmap.put("a8", wrook);
//		testmap.put("h8", wrook);
//		
//		testmap.put("b1", bknight);
//		testmap.put("g1", bknight);
//		testmap.put("b8", wknight);
//		testmap.put("g8", wknight);
//		
//		testmap.put("c1", bbishop);
//		testmap.put("f1", bbishop);
//		testmap.put("c8", wbishop);
//		testmap.put("f8", wbishop);
//		
//		testmap.put("d1", bking);
//		testmap.put("d8", wking);
//		
//		testmap.put("e5", bqueen);
//		testmap.put("e8", wqueen);
		
		Piece[][] pieces = new Piece[9][9];
		pieces[1][1] = new Piece('r', 'w');
		pieces[1][2] = new Piece('n', 'w');
		pieces[1][3] = new Piece('b', 'w');
		pieces[1][4] = new Piece('q', 'w');
		pieces[1][5] = new Piece('k', 'w');
		pieces[1][6] = new Piece('b', 'w');
		pieces[1][7] = new Piece('n', 'w');
		pieces[1][8] = new Piece('r', 'w');

		pieces[2][1] = new Piece('p', 'w');
		pieces[2][2] = new Piece('p', 'w');
		pieces[2][3] = new Piece('p', 'w');
		pieces[2][4] = new Piece('p', 'w');
		pieces[2][5] = new Piece('p', 'w');
		pieces[2][6] = new Piece('p', 'w');
		pieces[2][7] = new Piece('p', 'w');
		pieces[2][8] = new Piece('p', 'w');

		pieces[7][1] = new Piece('p', 'b');
		pieces[7][2] = new Piece('p', 'b');
		pieces[7][3] = new Piece('p', 'b');
		pieces[7][4] = new Piece('p', 'b');
		pieces[7][5] = new Piece('p', 'b');
		pieces[7][6] = new Piece('p', 'b');
		pieces[7][7] = new Piece('p', 'b');
		pieces[7][8] = new Piece('p', 'b');

		pieces[8][1] = new Piece('r', 'b');
		pieces[8][2] = new Piece('n', 'b');
		pieces[8][3] = new Piece('b', 'b');
		pieces[8][4] = new Piece('q', 'b');
		pieces[8][5] = new Piece('k', 'b');
		pieces[8][6] = new Piece('b', 'b');
		pieces[8][7] = new Piece('n', 'b');
		pieces[8][8] = new Piece('r', 'b');
		JFrame chessBoard = new JFrame("Chess Board");
		chessBoard.setBounds(0, 0, 816, 839);
		
		chessBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//ChessPanel panel = new ChessPanel();
//		panel.updateHMap(testmap);		
		//panel.updateMatrix(pieces);
		//panel.setBounds(0, 0, 800, 800);
		//chessBoard.add(panel);
		chessBoard.setVisible(true);
		chessBoard.repaint();
	}
}
