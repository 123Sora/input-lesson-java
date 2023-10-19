package polymorphism;
class Language {
    public void displayInfo(){
        System.out.println("Common English Language");
    }
}
class Java extends Language {
    @Override
    public void displayInfo() {
        System.out.println("Java Programming Language");
    }
}
public class ExampleTwo {   //method overriding
    public static void main(String[] args) {
        //create an obj of java class
        Java java = new Java();
        java.displayInfo();
        //create an obj of Language class
        Language language = new Language();
        language.displayInfo();
    }
}
