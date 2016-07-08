
public class RecursiveReversedString {

	String reverse = "";
	
	
	public static void main(String args[])
	{
	  RecursiveReversedString rrs = new RecursiveReversedString();
	  System.out.println("Result :"+rrs.reverseString("abcde"));
	}


	private String reverseString(String string) {
		// TODO Auto-generated method stub

		if(string.length() == 1){
			return string; 
		} else{
			
			reverse += string.charAt(string.length()-1)+ reverseString(string.substring(0, string.length()-1));
	
		} 
		
		return reverse;
	}
	
}
