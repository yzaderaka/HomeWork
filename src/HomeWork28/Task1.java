package HomeWork28;

import java.util.ArrayList;

public class Task1 {
    /*
     Create an ArrayList that will store 5 names into it.
     Find out whether the given ArrayList is empty or not?
     Check whether the specific name is present in an ArrayList or not?
     Find the size of your arrayList and print all values from that
     */
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Yaroslav");
        names.add("Nina");
        names.add("Boris");
        names.add("Victoria");
        names.add("Oleksander");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Yaroslav"));
        System.out.println(names.size());
        // one way to print
        System.out.println(names);
        // another way
        for (String str : names) {
            System.out.println(str);
        }
    }
}
