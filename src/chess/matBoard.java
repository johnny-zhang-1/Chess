package chess;

import java.util.*;
//this class converts a hashmap into a matrix for "easier" move checking.
public class matBoard {
	public HashMap<String, Piece> mapBoard = new HashMap<String, Piece>();
	public Piece[][] mat = new Piece[9][9];
	
	public matBoard(HashMap<String, Piece> m) {
		mapBoard = m;
	}
	
	public void convert() {
		//prepare matrix. 
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				mat[i][j] = new Piece('0', '0');
			}
		}
		Iterator it = mapBoard.entrySet().iterator();
		//fill in matrix by iterating through map. 
		while (it.hasNext()) {
			Map.Entry mapElement = (Map.Entry)it.next();
			int x, y;
			String pos = (String) mapElement.getKey();
			x = (int)(pos.charAt(0) - 'a');
	    	y = (int)(pos.charAt(1) - 49);
	    	mat[x][y] = (Piece) mapElement.getValue();
		}
	}
	
	
	
	public void updateMatBoard(HashMap<String, Piece> m) {
		mapBoard = m;
		convert();
	}
	
}
