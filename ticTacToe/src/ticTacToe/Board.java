package ticTacToe;

public class Board {
	
	// Instance variables //
	
	private char[][] board = new char[3][3];
	
	
	// Constructor //
	
	public Board(char c) {
		for(int i = 0; i <= 2; i++) {
			for(int j = 0; j <= 2; j++) {
				board[i][j] = c;
			}
		}
	}
	
	//---------//
	// Methods //
	//---------//
	
	public void printBoard() {
		for(int i = 0; i <= 2; i++) {
			for(int j = 0; j <= 2; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	//--------------------------------------------------------------------------------------//
	
	public void updateBoard(Game game, char playerSymbol) {
		
		System.out.print("Enter row: ");
		int row = game.getPlayerInput();
		
		System.out.print("Enter column: ");
		int column = game.getPlayerInput();
		
		System.out.println();
		board[row][column] = playerSymbol;
	}
	
	//--------------------------------------------------------------------------------------//
	
	public boolean checkForWin() {
		
		if(board[0][0] != '*' && board[1][1] != '*' && board[2][2] != '*') {
			if(this.checkForHorizontalWin())
				return true;
			if(this.checkForVerticalWin())
				return true;
			if(this.checkForDiagonalWin())
				return true;
		}
		
		return false;
	}
	
	//--------------------------------------------------------------------------------------//
	
	public boolean checkForHorizontalWin() {
		for(int i = 0; i <= board.length - 1; i++) {
				if(board[i][0] == board[i][1] && board[i][0] == board[i][2])
					return true;
		}
		return false;
	}
	
	public boolean checkForVerticalWin() {
		for(int j = 0; j <= board.length - 1; j++) {
				if(board[0][j] == board[1][j] && board[0][j] == board[2][j])
					return true;
		}
		return false;
	}
	
	public boolean checkForDiagonalWin() {
		
		int i = 0, j = 0;
		
		if(board[i][j] == board[i + 1][j + 1] && board[i][j] == board[i + 2][j + 2]) {
			return true;
		}
		
		i = 0;
		j = board.length - 1;
		
		if(board[i][j] == board[i + 1][j - 1] && board[i][j] == board[i + 2][j - 2]) {
			return true;
		}
		
		return false;
	}
	
	
	
}
