import java.util.Scanner;

public class PrimeNumber {

public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number to check it is prime or not");
		int flag =0;
		int num= scan.nextInt();
		
		
		
		for(int i=2;i<=num/2;i++){
			
			if(num%i==0){
				flag=1;
			}
			
		}
		if(flag==0){
			
			System.out.println("It is a prime number");
		}else{
			System.out.println("It not a prime number");
		}
		
		
		
	}

	
}
