import java.util.Arrays;	// Eclipse says that this is redundant as it's not being used

public class Array {// class to initialize state of game board and update it upon movement of pieces
	
	Array boardArray;
	
	public static void main(String[] args) {
		
		String pieceName = "null";
		int locationRow;
		int locationColumn;
		int turn = 1;
		
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
			
			turn++;
		}
		
				
	}
	
	
	public static String[][] move (String[][] array,String piece, int r, int c){//method to move a piece returns new game board state
		//input: piece to move, and space to move piece to
		
		int newRow = r;
		int newColumn = c;
		
		int oldRow = 0;
		int oldColumn=0;	
		
/*		if(emptySpaceCheck(array,r,c) == false) {
			System.out.println("another piece at destination space");
			System.out.println("");
			return array;
		}
*/
		for (int i = 0; i<=7;i++) {
			for (int j = 0; j<=7;j++) {
				if (array[i][j].equals(piece)) {
					 oldRow=i;
					 oldColumn = j;
					break;
				
					}
				}
			}
		
		if(canMove (array, piece, oldRow, oldColumn, newRow, newColumn)) {
			array[oldRow][oldColumn] = "emptySpace";
			array[newRow][newColumn] = piece;
			
			return array;
		}
		else {
			System.out.println("Invalid Move.");
			return array;
		}	
	}
	
		//Piece logic for the string array version
	
	public static boolean canMove (String[][] array, String piece, int fY, int fX, int iY, int iX) {
		
		if (piece.regionMatches(5, "Pawn", 0, 4)){
			System.out.println("move - " + "iX: " + iX + "iY: " + iY + "fX: " + fX + "fY: " + fY);
			if (array[fX][fY].charAt(0) == piece.charAt(0)) 
				return false;
			
			else if (Array.turn <= 2){ //handles moving 2 spaces for the first turn (turn 1 only whites should be able to move and turn 2 only blacks)
				if(fX == iX && fY == iY+2)
					return true;
			
				else if(fX == iX && fY == iY+1){ 	//handles moving forward
					if (array[fX][fY] != "emptySpace")
						return false;
					else
						return true;
				}
			
				else if (fX == iX-1 || fX == iX+1 && fY == iY+1){
					if (array[fX][fY] != "emptySpace"){
						return true;
					}
					else
						return false;
					}
			
				else
					return false;
			}
		}
		else if (piece.regionMatches(5, "Knight", 0, 6)) {
			if (array[fX][fY].charAt(0) == piece.charAt(0))
					return false;
				
			else if ((fX == iX+1 && fY == iY+2) || (fX == iX+2 && fY == iY+1) || (fX == iX+2 && fY == iY-1) || (fX == iX+1 && fY == iY-2) || (fX == iX-1 && fY == iY+2) || (fX == iX-2 && fY == iY-1) || (fX == iX-2 && fY == iY+1) || (fY == iX-1 && fY == iY-2))
					return true;
				
			else 
					return false;
			}
			
		if (piece.regionMatches(5, "King", 0, 4)) {
			if (array[fX][fY].charAt(0) == piece.charAt(0))
					return false;
				
			else if ((fX == iX+1 && fY == iY)||(fX == iX+1 && fY == iY+1)||(fX == iX && fY == iY+1)||(fX == iX-1 && fY == iY)||(fX == iX-1 && fY == iY-1)||(fX == iX && fY == iY-1)||(fX == iX+1 && fY == iY-1)||(fX == iX-1 && fY == iY+1))
					//if (inCheck(array, x, y)) //used to check whether the move will result in putting the king into check, thereby making it illegal. (This function doesn't exist yet.)
					return true;
			else
					return false;
			}
				
		if (piece.regionMatches(5, "Bishop", 0, 6)) {
			if (array[fX][fY].charAt(0) == piece.charAt(0)) {
				return false;
			}
				
			else if (Math.abs(fX - iX) == Math.abs(fY - iY))
				{
					return true;
				}
				
			else
				{
					return false;
				}
		}
			
		if (piece.regionMatches(5, "Rook", 0, 4)) {
			if (array[fX][fY].charAt(0) == piece.charAt(0))
					return false;
				
			else if ((fX == iX) || (fY == iY))
				{
					return true;
				}
				
			else
				{
					return false;
				}
		}
			
		if (piece.regionMatches(5, "Queen", 0, 5)) {
			if (array[fX][fY].charAt(0) == piece.charAt(0))
					return false;
				
			else if (Math.abs(fX - iX) == Math.abs(fY - iY) || ((fX == iX) || (fY == iY)))
				{
					return true;
				}
				
			else
				{
					return false;
				
				}
		}
		
		else
				return false;
	}
	
	public boolean isWhiteInCheck (String[][] array, String piece, int x, int y)
	{
	}
	public boolen isBlackInCheck (String[][] array, String piece, int x, int y)
	{
	}
	
	
	
/*	private static boolean emptySpaceCheck(String[][] array, int r, int c) { //I don't think this is needed currently
		if(array[r][c] == "emptySpace") {
			return true;
		}
		else {
			return false;
		}
	}
*/

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
			
		


