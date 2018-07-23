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
	
	public boolean canMove(String[][] array, int x, int y)
	{
		if ((x > 7) || (x < 0) || (y > 7) || (y < 0))
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
