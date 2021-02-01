package model.application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.ExceptionAccount;

public class Program {
	
	public static void main(String[] args) throws ExceptionAccount {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		try {
			System.out.println("Enter account data");
			
			System.out.print("Number: ");
			Integer number = Integer.parseInt(sc.nextLine());
			
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			
			System.out.print("Initial balance: ");
			Double balance = Double.parseDouble(sc.nextLine());
			
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = Double.parseDouble(sc.nextLine());
			
			Account ac = new Account(number, holder, balance, withdrawLimit);
			
			System.out.println();
			
			System.out.print("Enter amount for withdraw: ");
			Double amount = Double.parseDouble(sc.nextLine());
			ac.withdraw(amount);
			
			System.out.printf("New balance: %.2f%n", ac.getBalance());
			
		} catch (ExceptionAccount e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
