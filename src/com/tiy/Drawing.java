package com.tiy;

import java.util.HashMap;

public class Drawing {

    public static final String[] X_ARRAY = {"\\  /", " \\/ ", " /\\ ", "/  \\"};
    public static final String[] SPACE_ARRAY = {"    ", "    ", "    ", "    "};
    public static final String[] O_ARRAY = {" oo ", "O  O", "O  O", " oo "};

    private HashMap<Character, String[]> charToBigString;

    public Drawing () {
        charToBigString = new HashMap<Character, String[]>();
        charToBigString.put(new Character(' '), SPACE_ARRAY);
        charToBigString.put(new Character('X'), X_ARRAY);
        charToBigString.put(new Character('O'), O_ARRAY);
    }

    public static void printBoard(char[][] theChar){

        StringBuilder line1 = new StringBuilder("||");
        StringBuilder line2 = new StringBuilder("||");
        StringBuilder line3 = new StringBuilder("||");

        StringBuilder[] lines = {line1, line2, line3};

        for(int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                lines[row].insert(column * 2, theChar[row][column]);
            }
        }
        for (StringBuilder line : lines) {
            System.out.println(line);
        }
    }

    public void printBigBoard(char[][] board) {
        //char[][] board = {{' ', 'X', 'O'}, {' ', ' ', ' '}, {'O', 'X', 'X'}}; For testing
        StringBuilder[] response = new StringBuilder[12];
        for (int i = 0; i < 12; i++) {
            response[i] = new StringBuilder("");
        }
        for (int row = 0; row < 3; row++) {
            char[] rowChars = board[row];
            for (char c : rowChars) {
                for (int i = 0; i < 4; i++) {
                    response[(row * 4) + i].append("|" + charToBigString.get(c)[i]+ "|");
                }
            }
        }

        int row = 0;
        System.out.println("------------------");
        for (; row < 4; row++) {
            System.out.println(response[row]);
        }
        System.out.println("------------------");
        for (; row < 8; row++) {
            System.out.println(response[row]);
        }
        System.out.println("------------------");
        for (; row < 12; row++) {
            System.out.println(response[row]);
        }
        System.out.println("------------------");
    }
}
