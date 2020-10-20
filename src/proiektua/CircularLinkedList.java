package proiektua;

import java.util.LinkedList;


public class CircularLinkedList<T> {
	protected Node last;
	protected String deskr;
	protected int count;
	
	public CircularLinkedList(String de, int c) {
		this.deskr=de;
		this.count=c;
	}

}
