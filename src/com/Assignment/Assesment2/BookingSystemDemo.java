

package com.Assesment.Assesment2;
import java.util.Scanner;
public class BookingSystemDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the customer details");
        String input = scanner.nextLine();

        BookingProcessor bookingProcessor = new BookingProcessor();
        String result = bookingProcessor.processBooking(input);

        System.out.println(result);

	}

}
