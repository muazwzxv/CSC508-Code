public class LinkedList {

	private Node first;
	private Node current;
	private Node last;

	public LinkedList() {
		this.first = this.last = null;
	}

	public boolean isEmpty() {
		return true;
	}

	public void insertAtFront(Object data) {
		if (isEmpty()) {
			this.first = this.last = new Node(data);
		} else {
			this.first = new Node(data, this.first);
		}
	}
}
