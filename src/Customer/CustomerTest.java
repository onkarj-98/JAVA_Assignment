package Customer;

public class CustomerTest {
    public static void main(String[] args) {
       Customer customer1 = new Customer(100, "abc");
       Customer customer2 = new Customer(101, "abd");
       Customer customer3 = new Customer(103,"afr");

       customer1.setPhoneNumbers("122322","12323123","123421321");
       customer1.setPrintingAddress("asdasd","asdd","asdasd","asdasd");
       customer1.printPhoneNumber();
       customer1.printShippingAddress();
       customer1.printAllData();

        customer2.setPhoneNumbers("122422","12323143","123421321");
        customer2.setPrintingAddress("asdfasd","asdfd","asadasd","asdaasd");
        customer2.printPhoneNumber();
        customer2.printShippingAddress();
        customer2.printAllData();

        customer3.setPhoneNumbers("123322","12523123","123421371");
        customer3.setPrintingAddress("akdasd","ajdd","asdasd","asdajd");
        customer3.printPhoneNumber();
        customer3.printShippingAddress();
        customer3.printAllData();


    }
}
