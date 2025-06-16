class Employee {
    void work(){
        System.out.println("Employee Working");
    }
}

class Manager extends Employee{
    void manage(){
        System.out.println("Manager managing");
    }
}

class Developer extends Employee{
    void code(){
        System.out.println("Developer Coding");
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        Developer d = new Developer();

        m.work();
        m.manage();

        d.work();
        d.code();
    }
}