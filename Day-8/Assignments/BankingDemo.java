/**
 * @Class : BankingDemo
 * @Description : Implement Synchronization in banking functionality including withdrawal and deposit of amount
 */
package com.onebill.training.day8.assignments;

/**
 * @author Rathesh Prabakar
 * @version 1.0 27.05.2021
 */
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

class BankThread extends Thread {
	
	BankFunctions customerRef;
	public BankThread(BankFunctions p, int choice,int amount) {
		customerRef = p;
		if(choice == 1)
		{	synchronized (p) {
				p.withdraw(amount);
			}		
		}
		else
		{
			synchronized (p) {
				p.deposit(amount);
			}				
		}		
	}
}
class BankFunctions {
	
	int customerAmount =2500;               
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
public class BankingDemo{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BankFunctions customer =new BankFunctions();
		
		BankThread client1 = new BankThread(customer, 1, 1000);  // 1 - Withdrawal 2- Deposit
		BankThread client2 = new BankThread(customer, 2, 2000); 
		
		client1.start();
		client2.start();

		
	}

}
