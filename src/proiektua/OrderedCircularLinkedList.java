package proiektua;


import java.util.LinkedList;
public class OrderedCircularLinkedList<T> extends CircularLinkedList<T> implements  OrderedListADT<T>{
	
	public OrderedCircularLinkedList(String d, int c) {
		super();
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
	}
	
	public void merge(OrderedCircularLinkedList<T> lista) {
		
	}
	
	
	
}
