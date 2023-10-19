package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value;
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter value (int): ");
            value = input.nextInt();
            System.out.println("Value is : "+value);
        }catch (InputMismatchException ex){// ex as a variable
//            ex.printStackTrace();
            System.out.println("Value must be an integer only!!");
        }
        System.out.println("This is another statement");
    }
}
