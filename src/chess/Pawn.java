
public class Pawn extends Piece {
	
	public Pawn(char ct, char cc) {
		super(ct,cc);
	}

    
    public Pawn(String color,  String img_file) {
        super(color, img_file);
    }

    @Override
    public boolean getValid(Board b) {

        
        return true;
    }
}