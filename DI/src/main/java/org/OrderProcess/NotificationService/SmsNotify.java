package org.OrderProcess.NotificationService;


public class SmsNotify implements NotificationProvider
{

    @Override
    public void sendNotification()
    {
        System.out.println("SMS Sent");
    }
}