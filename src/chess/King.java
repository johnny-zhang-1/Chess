package chess;

import java.lang.*;

public class King extends Piece {

	
	public King(char ct, char cc) {
		super(ct,cc);
	}
	
    public King(char color, String img_file) {
        super(color, img_file);
    }

    
    
    @Override
    public boolean isLegal(String a, String b, Piece[][] mat, char turn) {
    	//convert to matrix coords
    	int x1, y1, x2, y2;
    	x1 = (int)(a.charAt(0) - 'a');
    	y1 = (int)(a.charAt(1) - 49);
    	x2 = (int)(b.charAt(0) - 'a');
    	y2 = (int)(b.charAt(1) - 49);
    	//check if it is this piece's color's turn
    	if (mat[x1][y1].getColor() != turn) {
    		return false;
    	}
    	//check if the colors of the start and end locations are different
    	boolean diff = true;
    	if (mat[x1][y1].getColor() == mat[x2][y2].getColor()) {
    		diff = false;
    		return false;
    	}
    	//check if move is within 1 space
    	if (Math.abs(x2 - x1) <= 1 && Math.abs(y2 - y1) <= 1 && diff == true) {
    		return true;
    	}
        
        return false;
    }

}