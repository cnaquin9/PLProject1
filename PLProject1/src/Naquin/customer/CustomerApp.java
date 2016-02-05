package Naquin.customer;

import java.util.Scanner;


public class CustomerApp {

    public static void main(String[] args) {
        String userChoice;
        // Prints welcome message.
        System.out.println("Welcome to the Customer Viewer");
        do {

            System.out.println("");

            Scanner input1 = new Scanner(System.in);

            // Get customer number
            System.out.print("Enter a customer number: ");
            int customerNumber = input1.nextInt();

            System.out.println();


            //call getCustomer
            System.out.println(CustomerDB.getCustomer(customerNumber));
            System.out.println();


            // Ask user if they would like to check another customer
            Scanner scan = new Scanner(System.in);
            System.out.print("Display another customer? (y/n): ");
            System.out.print("");
            userChoice = scan.next();


        } while (userChoice.contains("y"));


    }

}
