package generic.utils;

import java.util.List;
import java.util.Objects;

interface IFeatures{
    void loggin();
}
public class Utils {
    public static <T> void  showValues(T a, T b){
        if(a instanceof Integer){
            System.out.println("========== This is integer =================");
        }
        System.out.println("Value a is : "+a);
        System.out.println("Value b is : "+b);
    }
    public static <T> boolean compareValue(T a , T b ){
        return Objects.equals(a,b);
    }
    public static <T> T returnMethod(T a){
        return a;
    }
    //wildcard upperbound
    public static void printValues(List<? extends Number> numbers){
        System.out.println("Here are all numbers : ");
        for(Number a : numbers){
            System.out.println(a+" ");
        }
        System.out.println();
    }
    //lowwerbound
//    public static void printValues (List<? super Number > numbers){
//
//    }
    public static void printMyObjects(List<? extends IFeatures> myObjects){
//        if (IFeatures obj : myObjects){
//
//        }
    }
}
