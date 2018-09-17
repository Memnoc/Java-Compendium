package Classes.Constructors.VIP_Customer;

public class VipCustomer {

    private String name;
    private String email;

    private double creditLimit;

    // First Constructor
    public VipCustomer() {
        this("defaultName", "default@email.com", 100.00);
    }


    // Second constructor
    public VipCustomer(String name, double creditLimit) {
        this(name, "unknown@email.com", 120000);

    }

    // Third Constructor
    public VipCustomer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void whois() {
        String name = getName();
        String mail = getEmail();
        double credit = getCreditLimit();
        System.out.println("Name: " + this.name + " Email: " + this.email + " Credit Limit: " + this.creditLimit);
    }
}
