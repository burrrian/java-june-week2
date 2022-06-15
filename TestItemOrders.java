import java.util.ArrayList;

public class TestItemOrders {
    public static void main(String[] args) {

        // Menu items
        Item item1 = new Item();
        item1.name = "Mocha";
        item1.price = 7.2;
        Item item2 = new Item();
        item2.name = "Latte";
        item2.price = 5.2;
        Item item3 = new Item();
        item3.name = "Drip Coffee";
        item3.price = 8.2;
        Item item4 = new Item();
        item4.name = "Cappucino";
        item4.price = 7.6;

        // Order variables -- order1, order2 etc.
        // Order order = new OrdArrayList<Item> itemser();
        Order order2 = new Order();
        order2.name = "Cinduri";
        Order order1 = new Order();
        order1.name = "Jimmy";
        Order order3 = new Order();
        order3.name = "Noah";
        Order order4 = new Order();
        order4.name = "Sam";

        order2.items.add(item2);
        order2.total += item2.price;

        order3.items.add(item4);
        order3.total += item4.price;

        order4.items.add(item2);
        order3.total += item2.price;

        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += item2.price * 2;

        System.out.println("Sam has total of: " + order4.items);
        order2.ready = true; 
        order1.ready = true; 
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        // Add item1 to order2's item list and increment the order's total.
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);


        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}
