package Classes.Constructors.VIP_Customer.Bank_Account;

public class BankAccount {

    private String name;
    private String email;
    private long phoneNumber;
    private double balance;

    public BankAccount() {
        this("Matteo", "jacks@email.com", 1234556, 45.0);
    }

    public BankAccount(String name, String email, long phoneNumber, double balance) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw (double amount) {
        if (this.balance - amount >0) {
            this.balance -= amount;
            System.out.println("You have withdrawn: " + amount + " The current balance is: " + this.balance);
        } else {
            System.out.println("You don't have enough balance!! The current balance is: " + this.balance);
        }
    }

    public void deposit (double sum) {
        this.balance += sum;
        System.out.println("You have deposited: " + sum + " The current balance is: " + this.balance);

    }

    public void whosTheCustomer (){
        System.out.println("Name: " + this.name + " Email: " + this.email + " Phone Number: " +
                this.phoneNumber + " Balance: " + this.balance);
    }

}
