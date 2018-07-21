
public class Knight extends Piece{
	private String name = "N";
	
	public Knight(boolean white) {
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
		
		if ((x == this.posX+1 && y == this.posY+2) || (x == this.posX+2 && y == this.posY+1) || (x == this.posX+2 && y == this.posY-1) || (x == this.posX+1 && y == this.posY-2 || (x == this.posX-1 && y == this.posY-2) || (x == this.posX-2 && y == this.posY-1) || (x == this.posX-2 && y == this.posY-1) || (x == this.posX-1 && y == this.posY-2))
			return true;
		
		else 
			return false;
	}
}
