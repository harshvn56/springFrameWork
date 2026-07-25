package org.springCore;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    static void main()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

         //get bean by id or name
//        OrderService orderService = (OrderService) context.getBean("os1");

//get element by type
//        PaymentService paymentService = context.getBean("ps1",PaymentService.class);
//        paymentService.payment();

//        OrderService orderService = context.getBean( OrderService.class);
//        orderService.orderPlaced();'

        UserDetails us = context.getBean(UserDetails.class);
        System.out.println(us.getUserDetails());

       context.close();


    }
}
