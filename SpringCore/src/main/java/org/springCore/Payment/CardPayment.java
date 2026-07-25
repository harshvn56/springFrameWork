package org.springCore.Payment;


import org.springframework.stereotype.Component;

@Component
public class CardPayment implements PaymentMethod
{
    @Override
    public void paymentProcessed()
    {
        System.out.println("CardPayment Processed");
    }
}
