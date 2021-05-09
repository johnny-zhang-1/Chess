import java.util.*;

import javax.swing.JFrame;
public class GraphicsExampleMain {
	public static void main(String[] args) {
		System.out.println("ran main");
		HashMap<String, piece> testmap = new HashMap<String, piece>();
		piece bpawn = new piece('p','b');
		piece wpawn = new piece('p','w');
		piece brook = new piece('r','b');
		piece wrook = new piece('r','w');
		piece bknight = new piece('n','b');
		piece wknight = new piece('n','w');
		piece bbishop = new piece('b','b');
		piece wbishop = new piece('b','w');
		piece bqueen = new piece('q','b');
		piece wqueen = new piece('q','w');
		piece bking = new piece('k','b');
		piece wking = new piece('k','w');
		testmap.put("a2", bpawn);
		testmap.put("b2", bpawn);
		testmap.put("c2", bpawn);
		testmap.put("d2", bpawn);
		testmap.put("e2", bpawn);
		testmap.put("f2", bpawn);
		testmap.put("g2", bpawn);
		testmap.put("h2", bpawn);
		testmap.put("a7", wpawn);
		testmap.put("b7", wpawn);
		testmap.put("c7", wpawn);
		testmap.put("d7", wpawn);
		testmap.put("e7", wpawn);
		testmap.put("f7", wpawn);
		testmap.put("g7", wpawn);
		testmap.put("h7", wpawn);
		
		testmap.put("a1", brook);
		testmap.put("h1", brook);
		testmap.put("a8", wrook);
		testmap.put("h8", wrook);
		
		testmap.put("b1", bknight);
		testmap.put("g1", bknight);
		testmap.put("b8", wknight);
		testmap.put("g8", wknight);
		
		testmap.put("c1", bbishop);
		testmap.put("f1", bbishop);
		testmap.put("c8", wbishop);
		testmap.put("f8", wbishop);
		
		testmap.put("d1", bking);
		testmap.put("d8", wking);
		
		testmap.put("e5", bqueen);
		testmap.put("e8", wqueen);
		
		JFrame chessBoard = new JFrame("Chess Board");
		chessBoard.setBounds(0, 0, 816, 839);
		
		chessBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ChessPanel panel = new ChessPanel();
		panel.updateHMap(testmap);		
		panel.setBounds(0, 0, 800, 800);
		chessBoard.add(panel);
		chessBoard.setVisible(true);
		chessBoard.repaint();
	}
}
