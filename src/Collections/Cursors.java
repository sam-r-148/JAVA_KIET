package Collections;

import java.util.*;

public class Cursors {
    //    cursor : to iterate in collection
//    iterator, listiterator, enumeration - 3 cursors
//    iterator : don't have previous method
//    listiterator : specially for list
//    enumeration : for legacy classes(vectors,stacks)
//    we don't for loop cuz it is not safe it is done explicitly
    public static void main(String[] args) {


        ArrayList list1 = new ArrayList<>();
        list1.add(5);
        list1.add("Sam");
        list1.add(12.4);

        Iterator it = list1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        ArrayList name = new ArrayList<>();
        name.add("Samridh");
        name.add("Subrat");
        name.add("Soham");

        ListIterator lit = list1.listIterator();

        System.out.println("Forward Iteration : ");

        while (lit.hasNext()) {
            System.out.println(lit.next());
        }

        System.out.println("Backward Iteration: ");

        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }

        System.out.println("Enumeration iterator : ");

        Stack list = new Stack();
        list.add(111);
        list.add("wiwwii");
        Enumeration eit = list.elements();

        while (eit.hasMoreElements()) {
            System.out.println(eit.nextElement());
        }

    }

}
