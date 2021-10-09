package com.company;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
    	String name, id;
	    System.out.print("Please enter your name: ");
	    Scanner nInput = new Scanner(System.in);
	    name = nInput.next();
	    System.out.print("Enter your ID: ");
	    Scanner iInput = new Scanner(System.in);
	    id = iInput.next();

	    System.out.println(String.format("Hello %s, ID number %s", name, id));

	    Account person = new Account(name, id);
		person.deposit();

//		Account one = new Account("Tan", "123");
//		one.checkBalance();
//		double test = 10000;
//		System.out.println(String.format("Your current balance is: $%,.2f", test));

    }
}

class Account {
	String aName, aID;
	double balance = 10000;

	Account(String name, String id) {
		aName = name;
		aID = id;

	}

	void checkBalance() {
		System.out.println(String.format("Your current balance is: $%,.2f", balance));
	}

	void deposit() {
		System.out.print("Enter the amount to deposit: ");
		Scanner inputAmount = new Scanner(System.in);
		double amount = inputAmount.nextDouble();
		balance += amount;
		System.out.println(String.format("Deposited $%,.2f successfully.", amount));
	}

}
