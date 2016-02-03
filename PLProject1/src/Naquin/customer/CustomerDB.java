package Naquin.customer;

public class CustomerDB {

    //create customers
    public static void main(String[] args) {
        // "1001"
        Customer c1 = new Customer("Barbara White", "3400 Richmond Parkway #3423", "Bristol", "CT", "06010");
        // "1002"
        Customer c2 = new Customer("Karl Vang", "327 Franklin Street", "Edina", "MN", "55435");
        // "1003"
        Customer c3 = new Customer("Ronda Chavan", "518 Commanche Dr.", "Greensboro", "NC", "27410");
    }

    // return customer based on int parameter.
    // Try public static Customer (int customerNumber){}

}
