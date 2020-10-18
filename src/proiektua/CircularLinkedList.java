package proiektua;

import java.util.LinkedList;
import org.w3c.dom.Node;
import java.util.*;


public class CircularLinkedList<T> {
	protected Node last;
	protected String deskr;
	protected int count;
	
	public CircularLinkedList(String de, int c) {
		this.deskr=de;
		this.count=c;
	}

}
