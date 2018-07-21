
public class Queen extends Piece{
	private String name = "Q";
	
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
		else if (Math.abs(initX - finX) == Math.abs(initY - finY))
		{
			return true;
		}	

}
