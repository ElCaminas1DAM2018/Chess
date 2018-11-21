
public class Movement {
	public Piece piece;
	public int originalRow;
	public char originalCol;
	public int destinationRow;
	public char destinationCol;
	
	public Movement(Piece piece, int originalRow, char originalCol, 
			int destinationRow, char destinationCol) {
		this.piece = piece;
		this.originalRow = originalRow;
		this.originalCol = originalCol;
		this.destinationRow = destinationRow;
		this.destinationCol = destinationCol;
	}
	
	@Override
	public String toString() {
		return piece + " from " + originalCol + 
				originalRow + " to " + destinationCol + destinationRow;
	}
}
