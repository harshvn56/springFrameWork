package org.springCore;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.processing.SupportedSourceVersion;

@Component
@Lazy
public class PaymentService
{
      OrderService orderService;

    public PaymentService(OrderService orderService)
    {
//        System.out.println("Not coming here");
        this.orderService = orderService;
    }

    public void pay()
    {
        orderService.getOrderDetails();
        System.out.println("Payment done");
    }
}
