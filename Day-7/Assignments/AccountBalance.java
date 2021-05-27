/**
 * @Class Name : AccountBalance
 * @Description : Program to do the credit, debit, balance check operation with the exception of Minimum Balance Rs. 1000
 */
package com.onebill.training.assignments.day7;

/**
 * 
 * @Version 1.0 26.05.2021
 * @author Rathesh Prabakar
 */

import java.util.Scanner;

//MinimumBalanceException 
@SuppressWarnings("serial")
class MinimumBalanceException extends Exception{
  public MinimumBalanceException(String s){
	   super(s);
  }
}

//NegativeBalanceException
@SuppressWarnings("serial")
class NegativeBalanceException extends Exception{
public NegativeBalanceException(String s) {
	super(s);
}
}

class CustomerAccountDetails{
int customerAmount =0;               

//Function to perform deposit
public void deposit(int amount){ 
	 System.out.println("Deposited Amount:"+amount);     
    this.customerAmount+=amount; 
	balanceCheck();
 }  

//Function to perform Withdrawal 
public void withdraw(int withdrawAmount){           
       try{
       	if(this.customerAmount<=1000) {
       		// calling MinimumBalanceException 
       		throw new MinimumBalanceException("Your account must contains Minimum balance,Your Balance is low! Not able to withdraw");
       	}
       	else {
       		if(withdrawAmount<0) {
       			// calling NegativeBalanceException
       			throw new NegativeBalanceException("You have entered negative amount, Please enter the correct value");
       		}
       		else {
       			System.out.println("Withdraw Amount:"+withdrawAmount);
       			this.customerAmount-=withdrawAmount;
       			balanceCheck();
       		    }
           }
           }
       catch(Exception e){
           	System.out.println(e.getMessage());
           }  
  }

 public void balanceCheck() {
	  System.out.println("Available Balance:"+this.customerAmount);
 }
        
     
}
public class AccountBalance {
	public static void main(String[] args) {
		
		CustomerAccountDetails customer =new CustomerAccountDetails();
		Scanner input =new Scanner(System.in);
		
		while(true) {
		System.out.println("1.Deposit\n2.Withdraw\n3.Balance\n4.Cancel");
		System.out.print("Enter your choice:");
		
		int choice =input.nextInt();
		
		switch(choice) {
		case 1:
		{
		     System.out.println("Enter the Amount to be deposited\t");
		     int depositAmount =input.nextInt();
		     customer.deposit(depositAmount);
		     break;
		}
		case 2:
		{
			System.out.println("Enter the Amount to be withdraw");
			int withdrawAmount =input.nextInt();
			customer.withdraw(withdrawAmount);
			break;
		}
		case 3:
			customer.balanceCheck();
			break;
			
		case 4:
			System.exit(0);
			
		default:
			System.out.println("Invalid Choice");
			
	    }
		System.out.println();
	    }

	}

}
