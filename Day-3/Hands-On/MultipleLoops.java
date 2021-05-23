/*
 @Class Name : MultipleLoops
 @version1.10 21 May 2021
 @author Rathesh Prabakar
 */

public class MultipleLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=0,j=10;i<j;i++,j--) {
			System.out.println("i value "+i+" j value "+ j);
		}*/
		int power=3,base=-3,result=1;
		while(power!=0)
		{
			result*=base;
			power--;
		}
		System.out.println(result);

	}

}
