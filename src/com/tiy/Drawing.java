package com.tiy;

/**
 * Created by crci1 on 12/7/2016.
 * just testing commit parameters
 */
public class Drawing {

    public static void main(String[] args){
        char[][] test = {{' ', 'X', ' '}, {'O', ' ', 'X'}, {'X', 'X', 'O'}};
        printBoard(test);


    }
    public static void printBoard(char[][] theChar){

        StringBuilder s1 = new StringBuilder("||");
        StringBuilder s2 = new StringBuilder("||");
        StringBuilder s3 = new StringBuilder("||");


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
    }



    public static void paulBadApproach () {
        String[] x = {"\\  /", " \\/ ", " /\\", "/  \\"};
        String[] o = {" oo ", "O  O", "O  O", " oo "};

        //StringBuilder[] response = new StringBuilder[12];

        String[] response = new String[12];

        for (int i = 0; i < response.length; i++) {
            response[i] = "    |    |    ";
        }//Initializing the blank board.

        for (String s : x) {
            System.out.println(s);
        }

        for (int row = 0; row < 3; row++) {
            //StringBuilder line = new StringBuilder("    |    |    ");
            for (int column = 0; column < 3; column++) {
                //char c = test[row][column];
                char c = ' ';
                switch (c) {
                    case ' ':
                        break;

                    case 'X':
                        int lineInResponse = row*4;
                        int columnInResponse = column*4;
                        for (int i = 0; i < 4; i++) {
                            //response[row].insert(columnInResponse, x[i]);

                        }
                        break;
                }
            }
        }
        int line = 0;
        while (line < 4) {
            System.out.println(response[line]);
            line++;
        }
        System.out.println("--------------");
        while (line < 8) {
            System.out.println(response[line]);
            line++;
        }
        System.out.println("--------------");
        while (line < 12) {
            System.out.println(response[line]);
            line++;
        }
    }
}
