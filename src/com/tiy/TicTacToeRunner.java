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
        board = new char[][] {{' ',' ',' '}, {' ',' ', ' '}, {' ', ' ',' '}};
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
                    if (gameIsWon()) {
                        playing = false;
                        System.out.println("You win! You're amazing!");
                    }
                } else {
                    System.out.println("That square is already taken");
                }
            }
            computerMove();
            if (gameIsWon()) {
                System.out.println("You are a big fat loser!");
                playing = false;
            }
        }//End game loop
    }

    public void computerMove () {
        Random random = new Random();
        int row = random.nextInt(3);
        int column = random.nextInt(3);
        if (board[row][column] == ' ') {
            board[row][column] = COMPUTER_MOVE;
        }

        if (playerHasWinningMove()) {
        }

         else {
            boolean moveIsGood = false;
            while (!moveIsGood) {

            }
        }
    }

    public boolean playerHasWinningMove () {
        return true;
    }

    public void printBoard () {
        for (char[] row : board) {
            System.out.println(row);
        }


    }
d
    public boolean gameIsWon () {
        return false;
    }
    
}
