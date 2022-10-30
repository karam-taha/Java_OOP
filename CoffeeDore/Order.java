import java.util.ArrayList;
import java.text.DecimalFormat;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReady() {
        return this.ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public String getStatusMessage() {
        if (this.ready == true){
            return "Your order is ready";
        }
        else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public void display() {
        System.out.println("Customer Name: " + this.name);
        for (int i = 0; i < this.items.size(); i++) {
            System.out.println(this.items.get(i).getName() + " - " + "$" + df.format(this.items.get(i).getPrice()));
        }
        System.out.println("Total: " + "$" + df.format(getOrderTotal()));
    }

    public double getOrderTotal(){
        double total = 0.0;
        for (int i = 0; i < this.items.size(); i++) {
            total += this.items.get(i).getPrice();
        }
        return total;
    }
}