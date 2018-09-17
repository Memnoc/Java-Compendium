package Classes.Constructors.VIP_Customer;

public class Main {

    public static void main(String[] args) {

        VipCustomer personOne = new VipCustomer();
        personOne.whois();

        VipCustomer personTwo = new VipCustomer("Bob", 20.000);
        personTwo.whois();

        VipCustomer personThree = new VipCustomer("Matteo", "anotherme@email.com", 30.000);
        personThree.whois();
    }
}
