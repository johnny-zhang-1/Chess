package chess;


public class Piece {

    private String color;
    private String type;
    
    //Constructors
    public Piece(String color, String img_file) {
        this.color = color;

    }
    
    //Converts the chars, color and type, into strings 
    public Piece(char t, char c) {
	    	color = String.valueOf(c);
	    	type = String.valueOf(t);
    	
    }

    //Gets the Color of the piece
    public String getColor() {
        return color;
    }
    //Gets the Type of the piece
    public String getType() {
    	return type;
    }
	
    //Method of whether or not the move played is legal; returns true if legal and false if illegal
    public boolean isLegal(String a, String b, Piece[][] mat, char turn) {
    	return true;
    }



}
