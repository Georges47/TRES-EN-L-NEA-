package ticTacToe;

import java.util.Scanner;

public class Game {

	// Instance variables //
	
	private final static int MAX_TURNS = 9;
	private int turn = 1;
	
	//---------//
	// Methods //
	//---------//
	
	public int getTurn() {
		return turn;
	}
	
	
	public void incrementTurn() {
		turn++;
	}

	
	public static int getMaxTurns() {
		return MAX_TURNS;
	}

	//--------------------------------------------------------------------------------------//
	//Returns a given input by the player
	
	public int getPlayerInput() {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		return input;
	}
	
	//--------------------------------------------------------------------------------------//
	
	public void playerTurn1(Player player, Board board) {
		board.updateBoard(this, player.getPlayerSymbol());
		turn++;
		board.printBoard();
	}
	
	//--------------------------------------------------------------------------------------//
	
}
