import java.util.ArrayList;

public class Order {
    private String name;
    private double total;
    private boolean ready;

    public ArrayList<Item> items;

    public Order (){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    public Order (String name){
        this.name = name;
    }

    public String getName() {
    return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getTotal() {
    return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }

    public boolean getReady() {
    return ready;
    }
    public void isReady(boolean ready) {
        this.ready = ready;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public String getStatusMessage(){
        if(ready){
            return  "Your order is ready.";
        }
        else{
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public void display() {
        System.out.println( "Customer Name: " + name);
        // System.out.println(items.size());
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getName() + " - " + "$" + items.get(i).getPrice());
        }
        System.out.println("Total: " + "$" + getOrderTotal());
    }

    public double getOrderTotal(){
        double total = 0.0;
        for (int i = 0; i < this.items.size(); i++) {
            total += this.items.get(i).getPrice();
        }
        return total;
    }
}