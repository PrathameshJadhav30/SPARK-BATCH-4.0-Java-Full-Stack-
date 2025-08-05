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

        car1.Drive();
    }
}
