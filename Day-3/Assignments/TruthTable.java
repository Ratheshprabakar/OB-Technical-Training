/*
 @Class Name : TruthTable
 @Description : Program to print the truth table for AND, OR and EX-OR
 @version1.10 21 May 2021
 @author Rathesh Prabakar
 */

public class TruthTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("|P\t|Q\t|P&Q\t|P|Q\t|P^Q");
		System.out.println("-------------------------------------");
		for(int p=0;p<=1;p++)
		{
			for(int q=0;q<=1;q++)
			{
				System.out.println(p+"\t|"+q+"\t|"+(p&q)+"\t|"+(p|q)+"\t|"+(p^q));
				System.out.println("-------------------------------------");
			}
		}

	}

}
