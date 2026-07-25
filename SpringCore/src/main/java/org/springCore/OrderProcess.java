package org.springCore;

import org.springCore.Payment.CreditPayment;
import org.springCore.Payment.PaymentMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class OrderProcess
{
    private final PaymentMethod payment;

//    @Autowired
    public OrderProcess(@Qualifier("cardPayment")PaymentMethod payment)
    {
        this.payment = payment;
    }

//    public void setPayment(PaymentProcess payment) {
//        this.payment = payment;
//    }


    public void orderProcessed()
    {
        payment.paymentProcessed();
        System.out.println("Order processed");
    }
}
