
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Game game = new Game();
		Piece whitePawn1 = game.board.getPiece(2, 'D');
		Piece whitePawn2 = game.board.getPiece(2, 'E');
		Piece blackPawn1 = game.board.getPiece(7, 'E');
		Piece blackBishop1 = game.board.getPiece(8, 'F');

		game.movePiece(new Movement(whitePawn1, 2, 'D', 3, 'D'));
		game.movePiece(new Movement(blackPawn1, 7, 'E', 5, 'E'));
		game.movePiece(new Movement(whitePawn2, 2, 'E', 4, 'E'));
		game.movePiece(new Movement(blackBishop1, 8, 'F', 4, 'B'));
		
		System.out.println(game);
	}

}
