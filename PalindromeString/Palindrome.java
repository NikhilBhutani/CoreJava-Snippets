import java.util.Scanner;

public class Palindrome {

	public static void main(String args [])
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		String strrev = "";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			strrev+= str.charAt(i);
		}
				
		if(str.equals(strrev)){
			System.out.println("It is a palindrome string");
		}else{
			System.out.println("It is not a palindrome string");
		}
				
		
	}
	
}
