import java.util.Scanner;
import java.text.DecimalFormat;

import java.util.Scanner;

public class VendingMachine2 {

	public static void main(String[] args) {
		//declare variables
		double balance = 0;
		double change = 0;
		String choice = null;
		double total = 0;
		double[] data = null;

		/**
		 * Create an instance of the DecialFormat class for formatting balance
		 * and change correctly
		 */
		DecimalFormat formatter = new DecimalFormat("#,##0.00");
		Scanner keyboard = new Scanner(System.in);

		// Start the vending and loop until user decides to leave
		do {
			/**
			 * Show the item cost and current balance, then ask the user to
			 * input the command to add money, refund, dispense, or leave.
			 */
			System.out.println("Item Cost: 1.25 Balance: " + formatter.format(balance));
			System.out.printf("Enter Money(Q,D,N,B for Bill) or command "
					+ "(R, P, X): ");
			choice = keyboard.nextLine();

			/**
			 * Take the users input and either quit the vending (X), dispense
			 * the product(P), return the money(R), or add money to the
			 * balance(Q,D,N,B)
			 */
			if (choice.equals("X") || choice.equals("x")) {

				System.out.println("Good Bye");

			} else if (choice.equals("P") || choice.equals("p")) {
				if (balance >= 1.25) {
					change = balance - 1.25;
					balance = 0;
					System.out.println("Got Product wih change: " + formatter.format(change));
				} else {
					System.out.println("Unable to dispense!");
				}

			} else if (choice.equals("R") || choice.equals("r")) {
				System.out.println("Money Returned: " + formatter.format(balance));
				balance = 0;
			} else if (choice.equals("Q") || choice.equals("q")) {
				{
					balance += 0.25;
				}
			} else if (choice.equals("D") || choice.equals("d")) {

				balance += 0.10;

			} else if (choice.equals("N") || choice.equals("n")) {

				balance += 0.05;

			} else if (choice.equals("B") || choice.equals("b")) {

				balance += 1.00;

			} else {
				System.out.println("Invalid Choice");
			}

		} while (!(choice.equalsIgnoreCase("X"))); //if not enter X then look falls out
	}
}
