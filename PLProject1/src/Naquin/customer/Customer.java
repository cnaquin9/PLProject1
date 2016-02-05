package Naquin.customer;


public class Customer {
    private String name, address, city, state, postalCode;

    /*public Customer() {
        this("Bob","123 alphabet street","Austin", "TX", "78705");
    */

    public Customer(String name, String address, String city, String state, String postalCode) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;

    }


    // Set methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    // get methods
    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    //prints
    public String getNameAndAddress() {
        return (this.name + "\n" + this.address + "\n" + this.city + ", " + this.state + " " + this.postalCode);
    }

}
