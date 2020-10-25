package proiektua;

public class ProbaUnorderedCircularLinkedList {
	
	public static UnorderedCircularLinkedList<Node> listaSortu() {
		
		UnorderedCircularLinkedList<Node> l=new UnorderedCircularLinkedList<Node>(null, 0);
		
		l.addToRear(3);
		l.addToRear(3);
		l.addToRear(9);
		l.addToRear(7);
		l.addToRear(5);
		l.addToRear(0);
		l.addToRear(20);
		
		return l;
	}

	public static void main(String[] args)  {
		
		
		UnorderedCircularLinkedList<Node> l=listaSortu();
		
		Node elem=new Node(7,null);
		
		l.addToFront(elem);
		
		
	}
}
