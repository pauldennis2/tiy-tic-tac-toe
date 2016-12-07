package com.tiy;

import java.util.Random;

public class TicTacToeRunner {

    public static final char COMPUTER_MOVE = 'X';
    public static final char PLAYER_MOVE = 'O';

    char[][] board;
    SafeScanner scanner;

    private boolean playing = true;

    public static void main(String[] args) {
        new TicTacToeRunner().run();
    }

    public TicTacToeRunner () {
        board = new char[][] {{' ',' ',' '}, {' ', ' ', ' '}, {' ', ' ',' '}};
        scanner = new SafeScanner(System.in);
    }

    public void run () {
        System.out.println("Welcome to Tic Tac Toe!");
        printBoard();
        while (playing) { //Overall game loop
            boolean moveIsGood = false;
            while (!moveIsGood) { //getting the user's move
                printBoard();
                System.out.println("Please input move row");
                int row = scanner.nextIntInRange(0, 2);
                System.out.println("Please input move column");
                int column = scanner.nextIntInRange(0, 2);
                if (board[row][column] == ' ') {
                    moveIsGood = true;
                    board[row][column] = PLAYER_MOVE;
                    if (gameIsWon(board)) {
                        playing = false;
                        System.out.println("You win! You're amazing!");
                    }
                } else {
                    System.out.println("That square is already taken");
                }
            }
            computerMove();
            if (gameIsWon(board)) {
                System.out.println("You are a big fat loser!");
                playing = false;
            }
        }//End game loop
    }

    public void computerMove () {
        Random random = new Random();
        int playerHasWinningMove = playerHasWinningMove();
        if (playerHasWinningMove == -1) { //Player does not have a winning move
            boolean moveIsGood = false;
            while (!moveIsGood) {
                int row = random.nextInt(3);
                int column = random.nextInt(3);
                if (board[row][column] == ' ') {
                    board[row][column] = COMPUTER_MOVE;
                }
            }

        }
         else {
              int column = playerHasWinningMove % 10;
              int row = (playerHasWinningMove - column) / 10;
              if (board[row][column] == ' ') { //Should be true
                  board[row][column] = COMPUTER_MOVE;
              } else {
                  System.out.println("Error in playerHasWinningMove()");
              }
        }
    }
    //If the player does have a winning move, returns the move in the form:
        //Row = tensdigit
        //Column = onesdigit
    //Else returns -1
    public int playerHasWinningMove () {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column ++)
            {
                //if (playerHasWinningMoveAt(row, column))
            }
        }
        return -1;
    }
    
    public boolean playerHasWinningMoveAt (int row, int column) {
        char[][] theoreticalBoard = {{board[0][0], board[0][1], board[0][2]},
                                        {board[1][0], board[1][1], board[1][2]},
                                        {board[2][0], board[2][1], board[2][2]}};
        theoreticalBoard[row][column] = PLAYER_MOVE;
        return gameIsWon (theoreticalBoard);
    }

    public void printBoard () {
        for (char[] row : board) {
            System.out.println(row);
        }
    }

    public boolean gameIsWon (char[][] thisBoard) {
        return rowWinner(thisBoard) && columnWinner(thisBoard) && diagonalWinner(thisBoard);
    }

    public boolean rowWinner (char[][] thisBoard) {

        return false;
    }
    public boolean columnWinner (char[][] thisBoard) {
        return false;
    }
    public boolean diagonalWinner (char[][] thisBoard) {
        return false;
    }

}
