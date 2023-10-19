package encapsulation;
//Encapsulation = attributes of a class will be hidden or private
//                can be accessed only through methods (getters and setters )
//                 You should make attributes private if you do not have a reason to make them public/ protected

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Rang Rover", "Camaro", 2022);
        car.setYear(2021);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}


