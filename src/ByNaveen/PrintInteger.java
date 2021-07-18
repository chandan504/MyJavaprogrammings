package ByNaveen;

import java.util.Scanner;

public class PrintInteger {

    public static void main(String[] args) {
        Scanner scaner= new Scanner(System.in);
        System.out.println("Please enter the number:");
        int number= scaner.nextInt();
        System.out.println("you have entered : "+number);

//        For String we can use below
        System.out.println("Please enter the msg:");
        String msg= scaner.next();
        System.out.println("you have entered : "+msg);

    }
}
