package chess;

import java.util.*;

public class matBoard {
	public HashMap<String, Piece> mapBoard = new HashMap<String, Piece>();
	public Piece[][] mat = new Piece[9][9];
	
	public matBoard(HashMap<String, Piece> m) {
		mapBoard = m;
	}
	
	public void convert() {
		Iterator i = mapBoard.entrySet().iterator();
		while (i.hasNext()) {
			Map.Entry mapElement = (Map.Entry)i.next();
			int x, y;
			String pos = (String) mapElement.getKey();
			x = (int)(pos.charAt(0) - 'a');
	    	y = (int)(pos.charAt(1));
	    	mat[x][y] = (Piece) mapElement.getValue();
		}
	}
	
	
	
	public void updateMatBoard(HashMap<String, Piece> m) {
		mapBoard = m;
		convert();
	}
	
}
