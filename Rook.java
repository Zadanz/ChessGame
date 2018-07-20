
public class Rook extends Piece{
	private String name = "R";
	
	public Rook(boolean white) {
		if (white == true)
			this.name = "w" + name;
		else
			this.name = "b" + name;
	}
	
	public String drawPiece() {
		return name;
	}
}
