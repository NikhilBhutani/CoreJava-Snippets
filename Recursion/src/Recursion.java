import java.util.Scanner;


public class Recursion {
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        int  n;
        int f=1;
        Scanner scan = new Scanner(System.in);
        
        n = scan.nextInt();
        f = factorial(n);
        System.out.print(f);
        
    }
    static int factorial(int n)
        {
        if(n==0)
            {
            return 1;
        }else
            {
            return (n* (factorial(n-1)));
        }
    }

}
