package Classes.Constructors.VIP_Customer.CarParkingSystem;

public class Main {

    public static void main(String[] args) {

        CarParkingAI customerOne = new CarParkingAI("Standard Card", true, "Matteo", "Lancia Y", 1234567 );
        customerOne.whois();
        System.out.println("==========================");
        CarParkingAI customerTwo = new CarParkingAI("VIP Card", "Mike The Millionaire", "Ferrari", 999999);
        customerTwo.whois();

        System.out.println("==========================");
        customerOne.getOut();
        customerTwo.getOut();


    }
}
