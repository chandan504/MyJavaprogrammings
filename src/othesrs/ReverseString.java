package othesrs;

public class ReverseString



{

    public static void main(String[] args) {

//      String demo= "Deeppika chandan Santosh";
//        char[] afterchar= demo.toCharArray();
//        List<Character> addme= new LinkedList<>();
//        for (char c : afterchar)
//            addme.add(c);
//        Collections.reverse(addme);
//        ListIterator<Character> li= addme.listIterator();
//        while (li.hasNext()){
//
//            System.out.print(li.next());
//        }
//---------------------------------------------------------------------------------------

        //With charAt(i) function

//   String Original,Reverse = " ";
//
//
//        Original   = "chandan";
//      for (int i = Original.length()-1;i>=0;i--)
//          Reverse = Reverse + Original.charAt(i);
//          System.out.print(Reverse);




//---------------------------------------------------------------------------------------
        //  With toCharArray() function
//      String chndan=  "mkwmfksmfk3wmefkmkwefkk3";
//char[] c= chndan.toCharArray();
//for (int i= c.length-1;i>=0;i--)
//    System.out.print(c[i]);
//
//    }

//        ---------------------------------------------------------------------------------
    //    String Reverse using Recursion


        String str = "Welcome To Edureka";
       String[] straray= str.split(" ");
       System.out.println(straray.length);
       for (String s: straray)
       {
       System.out.println(s);
       }

       for(int i=0;i<straray.length;i++) {

           char[] c = straray[i].toCharArray();
           for (int j = c.length- 1; j >= 0; j--)
           {
               System.out.print(c[j]);
           }


       }
    }
}
