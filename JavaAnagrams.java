import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {

	
	  static boolean isAnagram(String a, String b) {
	        String a1=a.toLowerCase();
	        String b1=b.toLowerCase();
	        
	         char[] word1 = a1.replaceAll("[\\s]", "").toCharArray();
	     char[] word2 = b1.replaceAll("[\\s]", "").toCharArray();
	        Arrays.sort(word1);
	        Arrays.sort(word2);
	        if( Arrays.equals(word1,word2))
	            {
	            return true;
	        }else{
	            return false;
	        }
	        
	        
	    }
	  
	    public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	
	
}
