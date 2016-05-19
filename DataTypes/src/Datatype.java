import java.util.Scanner;


public class Datatype {

	public static void main(String args[])
	{
		int i =4;
		double d = 4.0;
		String s="Hello";
		Scanner scan = new Scanner(System.in);
		
		int j = scan.nextInt();
		double c = scan.nextDouble();
		scan.nextLine();
		String b = scan.nextLine();
	    
	    System.out.println(i+j);
	    System.out.println(c+d);
	    System.out.println(s+" "+b);
	    scan.close();
	}
	
}
