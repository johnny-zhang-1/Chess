package chess;

import java.lang.*;

public class Knight extends Piece {

	public Knight(char ct, char cc) {
		super(ct,cc);
	}
	
    public Knight(String color, String img_file) {
        super(color, img_file);
    }

    @Override
    public boolean isLegal(String a, String b, Piece[][] mat) {
    	int x1, y1, x2, y2;
    	x1 = (int)(a.charAt(0) - 'a');
    	y1 = (int)(a.charAt(1));
    	x2 = (int)(b.charAt(0) - 'a');
    	y2 = (int)(b.charAt(1));
        
    	if (Math.abs(x2 - x1) == 2 && Math.abs(y2 - y1) == 1) {
    		return true;
    	}
    	
    	if (Math.abs(x2 - x1) == 1 && Math.abs(y2 - y1) == 2) {
    		return true;
    	}
    	
        return false;
    }

}