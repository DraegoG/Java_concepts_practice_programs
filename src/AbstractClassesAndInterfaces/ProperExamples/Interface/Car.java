package AbstractClassesAndInterfaces.ProperExamples.Interface;

public class Car implements Vehicle {
    String subtype = "Car"; //overriding the variables is also possible
    int seats = 2; //overriding the variables is also possible
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.accelerate();
//        Vehicle.accelerate();
        car1.move();
        car1.stop();
//        Vehicle.super.stop();  //you can't call it directly but can be called using another method as in line 16
    }

    @Override
    public void move() {
        System.out.println(subtype + " has:" + seats + " seats, moving at the rate of: " + maxSpeed + "km/hr");
        Vehicle.super.stop();
    }

    @Override
    public void stop(){
        System.out.println("Stopping the vehicle from Car class");
    }

    void accelerate() { //overriding the static method is also possible
        System.out.println("accelerating the car");
    }
}