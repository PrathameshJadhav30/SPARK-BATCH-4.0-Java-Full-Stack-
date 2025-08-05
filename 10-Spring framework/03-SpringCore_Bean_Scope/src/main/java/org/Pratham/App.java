package org.Pratham;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App
{
    public static void main( String[] args )
    {
        System.out.println("------------BeanFactory Started---------");
        //BeanFactory factory = new XmlBeanFactory(new ClassPathResource("your-beans.xml"));
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        System.out.println("Bean File Loaded");

        System.out.println("Sending Request-------");
        System.out.println("-------------First Call-------------");
        Car car1 = context.getBean(Car.class);

        System.out.println("-------------Second  Call-------------");
        Car car2 = context.getBean(Car.class);

        System.out.println("Same Car Object ? " + (car1 == car2));


        System.out.println("-------------First Call-------------");
        PetrolEngine p1 = context.getBean(PetrolEngine.class);

        System.out.println("-------------Second  Call-------------");
        PetrolEngine p2 = context.getBean(PetrolEngine.class);

        System.out.println("Same PetrolEngine Object ? " + (p1 == p2));

//        car.Drive();
    }
}
