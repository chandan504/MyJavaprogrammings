package ByNaveen;

import java.util.Scanner;

public class SwipeNumber {


    public static void main(String[] args) {

       // Without third variable
        int X =3;
        int Y =2;

//         X= X-Y;
//         System.out.println(X);
//         Y= X+Y;
//         System.out.println(Y);
//         X= Y-X;
//         System.out.println(X);

       //With third variable
         int temp; //temp == 0
         temp=X;// temp == 3
         X=Y;  // X == 2
         Y=temp;// y== 3 which is temp value


     //   System.out.println(temp);
        System.out.println(X);
        System.out.println(Y);


    }



}
