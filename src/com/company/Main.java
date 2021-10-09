package com.company;
import java.util.Scanner;

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
    }
}
