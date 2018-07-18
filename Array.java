import java.util.Arrays;

public class Array {// class to initialize state of game board and update it upon movement of pieces
	
	Array boardArray;
	
	public static void main(String[] args) {
		
		String [][] boardArray=initArray();
		
		drawBoard(boardArray);
		
		String[][] newArray=move(boardArray,"blackPawn1",3,3);
		
		drawBoard(newArray);
		
		
				
	}
	
	
	public static String[][] move (String[][] array,String piece, int r, int c){//method to move a piece returns new game board state
		//input: piece to move, and space to move piece to
		
		int newRow = r;
		int newColumn = c;
		
		int oldRow = 0;
		int oldColumn=0;	
		
		if(emptySpaceCheck(array,r,c) == false) {
			System.out.println("another piece at destination space");
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
			
		

