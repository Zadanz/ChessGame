
public class Rook extends Piece{
	private String name = "R";
	
	public Rook(boolean white) {
		if (white == true)
			this.name = "w" + name;
		else
			this.name = "b" + name;
	}
	
	public Rook(int x, int y, boolean r)
	{
		super(x, y, "Rook", r);
	}
	
	public String drawPiece() {
		return name;
	}
	
	public boolean isAvailable(int initX, int initY, int finX, int finY)
	{
		if (!super.isAvailable(int initX, int initY, int finX, int finY))
		{
			return false;
		}
		if ((finX == initX) || (finY == initY))
		{
			return true;
		}
		return false;
	}
	
	public boolean canMove(String[][] array, int x, int y)
	{
		if (array[x][y].charAt(0) == this.name.charAt(0))
		{
			return false;
		}
		
		if ((x == this.posX) || (y == this.posY))
		{
			return true;
		}
		
		else
		{
			return false;
		}
		
	}

}
