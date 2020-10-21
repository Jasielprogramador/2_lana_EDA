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
	
	public void setDeskr(String nom) {
		super.deskr=nom;
	}
	
	public String getDeskr() {
		return super.deskr;
	}
	
	public T removeFirst() {
		T emaitza;
		
		//Solo hay un elemento
		if(super.last.next==null) {
			emaitza=(T)super.last;
			super.last=null;
		}
		else {
			Node unekoa=super.last.next;
			emaitza=(T)super.last.next;
			super.last.next=unekoa.next;
		}
	
		return emaitza;
		
	}
	
	public T removeLast() {
		T emaitza;
		Node unekoa=super.last.next;
		while(unekoa!=super.last) {
			unekoa=unekoa.next;
		}
		T emaitza=(T) super.last;
		unekoa.next=super.last.next;
		super.last=unekoa;
		
		return emaitza;
	}
	
	public T remove(T elem) {
		// Balio hori listan baldin badago, bere lehen agerpena ezabatuko dut. 
		//Kendutako objektuaren erreferentzia bueltatuko du (null ez baldin badago)
		
		Node unekoa=super.last.next;
		Node aurrekoa;
		
		T emaitza;
		while(unekoa!=super.last) {
			if(unekoa.data.equals(((Node) elem).data)) {
				
			}
		}
		
	}
	
	public T first() {
		
	}
	
	public T last() {
		
	}
	
	public boolean contains(T elem) {
		
	}
	
	public T find(T elem) {
		
	}
	
	public boolean isEmpty() {
		
	}
	
	public int size() {
		
	}
	
	public Iterator<T> iterator(){
		
	}
	
	
}
