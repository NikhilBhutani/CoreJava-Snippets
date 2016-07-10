import java.util.Scanner;

public class PerfectNumber {

	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number to check it is perfect or not");
		
		int num= scan.nextInt();
		
		int sum=0;
		
		for(int i=1;i<=num/2;i++){
			
			if(num%i==0){
				sum=sum+i;
			}
			
		}
		if(sum==num){
			
			System.out.println("It is a perfect number");
		}else{
			System.out.println("It not a perfect number");
		}
		
		
		
	}
	
}
