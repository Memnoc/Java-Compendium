package Classes.Inheritance.Vehicle;

public class Corolla extends Car {

    private String manufacturer;
    private String modelName;
    private String gearsType;
    private String modelType;

    private int speed;

    public Corolla(String engineType, String manufacturer, String modelName, String gearsType, String modelType, int speed) {
        super("car vehicle", "ground/misc", 4, engineType, speed);
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.gearsType = gearsType;
        this.modelType = modelType;
        this.speed = speed;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public String getGearsType() {
        return gearsType;
    }

    public String getModelType() {
        return modelType;
    }

    @Override
    public void turnOnEngine() {
        System.out.println(this.modelName + " turned on the engine");
    }

    @Override
    public void turnOffEngine() {
        System.out.println(this.modelName + " turned off the engine");
    }

    // Overloading
    public void handSteering(String direction, String code) {
        if (code.equals("corolla-smw")) {
            super.handSteering(direction);
            System.out.println("Special hybrid-drive for Toyota Corolla => activated");
        } else if (direction.equals("right")) {
            System.out.println("You are going right");
        }
        System.out.println("You are going left");


    }

    @Override
    public void changeGears(int gear) {
        if(gear >=1) {
            switch (gear) {
                case 1:
                    System.out.println("You're in " + gear + "st gear");
                    break;
                case 2:
                    System.out.println("You're in " + gear + "nd gear");
                    break;
                case 3:
                    System.out.println("You're in " + gear + "rd gear");
                    break;
                case 4:
                    System.out.println("You're in " + gear + "th gear");
                    break;
                case 5:
                    System.out.println("You're in " + gear + "th gear");
                    break;
            }
        }
    }
}
