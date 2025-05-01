package AbstractClassesAndInterfaces.ForUnderstandignAndTryOut;

public class ExtendAbstractExample extends AbstractClassExample{



    public static void main(String[] args) {
        AbstractClassExample ab = new AbstractClassExample() {
            @Override
            void abstractMethod1() {

            }
        };


    }

    //compulsory to implement the method in child class
    @Override
    void abstractMethod1() {

    }
}

