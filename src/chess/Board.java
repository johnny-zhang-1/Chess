package chess;

import java.util.*;

public class Board {
	
	piece[][] board = new piece[9][9];

	public int movedFromX;
	public int movedFromY;
	public int movedToX;
	public int movedToY;

	public void setup() {
		pieces[1][1] = new piece('r', 'w');
		pieces[1][2] = new piece('n', 'w');
		pieces[1][3] = new piece('b', 'w');
		pieces[1][4] = new piece('q', 'w');
		pieces[1][5] = new piece('k', 'w');
		pieces[1][6] = new piece('b', 'w');
		pieces[1][7] = new piece('n', 'w');
		pieces[1][8] = new piece('r', 'w');
		
		pieces[2][1] = new piece('p', 'w');
		pieces[2][2] = new piece('p', 'w');
		pieces[2][3] = new piece('p', 'w');
		pieces[2][4] = new piece('p', 'w');
		pieces[2][5] = new piece('p', 'w');
		pieces[2][6] = new piece('p', 'w');
		pieces[2][7] = new piece('p', 'w');
		pieces[2][8] = new piece('p', 'w');
		
		pieces[7][1] = new piece('p', 'b');
		pieces[7][2] = new piece('p', 'b');
		pieces[7][3] = new piece('p', 'b');
		pieces[7][4] = new piece('p', 'b');
		pieces[7][5] = new piece('p', 'b');
		pieces[7][6] = new piece('p', 'b');
		pieces[7][7] = new piece('p', 'b');
		pieces[7][8] = new piece('p', 'b');
		
		pieces[8][1] = new piece('r', 'b');
		pieces[8][2] = new piece('n', 'b');
		pieces[8][3] = new piece('b', 'b');
		pieces[8][4] = new piece('q', 'b');
		pieces[8][5] = new piece('k', 'b');
		pieces[8][6] = new piece('b', 'b');
		pieces[8][7] = new piece('n', 'b');
		pieces[8][8] = new piece('r', 'b');
	}
	public void move (String pos1, String pos2) {
		int x1 = (int)(pos1.charAt(0));
		int y1 = pos1.charAt(1);
		int x2 = (int)(pos2.charAt(0));
		int y2 = pos1.charAt(1);
		if (isLegal(pos1, pos2) == true) {
			movedFromX = x1;
			movedFromY = y1;
			movedToX = x2;
			movedToY = y2;
			pieces[x2][y2] = pieces[x1][y1];
			pieces[x1][y1] = new piece('e', 'e');
			updateMatrix(pieces);
		}
	}
	
	/*public boolean check() {
		
	}
	
	public boolean checkMate() {
		
	}
	
	public boolean staleMate() {
		
	}*/
}
