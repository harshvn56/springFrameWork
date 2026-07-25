package org.springCore;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("Singleton")
public class OrderService
{
    public OrderService()
    {
        System.out.println("Order service Created");
    }

    public void orderPlaced()
    {
        System.out.println("Order placed successful");
    }
}
