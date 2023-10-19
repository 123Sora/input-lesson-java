package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListYT {
    public static void main(String[] args) {
        //How to create an ArrayList using the ArrayList() constructor
        //Add new elements to an ArrayList using the add() method
        //created arraylist object
//        List<String> fruits = new ArrayList<>();
//        fruits.add("Banana");
//        fruits.add("Apple");
//        fruits.add("Mango");
//        fruits.add("Orange ");
//        System.out.println(fruits);



        //How to create an ArrayList from another collection using the
        //ArrayList using the addAll() method
        //create arraylsit object
        List<Integer> firstFiveElement = new ArrayList<>();
        firstFiveElement.add(22);
        firstFiveElement.add(33);
        firstFiveElement.add(88);
        firstFiveElement.add(11);
        firstFiveElement.add(34);
        firstFiveElement.add(90);

        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFiveElement);
        List<Integer> nextFiveElement = new ArrayList<>();
        nextFiveElement.add(4 );
        nextFiveElement.add(6);
        nextFiveElement.add(7);
        nextFiveElement.add(8);
        nextFiveElement.add(10);
        nextFiveElement.add(9);

        firstFiveElement.addAll(nextFiveElement);
        System.out.println(firstFiveElement);
    }
}

