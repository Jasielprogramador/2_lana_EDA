package proiektua;

public interface OrderedListADT<T> extends ListADT<T>{
	public void add(T elem);
	public void merge(OrderedCircularLinkedList<T> z);
}
