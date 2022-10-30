import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("mocha",5.25 );

        Item item2 = new Item("latte", 6.50);

        Item item3 = new Item("drip coffee", 4.15);

        Item item4 = new Item("capuccino", 7.50);
    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.setName("Cindhuri");

        Order order2 = new Order();
        order2.setName("Jimmy") ;

        Order order3 = new Order();
        order3.setName("Noah");

        Order order4 = new Order();
        order4.setName("Sam");
    
        // Application Simulations
        order1.addItem(item3);
        order1.addItem(item4);
        
        order2.addItem(item1);

        order3.addItem(item4);

        order4.addItem(item2);

        order1.display();
        // order2.display();
        // order3.display();
        // order4.display();

        order1.isReady(true);
        // System.out.println(order1.getStatusMessage());
        System.out.println(order1.getStatusMessage());

        order4.addItem(item2);
        order4.addItem(item2);

        order2.isReady(true);
        // System.out.println(order2.getStatusMessage());

        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.getName());
        // System.out.printf("Total: %s\n", order1.getTotal());
        // System.out.printf("Ready: %s\n", order1.getReady());

        // System.out.printf("Name: %s\n", order2.getName());
        // System.out.printf("Total: %s\n", order2.getTotal());
        // System.out.printf("Ready: %s\n", order2.getReady());

        // System.out.printf("Name: %s\n", order3.getName());
        // System.out.printf("Total: %s\n", order3.getTotal());
        // System.out.printf("Ready: %s\n", order3.getReady());

        // System.out.printf("Name: %s\n", order4.getName());
        // System.out.printf("Total: %s\n", order4.getTotal());
        // System.out.printf("Ready: %s\n", order4.getReady());

    }
}
