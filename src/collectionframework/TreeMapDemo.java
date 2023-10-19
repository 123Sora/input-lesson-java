package collectionframework;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Student> students = new TreeMap<>(){{
            put("M-1001",new Student(1001, "Sivthean", "Female"));
            put("M-1002",new Student(1002, "MeyMey", "Female"));
            put("F-999",new Student(1003, "Sun", "Male"));
            put("A-1000",new Student(998, "Moon", "Female"));
        }};
        System.out.println(students);


        TreeMap<String, String> nameList = new TreeMap<>(){{
            put("ttt", "This is ttt values ");
            put("ccc", "This is ccc values ");
            put("aaa", "This is aaa values ");
            put("fff", null);   //'for' key can not 'null' but 'value' can be 'null'
        }};
        System.out.println(nameList);
        //using descendingSet() method to descending order.
        System.out.println(new TreeSet<>(nameList.keySet()).descendingSet());

    }
}
