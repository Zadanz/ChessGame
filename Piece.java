


public class Piece {//base object that all placeable things inherit from
	private int posX;
	private int posY;
	private String name;
	private boolean ready;

	
	public String toString()
	{
		return name + " at " + posX +","+posY;
	}
	
	Piece (int x, int y,String n, boolean r)
	{
		posX = x;
		posY = y;
		name = n;
		ready = r;
	}

	public int getX()
	{
		return posX;
	}
	
	public int getY()
	{
		return posY;
	}
	
	public String getName()
	{
		return name;
	}

	public void setX(int x)
	{
		posX = x;
	}
	
	public void setY(int y)
	{
		posY = y;
	}
	
	public boolean isReady()
	{
		return ready;
	}
	
	public boolean setReady(boolean r)
	{
		this.ready = r;
	}
	
	public void moveUnit(int x, int y)
	{
		setX(x);
		setY(y);
	}
	
	public boolean isAvailable(int initX, int initY, int finX, int finY)
	{
		if ((finX == initX) && (finY == initY))
		{
			return false;
		}
		else if (initX < 0 || initX > 7 || finX < 0 || finX > 7 || initY < 0 || initY > 7 || finY < 0 || finY > 7)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
