package ByNaveen;

import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char c= in.next().charAt(0);
        if (c=='a'|| c== 'e'||c=='i'||c=='o'||c=='u'){
            System.out.println("The provided charecter is vowel");

        }
        else{
            System.out.println("The provided charcter is constant");
        }


        switch(c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("constant");

        }


    }
}
