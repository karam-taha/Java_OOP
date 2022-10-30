public interface OrderKioskTest {
    public static void main(String[] args) {
        OrderKiosk order = new OrderKiosk();
        order.addMenuItem("Mocha", 6.5);
        order.addMenuItem("Tea", 3.5);
        order.addMenuItem("Coffee", 4.0);
        order.addMenuItem("Choco", 2.0);
        order.newOrder();
    }
}