import java.util.LinkedList;
import java.util.List;

public class Rook extends Piece {

    public Rook(int color, Square initSq, String img_file) {
        super(color, initSq, img_file);
    }

    @Override
    public List<Square> getValid(Board b) {
        LinkedList<Square> valid = new LinkedList<Square>();
        Square[][] board = b.getSquareArray();
        
        int x = this.getPosition().getXNum();
        int y = this.getPosition().getYNum();
        
        int[] occups = getLinearOccupations(board, x, y);
        
        for (int i = occups[0]; i <= occups[1]; i++) {
            if (i != y) valid.add(board[i][x]);
        }
        
        for (int i = occups[2]; i <= occups[3]; i++) {
            if (i != x) valid.add(board[y][i]);
        }
        
        return valid;
    }
}