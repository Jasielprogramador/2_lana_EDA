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
		
		Node emaitza;
		if(unekoa==null) {
			emaitza=super.last;
			super.last=null;
		}
		else {
			while(unekoa!=super.last) {
				if(unekoa.data.equals(((Node) elem).data)) {
					aurrekoa.next=unekoa.next;
					unekoa=unekoa.next;
				}
				else {
					aurrekoa=unekoa;
					unekoa=unekoa.next;
				}
			}
			return emaitza;
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
