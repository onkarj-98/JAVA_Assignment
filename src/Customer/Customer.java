package Customer;

import Inventory_Management.PurchaseOrder;
import Inventory_Management.StockItem;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    // attributes
    private final int customerId;
    private final String customerName;
    private String homePhone;
    private String cellPhone;
    private String workPhone;
    private String customerStreet;
    private String customerCity;
    private String customerState;
    private String customerZip;
    public List<PurchaseOrder> purchaseOrders =  new ArrayList<>();

    //  printing phone number of a customer by Id
    public void printPhoneNumber(){
        System.out.println("Printing All Contact Numbers");
        System.out.println("Home Phone Number:"+homePhone);
        System.out.println("Cell Phone Number:"+cellPhone);
        System.out.println("Work Phone Number:"+workPhone);

    }
    // add to purchaseOrder List
    public void addPurchaseOrder(PurchaseOrder purchaseOrder){
        this.purchaseOrders.add(purchaseOrder);
    }

    // printing shipping address of a customer by Id
    public void printShippingAddress(){
        System.out.println("Printing the Address of Customer.Customer:"+customerStreet+"\t"+customerCity+"\t"+customerState+"\t"+customerZip);
    }

    // changing printing address to change address param: id, street, city,zip
    public boolean setPrintingAddress( String street, String city,String state,String zip){
        customerStreet = street;
        customerCity = city;
        customerState = state;
        customerZip = zip;
        return true;

    }
    // setPhone numbers
    public boolean setPhoneNumbers( String work, String home, String cell){
        workPhone = work;
        homePhone = home;
        cellPhone = cell;
        return true;
    }

    // constructor
 public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.customerName = name;
 }
public void printAllData(){
        System.out.println("Printing All Data:");
        System.out.println("Customer.Customer ID:"+customerId);
        System.out.println("Customer.Customer Name:"+customerName);
        System.out.println("Customer.Customer Phones:"+homePhone+"\t"+cellPhone+"\t"+workPhone+"\t");
        printShippingAddress();
}

}
