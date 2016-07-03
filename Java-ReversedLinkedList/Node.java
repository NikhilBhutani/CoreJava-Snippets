package ll;

public class Node<T> implements Comparable{
	
	private T value;
    private Node<T> nextref;
    
   
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}


	public Node<T> getNextref() {
		return nextref;
	}



	public void setNextref(Node<T> nextref) {
		this.nextref = nextref;
	}





	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
         if(arg0 == this.value)
		return 0;
         else
        return 1;	 
	}

}
