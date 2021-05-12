


public class Piece {
	
    private String color;
    private String type;
    
    
    public Piece(String color, String img_file) {
        this.color = color;

    }
    
    public Piece(char t, char c) {
	    	color = String.valueOf(c);
	    	type = String.valueOf(t);
    	
    }

    
    public String getColor() {
        return color;
    }
    
    public String getType() {
    	return type;
    }

    
    // No implementation, to be implemented by each subclass
    public boolean getValid(Board b){
    	return true;
    };


}