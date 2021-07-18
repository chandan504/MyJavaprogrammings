package ByNaveen;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner in= new
                Scanner(System.in);
        int x= in.nextInt();
        if (x%2 == 0)
        {
            System.out.println("The input is even:" +x);
        }
        else {
            System.out.println("The input is Odd: " +x);
        }

    }
}
