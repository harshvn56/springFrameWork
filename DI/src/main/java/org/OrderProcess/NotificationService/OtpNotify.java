package org.OrderProcess.NotificationService;

public class OtpNotify implements NotificationProvider{

    @Override
    public void sendNotification() {
        System.out.println("OTP sent");
    }
}
