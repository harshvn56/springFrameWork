package org.springCore.Payment;

import org.springframework.stereotype.Component;

@Component
public interface PaymentMethod
{
     void paymentProcessed();
}
