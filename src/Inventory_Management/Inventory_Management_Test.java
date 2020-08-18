package Inventory_Management;
import Customer.Customer;


public class Inventory_Management_Test {
    public static void main(String[] args) {
        ////////////////////////
        Customer customer1 = new Customer(101,"Onkar Jaliminche");
        Customer customer2 = new Customer(102,"Yogesh Bhosage");
        ///////////////////////
        StockItem milk = new StockItem(1,"Cow Milk",2.00,10);
        StockItem chicken = new StockItem(2,"Canadian Chicken",5,15);
        StockItem apple = new StockItem(3,"Red Apples",2,30);
        StockItem orange = new StockItem(4,"Orange Oranges",4,50);
        ////////////////////////
        PurchaseOrder po1 = new PurchaseOrder(1001,"12/7/19");
        po1.setShipDate("27/7/19");
        if (milk == null){
            System.out.println("Null Object!");
        }
        System.out.println();
        po1.createOrder(milk);
        po1.createOrder(chicken);
        po1.createOrder(apple);
        po1.createOrder(orange);
      //  po1.isShipped();
        po1.sumItems();
        po1.totalShipmentPrice();
        customer1.addPurchaseOrder(po1);
        System.out.println("Your Order placed successfully, Thank You for Shopping!");
    }
}
