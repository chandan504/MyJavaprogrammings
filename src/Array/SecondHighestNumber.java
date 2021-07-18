package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SecondHighestNumber {


    public static void main(String[] args) {

        int first;


 int[] number= {5,10,44,23,3009,999};

 for (int i=1;i<number.length;i++){
     for (int j= i ; j< number.length;j++){

         if (number[i]> number[j]){

             first= number[i];
             number[i]= number[j];
             number[j]= first;

         }

     }

 }
        System.out.println("Third second largest number is:: "+number[number.length-1]);
    }
}
