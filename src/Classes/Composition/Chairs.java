package Classes.Composition;

public class Chairs {

    private String material;
    private int legs;
    private Couch theCouch;

    public Chairs(String material, int legs, Couch theCouch) {
        this.material = material;
        this.legs = legs;
        this.theCouch = theCouch;
    }

    public void sitOnTheChair() {
        System.out.println("You're sitting on the chair");
    }

    public String getMaterial() {
        return material;
    }

    public int getLegs() {
        return legs;
    }

    public Couch getTheCouch() {
        return theCouch;
    }
}
