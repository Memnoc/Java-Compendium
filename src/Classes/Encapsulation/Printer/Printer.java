package Classes.Encapsulation.Printer;

public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplex = false;

    public Printer(int tonerLevel, boolean isDuplex) {
        this.tonerLevel = tonerLevel;
        this.numberOfPagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public void printPages(int pagesToPrint) {
        if(this.isDuplex){
            int pagesPrinted = this.numberOfPagesPrinted += (pagesToPrint / 2) + (pagesToPrint % 2);
            System.out.println("Pages to print: " + pagesToPrint + " Printed pages: " + pagesPrinted);
        } else {
            int pagesPrinted =  this.numberOfPagesPrinted += pagesToPrint;
            System.out.println("Pages to print: " + pagesToPrint + " Printed pages: " + pagesPrinted);
        }
    }

    public void fillToner(int quantity) {
        if (this.tonerLevel > 100) {
            this.tonerLevel = 100;
            System.out.println("The toner is full: current level => " + this.tonerLevel);
        } else {
            int total = this.tonerLevel += quantity;
            System.out.println("The toner level got refilled to " + total + " The current level of toner is " + this.tonerLevel);
            System.out.println("Toner level: " + this.tonerLevel);
        }

    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
