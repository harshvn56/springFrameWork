package org.OrderProcess;

import org.OrderProcess.NotificationService.EmailService;
import org.OrderProcess.NotificationService.NotificationProvider;
import org.OrderProcess.NotificationService.OtpNotify;
import org.OrderProcess.NotificationService.SmsNotify;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

//        NotificationProvider notify = new EmailService();
//        NotificationProvider notify = new OtpNotify();
        NotificationProvider notify = new SmsNotify();
        OrderProcessing order = new OrderProcessing(notify);
        order.doOrderProcessing();
    }
}
