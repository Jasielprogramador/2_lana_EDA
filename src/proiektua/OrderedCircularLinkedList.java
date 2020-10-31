package proiektua;


import java.util.LinkedList;
public class OrderedCircularLinkedList<T extends Comparable<T>> extends CircularLinkedList<T> implements  OrderedListADT<T>{
	
	public OrderedCircularLinkedList(String d) {
		super(d);
	}
	
	public void add(T elem) {
		Node unekoa=super.last.next;
		Node aurrekoa=null;
		boolean aurkitua=false;
		
		while(unekoa!=super.last || !aurkitua) {
			if(unekoa.data.equals(((Node) elem).next.data)){
				if(aurrekoa==null) {
					super.last.next=((Node)elem);
					((Node)elem).next=unekoa;
				}
				else {
					aurrekoa.next=((Node)elem);
					((Node)elem).next=unekoa;
				}
			}
			else {
				aurrekoa=unekoa;
				unekoa=unekoa.next;
			}
		}
		this.count++;
	}
	
	public void merge(OrderedCircularLinkedList<T> lista) {
		
		
		
		
		this.count+=lista.count;
	}
	
	
	
}
