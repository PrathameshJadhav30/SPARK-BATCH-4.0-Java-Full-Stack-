class Printer {
    void printDoc(String doc){
        synchronized (this){
            System.out.println("Printing " + doc);
        }
    }
}

public class SyncBlockDemo {
    public static void main(String[] args) {
        Printer p = new Printer();
        new Thread(() -> p.printDoc("A")).start();
        new Thread(() -> p.printDoc("B")).start();
    }
}
