import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LexicographicalString {
	
	
	public static void main(String arg[])
	{
		 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter String");
		String str = scan.nextLine();
		System.out.println("Enter the length of substring");
		int subslen = scan.nextInt();
		
		List<String> list = new ArrayList<String>();
		
		for(int i = 0; i <str.length();i++){
			if(str.length()-i>=subslen){
				list.add(str.substring(i, subslen+i));
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
		
		
	}

}
