package HomeWork28.Task6;

import java.util.ArrayList;
import java.util.Objects;

public class Insurance {
    String insuranceName;

    void getQuote() {

    }

    void cancelInsurance() {

    }

    public static void main(String[] args) {
        Insurance health = new Health();
        Insurance car = new Car();
        Insurance pet = new Pet();

        ArrayList<Insurance> arrayList = new ArrayList<>();
        arrayList.add(health);
        arrayList.add(car);
        arrayList.add(pet);
        for (Insurance insurance : arrayList) {
            insurance.cancelInsurance();
            insurance.getQuote();
        }
    }
}
