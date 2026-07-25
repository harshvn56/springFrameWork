package org.springCore;

import org.springframework.stereotype.Component;

@Component
public class A
{
    private OrderService orderService;

    public A(OrderService orderService)
    {
        System.out.println(" Order created in A");
        this.orderService = orderService;
    }
}
