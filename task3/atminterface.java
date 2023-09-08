package task3;
import java.util.*;

public class atminterface {
	double avail_bal;
	double amount;
	
	public atminterface(double amount) {
		this.avail_bal=amount;
	}
   
	public static void withdraw(double amount2) {
		int avail_bal=availabel_balance();
		if(amount2>avail_bal) {
			System.out.println("You not have sufficient balance");
	       return;
		}
	    avail_bal=amount2-avail_bal;
		
	}
	public static int availabel_balance() {
		int avail_balance=0;
		return avail_balance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("welcome to Atm \n choose a option\n 1.withdraw \n 2.deposit\n 3.checking the balance");
       Scanner input=new Scanner(System.in);
      
       atminterface atm = new atminterface(100);
       
       int ch = input.nextInt();
       switch(ch) {
       case 1: 
    	   System.out.println("enter amount to withdraw");
   		   int amount=input.nextInt();
    	   atminterface.withdraw(amount);
             break;
       }
	}

     
     
}
