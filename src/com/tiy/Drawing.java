package com.tiy;

/**
 * Created by crci1 on 12/7/2016.
 * just testing commit parameters
 */
public class Drawing {

    public static void main(String[] args){
        something();

    }
    public static void something(){
        System.out.println("yo");
        String[][] myTac = new String[][]{{" ","_|"," ","|_"," "},
                                          {" "," |"," ","|_"," "},
                                          {" ","-|"," ","|-"," "}};

        StringBuilder s1 = new StringBuilder("X|X|X");
        StringBuilder s2 = new StringBuilder("X|O| ");
        StringBuilder s3 = new StringBuilder(" || ");
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s3.length());
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        s1.insert(0,"X");
        s1.insert(2,"X");
        s1.insert(4,"X");
        s2.insert(0,"X");
        s2.insert(2,"X");
        s2.insert(4,"X");
        s3.insert(0,"X");
        s3.insert(2,"X");
        s3.insert(4,"X");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

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
