package AbstractClassesAndInterfaces.ForUnderstandignAndTryOut;

public class TryAbstractExample {

    public static void main(String[] args) {
        ExtendAbstractExample extendAbstractExample = new ExtendAbstractExample();
        extendAbstractExample.abstractMethod1();
        extendAbstractExample.printHello();

        System.out.println("Printing value of the dummyInt:" + extendAbstractExample.dummyInt);
    }
}
