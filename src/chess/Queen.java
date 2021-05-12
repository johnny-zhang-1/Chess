

public class Queen extends Piece {

	public Queen(char ct, char cc) {
		super(ct,cc);
	}
	
    public Queen(String color, String img_file) {
        super(color, img_file);
    }

    @Override
    public boolean getValid(Board b) {

        
        return true;
    }
    
}