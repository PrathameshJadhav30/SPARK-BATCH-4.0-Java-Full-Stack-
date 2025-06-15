package OPPs;

class Employee {
    String name;
    int age;

    //Constructor Overloading
    Employee(){
        name = "Unknown";
        age = 0;
    }

    Employee(String n, int a){
        name = n;
        age = a;
    }
    void show(){
        System.out.println("Name: " + name + " , Age: " + age);
    }
}
public class OverloadedConstructor {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Prathamesh", 30);
        e1.show();
        e2.show();
    }
}
