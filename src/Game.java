
public class Game {
	
	public Board board;
	private Movement[] movements;
	private int numMovements;
	
	public Game() {
		board = new Board();
		movements = new Movement[2000];
		for (int i=0; i<movements.length; i++) {
			movements[i] = null;
		}
	}
	
	public void movePiece(Movement movement) {
		movements[numMovements] = movement;
		numMovements ++;
		board.movePiece(movement);
	}
	
	@Override
	public String toString() {
		String s = board.toString();
		s = s + "\nMovements:\n";
		for (int i=0; i<numMovements; i++) {
			s = s + movements[i].toString() + "\n";
		}
		return s;
	}

}
