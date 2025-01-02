package AbstractClassesAndInterfaces.ForUnderstandignAndTryOut;

public abstract class AbstractClassExample {
//    And abstract class can have:
//    1. abstract method
//    2. Method implementation
//        Can have private methods
//        Can have static methods
//    3. Instance variables
//        Can have final variables
//        Can have static variables
//    4. Constructors

    abstract void abstractMethod1();

    public void printHello(){
        System.out.println("Hello world from abstract class");
    }

    public int dummyInt = 20;

    public AbstractClassExample(){

    }
}
