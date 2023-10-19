package collectionframework;

import java.util.*;

class Student{
    int id;
    String name ;
    String gender ;
    Student(){}
    Student(int id, String name, String gender ){
        this.id = id ;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}'+'\n';
    }
    //equals && hashcode by generator
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name) && Objects.equals(gender, student.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, gender);
    }
}

public class HashSetDemo {
    public static void main(String[] args) {
//        HashSet<String> uniqeNames = new HashSet<>(){{
//            add("Sivthean");
//            add("MeyMey");
//            add("Sky");
//            add("Sun");
//            add("Sivthean");
//            add("Sea");
//        }};
//        uniqeNames.remove("Sun");
//        for (String name : uniqeNames){
//            System.out.println("Name is : "+name);
//        }
//        Iterator<String> itr = uniqeNames.iterator();
//        while (itr.hasNext()){
//            System.out.println("Name -> "+itr.next());
//        }
//        System.out.println("Here are all the names : ");
//        System.out.println(uniqeNames);

//        ArrayList<String> roles = new ArrayList<>(List.of("Customer", "Admin", "Admin", "Customer"));
//        HashSet<String> uniqeRoles = new HashSet<>(roles);
//        roles = new ArrayList<>(uniqeRoles);
//        System.out.println("Roles : "+roles);
        HashSet<Student> students = new HashSet<>(){{
            add(new Student(1001,"Sivthean", "Female"));
            add(new Student(1002,"MeyMey", "Female"));
            add(new Student(1001,"Sivthean", "Female"));
        }};
        System.out.println("Here are all the students : ");
        System.out.println(students);
    }
}
