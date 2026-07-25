package org.springCore.Payment;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class UpiPayment implements PaymentMethod
{
    @Override
    public void paymentProcessed()
    {
        System.out.println("UPI payment Processed");
    }
}
