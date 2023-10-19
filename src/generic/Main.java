package generic;

import generic.utils.MyGeneric;
import generic.utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {
        Utils.showValues(111, "World");
//        Utils.showValues(12, 19);
//        Utils.showValues(12.5f, 12.222f);
//        Utils.showValues(34, "World");

        int a = 90;
        int b = 90;
        System.out.println("A = B is "+Utils.compareValue(a,b));
        String message = Utils.returnMethod("Hello World");
        System.out.println("Message is : "+message);

        List<Integer> integers = new ArrayList<>(List.of(1,2,3,4,5,6));
        List<Float> floats = new ArrayList<>(List.of(1.1f,2.23f,3.6f,3.4f,3.7f,4.5f));
        Utils.printValues(integers);
        Utils.printValues(floats);

        MyGeneric<String> stringObj = new MyGeneric<>("Hello world ");
        System.out.println(stringObj.getType());
        MyGeneric<Integer> intObj = new MyGeneric<>(1);
        MyGeneric<Float> floatObj = new MyGeneric<>(1.1f);
        System.out.println(intObj.getType());
        System.out.println(floatObj.getType());
    }
}
