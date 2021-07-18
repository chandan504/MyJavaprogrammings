package Program;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Count_duplicate {

//   The concept over here is we are taking one string and changing it to char array , the purpose of changing it is to count each character
//    after that using a hasmap and checking if character is not in map we are giving the count as 1 else exsting+1


    public static void main(String[] args) {

        String s= "my_wife_name_is_reena";
        char[]  second= s.toCharArray();

        HashMap<Character,Integer> duplicateStore = new HashMap<>();
        int i=0;
        while(i<s.length()){

            if (duplicateStore.containsKey(second[i])== false)
            {
                duplicateStore.put(second[i], 1);
            }
       else {

                duplicateStore.put(second[i], duplicateStore.get(second[i])+1);
            }

            ++i;
        }

        System.out.println(duplicateStore);
    }

    }

