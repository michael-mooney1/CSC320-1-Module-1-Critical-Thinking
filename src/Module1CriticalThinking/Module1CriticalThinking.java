package Module1CriticalThinking;

import java.util.Scanner;

public class Module1CriticalThinking {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		// Setup variables to use for input
		String firstName;
		String lastName;
		String streetAddress;
		String city;
		String state;
		String zipcode;
		
		// Get input from user
		System.out.println("Enter your first name:");
		firstName = scnr.nextLine();
		
		System.out.println("Enter your last name:");
		lastName = scnr.nextLine();
		
		System.out.println("Enter your street address:");
		streetAddress = scnr.nextLine();
		
		System.out.println("Enter your city:");
		city = scnr.nextLine();
		
		System.out.println("Enter your state:");
		state = scnr.nextLine();
		
		System.out.println("Enter your zipcode");
		zipcode = scnr.nextLine();
		
		// Output information
		System.out.println(firstName + " " + lastName);
		System.out.println(streetAddress);
		System.out.println(city + ", " + state + " " + zipcode);
	}
}
