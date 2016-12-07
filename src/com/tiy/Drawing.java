package com.tiy;

/**
 * Created by crci1 on 12/7/2016.
 * just testing commit parameters
 */
public class Drawing {

    public static void main(String[] args){
        char[][] test = {{' ', 'X', ' '}, {'O', ' ', 'X'}, {'X', 'X', 'O'}};
        //something(test);


    }
    public static void something(char[][] theChar){
        //theChar = new char[3][3];

        StringBuilder s1 = new StringBuilder(" | | ");
        StringBuilder s2 = new StringBuilder(" | | ");
        StringBuilder s3 = new StringBuilder(" | | ");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        if(theChar[0][0] == 'X'|| theChar[0][0]=='O'){
            s1.insert(0,theChar[0][0]);
        }else if (theChar[0][1]== 'X'|| theChar[0][1] =='O') {
            s1.insert(2,theChar[0][1]);
        }else  if (theChar[0][2]== 'X'|| theChar[0][2] =='O') {
            s1.insert(4, theChar[0][2]);
        }else if (theChar[1][0]== 'X'|| theChar[1][0] =='O') {
            s2.insert(0, theChar[0][1]);
        }else if (theChar[1][1]== 'X'|| theChar[1][1] =='O') {
            s2.insert(2, theChar[1][1]);
        }else if (theChar[1][2]== 'X'|| theChar[1][2] =='O') {
            s2.insert(4, theChar[0][1]);
        }else if (theChar[2][0]== 'X'|| theChar[2][0] =='O') {
            s3.insert(0, theChar[2][0]);
        }else if (theChar[2][1]== 'X'|| theChar[2][1] =='O') {
            s3.insert(2, theChar[2][1]);
        }else if (theChar[2][2]== 'X'|| theChar[2][2] =='O') {
            s3.insert(4, theChar[2][2]);
        }

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
