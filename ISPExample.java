package Solid_Design_Principles;

public class ISPExample {
    public static void main(String[] args) {
        Printer printer = new BasicPrinter();
        printer.print();
    }
}

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class BasicPrinter implements Printer {
    public void print() {
        System.out.println("Printing document...");
    }
}