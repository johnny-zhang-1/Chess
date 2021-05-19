package chess;

import java.util.*;

public class matBoard {
	public HashMap<String, Piece> mapBoard = new HashMap<String, Piece>();
	public Piece[][] mat = new Piece[9][9];
	
	public matBoard(HashMap<String, Piece> m) {
		mapBoard = m;
	}
	
	public void convert() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				mat[i][j] = new Piece('0', '0');
			}
		}
		Iterator it = mapBoard.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry mapElement = (Map.Entry)it.next();
			int x, y;
			String pos = (String) mapElement.getKey();
			x = (int)(pos.charAt(0) - 'a');
	    	y = (int)(pos.charAt(1) - 49);
	    	mat[x][y] = (Piece) mapElement.getValue();
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(mat[i][j].getType() + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	
	public void updateMatBoard(HashMap<String, Piece> m) {
		mapBoard = m;
		convert();
	}
	
}
