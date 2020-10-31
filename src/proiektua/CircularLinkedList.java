package proiektua;

import java.util.Iterator;
import java.util.LinkedList;


public class CircularLinkedList<T> implements ListADT<T>{
	protected Node<T> last;
	protected String deskr;
	protected int count;
	
	public CircularLinkedList(String des) {
		this.setDescr(des); 
		this.count = 0;
	}
	
	public void setDescr(String nom) {
		this.deskr=nom;
	}
	
	public String getDescr() {
		return this.deskr;
	}
	
	public T removeFirst() {
		T emaitza=null;
		
		if(this.isEmpty()) {
			System.out.println("Zerrenda hutsa");
		}
		else {
			Node<T> unekoa;
			//Solo hay un elemento
			if(this.last.next==this.last) {
				unekoa=this.last;
				emaitza=unekoa.data;
				this.last=null;
			}
			else {
				unekoa=this.last.next;
				emaitza=unekoa.data;
				this.last.next=unekoa.next;
			}
		}
		
		this.count--;
	
		return emaitza;
		
	}
	
	public T removeLast() {
		
		T emaitza=null;
		
		if(this.isEmpty()) {
			System.out.println("Zerrenda hutsa");
		}
		else {
			Node<T> aurrekoa=this.last;
			Node<T> unekoa=this.last.next;
			if(this.last.next!=this.last) {
				while(unekoa!=this.last) {
					unekoa=unekoa.next;
				}
				emaitza =aurrekoa.data;
				unekoa.next=this.last.next;
				this.last=unekoa;
			}
			else {
				emaitza=aurrekoa.data;
				this.last=null;
			}
		}
		this.count--;
	
		
		return emaitza;
	}
	
	public T remove(T elem) {
		// Balio hori listan baldin badago, bere lehen agerpena ezabatuko dut. 
		//Kendutako objektuaren erreferentzia bueltatuko du (null ez baldin badago)
		
		Node<T> aurrekoa=null;
		Node<T> unekoa=this.last.next;
		T emaitza=null;
		Node<T> berria = new Node (elem);
		boolean aurkitua=false;
		
		if(!this.isEmpty()) {
			//Elementu bakarra
			if(unekoa==this.last) {
				emaitza=(T)this.last;
				this.last=null;
			}
			else {
				while(unekoa!=this.last && !aurkitua) {
					if(unekoa.data.equals(berria.data)) {
						emaitza=unekoa.data;
						aurrekoa.next=unekoa.next;
						unekoa=unekoa.next;
						aurkitua=true;
					}
					aurrekoa=unekoa;
					unekoa=unekoa.next;		
				}
				if(unekoa.data.equals(berria.data)) {
					emaitza=unekoa.data;
					aurrekoa.next=unekoa.next;
					unekoa=unekoa.next;
					aurkitua=true;
				}
				
				if(!aurkitua) {
					emaitza=null;
				}
			}
		
		}
		else {
			System.out.println("Zerrenda hutsa");
		}
		
		return emaitza;
	}
	
	public T first() {
		return this.last.data;
	}
	
	public T last() {
		return this.last.data;
	}
	
	public boolean contains(T elem) {
		boolean emaitza=false;
		Node<T> unekoa=this.last.next;
		Node<T> berria = new Node(elem);
		
		if(!this.isEmpty()) {
		
			while(unekoa!=this.last) {
				if(unekoa.data.equals(berria.data)) {
					emaitza=true;
				}
				unekoa=unekoa.next;
			}
			if(unekoa.data.equals(berria.data)) {
				emaitza=true;
			}
		}
		else {
			System.out.println("Zerrenda hutsa");
		}
		
		return emaitza;
		
	}
	
	public T find(T elem) {
		boolean emaitza=false;
		Node<T> unekoa=this.last.next;
		T ema=null;
		Node<T> berria=new Node(elem);
		
		if(!this.isEmpty()) {
			while(unekoa!=this.last) {
				if(unekoa.data.equals(berria.data)) {
					emaitza=true;
					ema=unekoa.data;
				}
				unekoa=unekoa.next;
			}
			if(unekoa.data.equals(berria.data)) {
				emaitza=true;
				ema=unekoa.data;
			}
		}
		else {
			System.out.println("Zerrenda hutsa");
		}
		return ema;
	}
	
	public boolean isEmpty() {
		if(this.last==null) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public int size() {
		Node<T> unekoa=this.last.next;
		int kont=0;
		if(this.isEmpty()) {
			System.out.println("Zerrenda hutsa");
		}
		else {
			while(unekoa!=this.last) {
				kont++;
				unekoa=unekoa.next;
			}
		}
		return kont+1;
	}
	
	public Iterator<T> iterator(){
		return (Iterator<T>) new ListIterator();
	}
	
	public class ListIterator<T> {
		public Node current;
		public int size;
		
		public boolean hasNext() {
			
			if(size==0) {
				return false;
			}
			else {
				return true;
			}
		}
		public T next() {
			T emaitza=(T)current.data;
			size--;
			current=current.next;
			return emaitza;
		}
	}

}
