

import java.io.IOException;

public class ThrowsDemo1 {
  static char prompt(String str) throws IOException {
	  System.out.println(str);
	  return (char)System.in.read();
  }
	public static void main(String[] args) {
		char character;
		try {
			character= prompt("Enter the Character");
		}catch (IOException e) {
System.out.println("IOException Occurs");
       character='X';
		}
		System.out.println("The input character is "+ character);
	}

}
