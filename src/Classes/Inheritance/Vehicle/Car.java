package Classes.Inheritance.Vehicle;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int speed;

    private String engineType;


    public Car(String category, String terrain, int doors, String engineType, int speed) {
        super(category, terrain);
        this.wheels = 4;
        this.doors = doors;
        this.engineType = engineType;
        this.speed = speed;
    }

    @Override
    public void turnOnEngine() {
        super.turnOnEngine();
    }

    @Override
    public void turnOffEngine() {
        super.turnOffEngine();
    }

    public void handSteering (String direction) {
        if(direction.equals("right")) {
            System.out.println("Turning right");
        }
        System.out.println("Turning left");
    }

    public void changeGears(int gear) {
        if(gear >=1) {
            switch (gear) {
                case 1:
                    System.out.println("You're in " + gear + "st gear at a speed of " + this.speed);
                    break;
                case 2:
                    System.out.println("You're in " + "nd gear at a speed of " + this.speed);
                    break;
                case 3:
                    System.out.println("You're in " + gear + "rd gear at a speed of " + this.speed);
                    break;
                case 4:
                    System.out.println("You're in " + "th gear at a speed of " + this.speed);
                    break;
                case 5:
                    System.out.println("You're in " + "th gear at a speed of " + this.speed);
                    break;
                case 6:
                    System.out.println("You're in " + "th gear at a speed of " + this.speed);
                    break;
            }
        }
    }

    public void acceleration(int speed) {
        int currentSpeed = 0;
        if(speed <=0) {
            super.turnOffEngine();
        }
        super.turnOnEngine();
        currentSpeed = this.speed += speed;
        System.out.println("You're accelerating at speed " + currentSpeed);
    }
}
