
package com.Assesment.Assesment1;
import java.util.Scanner;

public class SkyAirlines {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Customer customer = new Customer();

        System.out.println("Enter name");
        customer.setName(scanner.nextLine());

        System.out.println("Enter source");
        customer.setSource(scanner.nextLine());

        System.out.println("Enter destination");
        customer.setDestination(scanner.nextLine());

        String message = generateMessage(customer);

        System.out.println(message);
        
    }

    private static String generateMessage(Customer customer) {
        return "Dear " + customer.getName() + ", welcome onboard with service from " +
                customer.getSource() + " to " + customer.getDestination() +
                ". Thank you for choosing Sky Airlines. Enjoy your flight.";}


}
