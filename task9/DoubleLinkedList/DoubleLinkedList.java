package task9;

import task9.Iterator;

public class DoubleLinkedList <T>{
	Node header;
	int size;
	
	class Node {
		Node next;
		Node prev;
		T value;
		
		public String toString() {
			return this.value.toString();
		}
	}
	
	public DoubleLinkedList() {
		this.header = new Node();
		this.size = 0;
	}
	
	public void addFirst(T value) {
		Node node = new Node();
		
		node.value = value;
		if ( this.isEmpty() ) {
			addFirstNode(node);
		} else {
			node.next = this.header.prev;
			this.header.prev.prev = node;
			this.header.prev = node;
		}
		incrSize();
	}
	
	public void addLast(T value) {
		Node node = new Node();
		
		node.value = value;
		if ( this.isEmpty() ) {
			addFirstNode(node);
		} else {
			node.prev = this.header.next;
			this.header.next.next = node;
			this.header.next = node;
		}
		incrSize();
	}
	
	public void add(T value, int index) {
		if ( index > this.size || index < 0 ) {
			throw new IllegalArgumentException();
		}
		if ( index == 0 ) {
			addFirst(value);
			return;
		}
		if ( index == this.size ) {
			addLast(value);
			return;
		}
		if ( index < ((this.size - 1) / 2) ) {
			addInFirstHalf(value, index);
		} else {
			addInLastHalf(value, index);
		}
	}
	
	public void removeFirst() {
		if ( !this.isEmpty() ) {
			this.header.prev = this.header.prev.next;
			this.header.prev.prev = null;
			decrSize();
		}
	}
	
	public void removeLast() {
		if ( !this.isEmpty() ) {
			this.header.next = this.header.next.prev;
			this.header.next.next = null;
			decrSize();
		}
	}
	
	public void remove(int index) {
		if ( index > this.size || index < 0 ) {
			throw new IllegalArgumentException();
		}
		if ( index == 0 ) {
			removeFirst();
			return;
		}
		if ( index == this.size - 1 ) {
			removeLast();
			return;
		}
		if ( index < (this.size / 2) ) {
			removeInFirstHalf(index);
		} else {
			removeInLastHalf(index);
		}
	}
	
	private void removeInFirstHalf(int index) {
		int pos = 0;
		Node node = this.header.prev;
		
		while ( pos < index  ) {
			node = node.next;
			pos += 1;
		}
		node.prev.next = node.next;
		node.next.prev = node.prev;
		decrSize();
	}
	
	private void removeInLastHalf(int index) {
		int pos = this.size - 1;
		Node node = this.header.next;
		
		while ( pos > index  ) {
			node = node.prev;
			pos -= 1;
		}
		node.prev.next = node.next;
		node.next.prev = node.prev;
		decrSize();
	}

	private void addInFirstHalf(T value, int index) {
		Node node = this.header.prev;
		Node newNode = new Node();
		int pos = 0;
		
		newNode.value = value;
		while ( pos < index - 1 ) {
			node = node.next;
			pos += 1;
		}
		newNode.prev = node;
		newNode.next = node.next;
	    newNode.prev.next = newNode;
	    newNode.next.prev = newNode;
	    incrSize();
	}
	
	private void addInLastHalf(T value, int index) {
		Node node = this.header.next;
		Node newNode = new Node();
		int pos = this.size - 1;
		
		newNode.value = value;
		while ( pos > index ) {
			node = node.prev;
			pos -= 1;
		}
		newNode.next = node;
		newNode.prev = node.prev;
		newNode.prev.next = newNode;
		newNode.next.prev = newNode;
		incrSize();
	}
	
	public boolean contains(T value) {
		Node node = this.header.prev;
		
		while (node != null) {    
            if ( node.value.equals(value) ) {
            	return true;
            }
            node = node.next;
        }
		return false;
	}
	
	public int size() {
		return this.size;
	}
	
	private boolean isEmpty() {
		return (this.header.prev == null);
	}
	
	private void incrSize() {
		this.size += 1;
	}
	
	private void decrSize() {
		this.size -= 1;
	}
	
	private void addFirstNode(Node node) {
		this.header.prev = node;
		this.header.next = node;
	}
	
	public Iterator iterator() {
        return new Iterator(this);
    }
	
	public String toString() {
		Node node = this.header.prev;
		StringBuilder output = new StringBuilder();
		
		if ( this.header.prev == null ) {
			return "{}";
		}
		
		if ( this.header.prev == this.header.next ) {
			return "{" + node +"}";
		}
		
		output.append("{");
		while (node.next != null) { 
			output.append(node + ", ");
			node = node.next;
		}
		
		output.append(node + "}");
		return output.toString();
	}
}
