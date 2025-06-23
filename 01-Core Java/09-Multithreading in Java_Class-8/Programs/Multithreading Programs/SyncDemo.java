class Table {
    synchronized  void printTable(int n){
        for(int i = 1; i <= 5; i++){
            System.out.println(n * i);
        }
    }
}

class SyncThread extends Thread {
    Table t;
    SyncThread(Table t){
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(5);
    }
}

public class SyncDemo {
    public static void main(String[] args) {
     Table obj = new Table();
     SyncThread t1 = new SyncThread(obj);
     SyncThread t2 = new SyncThread(obj);
     t1.start();
     t2.start();
    }
}
