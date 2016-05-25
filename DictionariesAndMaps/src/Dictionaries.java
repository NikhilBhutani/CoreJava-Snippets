import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Dictionaries {
	
	 public static void main(String []arg){
		 Map<String,String> dict = null;
		 String name=null,myphone=null;
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        dict = new HashMap<String,String>();
	        for(int i = 0; i < n; i++){
	            name = in.next();
	            in.nextLine();
	            int phone = in.nextInt();
	            // Write code here
	            System.out.println("Entered "+i+" times");
	            myphone = String.valueOf(phone);
	            dict.put(name, myphone);
	        }
	        while(in.hasNext()){
	            String s = in.next();
	            
	            // Write code here
	            if(dict.get(s)==null)
	            {
	            	System.out.println("Not found");
	            }
	            else
	            {
	            	System.out.println(s+"="+dict.get(s));
	            }
	            
	        }
	        in.close();
	    }

}
