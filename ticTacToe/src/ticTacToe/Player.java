package ticTacToe;

public class Player {

	// Instance variables //
	
	private char symbol;
	
	// Constructor // 
	
	public Player(char c) {
		symbol = c;
	}
	
	// Methods //
	
	public char getPlayerSymbol() {
		return symbol;
	}
}
