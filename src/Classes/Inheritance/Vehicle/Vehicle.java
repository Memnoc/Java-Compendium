package Classes.Inheritance.Vehicle;

public class Vehicle {

    private String category;
    private String terrain;


    public Vehicle(String category, String terrain) {
        this.category = category;
        this.terrain = terrain;
    }

    public String getCategory() {
        return category;
    }

    public String getTerrain() {
        return terrain;
    }

    public void turnOnEngine() {
        System.out.println("Engine is turned on");
    }

    public void turnOffEngine() {
        System.out.println("Engine is turned off");
    }
}
