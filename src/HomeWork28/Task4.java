package HomeWork28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Task4 {
    /*
    Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
     */
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Cola");
        drinks.add("Juice");
        drinks.add("Whisky");
        drinks.add("Beer");
        drinks.add("Vodka");

        ListIterator<String> iterator=drinks.listIterator();

        while (iterator.hasNext()){
            String s= iterator.next();
            if(s.contains("a")||s.contains("e")){
                iterator.remove();
                iterator.add("Water");
            }
        }
        System.out.println(drinks);




    }
}

