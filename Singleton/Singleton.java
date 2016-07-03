
public class Singleton {

	

	 private static Singleton instance = null;
	 
	    private Singleton()
	    {
	    	
	    }
	    
	    public static Singleton getinstance()
	    {
	    	if(instance==null)
	    	{
	    		instance = new Singleton();
	    	}
	    	return instance;
	    }
	    
	    public static void main(String arg[])
	    {
	    	Singleton mysingleton = getinstance();
	    	mysingleton.here();
	    }

		private void here() {
			// TODO Auto-generated method stub
	      System.out.println("Singleton Class is created BAAM!!");		
		}
	    

	
}
