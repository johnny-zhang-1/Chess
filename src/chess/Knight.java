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
    public boolean isLegal(String a, String b, Piece[][] mat, char turn) {
    	int x1, y1, x2, y2;
    	x1 = (int)(a.charAt(0) - 'a');
    	y1 = (int)(a.charAt(1) - 49);
    	x2 = (int)(b.charAt(0) - 'a');
    	y2 = (int)(b.charAt(1) - 49);
    	
    	if (mat[x1][y1].getColor().charAt(0) != turn) {
    		return false;
    	}
        
    	System.out.println(x1 + " " + y1 + " " + x2 + " " + y2);
    	System.out.println(mat[x1][y1].getType() + " " + mat[x2][y2].getType());
    	System.out.println((String)mat[x1][y1].getColor() + " " + (String)mat[x2][y2].getColor());
    	boolean diff = true;
    	if (mat[x1][y1].getColor().charAt(0) == mat[x2][y2].getColor().charAt(0)) {
    		diff = false;
    	}
    	
    	System.out.println(diff);
    	
    	if (Math.abs(x2 - x1) == 2 && Math.abs(y2 - y1) == 1 && diff == true) {
    		return true;
    	}
    	
    	if (Math.abs(x2 - x1) == 1 && Math.abs(y2 - y1) == 2 && diff == true) {
    		return true;
    	}
    	
        return false;
    }

}