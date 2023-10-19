package collectionframework;


import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        //class , wrapper class , not for  primitive
//        List <String> name = new ArrayList<>();
//            name.add("Sivthean");
//            name.add("October");
//
//        System.out.println("All names are : "+name );

//        List <String> name = new ArrayList<>(List.of("Siv","thean","October","Moon"));
//        System.out.println(name);

        List<String > name = new ArrayList<>(){{
            add("Siv");
            add("thean");
            add("Moon");
        }};

        //For loop
        for(int i = 0 ; i < name.size();i++){
            System.out.println("Name : "+(i+1)+" :"+name.get(i));
        }

        System.out.println("==========Using foreach loop=================");
        for (String names : name){
            System.out.println("Name is : "+names);
        }
        name.add("Sun");
        name.set(0,"Sky");

        //name clear()
        name.remove("thean");
        //name.remove(3)
        name.add(0,"Moonlight");

        System.out.println("Sky at index : "+name.indexOf("Sky"));
        System.out.println("Total element : "+name.size());
        System.out.println("name at index 3 : "+name.get(3));
        System.out.println("All names are : "+name);

    }
}
