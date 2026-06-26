public class Main {
     public static void main(String[] args) {
        //Main is creating object of OrderService
        OrderService orderService = new OrderService();
        System.out.println("Order Service Started");
        orderService.placeOrder();
    }
}
