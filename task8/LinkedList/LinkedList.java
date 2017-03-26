package task8;

public class LinkedList<T> {
	Node first;
	Node current;
	int modCount = 0;
	
	class Node {
		Node next;
		T value;
		
		public String toString() {
			return this.value.toString();
		}
	}
	
	public Node getFirst() {
		return this.first;
	}
	
	public Node getLast() {
		return this.current;
	}
	
	public void add(T value) {
		Node node = new Node();
		
		node.value = value;
		if ( this.first == null ) {
			this.first = node;
			this.current = node;
		} else {
			this.current.next = node;   
            this.current = node; 
		}
		modCount += 1;
	}
	
	public void addFirst(T value) {
		Node node = new Node();
		
		node.value = value;
		if ( first == null ) {
			this.first = node;
			this.current = node;
		} else {
			node.next = this.first;
			this.first = node;
		}
		modCount += 1;
	}
	
	public void add(T value, int index) {
		int pos = 0;
		Node node = first;
		Node newNode = new Node();
		
		if ( index > this.size() || index < 0 ) {
			throw new IllegalArgumentException();
		}
		
		if ( index == 0 ) {
			this.addFirst(value);
		}
		
		newNode.value = value;
		while ( pos < index - 1 ) {
			node = node.next;
			pos += 1;
		}
		
		newNode.next = node.next;
		node.next = newNode;
		modCount += 1;
	}
	
	
	public void removeFirst()  {
		this.first = first.next;
		modCount += 1;
	}
	
	public void remove()  {
		Node node = first;
		int preLast = this.size() - 2; 
		
		if ( first == null ) {
			return;
		}
		
		if ( first == current ) {
			this.removeFirst();
		}
		
		for( int i = 0; i < preLast; i++ ) {
			node = node.next;
		}
		node.next = null;
		modCount += 1;
	}
	
	public void remove(int index) {
		int pos = index - 1;
		Node node = this.first;
		
		if ( index > this.size() - 1 || index < 0 ) {
			throw new IllegalArgumentException();
		}
		
		if ( index == 0 ) {
			this.removeFirst();
		}
		
		for( int i = 0; i < pos; i++ ) {
			node = node.next;
		}
		node.next = node.next.next;
		modCount += 1;
	}
	
	public boolean contains(T value) {
		Node node = this.first;
		
		while (node != null) {    
            if ( node.value.equals(value) ) {
            	return true;
            }
            node = node.next;
        }
		return false;
	}
	
	public int size() {
		int size = 0;
		Node node = this.first;
		
		while(node != null) {
			size += 1;
			node = node.next;
		}
		
		return size;
	}
	
	public String toString() {
		Node node = this.first;
		StringBuilder output = new StringBuilder();
		
		if ( this.first == null ) {
			return "{}";
		}
		
		output.append("{");
		while (node.next != null) { 
			output.append(node + ", ");
			node = node.next;
		}
		output.append(node + "}");
		return output.toString();
	}

	public Iterator iterator() {
        return new Iterator(this);
    }
}


