interface  Printable {
    void print();
}

interface ScannerPrinter extends Printable {
    void scan();
}

class OfficeDevice implements ScannerPrinter {

    @Override
    public void scan() {
        System.out.println("Scanning Documents......");
    }

    @Override
    public void print() {
        System.out.println("Printing Documents...");
    }
}

public class TestScannerPrinter {
    public static void main(String[] args) {
       ScannerPrinter device = new OfficeDevice();
       device.scan();
       device.print();
    }
}
