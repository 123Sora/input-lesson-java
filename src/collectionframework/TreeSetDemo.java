package collectionframework;

import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //can't store null values 
        TreeSet <String> names = new TreeSet<>(
                List.of("z-index","apple","Orange","mango","apple"));

        //ascending order
        System.out.println("Name : "+names);
        //descending order
        System.out.println("Name in descending order is : "+names.descendingSet());
    }
}
