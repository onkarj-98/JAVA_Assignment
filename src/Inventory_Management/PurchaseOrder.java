package Inventory_Management;
import Customer.Customer;

import java.text.ParseException;
import java.util.ArrayList;
//import java.util.regex.

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

public class PurchaseOrder  {
    public   int poNumber;
    public String orderDate;
    public   String shipDate;
    public List<OrderItem> orderItems = new ArrayList<>();;


    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
    Date date = new Date();


    public boolean isShipped(){

        if ( shipDate.equals(formatter.format(date))){
            System.out.println("Your Item has been shipped!");
            return true;
        }
    return false;
    }
    public double sumItems(){
        int total=0;
            for(OrderItem item : orderItems){
                total += item.numberOfItems;
            }
            System.out.println("Total number of items:\t");
        return total;
    }
    public boolean setShipDate( String date){
        try {
            formatter.parse(date);
            shipDate = date;
            return true;
        }
        catch(ParseException e){
            return false;
        }
    }
    public boolean createOrder(StockItem stockItem){
        if (stockItem == null){
            System.out.println("Null Object");
        }
      OrderItem item = new OrderItem(stockItem.itemNumber, stockItem);
      orderItems.add(item);
      return true;
    }

    public PurchaseOrder(int poNumber, String orderDate){
        this.poNumber = poNumber;
        this.orderDate = orderDate;
    }
    public double totalShipmentPrice(){
        double total = 0;
        for(OrderItem orderItem: orderItems){
            total += orderItem.getTotal();
        }
        return total;
    }


}
