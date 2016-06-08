
public class Book {

	String title;
	int pageCount;
	int ISBN;
	boolean ischeckedOut;
	int dayCheckedOut = -1;
	
	//constructor
	public Book(String bookTitle, int BookPageCount, int bookISBN)
	{
		this.title = bookTitle;
		this.pageCount = BookPageCount;
		this.ISBN = bookISBN;
		this.ischeckedOut = false;
	}
	
	//....  Getters
	public String getTitle()
	{
		return this.title;
	}
	public int getPageCount()
	{
		return this.pageCount;
	}
	public int getISBN()
	{
		return this.ISBN;
	}
	public boolean getIsCheckedout()
	{
		return this.ischeckedOut;
	}
	public int getDayCheckedOut()
	{
       		return this.dayCheckedOut;
	}
	
	//.... Setters
	public void setIsCheckedOut(boolean newIscheckedOut, int currentDayCheckedOut)
	{
		this.ischeckedOut = newIscheckedOut;
		setDayCheckedOut(currentDayCheckedOut);
	}
	
	private void setDayCheckedOut(int day)
	{
		this.dayCheckedOut = day;
	}
	
	
}
