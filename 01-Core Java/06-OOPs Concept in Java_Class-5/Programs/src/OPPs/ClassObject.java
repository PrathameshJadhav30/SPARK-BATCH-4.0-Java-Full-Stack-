package OPPs;
//Class and Object
class student {
    //Fields
    String name;
    int age;

    //Method
    void display(){
        System.out.println("Name: "+ name + " , Age: " + age);
    }
}
public class ClassObject {
    public static void main(String[] args) {
        student s1 = new student(); // object created
        s1.name = " Prathamesh";
        s1.age = 21;
        s1.display();
    }
}
