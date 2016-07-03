package ll;



public class SingleLinkedList<T> {

	private Node<T> head;
	
	private void add(T i) {
		// TODO Auto-generated method stub
		
		Node<T> newnode = new Node<T>();
		newnode.setValue(i);
		
		System.out.println("Adding Element");
		Node<T> temp = head;
		while(true){
			if(temp == null)
			{
				head = newnode;
				break;
			}
			else if(temp.getNextref() == null)
			{
				temp.setNextref(newnode);
				break;
			}
			else
			{
				temp = temp.getNextref();
			}
			
			
			
		}
		
		
	}
	
	
	
	
	private void traverse() {
		// TODO Auto-generated method stub
		Node<T> temp = head;
		
		while(true)
		{
			if(temp == null){break;}
			
			System.out.println(temp.getValue());
			temp = temp.getNextref();
			
		}
	}
	
	public static void main(String args[])
	{
	    SingleLinkedList<Integer> linkedlist = new SingleLinkedList<Integer>();
	    linkedlist.add(2);
	    linkedlist.add(5);
	    linkedlist.add(15);
	    linkedlist.add(45);
	    System.out.println();
	    linkedlist.traverse();
	    
	    System.out.println();
	    linkedlist.reverse();
	    linkedlist.traverse();
	     
	}




	private void reverse() {
		// TODO Auto-generated method stub
		
		Node<T> prev = null;
		Node<T> current = head;
		Node<T> next = null;
		
		while(current!=null)
		{
			next = current.getNextref();
			current.setNextref(prev);
			prev = current;
			current = next;
		}
			
		
		head = prev;
	}

	

	
	
}
