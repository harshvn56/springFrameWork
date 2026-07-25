package org.springCore;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class OrderService
{

    PaymentService paymentService;

    public OrderService( @Lazy PaymentService paymentService)
    {
//        System.out.println("Payment service proxy created");
        this.paymentService = paymentService;
    }

    public void orderPlaces()
    {
        paymentService.pay();
        System.out.println("OrderPlaced successful");
    }

    public void getOrderDetails()
    {
        System.out.println("Viewing of Order Details");
    }
}
