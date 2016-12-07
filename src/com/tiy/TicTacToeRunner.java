package com.tiy;

import java.util.Arrays;
import java.util.Random;

public class TicTacToeRunner {

    public static final char COMPUTER_MOVE = 'X';
    public static final char PLAYER_MOVE = 'O';

    char[][] board;
    SafeScanner scanner;
    Random random;

    private boolean playing = true;

    private boolean sassy;

    public static void main(String[] args) {
        new TicTacToeRunner().run();
    }

    public TicTacToeRunner () {
        board = new char[][] {{' ',' ',' '}, {' ',' ', ' '}, {' ', ' ',' '}};
        scanner = new SafeScanner(System.in);
        random = new Random();
    }

    public TicTacToeRunner (int size) {
        scanner = new SafeScanner(System.in);
        board = new char[size][size];
        for (char[] row : board) {
            Arrays.fill(row, ' ');
        }

    }

    public void run () {
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("Sassy mode?");
        sassy = scanner.nextYesNoAnswer();

        while (playing) { //Overall game loop
            playerMove();
            //Player's move is inputted; check to see if board is full.
            if (boardIsFull()) {
                if (sassy) {
                    System.out.println("It's a tie. You couldn't even beat this lame CPU.");
                } else {
                    System.out.println("It's a tie. No one wins.");
                }
                playing = false;
            }
            if (playing) {
                System.out.println("Computer's turn");
                Drawing.printBoard(board);
                computerMove();
            }
        }//End game loop
    }

    public void playerMove () {
        boolean moveIsGood = false;
        while (!moveIsGood) { //getting the user's move
            Drawing.printBoard(board);
            System.out.println("Please input move row");
            int row = scanner.nextIntInRange(0, 2);
            System.out.println("Please input move column");
            int column = scanner.nextIntInRange(0, 2);
            if (board[row][column] == ' ') { //User's desired move is empty
                moveIsGood = true;
                board[row][column] = PLAYER_MOVE;
                if (gameIsWon(board)) {
                    playing = false;
                    System.out.println("You win! You're amazing!");
                    if (sassy) {
                        System.out.print("This program is the Deep Blue of Tic-Tac-Toe");
                        System.out.println(" but somehow you managed to win! Call Guiness!");
                    }
                }
            } else { //User's move is no good
                if (sassy) {
                    System.out.println("You dummy, you can't move there. It's already taken.");
                } else {
                    System.out.println("That square is already taken");
                }
            }
        }
    }

    public void computerMove () {
        int playerHasWinningMove = playerHasWinningMove();
        if (playerHasWinningMove == -1) { //Player does not have a winning move
            boolean moveIsGood = false;
            while (!moveIsGood) {
                int row = random.nextInt(3);
                int column = random.nextInt(3);
                if (board[row][column] == ' ') {
                    board[row][column] = COMPUTER_MOVE;
                    moveIsGood = true;
                }
            }
        }
         else {
              int column = playerHasWinningMove % 10;
              int row = (playerHasWinningMove - column) / 10;
              if (board[row][column] == ' ') { //Should be true
                  board[row][column] = COMPUTER_MOVE;
                  if (sassy) {
                      System.out.println("Haha! I blocked you.");
                  }
              } else {
                  System.out.println("Error in playerHasWinningMove()");
              }
        }
        if (gameIsWon(board)) {
            if (sassy) {
                System.out.println("You are a big fat loser!");
                System.out.println("You couldn't even beat the CPU which moves randomly! Ha!");
            } else {
                System.out.println("The computer won. Better luck next time!");
            }

            playing = false;
        }
    }
    /*  If the player does have a winning move, returns the move in the form:
            Row = tensdigit
            Column = onesdigit
        Else returns -1
        Will return the first winning move it finds starting at top left and reading down, the middle row and down, etc.
    */
    public int playerHasWinningMove () {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column ++) {
                if (playerHasWinningMoveAt(row, column)) {
                    int response = row*10 + column;
                    return response;
                }
            }
        }
        return -1;
    }

    /**
     *
     * @param row - row of the move in question
     * @param column - column of the move in question
     * @return True if the human can win with the given move; false otherwise;
     */
    public boolean playerHasWinningMoveAt (int row, int column) {
        char[][] theoreticalBoard = {{board[0][0], board[0][1], board[0][2]},
                                        {board[1][0], board[1][1], board[1][2]},
                                        {board[2][0], board[2][1], board[2][2]}};

        if (theoreticalBoard[row][column] == ' ') {
            theoreticalBoard[row][column] = PLAYER_MOVE;
        }
        return gameIsWon (theoreticalBoard);
    }

    public boolean gameIsWon (char[][] thisBoard) {
        return (rowWinner(thisBoard) || columnWinner(thisBoard) || diagonalWinner(thisBoard));
    }

    public boolean rowWinner (char[][] thisBoard) {
        for (int row = 0; row < 3; row++) {
            char c = thisBoard[row][0];//Starting from the leftmost char in the row
            if (c == ' ') {
                continue;
            }
            if (c == thisBoard[row][1]) {
                if (c == thisBoard[row][2]) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean columnWinner (char[][] thisBoard) {
        for (int column = 0; column < 3; column++) {
            char c = thisBoard[0][column];//Starting from the top char in the column
            if (c == ' ') {
                continue;
            }
            if (c == thisBoard[1][column]) {
                if (c == thisBoard[2][column]) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean diagonalWinner (char[][] thisBoard) {
        char c = thisBoard[0][0];
        if (c != ' ') {
            if (c == thisBoard[1][1]) {
                if (c == thisBoard[2][2]) {
                    return true;
                }
            }
        }
        c = thisBoard[2][0];
        if (c != ' ') {
            if (c == thisBoard[1][1]) {
                if (c == thisBoard[0][2]) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean boardIsFull () {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                if (board[row][column] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
