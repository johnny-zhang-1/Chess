import java.util.List;
import java.util.LinkedList;

public class Pawn extends Piece {
	
    private boolean pieceMoved;
    
    public Pawn(int color, Square initSq, String img_file) {
        super(color, initSq, img_file);
    }
    
    @Override
    public boolean move(Square fin) {
        boolean b = super.move(fin);
        pieceMoved = true;
        return b;
    }

    @Override
    public List<Square> getValid(Board b) {
        LinkedList<Square> valid = new LinkedList<Square>();
        
        
        Square[][] board = b.getSquareArray();
        
        
        int x = this.getPosition().getXNum();
        int y = this.getPosition().getYNum();
        int c = this.getColor();
        
        
        if (c == 0) {
        	
            if (!pieceMoved) {
            	
                if (!board[y+2][x].isOccupied()) {
                    valid.add(board[y+2][x]);
                }
                
            }
         
            
            if (y+1 < 8) {
            	
                if (!board[y+1][x].isOccupied()) {
                	
                    valid.add(board[y+1][x]);
                }
            }
       
            
            if (x+1 < 8 && y+1 < 8) {
                if (board[y+1][x+1].isOccupied()) {
                    valid.add(board[y+1][x+1]);
                }
            }
         
            
            if (x-1 >= 0 && y+1 < 8) {
                if (board[y+1][x-1].isOccupied()) {
                    valid.add(board[y+1][x-1]);
                }
            }
        }
        
        
        if (c == 1) {
            if (!pieceMoved) {
                if (!board[y-2][x].isOccupied()) {
                    valid.add(board[y-2][x]);
                }
            }
            
            if (y-1 >= 0) {
                if (!board[y-1][x].isOccupied()) {
                    valid.add(board[y-1][x]);
                }
            }
            
            if (x+1 < 8 && y-1 >= 0) {
                if (board[y-1][x+1].isOccupied()) {
                    valid.add(board[y-1][x+1]);
                }
            }
                
            if (x-1 >= 0 && y-1 >= 0) {
                if (board[y-1][x-1].isOccupied()) {
                    valid.add(board[y-1][x-1]);
                }
            }
        }
        
        return valid;
    }
}