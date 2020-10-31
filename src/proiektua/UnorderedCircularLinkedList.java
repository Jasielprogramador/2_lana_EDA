package proiektua;


import java.util.LinkedList;



public class UnorderedCircularLinkedList<T> extends CircularLinkedList{
	
	public UnorderedCircularLinkedList(String d, int c) {

	}

	public void addToFront(T elem) {
		Node azkenekoa=(Node)super.last;
		
		// Zerrenda hutsa bada
		if(super.isEmpty()) {
			azkenekoa=(Node)elem;
			((Node) elem).next=azkenekoa;
		}
		else {
			((Node) elem).next=azkenekoa.next;
			azkenekoa.next=(Node)elem;
		}
	}
	
	//Sartu amaieran
	public void addToRear(T elem) {
		Node azkenekoa = (Node)super.last;
		
		if(super.isEmpty()) {
			azkenekoa=(Node)elem;
			((Node) elem).next=azkenekoa;
		}
		else {
			((Node) elem).next=azkenekoa.next;
			azkenekoa.next=(Node) elem;
			azkenekoa=(Node) elem;
		}
		
	}
	
	public void addAfter(T elem, T target) {
		
		//Target zerrendan dago
		
		
		boolean aurkitua=false;
		ListIterator it=super.iterator();
		T t;
		
		while(it.hasNext() || !aurkitua) {
			t=(T) it.next();
			
			if (((Node) target).equals(t)) {
				aurkitua=true;
				
				((Node) elem).next=((Node) t).next;
				((Node) t).next=(Node) elem;
				
			}
			
		}
		if (unekoa.data.equals(((Node)target).data)) {
			aurrekoa=unekoa;
			unekoa=unekoa.next;
			aurrekoa.next=((Node)elem);
			((Node)elem).next=unekoa;
			
		}
		
	}
	
	
	
	
	
}
