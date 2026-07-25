package org.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main()
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        OrderService orderService = context.getBean(OrderService.class);
//        OrderService orderService2 = context.getBean(OrderService.class);

//        OrderService orderService = new OrderService();
//        OrderService orderService2 = new OrderService();

//        System.out.println(orderService.equals(orderService2));

    }
}
