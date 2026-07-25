package org.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
   public  static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        PaymentProcess pay = context.getBean(PaymentProcess.class);
//        pay.paymentProcessed();

        OrderProcess or= context.getBean(OrderProcess.class);
        or.orderProcessed();



    }
}
