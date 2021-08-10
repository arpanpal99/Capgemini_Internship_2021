package com.capgemini.springiocexampleusingxml;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


/**
 * Spring IOC Example using XML configuration 
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        WelcomeMessage welcomeMessageObj = (WelcomeMessage) ctx.getBean("welcomeMsg");
        welcomeMessageObj.getMessage();
        System.out.println(welcomeMessageObj.getName());
        Message messageObj = (Message) ctx.getBean("msg");
        System.out.println(messageObj.getSendMsg());
       
        
        //BeanFactory Container
        System.out.println("Bean Factory IOC container");
        //XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        WelcomeMessage welcomeMessageObj1 = (WelcomeMessage) factory.getBean("welcomeMsg");
        welcomeMessageObj1.getMessage();
        System.out.println(welcomeMessageObj1.getName());
    }
}
