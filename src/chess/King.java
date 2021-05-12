

public class King extends Piece {

	
	public King(char ct, char cc) {
		super(ct,cc);
	}
	
    public King(String color, String img_file) {
        super(color, img_file);
    }

    @Override
    public boolean getValid(Board b) {

        
        return true;
    }

}