package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SecondHighestNumber {


    public static void main(String[] args) {
        int temp;
 int[] number= {5,10,44,23,3009,999};

 for (int i=0;i<number.length;i++){

     for (int j= i+1; j< number.length;j++){
         if (number[i]< number[j]){    // ame dekhuche ki number[i] jauta ki 5, alaga number tharu kam ki kaniki
                                      //na j loop pura complete habba
             temp= number[i];        //temp re pureile number[i] ku jauta ki 5 amara darkar nahi
             number[i] = number[j]; //number[i] re pureile number[j] ku jauta ki bada aau amara bada hidarkar aaur badaru sana krame ame sajeiba
             number[j]= number[i]; //ethi ame number j re number i ku pureidele jauta ki sana , aau second re rahila aau next loop re check rahila

         }
     }
 }
        System.out.println("Third second largest number is:: "+number[0]);
    }
}
