package Arrtlist;

import java.util.ArrayList;
import java.util.ListIterator;

public class IterateArrayList {

    public static void main(String[] args) {
        ArrayList<String> chandan= new ArrayList<>();
        chandan.add("name");
        chandan.add("rollno");
        chandan.add("adress");
        chandan.add("mobilenum");
        chandan.add("name");
        chandan.add(2,"my roll");
        chandan.size();

        System.out.println(chandan.clone());

        ListIterator E= chandan.listIterator();
        while (E.hasNext())
        System.out.println(E.next());


        while (E.hasPrevious())
        System.out.println(E.previous());

    }

}
