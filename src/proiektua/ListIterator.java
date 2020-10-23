package proiektua;

public class ListIterator<T> {
	public Node current;
	public int size;
	private static ListIterator instance=null;
	
	private ListIterator() {}
	
	private static ListIterator getInstance() {
		if(instance==null) {
			instance=new ListIterator();
		}
		return instance;
	}
	
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
