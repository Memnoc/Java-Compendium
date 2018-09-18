package Classes.Composition;

public class Walls {

    private String material;
    private String color;
    private int height;
    private int width;
    private Floors floorType;

    public Walls(String material, String color, int height, int width, Floors floorType) {
        this.material = material;
        this.color = color;
        this.height = height;
        this.width = width;
        this.floorType = floorType;
    }

    public void paintTheWalls(String wallColor) {
        this.color = wallColor;
        System.out.println("You have painted the wall " + wallColor);
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Floors getFloorType() {
        return floorType;
    }
}
