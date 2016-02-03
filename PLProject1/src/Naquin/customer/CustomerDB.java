package Naquin.customer;

public class CustomerDB {

    //create customers
        public static 
    Customer
    getCustomer(int customerNum) {this.customerNum = customerNum};
    	if (customerNum == 1001) {
        	customer1 = new Customer("Barbara White", "3400 Richmond Parkway #3423", "Bristol", "CT", "06010");
		return String (customer1.name + “\n” + customer1.address + “\n + customer1.city + “, “ + customer1.state + “ “ + customer1.postalCode);
	} else if (customerNum == 1002) {
        	customer2 = new Customer("Karl Vang", "327 Franklin Street", "Edina", "MN", "55435");
		return String (customer2.name + “\n” + customer2.address + “\n + customer2.city + “, “ + customer2.state + “ “ + customer2.postalCode);
	} else if (customerNum == 1003) {
		customer3 = new Customer("Ronda Chavan", "518 Commanche Dr."", "Greensboro", "NC", "27410");
		return String (customer3.name + “\n” + customer3.address + “\n + customer3.city + “, “ + customer3.state + “ “ + customer3.postalCode);
	} else {
		return String (“There is no customer number “ + customerNum + "in our records.”);

    }

    // return customer based on int parameter.
    // Try public static Customer (int customerNumber){}

}
