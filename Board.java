public class Board {
	Piece[][] board;
	
	public Board() {
		board = new Piece[8][8];
		initializeBoard();
	}
	public void initializeBoard() {
		for (int y = 0; y < 8; y++)
			for (int x = 0; x < 8; x++)
				board[y][x] = null;
	
		for (int x = 0; x < 8; x++)
			board[x][6] = new Pawn(true);
		
		board[0][7] = new Rook(true);
		board[1][7] = new Knight(true);
		board[2][7] = new Bishop(true);
		board[3][7] = new Queen(true);
		board[4][7] = new King(true);
		board[5][7] = new Bishop(true);
		board[6][7] = new Knight(true);
		board[7][7] = new Rook(true);
	
		for (int x = 0; x < 8; x++)
			board[x][1] = new Pawn(false);
		
		board[0][0] = new Rook(false);
		board[1][0] = new Knight(false);
		board[2][0] = new Bishop(false);
		board[3][0] = new Queen(false);
		board[4][0] = new King(false);
		board[5][0] = new Bishop(false);
		board[6][0] = new Knight(false);
		board[7][0] = new Rook(false);
	}
	
	
}
