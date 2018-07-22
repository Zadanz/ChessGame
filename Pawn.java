
public class Pawn extends Piece{
	private String name = "P";
	
	public Pawn(boolean white) {
		if (white == true)
			this.name = "w" + name;
		else
			this.name = "b" + name;
	}
	
	public String drawPiece() {
		return name;
	}
	
	public boolean canMove(String[][] array, int x, int y) {	//assuming that the board will handle invalid inputs (outside of the board)
		if (array[x][y].charAt(0) == this.name.charAt(0)) 
			return false;
		
		else if (turn <= 2){ //handles moving 2 spaces for the first turn (turn 1 only whites should be able to move and turn 2 only blacks)
			//turn should be changed to whatever variable will be handling this
			if(x == this.posX && y == this.posY+2){
				return true;	
		}
		
		else if(x == this.posX && y == this.posY+1){ 	//handles moving forward
			if (array[x][y] != "empty")
				return false;
			else
				return true;
		}
		
		else if (x == this.posX-1 || x == this.posX+1 && y == this.posY+1){
			if (array[x][y] != "empty"){
				//array[x][y].remove;			//this line could handle the removal of a piece that is occupying that space, unless that is done elsewhere.
				return true;
			}
			else
				return false;
		}
		
		else
			return false;
		}
	}
}

