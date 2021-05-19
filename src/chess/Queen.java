package chess;

public class Queen extends Piece {

	public Queen(char ct, char cc) {
		super(ct,cc);
	}
	
    public Queen(String color, String img_file) {
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
    	
    	boolean diff = true;
    	if (mat[x1][y1].getColor().charAt(0) == mat[x2][y2].getColor().charAt(0)) {
    		diff = false;
    		return false;
    	}
    	
    	if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
    		if (x1 < x2 && y1 < y2) {
        		for (int i = 0; i < x2 - x1; i++) {
        			if (mat[x1 + i][y1 + i].getType().charAt(0) == 
        				mat[x1][y1].getType().charAt(0) && 
        				mat[x1 + i][y1 + i].getColor().charAt(0) == 
        				mat[x1][y1].getColor().charAt(0)) {
        				continue;
        			}
        			if (mat[x1 + i][y1 + i].getType().charAt(0) != '0') {
        				return false;
        			}
        		}
        	}
        	
        	if (x1 < x2 && y1 > y2) {
        		for (int i = 0; i < x2 - x1; i++) {
        			if (mat[x1 + i][y1 - i].getType().charAt(0) == 
            			mat[x1][y1].getType().charAt(0) && 
            			mat[x1 + i][y1 - i].getColor().charAt(0) == 
            			mat[x1][y1].getColor().charAt(0)) {
            				continue;
            			}
        			if (mat[x1 + i][y1 - i].getType().charAt(0) != '0') {
        				return false;
        			}
        		}
        	}
        	
        	if (x1 > x2 && y1 < y2) {
        		for (int i = 0; i < x1 - x2; i++) {
        			if (mat[x1 - i][y1 + i].getType().charAt(0) == 
            			mat[x1][y1].getType().charAt(0) && 
            			mat[x1 - i][y1 + i].getColor().charAt(0) == 
            			mat[x1][y1].getColor().charAt(0)) {
            				continue;
            			}
        			System.out.println((x1 - i) + " , " + (y1 + i) + " is occupied by " + mat[x1-i][y1+i].getType());
        			if (mat[x1 - i][y1 + i].getType().charAt(0) != '0') {
        				return false;
        			}
        		}
        	}
        	
        	if (x1 > x2 && y1 > y2) {
        		for (int i = 0; i < x1 - x2; i++) {
        			if (mat[x1 - i][y1 - i].getType().charAt(0) == 
            			mat[x1][y1].getType().charAt(0) && 
            			mat[x1 - i][y1 - i].getColor().charAt(0) == 
            			mat[x1][y1].getColor().charAt(0)) {
            				continue;
            			}
        			if (mat[x1 - i][y1 - i].getType().charAt(0) != '0' ) {
        				return false;
        			}
        		}
        	}
        	return true;
    	}
    	
    	if (x1 == x2 && diff == true) {
    		for (int i = Math.min(y1, y2) + 1; i < Math.max(y1, y2); i++) {
    			if (mat[x1][i].getType().charAt(0) != '0') {
    				return false;
    			}
    		}
    		return true;
    	}
    	
    	if (y1 == y2 && diff == true) {
    		for (int i = Math.min(x1, x2) + 1; i < Math.max(x1, x2); i++) {
    			if (mat[i][y1].getType().charAt(0) != '0') {
    				return false;
    			}
    		}
    		return true;
    	}
    	
    	return false;
    	
    }
    
}