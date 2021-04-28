package chess;
import java.util.*;
public class piece {
	
	char type;
	String pos;
	char color;
	
	public piece (char t, char c) {
		type = t;
		if (c == 'w') {
			color = 'w';
		} else {
			color = 'b';
		}
		
	}
	
}
