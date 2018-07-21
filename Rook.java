
public class Rook extends Piece{
	
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
			if (a.emptySpaceCheck())
			{
				return true;
			}
		}
		return false;
		
	public void moveUnit(int x, int y)//will change the move stuff to another class
	{
		if (rk.isAvailable(int initX, int initY, int finX, int finY))
		{
			setX(x);
			setY(y);
		}
	}
	
	
	public static void main(String[] args)
	{
		Rook rk = new Rook();
	}
}













}
