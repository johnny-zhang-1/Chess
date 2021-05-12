

public class Rook extends Piece {

	public Rook(char ct, char cc) {
		super(ct,cc);
	}
	
    public Rook(String color, String img_file) {
        super(color, img_file);
    }

    @Override
    public boolean getValid(Board b) {

        
        return true;
    }
}