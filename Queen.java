
public class Queen extends Piece{
	private String name = "Q";
	
	public Queen (boolean white) {
		if (white == true)
			this.name = "w" + name;
		else
			this.name = "b" + name;
	}
	
	public String drawPiece() {
		return name;
	}
}
