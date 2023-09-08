package task3;
import java.util.*;

class useraccount{
	private double balance;
	public useraccount(double initial_balance) {
		this.balance= initial_balance;
	}
	
	public double available_balance() {
		return balance;
	}
	
	public boolean withdraw(double amount) 
	{
		if(amount>balance) { 
			return false;
		}
		else {
	         balance = balance-amount;
	         return true;
		}
	}
	
	public double deposit(double amount)
	{
		balance = balance+ amount;
		return balance;
		
	}
	
}
class  ATM{
	private useraccount account;
	
	Scanner input=new Scanner(System.in);
	
	public ATM(useraccount account) {
		this.account=account;
		
	}
	public void displayoptons() {
		System.out.println("*************************Welcome to ATM*****************************");
		System.out.println("choose the options");
		System.out.println(" 1. Show Available Balance \n 2. Witdraw Money \n 3. Deposit Money \n 4.Exit \n");
	}
	public boolean performoptions(int choice) {
		boolean flag;
		switch(choice) {
			case 1:
				double balance_avail=account.available_balance();
				System.out.println("Your Available Balance is " + balance_avail+"Rs");
				break;
				
			case 2:
				System.out.println("Enter a amount to withdraw");
				double amount=input.nextDouble();
				flag=account.withdraw(amount);
				if(flag==true) {
				System.out.println("You have successfully withdraw amount "+amount+"Rs");
				}
				else {
					System.out.println("You not have sufficient balance");
				}
				break;
				
			case 3:
				System.out.println("Enter a amount to Deposit");
				double amount2=input.nextDouble();
				double deposit_amt=account.deposit(amount2);
				System.out.println("You have successfully withdraw amount "+deposit_amt+"Rs");
				break;
				
			case 4:
				
				System.out.println("Thank for using Atm");
				break;
				
			default:
				System.out.println("Invalid Choice, Please try again");
				
		}
		if(choice==4) {
		System.out.println("you want to perform another operation Y/N");
		String ch= input.next();
		if(ch.equals("N")){
			return false;
		}
//		else {
//		return false;
//		}
	}
		return true;
	}
	
	public void run() {
		int choice;
		boolean flag;
		do{
		displayoptons();
		System.out.println("Enter your Choice");
		choice=input.nextInt();
		flag=performoptions(choice);
		System.out.println();
		}
		while(flag);
		
	}
}


public class atminterface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       useraccount account=new useraccount(100);
       
       ATM obj= new ATM(account);
       obj.run();
}
}
