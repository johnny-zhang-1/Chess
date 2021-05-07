package chess;
import java.util.*;
public class Piece {
	
	char type;
	String pos;
	char color;
	
	public Piece (char t, char c) {
		type = t;
		if (c == 'w') {
			color = 'w';
		} else {
			color = 'b';
		}
		
	}
	
}
