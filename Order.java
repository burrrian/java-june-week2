import java.util.ArrayList;

public class Order {
    public String name;
    public double total;    
    public boolean ready;
    
    public ArrayList<Item> items = new ArrayList<Item>();

    // public Order(){
    //     this.name = "";
    //     this.total = 0;
    //     this.ready = false;
    // }

    // public Order(String name, double total, boolean ready){
    //     this.name = name;
    //     this.total = total; 
    //     this.ready = ready;
    // }

    // public String getName(){
    //     return this.name;
    // }

    // public void setName(String name){
    //     this.name = name;
    // }

    // public double getTotal(){
    //     return this.total;
    // }
    // public void setTotal(double total){
    //     this.total = total;
    // }
    // public boolean getReady(){
    //     return this.ready;
    // }
    // public void setReady(boolean ready){
    //     this.ready = ready;
    // }

    // public String getItem(){
    //     return this.item;
    // }
    // public void getItem(String item){
    //     this.item = item;
    // }

    // public void printOrder(){
    //     System.out.println("--------Order---------");
    //     System.out.println("Name: " + this.name);
    //     System.out.println("Name: " + this.total);
    //     System.out.println("Name: " + this.ready);
    // }
}
