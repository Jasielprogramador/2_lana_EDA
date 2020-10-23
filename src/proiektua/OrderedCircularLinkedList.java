/*package proiektua;


import java.util.LinkedList;
public class OrderedCircularLinkedList<T> extends CircularLinkedList extends Comparable<T>{
	
	public OrderedCircularLinkedList(String d, int c) {
		super(d,c);
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
	
	
	
	public void setDeskr(String nom) {
		
	}
	
	public String getDeskr() {
		
	}
	
	public T removeFirst() {
		
	}
	
	public T removeLast(T elem) {
		
	}
	
	public T remove(T elem) {
		 // Balio hori listan baldin badago, bere lehen agerpena ezabatuko dut. Kendutako objektuaren erreferentzia bueltatuko du (null ez baldin badago)
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
	
	
}*/
