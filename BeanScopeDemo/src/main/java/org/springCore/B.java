package org.springCore;

import org.springframework.stereotype.Component;

@Component
public class B
{
    private OrderService orderService;

    public B(OrderService orderService)
    {
        System.out.println("Order created in B");
        this.orderService = orderService;
    }
}
