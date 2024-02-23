package com.Assesment.Assesment2;

public class BookingProcessor {
	
	   public String processBooking(String input) {
	        String[] details = input.split(":");
	        
	        String customerName = details[0];
	        int numOfAdults = Integer.parseInt(details[1]);
	        int numOfChildren = Integer.parseInt(details[2]);
	        int numOfDays = Integer.parseInt(details[3]);

	        if (numOfAdults < 0) {
	            return "Invalid input for number of adults";
	        }

	        if (numOfChildren < 0) {
	            return "Invalid input for number of children";
	        }

	        if (numOfDays <= 0) {
	            return "Invalid input for number of days";
	        }

	        double totalCost = calculateTotalCost(numOfAdults, numOfChildren, numOfDays);

	        return customerName + " your booking is confirmed and the total cost is " + totalCost;
	    }

	    private double calculateTotalCost(int numOfAdults, int numOfChildren, int numOfDays) {
	        double adultCost = numOfAdults * 1000 * numOfDays;
	        double childCost = numOfChildren * 650 * numOfDays;

	        return adultCost + childCost;
	    }

}
