package classandobject;

public class ClassAndObject {
    public static void main(String[] args) {
        System.out.println("Hello Java Programming ");
        //to create object from user
        User user = new User();
        user.register("Sivthean", "Svithean@gmail.com","Student","1234567");
        user.getinfo();

        System.out.println("---------------------------------");

        User user1 = new User();
        user1.register("Sora", "Sora@gmail.com","Studetn","54321");
        user1.getinfo();
    }
}
