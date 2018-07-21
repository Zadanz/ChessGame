public class Bishop extends Piece{
	private String name = "B";
	
	public Bishop(boolean white) {
		if (white == true)
			this.name = "w" + name;
		else
			this.name = "b" + name;
	}
	
	
	public Bishop(int x, int y, boolean r)
	{
		super(x, y, "Bishop", r);
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
		
		if (Math.abs(initX - finX) == Math.abs(initY - finY))
		{
			return true;
		}
		return false;
	}
	
	public void moveUnit(int x, int y)//the moving of the piece might be put in another class instead
	{
		if (b.isAvailable(int initX, int initY, int finX, int finY))
		{
			setX(x);
			setY(y);
		}
			
		
	}
	
	public static void main(String[] args)
	{
		Bishop b = new Bishop();
	}
