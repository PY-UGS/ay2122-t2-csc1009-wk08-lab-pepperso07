package Wk8;

import java.util.Scanner;

public class BankDemoClass {
public static void main(String[] args) {
	
	CheckingAccount ca= new CheckingAccount("AAA");
	
	double deposit=0;
	double withdraw=0;
	
	try
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter amount to deposit: ");
		deposit= sc.nextDouble();
		ca.deposit(deposit);
		
		System.out.println("Enter amount to withdraw: ");
		withdraw= sc.nextDouble();
		ca.withdrawal(withdraw);
		
		System.out.println("The balance left after withdrawal : $"+String.format("%.2f",ca.getBal()));
		
		
		
	}
	catch(Exception e)
	{
		System.out.println(e);
		System.out.println("Sorry! but your amount is short by $"+String.format("%.2f",withdraw-ca.getBal()));

	}
	
	
	
			
}
}
