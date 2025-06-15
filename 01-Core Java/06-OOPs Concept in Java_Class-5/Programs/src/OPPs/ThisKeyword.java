package OPPs;

class Person {
    String name;

    Person(String name){
        this.name = name; //refers to Current Objects name
    }

    void show(){
        System.out.println("Person Name: " + name);
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        Person p = new Person("Prathamesh");
        p.show();
    }
}
