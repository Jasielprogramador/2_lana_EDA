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
			azkenekoa.next=(Node)elem;
			((Node) elem).next=azkenekoa.next.next;
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
			azkenekoa.next=(Node) elem;
			((Node) elem).next=azkenekoa.next.next;
		}
		
	}
	
	public void addAfter(T elem, T target) {

		/*
		//Target zerrendan dago
		
		
		boolean aurkitua=false;
		ListIterator it=super.iterator();
		int i;
		
		while(it.hasNext() || !aurkitua) {
			i=(int)it.next();
			
			if (i==((Node) target).data) {
				aurkitua=true;
				
				aurrekoa=unekoa;
				unekoa=unekoa.next;
				aurrekoa.next=((Node)elem);
				((Node)elem).next=unekoa;
				
			}
			aurrekoa=unekoa;
			unekoa=unekoa.next;
			
		}
		if (unekoa.data.equals(((Node)target).data)) {
			aurrekoa=unekoa;
			unekoa=unekoa.next;
			aurrekoa.next=((Node)elem);
			((Node)elem).next=unekoa;
			
		}
		*/
	}
	
	
	
	
	
}
