package com.tiy;

/**
 * Created by crci1 on 12/7/2016.
 * just testing commit parameters
 */
public class Drawing {

    public static void main(String[] args){


    }
    public void something(char[][] theChar){
        theChar = new char[3][3];

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
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);

//        s1.insert(0,"X");
//        s1.insert(2,"X");
//        s1.insert(4,"X");
//        s2.insert(0,"X");
//        s2.insert(2,"X");
//        s2.insert(4,"X");
//        s3.insert(0,"X");
//        s3.insert(2,"X");
//        s3.insert(4,"X");

//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);

//        myTac[0][0] = "O";
//        myTac[0][2] = "X";
//        myTac[0][4] = "X";
//        myTac[1][0] = "O";
//        myTac[1][2] = "X";
//        myTac[1][4] = "X";
//        myTac[2][0] = "X";
//        myTac[2][2] = "X";
//        myTac[2][4] = "X";







    }
}
