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
	
	public void move (String pos1, String pos2) {
		boolean legal = false;
		if (type == 'p') {
			
		}
		if (type == 'n') {
			
		}
		if (type == 'b') {
			
		}
		if (type == 'r') {
			
		}
		if (type == 'q') {
			
		}
		if (type == 'k') {
			
		}
	}
	
	/*public boolean check() {
		
	}
	
	public boolean checkMate() {
		
	}
	
	public boolean staleMate() {
		
	}*/
}
