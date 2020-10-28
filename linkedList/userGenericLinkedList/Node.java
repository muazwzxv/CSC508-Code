package userGenericLinkedList;

public class Node<T> {
	T data;
	Node<T> next;

	public Node(T data) {
		this(data, null);
	}

	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}

	public T getData() {
		return this.data;
	}

	public Node<T> getNext() {
		return this.next;
	}
}