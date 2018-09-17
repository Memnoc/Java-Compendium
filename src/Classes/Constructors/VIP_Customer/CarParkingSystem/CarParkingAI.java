package Classes.Constructors.VIP_Customer.CarParkingSystem;

public class CarParkingAI {

    // Modeling the car park components
    private String card;
    private boolean isPaid = false;

    // Modeling the person
    private String name;
    private String carModel;
    private long plateNumber;


    // First Constructor
    public CarParkingAI(String card, boolean isPaid, String name, String carModel, long plateNumber) {
        this.card = card;
        this.isPaid = isPaid;
        this.name = name;
        this.carModel = carModel;
        this.plateNumber = plateNumber;
    }


    // Second Constructor => for customer pay-late
    public CarParkingAI(String card, String name, String carModel, long plateNumber) {
        this.card = card;
        this.name = name;
        this.carModel = carModel;
        this.plateNumber = plateNumber;
    }

    public String getCard() {
        return card;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public String getName() {
        return name;
    }

    public String getCarModel() {
        return carModel;
    }

    public long getPlateNumber() {
        return plateNumber;
    }

    public void whois() {
        String card = this.card;
        String name = this.name;
        boolean paid = this.isPaid;
        String car = this.carModel;
        long plate = this.plateNumber;

        System.out.println("Card: " + card + "\n" + "Name: " + name + "\n" + "Paid: " + paid + "\n" + "Model: " + car + "\n" + "PLate Number: " + plate);
    }

    public void getOut() {
        if (!this.isPaid) {
            System.out.println("You cannot get out cause you did not pay");
        } else {
            System.out.println("Thank you for paying!");
        }

    }
}

