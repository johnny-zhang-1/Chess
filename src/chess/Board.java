package chess;

import java.util.*;

public class Board {
	
	Map<String, piece> pieces = new HashMap<String, piece>();
	
	public void setup() {
		pieces.clear();
		pieces.put("a8", new piece('r', 'b'));
		pieces.put("b8", new piece('n', 'b'));
		pieces.put("c8", new piece('b', 'b'));
		pieces.put("d8", new piece('q', 'b'));
		pieces.put("e8", new piece('k', 'b'));
		pieces.put("f8", new piece('b', 'b'));
		pieces.put("g8", new piece('n', 'b'));
		pieces.put("h8", new piece('r', 'b'));
		
		pieces.put("a7", new piece('p', 'b'));
		pieces.put("b7", new piece('p', 'b'));
		pieces.put("c7", new piece('p', 'b'));
		pieces.put("d7", new piece('p', 'b'));
		pieces.put("e7", new piece('p', 'b'));
		pieces.put("f7", new piece('p', 'b'));
		pieces.put("g7", new piece('p', 'b'));
		pieces.put("h7", new piece('p', 'b'));
		
		pieces.put("a1", new piece('r', 'w'));
		pieces.put("b1", new piece('n', 'w'));
		pieces.put("c1", new piece('b', 'w'));
		pieces.put("d1", new piece('q', 'w'));
		pieces.put("e1", new piece('k', 'w'));
		pieces.put("f1", new piece('b', 'w'));
		pieces.put("g1", new piece('n', 'w'));
		pieces.put("h1", new piece('r', 'w'));
		
		pieces.put("a2", new piece('p', 'w'));
		pieces.put("b2", new piece('p', 'w'));
		pieces.put("c2", new piece('p', 'w'));
		pieces.put("d2", new piece('p', 'w'));
		pieces.put("e2", new piece('p', 'w'));
		pieces.put("f2", new piece('p', 'w'));
		pieces.put("g2", new piece('p', 'w'));
		pieces.put("h2", new piece('p', 'w'));
	}
	public void move (String pos1, String pos2) {
		boolean legal = false;
		if (type == 'p') {
			
		}
		if (type == 'n') {
			
		}
		if (type == 'b') {
			
		}
		if (type == 'r') {
			
		}
		if (type == 'q') {
			
		}
		if (type == 'k') {
			
		}
	}
	
	/*public boolean check() {
		
	}
	
	public boolean checkMate() {
		
	}
	
	public boolean staleMate() {
		
	}*/
}
