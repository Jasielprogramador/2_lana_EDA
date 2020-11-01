package proiektua;


import java.util.LinkedList;
import java.util.Iterator;

public class OrderedCircularLinkedList<T extends Comparable<T>> extends CircularLinkedList<T> implements  OrderedListADT<T>{
	
	public OrderedCircularLinkedList(String d) {
		super(d);
	}
	
	public void add(T elem) {
		Node berria=new Node(elem);
		
		if(this.isEmpty()) {
			this.last=berria;
			berria.next=berria;
		}
		else {
			Node unekoa=this.last.next;
			Node aurrekoa=null;
			boolean aurkitua=false;
			
			while(unekoa!=this.last || !aurkitua) {
				if(unekoa.data.equals(berria.next.data)){
					if(aurrekoa==null) {
						this.last.next=berria;
						berria.next=unekoa;
					}
					else {
						aurrekoa.next=berria;
						berria.next=unekoa;
					}
				}
				else {
					aurrekoa=unekoa;
					unekoa=unekoa.next;
				}
			}
			this.count++;
		}
	}
		
	
	public void merge(OrderedCircularLinkedList<T> lista) {
		if (lista.isEmpty()) {
			System.out.println("Zerrenda hutsa");
		}
		else {
			Node<T> berria;
			Iterator<T> itr = lista.iterator();
			if(this.last==null) {
				berria= new Node(itr.next());
				this.last=berria;
				this.last.next=berria;
				this.count++;
			}
			else {
				Node<T> aurrekoa=this.last;
				Node<T> unekoa=this.last.next;
				T t;
				while(itr.hasNext()) {
					t=itr.next();
					if(unekoa.data.compareTo(t)<0) {
						aurrekoa=unekoa;
						unekoa=unekoa.next;
					}
					else if(unekoa.data.compareTo(t)==0) {
						berria=new Node(t);
						berria.next=unekoa.next;
						unekoa.next=berria;
						aurrekoa=unekoa;
						unekoa=unekoa.next;
						
					}
					else {
						berria=new Node(t);
						berria.next=unekoa;
						aurrekoa.next=berria;
						aurrekoa=unekoa;
						unekoa=unekoa.next;
					}
				}
			}
			
		}
	}
	
	
}
