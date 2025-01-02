package AbstractClassesAndInterfaces.ProperExamples.AbstractClass;

public class Car extends Vehicle{

    @Override
    void move() {
        maxSpeed = 50;
        System.out.println("Moving at the rate of: " + maxSpeed + "km/hr");
    }
}
