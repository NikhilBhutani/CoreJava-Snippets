import java.util.Scanner;


public class Operators {
	
	  public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        double mealCost = scan.nextDouble(); // original meal price
	        int tipPercent = scan.nextInt(); // tip percentage
	        int taxPercent = scan.nextInt(); // tax percentage
	        scan.close();
	        
	        double mytipPercent = (double)tipPercent;
	        double mytaxPercent = (double)taxPercent;
	        double tipcost = Math.round(mealCost*(mytipPercent/100));
	        double taxcost = Math.round(mealCost*(mytaxPercent/100));
	          
	          int totalCost = (int)(tipcost + taxcost);
	          
	          int mytotalcost = (int)(totalCost + mealCost);
	          System.out.println("The total meal cost is "+mytotalcost+" dollars.");
	    }

}
