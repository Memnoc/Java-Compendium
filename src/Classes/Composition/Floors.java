package Classes.Composition;

public class Floors {

    private String material;
    private String floorColor;
    private String countryOfOrigin;
    private Chairs chairs;

    public Floors(String material, String floorColor, String countryOfOrigin, Chairs chairs) {

        this.material = material;
        this.floorColor = floorColor;
        this.countryOfOrigin = countryOfOrigin;
        this.chairs = chairs;
    }

    public void wipeTheFloor() {
        System.out.println("You have wiped the floor!");
    }

    public String getNmaterial() {
        return material;
    }

    public String getFloorColor() {
        return floorColor;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public Chairs getChairs() {
        return chairs;
    }
}
