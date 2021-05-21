package chess;
//i spent so much god damn time debugging this. 
public class Rook extends Piece {

	public Rook(char ct, char cc) {
		super(ct,cc);
	}
	
    public Rook(char color, String img_file) {
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
    	}
    	//if moving vertically
    	if (x1 == x2 && diff == true) {
    		for (int i = Math.min(y1, y2) + 1; i < Math.max(y1, y2); i++) {
    			if (mat[x1][i].getType() != '0') {
    				return false;
    			}
    		}
    		return true;
    	}
    	//if moving horizontally
    	if (y1 == y2 && diff == true) {
    		for (int i = Math.min(x1, x2) + 1; i < Math.max(x1, x2); i++) {
    			if (mat[i][y1].getType() != '0') {
    				return false;
    			}
    		}
    		return true;
    	}
    	
    	return false;
    	
    }
}