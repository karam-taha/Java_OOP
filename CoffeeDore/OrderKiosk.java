import java.util.ArrayList;
import java.text.DecimalFormat;

public class OrderKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public OrderKiosk() {
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }

    public void addMenuItem(String name, double price) {
        Item item = new Item(name, price);
        this.menu.add(item);
    }

    public void displayMenu() {
        for(int i=0;i<this.menu.size();i++){
        System.out.println(i + " " + this.menu.get(i).getName() + " -- " + "$" + df.format(this.menu.get(i).getPrice()));
        }
    }

    public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
        Order new_order = new Order(name);
        
        this.displayMenu();
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            new_order.addItem(this.menu.get(Integer.parseInt(itemNumber)));
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        new_order.display();
    }

}