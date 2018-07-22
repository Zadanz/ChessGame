public class King extends Piece{
	private String name = "K";
	
	public King(boolean white) {
		if (white == true)
			this.name = "w" + name;
		else
			this.name = "b" + name;
	}
	
	public String drawPiece() {
		return name;
	}
	
	public boolean inCheck(String[][] array, int x, int y) { //INCOMPLETE
		return false;
	}
	
	public boolean canMove(String[][] array, int x, int y){
		if (array[x][y].charAt(0) == this.name.charAt(0))
			return false;
		
		else if ((x == this.posX+1 && y == this.posY)||(x == this.posX+1 && y == this.posY+1)||(x == this.posX && y == this.posY+1)||(x == this.posX-1 && y == this.posY)||(x == this.posX-1 && y == this.posY-1)||(x == this.posX && y == this.posY-1)||(x == this.posX+1 && y == this.posY-1)||(x == this.posX-1 && y == this.posY+1))
				if (inCheck(array, x, y)) //used to check whether the move will result in putting the king into check, thereby making it illegal. (This function doesn't exist yet.)
					return false;
				else
					return true;
		
		else
			return false;
		}
	
}
