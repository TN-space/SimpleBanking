package com.company;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
    	String name, id;
    	// Taking user inputs for name and id
	    System.out.print("Please enter your name: ");
	    Scanner nInput = new Scanner(System.in);
	    name = nInput.next();
	    System.out.print("Enter your ID: ");
	    Scanner iInput = new Scanner(System.in);
	    id = iInput.next();

	    System.out.println(String.format("Hello %s, ID number %s", name, id));

	    // Created a new object - person, from the type BankAccount, and pass in name, id as arguments
		BankAccount person = new BankAccount(name, id);
		// Invoke showOptions method in the person object
		person.showOptions();
    }
}

class BankAccount {
	String aName, aID;
	double balance = 10000;

	// Contructor BankAccount has to have the same name as the class and no identifier.
	BankAccount(String name, String id) {
		aName = name;
		aID = id;
	}

	void checkBalance() {
		System.out.println(String.format("Your current balance is: $%,.2f", balance));
	}

	void deposit() {
		System.out.print("Enter the amount to deposit: ");
		Scanner deposit = new Scanner(System.in);
		double dAmount = deposit.nextDouble();
		balance += dAmount;
		System.out.println(String.format("Deposited $%,.2f successfully.", dAmount));
	}

	void withdraw() {
		System.out.print("Enter the amount to withdraw: ");
		Scanner withdraw = new Scanner(System.in);
		double wAmount = withdraw.nextDouble();
		if (balance < wAmount) {
			System.out.println("Withdraw amount exceeds current balance.");
		} else {
			balance -= wAmount;
			System.out.println(String.format("Withdrew $%,.2f successfully.", wAmount));
		}
	}

	void showOptions() {
		System.out.println("Please follow the menu option below:");
		System.out.println("\t Press 1 to check balance.");
		System.out.println("\t Press 2 to deposit.");
		System.out.println("\t Press 3 to withdraw.");
		System.out.println("\t Press 9 to exit.");

		int option;
		do {
			System.out.println("\n");
			System.out.print("Please choose your option: ");
			Scanner inputOption = new Scanner(System.in);
			option = inputOption.nextInt();

			switch (option) {
				case 1:
					checkBalance();
					break;
				case 2:
					deposit();
					break;
				case 3:
					withdraw();
					break;
				case 9:
					break;
				default:
					System.out.println("Please enter a valid option.");
					break;
			}
		} while (option != 9);
	}
}
