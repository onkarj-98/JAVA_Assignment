package Inventory_Management;

public class StockItem {
    public   int itemNumber;
    public   String itemDescription;
    public double itemPrice;
    public   int totalQuantity;
    public int getQuantity(){
        return totalQuantity;
    }
    public double getPrice(){
        return itemPrice;
    }
    public StockItem(int itemNumber, String itemDescription, double itemPrice, int totalQuantity){
        this.itemNumber = itemNumber;
        this.itemDescription= itemDescription;
        this.itemPrice = itemPrice;
        this.totalQuantity = totalQuantity;
    }
}
