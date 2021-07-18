package SET;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class HassetBasic {

//    public class HashSet<E>
//            extends AbstractSet<E>
//            implements Set<E>, Cloneable, java.io.Serializable
//
//    Key points:
//    HashSet is sub class of AbstractSet class.
//    Underlying data structure of HashSet is HashTable.
//            HashSet implements Serializable and Cloneable interfaces
//    HashSet does not allow duplicate elements.
//    Insertion order is not preserved. No order(Based on hashcode of objects)

//    get size of hashset
public static void main(String[] args) {
    LinkedHashSet<String> basic= new LinkedHashSet<>();

    String removeElem = "kunu";

    basic.add("chandan");
    basic.add("chandan");  // no duplicate
    basic.add("subu");
    basic.add("kunu");
    basic.add("rool no");
    // System.out.println(basic.size());


  Iterator<String> l =  basic.iterator();

//     How to add number
      while (l.hasNext())
       System.out.println(l.next());

            // System.out.println(l.next());
        //   How to remove an element from collection using Iterator object?

    Iterator<String> e= basic.iterator();
    while (e.hasNext())
       if (removeElem.equals(e.next())) {
           e.remove();
       }

      System.out.println(basic);




}


}
