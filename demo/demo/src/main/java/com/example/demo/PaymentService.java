package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PaymentService
{

    private  PaymentProperties paymentProperties;
    @Autowired
    PaymentService(PaymentProperties paymentProperties)
    {
        this.paymentProperties = paymentProperties;
    }

    public String getType() {
        return paymentProperties.getType();
    }


    public int getRetryCount() {
        return paymentProperties.getRetryCount();
    }

    public int getTimeout() {
        return paymentProperties.getTimeout();
    }

    public boolean getEnabled() {
        return paymentProperties.isEnabled();
    }

    public void print()
    {

        System.out.println(getType());
        System.out.println(getRetryCount());
        System.out.println(getEnabled());
        System.out.println(getTimeout());
    }


}


//    public void setType(String type) {
//        this.type = type;
//    }

//    public void setRetryCount(int retryCount) {
//        this.retryCount = retryCount;
//    }

//    @Value("${paymentserivce.type:RazorPay}")
//    private String type;
//
//    @Value("${paymentserivce.retrycount}")
//    private int retryCount;

//    public PaymentService(@Value("${paymentserivce.type}") String type, @Value("${paymentserivce.retrycount}") int retryCount)
//    {
//        this.type = type;
//        this.retryCount = retryCount;
//    }



