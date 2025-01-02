package AbstractClassesAndInterfaces.ProperExamples.Interface;

public class Car implements Vehicle {

    @Override
    public void move() {
        System.out.println("Moving at the rate of: " + maxSpeed + "km/hr");
    }

}
