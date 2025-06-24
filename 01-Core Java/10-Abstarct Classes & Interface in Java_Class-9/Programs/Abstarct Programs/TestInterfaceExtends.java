interface Printable {
    void print();
}

interface Scannable extends  Printable {
    void scan();
}

class PrinterScanner implements Scannable {

    @Override
    public void scan() {
        System.out.println("Scanning Document.....");
    }

    @Override
    public void print() {
        System.out.println("Printing Documents.....");
    }
}

public class TestInterfaceExtends {
    public static void main(String[] args) {
        PrinterScanner ps = new PrinterScanner();
        ps.print();
        ps.scan();
    }
}
