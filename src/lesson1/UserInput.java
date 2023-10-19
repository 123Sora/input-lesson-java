package lesson1;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter some of number : ");
        int user_input = userinput.nextInt();
        System.out.println("The entered value is ");
        System.out.println(user_input);
        System.out.println("Add again");

    }
}
