package proiektua;


import java.util.LinkedList;



public class UnorderedCircularLinkedList<T> extends CircularLinkedList implements UnorderedListADT<T> {
	
	public UnorderedCircularLinkedList(String d) {
		super(d);
	}

	public void addToFront(T elem) {
        Node<T> berria=new Node(elem);

        // Zerrenda hutsa bada
        if(super.isEmpty()) {
        	berria.next=berria;
            this.last=berria;
        }
        else {
            berria.next=this.last.next;
            this.last.next=berria;
        }
        this.count++;
    }
	
	//Sartu amaieran
	 public void addToRear(T elem) {
	        Node<T> berria=new Node(elem);

	        if(super.isEmpty()) {
	        	berria.next=berria;
	            this.last=berria;
	        }
	        else {
	            berria.next=this.last.next;
	            this.last.next=berria;
	            this.last=berria;
	        }
	        this.count++;
	    }
	
	public void addAfter(T elem, T target) {
		
		Node<T> orain = this.last;
		boolean aurkitua=false;
		
		if (target != null && this.last!=null && elem!=null) {
			do  {
				if (orain.data.equals(target)) {
				
					aurkitua=true;
				
					if (orain==this.last)
					this.addToRear(elem);
					else {
						Node<T> berri = new Node<T>(elem);
						berri.next = orain.next;
						orain.next=berri;
						this.count++;
					}
				}
				else
					orain=orain.next;
			}while(!aurkitua && orain!=this.last);
		}
	}
	
	
	
}
