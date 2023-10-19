package polymorphism;

class Pattern {
    public void display(){
        for(int i = 0 ; i<10;i++){
            System.out.print("*");
        }
    }
    public void display(char symbol){
        for(int i = 0 ;i<10;i++){
            System.out.print(symbol);
        }
    }
}

public class ExampleThree {
    public static void main(String[] args) {
       Pattern pattern = new Pattern();
        //call method without any argument
        pattern.display();
        System.out.println();
        //call method with a single argument
        pattern.display('#');
    }
}
