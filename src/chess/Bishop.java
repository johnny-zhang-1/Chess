

public class Bishop extends Piece {

	
	public Bishop(char ct, char cc) {
		super(ct,cc);
	}
	
    public Bishop(String color, String img_file) {
        super(color , img_file);
        
    }
    
    @Override
    public boolean getValid(Board b) {

        
        return true;
    }
    
}