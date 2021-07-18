package MAP;

import java.util.HashMap;
import java.util.Map;

public class Foreachjava8 {




    public static void main(String[] args) {

        Map<String, Integer> chandan = new HashMap<>();

        chandan.put("mobilenum ",920659460);
        chandan.put("Age ",20);
        chandan.put("bike num ",5946);
        chandan.put("book ",4);

       System.out.println(chandan.containsKey("book1 "));
       // Without Foreatchloop with Entry inteface
        //Using entryset

//        for(Map.Entry<String, Integer> entry : chandan.entrySet()){
//
//            System.out.println( entry.getKey()+"value"+entry.getValue());
//        }

        // Java 8 new feature with foreatch loop
//        chandan.forEach((k,v)->System.out.println(k +""+v));
    }
}
