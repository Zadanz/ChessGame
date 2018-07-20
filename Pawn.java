
public class Pawn extends Piece{
	private String name = "P";
	
	public Pawn(boolean white) {
		if (white == true)
			this.name = "w" + name;
		else
			this.name = "b" + name;
	}
	
	public String drawPiece() {
		return name;
	}
}
