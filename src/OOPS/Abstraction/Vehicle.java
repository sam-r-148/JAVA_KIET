package OOPS.Abstraction;

abstract public class Vehicle {
    int noOfTyre;
    void commonMethod(){
        System.out.println("This is a common method");
    }
    abstract void stop();
    public static void main(String[] args) {
        Car car = new Car();
        car.noOfTyre = 4;
        car.stop();

    }
}
