class Notification {
    void alert(){
        System.out.println("Generic notifications");
    }
}

class EmailNotification extends Notification{
    void alert(){
        System.out.println("You've got mail!");
    }
}

class SMSNotification extends Notification{
    void alert(){
        System.out.println("You received an SMS!");
    }

    public static void main(String[] args) {
        Notification n;

        n = new EmailNotification();
        n.alert();

        n = new SMSNotification();
        n.alert();
    }
}
