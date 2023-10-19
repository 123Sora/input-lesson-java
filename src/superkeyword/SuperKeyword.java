package superkeyword;
class Animal{
    String color = "White";
}
class Dog extends Animal{
    String color = "Black";
    void printColor(){
        System.out.println(super.color); // prints color of Animal class
        System.out.println(color);       // prints color of Dog class
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printColor();
    }
}
