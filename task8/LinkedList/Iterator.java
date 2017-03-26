package task8;

import java.util.ConcurrentModificationException;

import task8.LinkedList.Node;

public class Iterator {
		int modCount;
		Node current;
	    LinkedList list;
	    
	    public Iterator(LinkedList<?> list) {
	    	this.list = list;
	    	modCount = list.modCount;
	    	
	    	start();
		}

		public void start() {
			this.current = list.getFirst();
	    }
	    
	    public boolean hasNext() {
	    	return current.next != null;
		}
	    
	    public Node next() {
	    	if ( list.modCount != this.modCount ) {
	    		throw new ConcurrentModificationException();
	    	}
	    	if ( current == null ) {
	    		this.start();
	    		return current;
	    	}
	    	current = current.next;
	    	return current;
	    }
	    
	    public String toString() {
	    	return current.toString();
	    }
}
