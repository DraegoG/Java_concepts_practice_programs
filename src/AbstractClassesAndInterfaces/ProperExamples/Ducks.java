package AbstractClassesAndInterfaces.ProperExamples;

public class Ducks extends Animal implements Swimable, Flyable {

    Ducks(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Ducks can swim");
    }

    @Override
    public void fly() {
        System.out.println("Ducks can fly");
    }

    @Override
    void makeSound() {
        System.out.println("Quack quack");
    }

    public static void main(String[] args) {
        Ducks duck1 = new Ducks("Duck");
        duck1.makeSound();
    }
}




interface Swimable{
    void swim();
}

interface Flyable{
    void fly();
}

abstract class Animal{
    String name;
    String []eatingOptions;

    Animal(String name){
        this.name = name;
    }

    void setEatingOptions(String []options){
        eatingOptions = options;
    }

    public void eat(){
        System.out.println("It eats:" + eatingOptions);
    }

    abstract void makeSound();
}