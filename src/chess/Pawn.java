package chess;
public class Pawn extends Piece {
	
	public Pawn(char ct, char cc) {
		super(ct,cc);
	}

    
    public Pawn(char color,  String img_file) {
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
    	//if pawn is white:
    	if (mat[x1][y1].getColor() == 'w') {
			//check if pawn is moving forward
    		if (y2 <= y1) {
    			return false;
    		}
			//if pawn is at starting position
    		if (y1 == 1) {
    			if (x1 == x2 && y2 == 3 && 
    			mat[x1][2].getType() == '0' &&
    			mat[x1][3].getType() == '0') {
    				return true;
    			}
    		}
			//if pawn is moved one step forward
    		if (x1 == x2 && y1 + 1 == y2 && 
    			mat[x1][y1 + 1].getType() == '0') {
    			return true;
    		}
			//check if capture is legal
    		if (x1 + 1 == x2 && y1 + 1 == y2 && 
    			mat[x2][y2].getType() != '0') {
    			return true;
    		}
    		if (x1 - 1 == x2 && y1 + 1 == y2 && 
    			mat[x2][y2].getType() != '0') {
    			return true;
    		}
    		
    	}
    	//pretty much the same as white, too lazy to write comments
    	if (mat[x1][y1].getColor() == 'b') {
    		if (y2 >= y1) {
    			return false;
    		}
    		if (y1 == 6) {
    			if (x1 == x2 && y2 == 4 && 
    			mat[x1][5].getType() == '0' &&
    			mat[x1][4].getType() == '0') {
    				return true;
    			}
    		}
    		if (x1 == x2 && y1 - 1 == y2 && 
    			mat[x1][y1 - 1].getType() == '0') {
    			return true;
    		}
    		if (x1 + 1 == x2 && y1 - 1 == y2 && 
    			mat[x2][y2].getType() != '0') {
    			return true;
    		}
    		if (x1 - 1 == x2 && y1 - 1 == y2 && 
    			mat[x2][y2].getType() != '0') {
    			return true;
    		}
    	}
        
        return false;
    }
}