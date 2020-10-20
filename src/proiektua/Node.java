package proiektua;

public class Node<T> {
	public T data;
	public Node next;
	
	public Node(T d,Node n) {
		this.data=d;
		this.next=n;
	}
}
