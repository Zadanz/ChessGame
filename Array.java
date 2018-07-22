import java.util.Arrays;	// Eclipse says that this is redundant as it's not being used



//Some ideas to implement (will work on these in the morning):
//When drawing the board, consider the availability of the piece; only draw if it is available.
//When a piece is captured, set it to not be available so that it won't be redrawn.
//
//Implement capturing pieces.
//-How do we want this to work? Will there be several confirmations for the user about their move, or will the first valid move that the user chooses be executed?
//
//Pawn needs to be replaced with a Queen when it reaches the other side of the board.
//
//Implement a check for check in the King class to restrict playing into a check (perhaps same code as for win condition) - this could possibly be put off until after the demo, since, although this is a rule, the game is playable without it.


public class Array {// class to initialize state of game board and update it upon movement of pieces
	
	Array boardArray;
	
	public static void main(String[] args) {
		
		String pieceName = "null";
		int locationRow;
		int locationColumn;
		
		String [][] boardArray=initArray();// initialize board
		drawBoard(boardArray); // print default board
		System.out.println("");
		
		while ( 1 != 2) { // main game loop, can only break out of loop when prompted
			boolean colorCheck = false;
			
			
			while (colorCheck == false) {
				pieceName = keyboardInput.getPieceName();
				if (pieceName.charAt(0)=='b'){
					System.out.println("Not Allowed to move enemy units");
				}
				if (pieceName.isEmpty()) {
					System.out.println("Empty Space");
				}
				else {
					colorCheck = true;
				}	
			}

			
			
			locationRow = keyboardInput.getLocationRow();
			
			locationColumn = keyboardInput.getLocationColumn(); //gets info from user
			
			String[][] newArray=move(boardArray,pieceName,locationRow,locationColumn); // redraws board
			drawBoard(newArray);
			
			keyboardInput.exitPrompt(); // prompts the user if want to exit
			
		}
		
				
	}
	
	
	public static String[][] move (String[][] array,String piece, int r, int c){//method to move a piece returns new game board state
		//input: piece to move, and space to move piece to
		
		int newRow = r;
		int newColumn = c;
		
		int oldRow = 0;
		int oldColumn=0;	
		
		if(emptySpaceCheck(array,r,c) == false) {
			System.out.println("another piece at destination space");
			System.out.println("");
			return array;
		}

		for (int i = 0; i<=7;i++) {
			for (int j = 0; j<=7;j++) {
				if (array[i][j].equals(piece)) {
					 oldRow=i;
					 oldColumn = j;
					break;
				
					}
				}
			}
		
		array[oldRow][oldColumn] = "emptySpace";
		array[newRow][newColumn]= piece;
		
		return array;
		
				
		
	
		
	}
	
	
	private static boolean emptySpaceCheck(String[][] array, int r, int c) {
		if(array[r][c] == "emptySpace") {
			return true;
		}
		else {
			return false;
		}
	}


	public static void drawBoard(String[][] boardArray) {
		
		for (int i = 0; i<=7;i++) {
			for (int j = 0; j<=7;j++) {
				System.out.print(boardArray[i][j] + " ");
				}
			System.out.println();
			}
			
	}
	
	
	public static String[][] initArray(){
		String [][] boardArray = {
				
				{"blackRook1","blackKnight1","blackBishop1","blackQueen","blackKing","blackBishop2","blackKnight2","blackRook2"},
				{"blackPawn1","blackPawn2","blackPawn3","blackPawn4","blackPawn5","blackPawn6","blackPawn7","blackPawn8"},
				{"emptySpace","emptySpace","emptySpace","emptySpace","emptySpace","emptySpace","emptySpace","emptySpace"},
				{"emptySpace","emptySpace","emptySpace","emptySpace","emptySpace","emptySpace","emptySpace","emptySpace"},
				{"emptySpace","emptySpace","emptySpace","emptySpace","emptySpace","emptySpace","emptySpace","emptySpace"},
				{"emptySpace","emptySpace","emptySpace","emptySpace","emptySpace","emptySpace","emptySpace","emptySpace"},
				{"whitePawn1","whitePawn2","whitePawn3","whitePawn4","whitePawn5","whitePawn6","whitePawn7","whitePawn8"},
				{"whiteRook1","whiteKnight1","whiteBishop1","whiteKing","whiteQueen","whiteBishop2","whiteKnight2","whiteRook2"},
				
			};
		
			return boardArray;
		
	}

}
			
		


