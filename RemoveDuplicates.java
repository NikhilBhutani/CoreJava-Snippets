import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDuplicates {
	
	  private int[] rmvdup(int[] input){
		  int oldlen = input.length;
		
		  Arrays.sort(input);
		  int count =0;
		  int i = 0;
		  int j = 1;
		  
		  while(j<oldlen){
			  if(input[i]==input[j]){
	            j++;               		  
			  }else{
				  //j++;
				    
				    input[++i]=input[j++];
	
			  }
			  
		  }
		  int output[] =  new int[i+1];
		  for(int k=0;k<output.length;k++){
			   output[k] = input[k];
		  }
	
	   return output;
	  }
	
	
	public static void main(String arg[]){
		RemoveDuplicates rmv = new RemoveDuplicates();
		int myarry[] = {2,7,4,5,6,4,7,3};
		int output[] = rmv.rmvdup(myarry); 
		
		for(int v:output){
			System.out.println(v);
		}
	}

}
