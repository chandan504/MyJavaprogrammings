package STRING;

public class Duplicate {
//july 18 commit
    public static void main(String[] args) {
        String str= "beautiful bird";
        char[] charry= str.toCharArray();
        for (int i= 0; i< str.length();i++)
             {
         for (int j= i+1;j<str.length();j++)
              {
                  if (charry[i] == charry[j]) {
                      System.out.print(charry[j] + " ");
                      break;
                  }
              }
             }


    }

}
