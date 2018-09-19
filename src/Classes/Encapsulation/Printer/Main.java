package Classes.Encapsulation.Printer;

public class Main {

    public static void main(String[] args) {
        // Everything working, logic seems solid
        Printer printer = new Printer(50,false);
        System.out.println("Initial page count = " + printer.getNumberOfPagesPrinted());
        System.out.println("Pages printed was: ");
        printer.printPages(4);
        System.out.println("New total count for printer is: ");
        System.out.println(printer.getNumberOfPagesPrinted());

        System.out.println("Pages printed was: ");
        printer.printPages(2);
        System.out.println("New total count for printer is: ");
        System.out.println(printer.getNumberOfPagesPrinted());







    }
}
