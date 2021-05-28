/**
 * @Class : RestaurantManagementSystem
 * @Description : Program to demonstrate the Restaurant Food Ordering System
 * 					Customer can see all the item and its price of the restaurant. Customer will select any item(at a time multiple items can be selected). 
 * 					After selection of items customer will get to know about billing details. 
 * 					Finally order get successful and generate the bill. Take an order till the user selection is done.
 * 					Get the calculation after items selection is done and show the billing amount.
 * 					Finally printed the order successful message
 */
package com.onebill.training.day8.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Rathesh Prabakar
 * @version 1.0 27.05.2021
 *
 */
public class RestaurantManagementSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> foodItemsName = new ArrayList<String>(
			Arrays.asList("Chicken Biriyani----> Rs.140", 
					"Mutton Biriyani----> Rs.160","Veg Fried Rice----> Rs.90",
					"Parotta----> Rs.20","Masala Dosa----> Rs.35",
					"Roti----> Rs.15","Naan---->Rs.60")
		);
		ArrayList<Integer> foodItemsPrice = new ArrayList<Integer>(
				Arrays.asList(140,160,90,20,35,15,60));
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Rathesh Restaurant\t");
		int totalFoodCost=0;
		while(true) {
			int k=1;
			for (String items : foodItemsName) {
				System.out.println(k+". "+items);
				k++;
			}
			
			System.out.println("Enter your choice, Enter 0 to finish the order\t");
			int choice = input.nextInt();
			
			if(choice!=0) {
				System.out.println("Enter the quantity for "+foodItemsName.get(choice-1));
				int foodQuantity = input.nextInt();
				totalFoodCost+=(foodItemsPrice.get(choice-1)*foodQuantity);
			}
			
			else {
				System.out.println("Your order amount is "+totalFoodCost);
				System.out.println("Do you want to make the payment (yes/no)");
				String confirmation = input.next();
				if(confirmation.equalsIgnoreCase("Yes")) {
					System.out.println("Thank you for ordering with us, Order is successfully booked, Your order is on the way ...");
					break;
				}
				else
				{
					System.out.println("Oops, Do you want to add some more items (yes- Add some more items /no - Quit the order)");
					String confirm = input.next();
					if(confirm.equalsIgnoreCase("no")) {
						System.out.println("Oops, I think you are not hungry now, Thank you visit again");
						break;
					}
					else
					{
						System.out.println("Rolling back to your order ...");
					}
				}
				
			}
		}
		input.close();
	}

}
