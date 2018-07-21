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
	
	public boolean canMove(int x, int y){
		if (board[x,y].name.CharAt(0) == this.name.CharAt(0))
			return false;
		
		if ((x == this.posX+1 && y == this.posY)||(x == this.posX+1 && y == this.posY+1)||(x == this.posX && y == this.posY+1)||(x == this.posX-1 && y == this.posY)||(x == this.posX-1 && y == this.posY-1)||(x == this.posX && y == this.posY-1)||(x == this.posX+1 && y == this.posY-1)||(x == this.posX-1 && y == this.posY+1))
			if (array[x,y].inCheck) //used to check whether the move will result in putting the king into check, thereby making it illegal. (This function doesn't exist yet.)
				return false;
			else
				return true;
	}	
}
