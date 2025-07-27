package org.example;

public class Student {

    private Course course;  //Course type ka Object
    //Dependency Injection
    //setter Injection
    public void setCourse(Course course) {
        this.course = course;
    }

    public Student() {
    }

    //Constructor Injection
    public Student(Course course) {
        this.course = course;
    }

    public void study(){
        int start = course.enroll();
        if(start >= 1){
            System.out.println("Journy Started....");
        }else{
            System.out.println("Payment Failed...");
        }
    }
}
