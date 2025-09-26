//You are given an ArrayList<String> that contains several names. Remove all names that start with the letter "A" (case-insensitive). Print the resulting list

package Collections;

import java.util.ArrayList;

public class PracticeQ2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ajay");
        list.add("Vivek");
        list.add("Ankit");
        list.add("animesh");
        list.add("Parv");
        list.add("Kanika");
        list.removeIf(n -> n.charAt(0) == 'A' || n.charAt(0) == 'a');
        System.out.println(list);


    }
}
