package org.springCore.Payment;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class CreditPayment implements PaymentMethod
{
    @Override
    public void paymentProcessed()
    {
        System.out.println("CreditCard Processed");
    }
}
