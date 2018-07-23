
public class Queen extends Piece{
	
	public Queen (boolean white) {
		if (white == true)
			this.name = "w" + name;
		else
			this.name = "b" + name;
	}
	
	Queen(int x, int y, boolean r)
	{
		super(x, y, "Queen", r);
	}
	
	public String drawPiece() {
		return name;
	}
	
	public boolean canMove(String[][] array, int x, int y)
	{
		if (array[x][y].charAt(0) == this.name.charAt(0))
			return false;

		elses if ((x == this.posX) || (y == this.posY))
		{
			return true;
		}
		else if (Math.abs(x - this.posX) == Math.abs(y - this.posY))
		{
			return true;
		}
		else
		{
			return false;
		}
		

}
