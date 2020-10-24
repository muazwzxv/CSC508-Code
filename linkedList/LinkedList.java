public class LinkedList {

	private Node first;
	private Node current;
	private Node last;

	public LinkedList() {
		this.first = this.last = null;
	}

	public boolean isEmpty() {
		return (this.first == null);
	}

	public void insertAtFront(Object data) {
		if (isEmpty()) {
			this.first = this.last = new Node(data);
		} else {
			this.first = new Node(data, this.first);
		}
	}

	public void insertAtBack(Object data) {
		if (isEmpty()) {
			this.first = this.last = new Node(data);
		} else {
			this.last = this.last.next = new Node(data);
		}
	}

	public Object removeFromFront() throws EmptyListException {

	}
}
