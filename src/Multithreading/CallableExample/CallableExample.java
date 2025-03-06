package Multithreading.CallableExample;

import java.util.concurrent.*;

public class CallableExample {

    public static void main(String[] args) {
        PredictFuture predictFuture1 = new PredictFuture(true);
        PredictFuture predictFuture2 = new PredictFuture(false);

        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Future<String> f1 = executorService.submit(predictFuture1);
        Future<String> f2 = executorService.submit(predictFuture2);

        try {
            System.out.println("inside try block");
            System.out.println("Message from future:" + f1.get());
            System.out.println("Message from future:" + f2.get());
        } catch (Exception e){
            System.out.println("Got exception:" + e.getMessage());
        }

        executorService.shutdown();
    }
}


class PredictFuture implements Callable<String> {

    boolean goodOrAwesome = false;

    public PredictFuture(boolean goodOrAwesome){
        this.goodOrAwesome = goodOrAwesome;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(3000);
        return returnFuture();
    }

    private String returnFuture(){
        if(this.goodOrAwesome) {
            return "Your future is awesome";
        }
        return "Your future is good";
    }
}
