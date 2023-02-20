package HomeWork28;

import java.util.ArrayList;

public class Task3 {
    /*
    Create an arrayList of words. Remove every word that ends with “e”.
     */
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Tom");
        words.add("Alice");
        words.add("Kate");
        words.add("Sam");
        words.add("Marie");
        words.add("Boris");
        words.removeIf(w -> w.endsWith("e"));
        System.out.println(words);

    }

}
