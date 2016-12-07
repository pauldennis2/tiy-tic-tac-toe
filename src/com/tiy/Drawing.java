package com.tiy;

public class Drawing {

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
}
