import java.util.HashMap;
import java.util.Map;


public class LibraryCatalogue {

	//Properties/Fields/Global Variables
	Map<String, Book> bookCollection = new HashMap<String, Book>();
	int currentDay = 0;
	int lengthOfCheckOutPeriod = 7;
	double initalLateFee = 0.50;
	double feePerLateDay = 1.00;
	
	
	public LibraryCatalogue(Map<String, Book> collection)
	{
		this.bookCollection = collection;
	
	}
	
	public LibraryCatalogue( Map<String,Book> collection, int lengthOfCheckedPeroid,
			double initialLateFee, double feePerLateDay)
	{
		this.bookCollection = collection;
		this.lengthOfCheckOutPeriod = lengthOfCheckedPeroid;
		this.initalLateFee = initialLateFee;
		this.feePerLateDay = feePerLateDay;
		
	}
	
	//Getter & Setter
	
	public Map<String, Book> getBookCollection() {
		return this.bookCollection;
	}
	
	public Book getBook(String bookTitle)
	{
		return getBookCollection().get(bookTitle);
	}

	public void setBookCollection(Map<String, Book> bookCollection) {
		this.bookCollection = bookCollection;
	}

	public int getCurrentDay() {
		return this.currentDay;
	}

	public void setCurrentDay(int currentDay) {
		this.currentDay = currentDay;
	}

	public int getLengthOfCheckOutPeriod() {
		return this.lengthOfCheckOutPeriod;
	}

	public void setLengthOfCheckOutPeriod(int lengthOfCheckOutPeriod) {
		this.lengthOfCheckOutPeriod = lengthOfCheckOutPeriod;
	}

	public double getInitalLateFee() {
		return this.initalLateFee;
	}

	public void setInitalLateFee(double initalLateFee) {
		this.initalLateFee = initalLateFee;
	}

	public double getFeePerLateDay() {
		return this.feePerLateDay;
	}

	public void setFeePerLateDay(double feePerLateDay) {
		this.feePerLateDay = feePerLateDay;
	}
	
	public void NextDay()
	{
		currentDay++;
	}
	public void setDay(int day)
	{
		currentDay = day;
	}
	
	
	//INSTANCE METHODS
	
	public void checkOutBook(String title)
	{
		Book book = getBook(title);
		if(book.getIsCheckedout())
		{
			sorryBookAlreadyCheckedOut(book);
		}
		else
		{
			book.setIsCheckedOut(true, currentDay);
			System.out.println("You just checked out "+ title + ". It is due on day "+ (getCurrentDay()+ 
					getLengthOfCheckOutPeriod())+".");
		}
	}
	
	public void returnBook(String title)
		{
		  Book book = getBook(title);
		  
		  int daysLate = currentDay -(book.getDayCheckedOut()+getLengthOfCheckOutPeriod());
				  
		  if(daysLate>0)
		  {
			  System.out.println("You owe the library $ " + (getFeePerLateDay() + daysLate * getFeePerLateDay())+
			  " because your is "+ daysLate +" days overdue.");
		  }
		  else
		  {
			  System.out.println(" Book Returned, Thank you ");
		  }
		book.setIsCheckedOut(false, -1);
		}
	
	public void sorryBookAlreadyCheckedOut(Book book)
	{
		System.out.println("Sorry, "+ book.getTitle() + " is already checked out. "
				+ "It should be back on day "+ (book.getDayCheckedOut()+getLengthOfCheckOutPeriod())+ ".");
	}
	
//main function	
	public static void main(String args[])
	{
		Map<String, Book> bookCollection = new HashMap<String, Book>();
		
		Book leanStartup = new Book("Lean Startup", 300, 999999);
		
		bookCollection.put("Lean Startup", leanStartup);
		LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
		lib.checkOutBook("Lean Startup");
		lib.NextDay();
		lib.NextDay();
		lib.checkOutBook("Lean Startup");
		lib.setDay(17);
		lib.returnBook("Lean Startup");
		lib.checkOutBook("Lean Startup");
	

	}

}
