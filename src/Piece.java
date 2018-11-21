
public class Piece {
	
	private TypeOfPiece typeOfPiece;
	private Color color;
	
	public Piece(TypeOfPiece typeOfPiece, Color color) {
		this.typeOfPiece = typeOfPiece;
		this.color = color;
	}
	
	@Override
	public String toString() {
		String s;
		if (color == Color.BLACK) {
			s = "BLACK ";
		} else {
			s = "WHITE ";
		}
		switch(typeOfPiece) {
			case PAWN: s = s + "PAWN";
				break;
			case TOWER: s = s + "TOWER";
				break;
			case KNIGHT: s = s + "KNIGHT";
				break;
			case BISHOP: s = s + "BISHOP";
				break;
			case QUEEN: s = s + "QUEEN";
				break;
			case KING: s = s + "KING";
				break;
		}
		return s; 
	}
	
	public String getLetter() {
		switch(typeOfPiece) {
		case PAWN:if (color == Color.BLACK) {
					return "P";
				} else {
					return "p";					
				}
		case TOWER: if (color == Color.BLACK) {
					return "T";
				} else {
					return "t";					
				}
		case KNIGHT: if (color == Color.BLACK) {
						return "K";
					} else {
						return "k";					
					}
		case BISHOP: if (color == Color.BLACK) {
						return "B";
					} else {
						return "b";					
					}
		case QUEEN: if (color == Color.BLACK) {
						return "Q";
					} else {
						return "q";					
					}
		case KING: if (color == Color.BLACK) {
						return "X";
					} else {
						return "x";					
					}
		}
		return ". ";
	}
}
