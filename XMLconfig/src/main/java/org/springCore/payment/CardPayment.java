package org.springCore.payment;

public class CardPayment implements PaymentService{

    @Override
    public void payment()
    {
        System.out.println("Payment from Card");
    }
}
