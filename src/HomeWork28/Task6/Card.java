package HomeWork28.Task6;

import java.util.ArrayList;

public class Card {
    int interestRate;
    String cardType;

    Card(int interestRate, String cardType){
        this.interestRate=interestRate;
        this.cardType=cardType;
    }

    void print(){
        System.out.println("Interest rate "+interestRate+". Card type "+cardType+".");

    }

    public static void main(String[] args) {
        Card obj1=new Card(3,"Gold");
        Card obj2=new Card(4,"Platinum");
        Card obj3=new Card(5,"World");

        ArrayList<Card> arrayList=new ArrayList<>();
        arrayList.add(obj1);
        arrayList.add(obj2);
        arrayList.add(obj3);

        for (Card card: arrayList){
            card.print();
        }


    }
}
