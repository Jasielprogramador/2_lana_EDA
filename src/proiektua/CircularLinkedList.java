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
		this.deskr=nom;
	}
	
	public String getDeskr() {
		return this.deskr;
	}
	
	public T removeFirst() {
		T emaitza=null;
		
		if(this.last==null) {
			System.out.println("Zerrenda hutsa");
		}
		else {
			
			//Solo hay un elemento
			if(this.last.next==this.last) {
				emaitza=(T)this.last;
				this.last=null;
			}
			else {
				Node unekoa=this.last.next;
				emaitza=(T)this.last.next;
				this.last.next=unekoa.next;;
			}
		}
		
		this.count--;
	
		return emaitza;
		
	}
	
	public T removeLast() {
		
		T emaitza=null;
		
		if(this.last==null) {
			System.out.println("Zerrenda hutsa");
		}
		else {
			if(this.last.next!=this.last) {
				Node unekoa=this.last.next;
				while(unekoa!=this.last) {
					unekoa=unekoa.next;
				}
				emaitza=(T) this.last;
				unekoa.next=this.last.next;
				this.last=unekoa;
			}
			else {
				emaitza=(T)this.last;
				this.last=null;
			}
		}
		this.count--;
	
		
		return emaitza;
	}
	
	public T remove(T elem) {
		// Balio hori listan baldin badago, bere lehen agerpena ezabatuko dut. 
		//Kendutako objektuaren erreferentzia bueltatuko du (null ez baldin badago)
		
		Node aurrekoa=null;
		Node unekoa=this.last.next;
		T emaitza=null;
		
		if(this.last!=null) {
			//Elementu bakarra
			if(unekoa==this.last) {
				emaitza=(T)this.last;
				this.last=null;
			}
			else {
				while(unekoa!=this.last) {
					if(unekoa.data.equals(((Node) elem).data)) {
						emaitza=(T)unekoa;
						aurrekoa.next=unekoa.next;
						unekoa=unekoa.next;
					}
					aurrekoa=unekoa;
					unekoa=unekoa.next;		
				}
			}
		
		}
		else {
			System.out.println("Zerrenda hutsa");
		}
		
		return emaitza;
	}
	
	public T first() {
		return (T)this.last.next;
	}
	
	public T last() {
		return (T)this.last;
	}
	
	public boolean contains(T elem) {
		boolean emaitza=false;
		
		
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
