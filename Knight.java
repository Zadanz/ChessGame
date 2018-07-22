
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
	
	public boolean canMove(String[][] array, int x, int y){
		if (array[x][y].charAt(0) == this.name.charAt(0))
			return false;
		
		if ((x == this.posX+1 && y == this.posY+2) || (x == this.posX+2 && y == this.posY+1) || (x == this.posX+2 && y == this.posY-1) || (x == this.posX+1 && y == this.posY-2) || (x == this.posX-1 && y == this.posY-2) || (x == this.posX-2 && y == this.posY-1) || (x == this.posX-2 && y == this.posY-1) || (x == this.posX-1 && y == this.posY-2))
			return true;
		
		else 
			return false;
	}
}
