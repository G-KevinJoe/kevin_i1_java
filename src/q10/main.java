package q10;

public class main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.start();
        Car car = new Car();
        car.start();
    }
}

class Vehicle {
    public void start() {
        System.out.println("The vehicle is starting.");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("The car starts when its key is turned.");
    }
}
