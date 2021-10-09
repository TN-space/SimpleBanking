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

	    BankAccount person = new BankAccount(name, id);
		person.withdraw();

//		Account one = new Account("Tan", "123");
//		one.checkBalance();
//		double test = 10000;
//		System.out.println(String.format("Your current balance is: $%,.2f", test));

    }
}

class BankAccount {
	String aName, aID;
	double balance = 10000;

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

}
