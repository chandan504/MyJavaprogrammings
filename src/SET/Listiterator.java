package SET;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Listiterator {


    public static void main(String[] args) {
        List<String> c= new LinkedList<>();
        c.add("ddd");
        c.add("dss");
        c.add("dss");
        c.add("dss");
        c.add("dss");
        c.add("dss");


    ListIterator<String> list= c.listIterator();


    while (list.hasNext())
        System.out.println(list.next());


System.out.println("---------------------");

    while (list.hasPrevious())
        System.out.println(list.previous());



    }



}
