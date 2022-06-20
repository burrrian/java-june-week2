import java.util.ArrayList;

public class TestItemOrders {
    public static void main(String[] args) {

        // Menu items
        Item item1 = new Item("cappucino", 5.5);
        Item item2 = new Item("mocha", 6.5);
        Item item3 = new Item("drip coffee", 2.5);
        Item item4 = new Item("latte", 4.5);
        // Item item2 = new Item("Mocha", 6.5);
        // Item item3 = new Item("Latte", 4.5);
        // Item item4 = new Item("Drip Coffee", 5.0);
        // System.out.println(item1.getPrice());
        // System.out.println(item1.getName());

        Order order1 = new Order();
        Order order2 = new Order();

        Order order3 = new Order("Ed");
        Order order4 = new Order("James");
        Order order5 = new Order("Charles");

        order1.addItem(item2);
        order1.addItem(item4);
        System.out.println(order1.getStatusMessage());
        // set to ready
        order1.setReady(true);
        System.out.println(order1.getStatusMessage());

        order2.addItem(item1);
        order2.addItem(item3);

        order3.addItem(item3);
        order3.addItem(item4);

        order4.addItem(item2);
        order4.addItem(item1);

        order5.addItem(item4);
        order5.addItem(item1);

        System.out.println(order1.getOrderTotal());

        order3.addItem(item1);
        order3.addItem(item4);
        order3.addItem(item2);

        order3.display();

    }
}
