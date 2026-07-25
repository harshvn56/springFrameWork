package org.springCore;

import org.springCore.payment.PaymentService;

public class OrderService
{
    private PaymentService paymentService;

   //XMl based configuration it only supports setter and constructor

    //constructor initialization
        public  OrderService(PaymentService  paymentService)
    {
      this.paymentService = paymentService;
    }

    //setter injection
//    public void setPaymentService(PaymentService paymentService)
//    {
//        this.paymentService = paymentService;
//    }

    public  void orderPlaced()
    {
        paymentService.payment();
        System.out.println("Order Placed");
    }
}
