package AbstractClassesAndInterfaces.ProperExamples.Interface;

/*
When to use abstract classes:
Abstract classes work well when creating a base class for other classes that share common behavior.
 */
public interface Vehicle {

    int maxSpeed = 50; //Variables are static and final by default
    int seats = 4;
    String subtype = "Vehicle";

    public void move();

    public default void stop(){
        System.out.println("Stopping the vehicle");
    }
}