/*
 @Class Name : GuessingGame
 @Description : GuessingGame class is created to implement the character guessing game 
 using System.in.read() 
 
 @version1.10 20 May 2021
 @author Rathesh Prabakar
 */

import java.io.IOException;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) throws IOException {
		Scanner input =new Scanner(System.in);
		char characterGuess = 'x';
		int guessCount=0;
		char inputCharacter;
		do {
			System.out.println("Enter your guess\t");
			inputCharacter=(char)System.in.read();
			input.nextLine();
			if(inputCharacter==characterGuess) {
				System.out.println("Congratulations your guess is correct, "
						+ "You did it this time with "+guessCount+" Guess");
				break;
			}
			else
			{
				System.out.println("OOPS, Your guess is wrong");
			}
			guessCount++;
		}while(true);
		input.close();
	}

}
