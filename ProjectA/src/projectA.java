import java.util.Scanner;

public class projectA
	{

		public static void main(String[] args)
			{
				
				Scanner userInput = new Scanner(System.in);
				
				System.out.println("Please type in any combination of uppercase and lowercase words with a space inbetween.");
				
				String word = userInput.next();
				String word1 = userInput.next();
			
				
				System.out.print("Your camel case word is..." + word.toLowerCase());
				
				System.out.println(word1.substring(0,1).toUpperCase() + word1.substring(1).toLowerCase());
			}

	}
