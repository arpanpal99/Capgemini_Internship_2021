package com.capgemini.springiocexample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring IOC Example 
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloworldobj = (HelloWorld) ctx.getBean("helloworld");
        helloworldobj.getMsg();
        Message messageBeanObj = (Message) ctx.getBean("messageBean");
        System.out.println(messageBeanObj.getSendMsg());
        ctx.close();
    }
}
