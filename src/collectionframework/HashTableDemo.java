package collectionframework;

import java.util.HashSet;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<String, String> nameList = new Hashtable<>(){{
           put("bbb", "James Gosling");
           put("ccc", "Sivthean");
           put("aaa", "MeyMey");
           // for HashTable can not be null both key and value
        }};
        System.out.println("Here are the student name : ");
        System.out.println(nameList);


    }
}
