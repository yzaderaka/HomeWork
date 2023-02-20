package HomeWork28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    /*
    Create an arraylist of cars and retrieve all the values using 3 different ways.
    */
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Tesla");
        cars.add("Lexus");
        // first way
        System.out.println(cars);
// second way
        Iterator ir= cars.iterator();
        while (ir.hasNext()){
            System.out.print(ir.next()+" ");
        }

        System.out.println();
        // third way
        for (String str:cars){
            System.out.print(str+" ");
        }


    }
}
