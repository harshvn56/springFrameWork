package org.springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService
{
    @Autowired
    private  OrderService orderService;

//    @Autowired
//    public PaymentService(OrderService orderService)
//    {
//        this.orderService = orderService;
//    }

    public void paymentDone()
    {
        orderService.getOrderDetails();
        System.out.println("Payment successful");
    }
}
