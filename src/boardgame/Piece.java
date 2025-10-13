package boardgame;

public class Piece {
    
    protected Position posicion;
    private Board board;
    
    protected Board getBoard() {
        return board;
    }

    public Piece(Board board) {
        this.board = board;
        posicion = null;
    }

    
}
