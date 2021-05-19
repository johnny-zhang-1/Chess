package chess;

public class Rook extends Piece {

	public Rook(char ct, char cc) {
		super(ct,cc);
	}
	
    public Rook(String color, String img_file) {
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
        
    	System.out.println(x1 + " " + y1 + " " + x2 + " " + y2 + " ");
    	
    	System.out.println(mat[x1][y1].getType() + " " + mat[x2][y2].getType());
    	
    	boolean diff = true;
    	if (mat[x1][y1].getColor().charAt(0) == mat[x2][y2].getColor().charAt(0)) {
    		diff = false;
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