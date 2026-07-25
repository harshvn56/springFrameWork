package org.springCore.payment;


public class UPIPayment implements PaymentService
{
    @Override
    public void payment()
    {
        System.out.println("Payment from UPI");
    }
}
