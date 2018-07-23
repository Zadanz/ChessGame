public class Piece {//base object that all placeable things inherit from
	protected int posX;
	protected int posY;
	protected String name;
	protected boolean ready; //not sure what "ready" means. I think that "available" would be a more informative name, unless its used for something that I'm misunderstanding.

	public Piece(){
	
	}
	
	public Piece(int x, int y){
		posX = x;
		posY = y;
	}
	
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
	
	public boolean canMove(String[][] array, int x, int y)
	{
		//this code is not re done yet for canMove
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
