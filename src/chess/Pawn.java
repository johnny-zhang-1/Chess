package chess;
public class Pawn extends Piece {
	
	public Pawn(char ct, char cc) {
		super(ct,cc);
	}

    
    public Pawn(String color,  String img_file) {
        super(color, img_file);
    }

    @Override
    public boolean isLegal(String a, String b, Piece[][] mat) {
    	
        
        return true;
    }
}