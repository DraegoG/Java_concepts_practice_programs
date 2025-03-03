package DesignPatterns;

public class SingletonPattern {
    //Make default constructor private
    private SingletonPattern(){

    }

    //make a singleton object private
    private static SingletonPattern singletonPatternObj;

    //make getter synchronized so that only one thread has access to it at a time
    public synchronized SingletonPattern getSingletonPatternObj(){
        if(singletonPatternObj == null){
            singletonPatternObj = new SingletonPattern();
        }
        return singletonPatternObj;
    }


}
