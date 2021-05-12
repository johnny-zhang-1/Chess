
public class Knight extends Piece {

	public Knight(char ct, char cc) {
		super(ct,cc);
	}
	
    public Knight(String color, String img_file) {
        super(color, img_file);
    }

    @Override
    public boolean getValid(Board b) {

        
        return true;
    }

}