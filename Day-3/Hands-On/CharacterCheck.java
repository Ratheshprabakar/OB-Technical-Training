/*
 @Class Name : CharacterCheck
 @version1.10 21 May 2021
 @author Rathesh Prabakar
 */

import java.io.IOException;
import java.util.Scanner;

public class CharacterCheck {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		char inputCharacter;
		do {
			System.out.println("Enter your input\t");
			inputCharacter=(char)System.in.read();
			input.nextLine();
			if(inputCharacter=='q') 
				break;		
			else
				continue;
		}while(true);
		input.close();

	}
}


