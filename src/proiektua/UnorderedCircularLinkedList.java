package proiektua;


import java.util.LinkedList;


public class UnorderedCircularLinkedList<T> extends CircularLinkedList{
	
	public UnorderedCircularLinkedList(String d, int c) {

		super(d,c);
	}

	public void addToFront(T elem) {
		Node azkenekoa=(Node)super.last;
		
		// Zerrenda hutsa bada
		if(azkenekoa==null) {
			azkenekoa=(Node)elem;
			((Node) elem).next=azkenekoa;
		}
		else {
			azkenekoa.next=(Node)elem;
			((Node) elem).next=azkenekoa.next.next;
		}
	}
	
	public void addToRear(T elem) {
			
		Node azkenekoa=(Node)super.last;
		
		// Zerrenda hutsa bada
		if(azkenekoa==null) {
			azkenekoa=(Node)elem;
			((Node) elem).next=azkenekoa;
		}
		else {
			azkenekoa.next=(Node)elem;
			((Node) elem).next=azkenekoa.next.next;
		}
		
	}
	
	public void addAfter(T elem, T target) {

		
		//Target zerrendan dago
		
		Node unekoa=super.last.next;
		Node aurrekoa;
		boolean aurkitua=false;
		while(unekoa!=super.last || !aurkitua) {
			if (unekoa.data.equals(((Node)target).data)) {
				aurkitua=true;
				
				aurrekoa=unekoa;
				unekoa=unekoa.next;
				aurrekoa.next=((Node)elem);
				((Node)elem).next=unekoa;
				
			}
			else {
				aurrekoa=unekoa;
				unekoa=unekoa.next;
			}
		}
	}
}
