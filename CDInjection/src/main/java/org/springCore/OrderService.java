package org.springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService

{   @Autowired
    private PaymentService paymentService;

////    @Autowired
//    public OrderService(PaymentService paymentService)
//    {
//        this.paymentService = paymentService;
//    }

    public void OrderPlaced()
    {
        paymentService.paymentDone();
        System.out.println("Order Placed successfully");
    }

    public void getOrderDetails()
    {
        System.out.println("Printing of OrderDetails");
    }
}
