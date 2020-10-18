package proiektua;

import org.w3c.dom.Node;
import java.util.LinkedList;


public class UnorderedCircularLinkedList<T> extends CircularLinkedList{
	
	public UnorderedCircularLinkedList(String d, int c) {
		super(d,c);
	}

	public void addToFront(T elem) {
		Node azkenekoa=(Node)super.last;
		
		// Zerrenda hutsa bada
		if(azkenekoa==null) {
			Node berria=new Node(elem,azkenekoa);
			azkenekoa=(Node)elem;	
		}
		else {
			Node berria=new Node(elem,azkenekoa.next);
			azkenekoa.next=berria;
		}
	}
	
	public void addToRear(T elem) {
		
	}
	
	public void addAfter(T elem, T target) {
		Node unekoa=(Node)super.last.next;
		Node aurrekoa;
		boolean aurkitua=false;
		while(unekoa!=super.last || !aurkitua) {
			if (unekoa.data.equals(target.data)) {
				aurkitua=true;
				Node berria=new Node(elem,azkenekoa.next);
				
				
			}
		}
	}
}
