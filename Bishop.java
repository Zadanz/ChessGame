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

	
	public boolean canMove(String[][] array, int x, int y)
	{
		if (array[x][y].charAt(0) == this.name.charAt(0))
		{
			return false;
		}
		
		if (Math.abs(x - this.posX) == Math.abs(y - this.posY))
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
		
	
	
				
				
				
				
				
				
				
				
}
