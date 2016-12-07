package com.tiy;

public class Drawing {

    public static void printBoard(char[][] theChar){

        StringBuilder s1 = new StringBuilder("||");
        StringBuilder s2 = new StringBuilder("||");
        StringBuilder s3 = new StringBuilder("||");

        for(int row = 0; row < 3; row++){
            for (int column = 0; column < 3; column++){
                s1.insert(0, theChar[0][0]);
                s1.insert(2, theChar[0][1]);
                s1.insert(4, theChar[0][2]);
                s2.insert(0, theChar[1][0]);
                s2.insert(2, theChar[1][1]);
                s2.insert(4, theChar[1][2]);
                s3.insert(0, theChar[2][0]);
                s3.insert(2, theChar[2][1]);
                s3.insert(4, theChar[2][2]);

                System.out.println(s1);
                System.out.println(s2);
                System.out.println(s3);
                System.out.println();

            }
        }
    }
}
