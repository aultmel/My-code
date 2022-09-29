import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {
		char[][] theBoard = new char[3][3];

		int gameStatus = 0; 

		drawBoard(theBoard);
		while (gameStatus == 0) {
			takeTurn(theBoard, true);
			gameStatus = getGameStatus(theBoard);
			drawBoard(theBoard);
			if (gameStatus == 0) {
				takeTurn(theBoard, false);
				gameStatus = getGameStatus(theBoard);
				drawBoard(theBoard);
			}
		}

		if (gameStatus == 1) {
			System.out.println("Player X wins!!!");
		}
		else if (gameStatus == 2) {
			System.out.println("Player O wins!!!");
		}
		else {
			System.out.println("It's a tie!!!");
		}
	}

	public static void drawBoard(char[][] theBoard) {
		for (int i = 0; i < theBoard.length; i++) {
			for (int j = 0; j < theBoard[i].length; j++) {
				System.out.print(theBoard[i][j]);
				if (j != 2) {
					System.out.print("|");
				}
			}
			System.out.println();
			if (i != 2) {
				System.out.println("-----");
			}
		}
	}

	public static void takeTurn(char[][] theBoard, boolean isXsTurn) {
		Scanner scnr = new Scanner(System.in);

		char player = 'X';
		if (!isXsTurn) {
			player = 'O';
		}

		System.out.println("Player " + player + "'s turn");
		System.out.println("---------------");

		System.out.println("Enter the row (0-2) and column (0-2) where you'd like to move:");
		boolean inputValid = false;
		do {
			int row = scnr.nextInt();
			int col = scnr.nextInt();

			if (row < 0 || row > 2 || col < 0 || col > 2) {
				System.out.println("Row and col must both be between 0-2!");
			}
			else if (theBoard[row][col] == 'X' || theBoard[row][col] == 'O') {
				System.out.println("Hey, there's already a piece there! Who do you think you are?");
			}
			else {
				theBoard[row][col] = player;
				inputValid = true;
			}
		} while (!inputValid);
	}

	public static int getGameStatus(char[][] theBoard) {
		if (playerHasWon(theBoard, 'X')) {
			return 1;
		}
		if (playerHasWon(theBoard, 'O')) {
			return 2;
		}

		int count = 0;
		for (int i = 0; i < theBoard.length; i++) {
			for (int j = 0; j < theBoard[i].length; j++) {
				if (theBoard[i][j] == 'X' || theBoard[i][j] == 'O') {
					count++;
				}
			}
		}
		return count == 9 ? 3 : 0;

	}
	public static boolean hasPlayerWon(char[][] theBoard, char player) {
		if (	theBoard[0][0] == player && theBoard[0][1] == player && theBoard[0][2] == player ||
				theBoard[1][0] == player && theBoard[1][1] == player && theBoard[1][2] == player ||
				theBoard[2][0] == player && theBoard[2][1] == player && theBoard[2][2] == player ||
				theBoard[0][0] == player && theBoard[1][0] == player && theBoard[2][0] == player ||
				theBoard[0][1] == player && theBoard[1][1] == player && theBoard[2][1] == player ||
				theBoard[0][2] == player && theBoard[1][2] == player && theBoard[2][2] == player ||
				theBoard[0][0] == player && theBoard[1][1] == player && theBoard[2][2] == player ||
				theBoard[0][2] == player && theBoard[1][1] == player && theBoard[2][0] == player) {
			return 1;
		}
		return false;
	}
}