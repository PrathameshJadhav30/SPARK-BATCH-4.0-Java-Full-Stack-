class shared {
    boolean flag = false;

    synchronized  void produce() throws InterruptedException {
        if(flag){
            wait();
        }
        System.out.println("Produced");
        flag = true;
        notify();
    }
    synchronized  void consume() throws InterruptedException {
        if(!flag){
            wait();
        }
        System.out.println("Consumed");
        flag = false;
        notify();
    }
}

public class InterThreadDemo {
    public static void main(String[] args) {
       shared s = new shared();

       new Thread(() ->{
           try {
               s.produce();
           }catch(Exception e){

           }
       }).start();

       new Thread(() -> {
           try {
               s.consume();
           }catch(Exception e){

           }
       }).start();
    }
}
