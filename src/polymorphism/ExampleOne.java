package polymorphism;
class Polygon{
    //method to render a shape
    public void render(){
        System.out.println("Rendering Polygon......");
    }
}
class Square extends Polygon{
    //renders Square
    public void render(){
        System.out.println("Rendering Square......");
    }

}

class Circle extends Polygon{
    //renders circle
    public void render(){
        System.out.println("Rendering Circle..... ");
    }
}

public class ExampleOne {
    public static void main(String[] args) {
        //create an obj of square
        Square s1 = new Square();
        s1.render();
        //create an obj of circle
        Circle s2 = new Circle();
        s2.render();
    }
}
