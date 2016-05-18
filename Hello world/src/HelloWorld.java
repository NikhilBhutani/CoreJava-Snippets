import java.util.Scanner;


public class HelloWorld {

	public static void main (String args[])
	{
		//using the scanner class to read from stdin
		Scanner scan  = new Scanner(System.in);
		
		//here reading the input and saving to the variable
		String inputString = scan.nextLine();
		
		//closing the scanner 
		scan.close();
		
		//Hello world String output
		System.out.println("Hello World");
		
		//your first Entered String in java output
		System.out.print("You Entered "+inputString+" Bingo!");
	}
	
}
