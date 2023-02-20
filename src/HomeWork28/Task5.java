package HomeWork28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task5 {
    /*
    5)Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
     */
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 500; i++) {
            numbers.add(i);
        }
        Iterator<Integer> iterator= numbers.iterator();
        while (iterator.hasNext()){
            int s= iterator.next();
            if(s%5==0){
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }

}
