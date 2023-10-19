package collectionframework;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {

        //create a HashMap
        HashMap<Integer, String> studentInfos = new HashMap<>(){{
            put(1000, "Sky studied at RUPP too");
            put(1004, "Sun studied at CSTAD too");
            put(null, null);
            put(null, "Moon studied at AUPP");
        }};

        //add elements to hashmap
        studentInfos.put(1001, "Sivthean studied at RUPP");
        studentInfos.put(1002, "MeyMey studied at CSTAD");
        studentInfos.put(1003, "Teacher studied at UC");

        System.out.println("Here are students information : ");
        System.out.println(studentInfos);

        //loop
        System.out.println("Key is 1001 : "+studentInfos.get(1001)); //access hashmap element
//        Set<Integer> keys = studentInfos.keySet(); or  using like below
        Set<Integer> keys = new HashSet<>(studentInfos.keySet());
        System.out.println("All Keys are : "+keys);

        //print value based on key
        for (Integer key : keys ){
            System.out.println("Key : "+key+" => "+studentInfos.get(key));

        }

        System.out.println("=====================<<Using EntrySet>>==================");
        Set<Map.Entry<Integer,String>> entries = studentInfos.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println("Key : "+entry.getKey()+","+"Value is "+entry.getValue());
        }

        //stream
        System.out.println("====================Printing using Stream=======================");
        studentInfos.keySet().forEach(e-> System.out.println(studentInfos.get(e)));
    }
}
