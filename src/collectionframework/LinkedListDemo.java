package collectionframework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>(){{
            add("Sivthean");
            add("MeyMey");
            add("Teacher");
        }};
        names.add("TheanThean");
        names.set(0,"Sky");
        names.remove("Teacher");
        //names.clear();


        String popItem = names.pop();
        names.push("Sun");
        System.out.println("Pop Item is : "+popItem);
        System.out.println("All names : "+names);

        Iterator<String> itr = names.iterator();
        while (itr.hasNext()){
            System.out.println("Name is : "+itr.next());
        }

    }
}
