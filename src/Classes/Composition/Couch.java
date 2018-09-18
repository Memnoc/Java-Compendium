package Classes.Composition;

public class Couch {
    private String fabric;
    private String countryOfOrigin;


    public Couch(String fabric, String countryOfOrigin) {
        this.fabric = fabric;
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getFabric() {
        return fabric;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void sitOnTheCouch() {
        System.out.println("You are sitting on the couch");
    }
}
