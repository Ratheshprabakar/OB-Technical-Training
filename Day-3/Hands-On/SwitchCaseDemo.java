/*
 @Class Name : SwitchCaseDemo
 @version1.10 21 May 2021
 @author Rathesh Prabakar
 */

public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=4;i++)
		{
			switch(i)
			{
				case 0:
					System.out.println("The value is zero");
					break;
				case 1:
					System.out.println("The value is one");
					break;
				case 2:
					System.out.println("The value is two");
					break;
				case 3:
					System.out.println("The value is three");
					break;
				default:
					System.out.println("Value mismatch");
			}
		}

	}

}
