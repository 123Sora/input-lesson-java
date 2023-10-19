package collectionframework;

import java.util.Enumeration;
import java.util.Vector;

public class MainVector {
    public static void main(String[] args) {
        Vector<String> allNames = new Vector<>(){{
            add("Sivthean");
            add("MeyMey");
            add("Tim Berners");
        }};
        //allNames clear
        allNames.remove("Sivthean");
        allNames.add("Sky");
        allNames.set(0,"Moonlight");
        System.out.println("All names : "+allNames);

        Enumeration<String> names = allNames.elements();
        System.out.println("=====================Enumeration========================");
        while (names.hasMoreElements()){
            System.out.println("Name is : "+names.nextElement());
        }
    }
}
