package AbstractClassesAndInterfaces.ForUnderstandignAndTryOut;

public interface InterfaceExample1 {
//    An interface can have:
//    1. A method definition specified with default keyword
//        Can NOT have private methods
//        Can have static methods
//        Can have final methods
//    2. An instance variable
//        Can have static variables
//        Can have final variables
//    3. An abstract method with no definition
//    NOTE: it does NOT allow constructor

    public default void printHello1(){
        System.out.println("Hello from interface1");
    }

    public  int dummyIntInsideInterface = 10;

    public void methodWithNoDefinition();

}
