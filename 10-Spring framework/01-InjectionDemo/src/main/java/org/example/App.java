package org.example;


public class App 
{
    public static void main( String[] args )
    {
        //Student s = new Student(); //use for setter injection
        Student s = new Student(new DSA());  //use for constrcture injection

//        Course course = new DSA();
//        s.setCourse(course);

        s.study();
    }
}
