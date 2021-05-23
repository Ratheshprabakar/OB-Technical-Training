/*
 @Class Name : KeyboardInput

 @version1.10 20 May 2021
 @author Rathesh Prabakar
 */

import java.io.IOException;

public class KeyboardInput {

	public static void main(String[] args) {

		char character;
		try {
			character=(char) System.in.read();
			System.out.println("You have entered:"+ch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
