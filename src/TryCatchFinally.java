public class TryCatchFinally {
    public static void main(String[] args) {

        int x = tryFinally();
        System.out.println("Value of x:" + x);
    }

    static int tryFinally(){
        try{
            System.out.println("Inside try block");
            return 1;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Ran finally before returning the value in try block!!!");
        }
    }
}
