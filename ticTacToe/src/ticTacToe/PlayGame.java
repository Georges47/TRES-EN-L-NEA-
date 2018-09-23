package ticTacToe;

public class PlayGame {
	
	public static void main(String[] args) {
		
		Game game = new Game();
		Board board = new Board('*');
		Player player1 = new Player('X');
		Player player2 = new Player('O');
		
		board.printBoard();
		
		while(game.getTurn() <= 4) {
			game.playerTurn1(player1, board);
			game.playerTurn1(player2, board);
		}

		while( (game.getTurn() <= Game.getMaxTurns()) && !(board.checkForWin()) ) {
			game.playerTurn1(player1, board);
			if(board.checkForWin() || game.getTurn() <= Game.getMaxTurns())
				break;
			game.playerTurn1(player2, board);
		}
		
		if(board.checkForWin()) {
			if(game.getTurn() % 2 == 0) {
				System.out.println("Player 2 won");
			}
			else {
				System.out.println("Player 1 won");
			}
		}
		else {
			System.out.println("Draw");
		}
		
	}

}
