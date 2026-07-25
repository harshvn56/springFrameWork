package org.OrderProcess.NotificationService;

public class EmailService implements NotificationProvider
{

   @Override
    public void sendNotification()
    {
        System.out.println("Email Sent");
    }
}
