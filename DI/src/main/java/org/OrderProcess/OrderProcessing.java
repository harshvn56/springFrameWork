package org.OrderProcess;


import org.OrderProcess.NotificationService.NotificationProvider;

public class OrderProcessing
{
    NotificationProvider notification;

   public OrderProcessing (NotificationProvider notification)
    {
        this.notification = notification;
    }

    public void doOrderProcessing()
    {
        System.out.println("Order Processed");
        notification.sendNotification();
    }
}
