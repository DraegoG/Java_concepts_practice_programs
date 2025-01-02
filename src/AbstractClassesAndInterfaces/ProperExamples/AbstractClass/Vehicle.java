package AbstractClassesAndInterfaces.ProperExamples.AbstractClass;

/*
When to use abstract classes:
Abstract classes work well when creating a base class for other classes that share common behavior.
 */
public abstract class Vehicle {

    int maxSpeed;
    int seats;
    String subtype;

    abstract void move();

    public void stop(){
        System.out.println("Stopping the vehicle");
    }
}