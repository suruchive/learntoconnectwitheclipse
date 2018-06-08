package com.suruchi.LearnSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       /* Beanfactory--small application
        Application context---superset of beanfactory....used for enterprise application*/
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
    	//Vehicle obj = (Vehicle) context.getBean("car");
    	Car car=(Car)context.getBean("car");
    	car.drive();
    }
}
