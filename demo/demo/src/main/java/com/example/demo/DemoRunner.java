package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements ApplicationRunner
{
    private PaymentService paymentService;

    public DemoRunner(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception
    {
      paymentService.print();
    }
}
