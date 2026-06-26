public class OrderService {
   //OrderService is dependent on EmailService and SmsService
   //OrderService is creating the objects of these dependency itself
    EmailService emailService = new EmailService();
    SmsService smsService = new SmsService();

    public void placeOrder(){
        System.out.println("ORDER SENT");
        emailService.sendEmailNotification();
        smsService.sendSMSNotification();
    }
}
