package task9;

import task9.DoubleLinkedList.Node;

public class Iterator {
	    Node current;
	    DoubleLinkedList list;
	    
	    
	    public Iterator(DoubleLinkedList<?> list) {
	    	this.list = list;
	    	
	    	this.start();
		}

		public void start() {
			this.current = list.header.prev;
	    }
		
		public void end() {
			this.current = list.header.next;
	    }
	    
	    public boolean hasNext() {
			return ( current.next != null );
		}
	    
	    public boolean hasPrev() {
			return ( current.prev != null );
		}
	    
	    public Node next() {
	    	current = current.next;
	    	return current;
	    }
	    
	    public Node prev() {
	    	current = current.prev;
	    	return current;
	    }
	    
	    public String toString() {
	    	return current.toString();
	    }
}
