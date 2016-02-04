package Naquin.customer;

public class CustomerDB {

    //create customers
	private int customerNum;
        public String getCustomer(int n) {this.customerNum = n;
            if (customerNum == 1001) {
                Customer customer1 = new Customer("Barbara White", "3400 Richmond Parkway #3423", "Bristol", "CT", "06010");
                return (customer1.getNameAndAddress());
            } else if (customerNum == 1002) {
                Customer customer2 = new Customer("Karl Vang", "327 Franklin Street", "Edina", "MN", "55435");
                return (customer2.getNameAndAddress());
            } else if (customerNum == 1003) {
                Customer customer3 = new Customer("Ronda Chavan", "518 Commanche Dr.", "Greensboro", "NC", "27410");
                return (customer3.getNameAndAddress());
            } else {
                String noNum = ("There is  no customer number " + customerNum + "in our records.");
                return noNum;}

        // return customer based on int parameter.
        // Try public static Customer (int customerNumber){}

}}


}
