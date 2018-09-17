package Classes.Inheritance.Vehicle;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Train", "Train Tracks");
        System.out.println(vehicle.getCategory());
        System.out.println(vehicle.getTerrain());
        vehicle.turnOnEngine();
        vehicle.turnOffEngine();

        Car car = new Car("Car", "misc-grounds", 4,  "Combustion Engine", 0);
        car.turnOnEngine();
        car.acceleration(20);
        car.acceleration(20);
        car.changeGears(3);
        car.acceleration(70);
        car.changeGears(4);

        Corolla corolla = new Corolla("Turbo", "Toyota", "Corolla SXV", "Manual", "Spider", 0);
        corolla.turnOnEngine();
        corolla.acceleration(30);
        corolla.acceleration(30);
        corolla.handSteering("left", "corolla");
        corolla.handSteering("left", "corolla-smw");
    }
}
