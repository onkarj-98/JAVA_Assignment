package Inventory_Management;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    public int numberOfItems;
    public List<StockItem> stockItems =  new ArrayList<>();;

    void addItem(StockItem stockItem){
        if (stockItem == null){
            System.out.println("Null Object");
        }
        this.stockItems.add(stockItem);
    }
    public OrderItem(int numberOfItems, StockItem stockItem){
        addItem(stockItem);
        this.numberOfItems = numberOfItems;
    }

    public double getTotal(){
        double total = 0;
        double finalTotalOfOrder = 0;

        for (StockItem stockItem : stockItems){

            total += stockItem.getPrice();
            finalTotalOfOrder = total * numberOfItems;
        }
        final double finalTotalOfOrder1 = finalTotalOfOrder;
        return finalTotalOfOrder1;

    }
}
