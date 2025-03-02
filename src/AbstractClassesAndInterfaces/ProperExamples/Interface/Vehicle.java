package AbstractClassesAndInterfaces.ProperExamples.Interface;

/*
When to use abstract classes:
Abstract classes work well when creating a base class for other classes that share common behavior.
 */
public interface Vehicle {

    int maxSpeed = 20; //Variables are static and final by default
    int seats = 2;
    String subtype = "Vehicle";

    public void move();

    default void stop(){
        System.out.println("Stopping the vehicle from interface");
    }

    static void accelerate() {
        System.out.println("accelerating");
    }
}