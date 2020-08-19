package Inventory_Management;



public class OrderItem {
    public int numberOfItems;
    public StockItem stockItem;

    // Whenever new stockitem linked to orderItem it is added through a constructor
    public OrderItem( StockItem stockItem, int numberOfItems){
        this.stockItem = stockItem;
        this.numberOfItems = numberOfItems;
    }
    // returns the total price of orderItem ( a single orderItem)
    public double getTotal(){
        double total = 0;
           total = stockItem.totalQuantity * stockItem.itemPrice;
           return  total;
    }
}
