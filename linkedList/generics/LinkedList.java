package generics;

public class LinkedList<T> {

	private Node<T> first;
	private Node<T> current;
	private Node<T> last;

	public LinkedList() {
		this.first = this.last = null;
	}

	public boolean isEmpty() {
		return (this.first == null);
	}

	public void insertAtFront(T data) {
		if (isEmpty()) {
			this.first = this.last = new Node<T>(data);
		} else {
			this.first = new Node<T>(data, this.first);
		}
	}

	public void insertAtBack(T data) {
		if (isEmpty()) {
			this.first = this.last = new Node<T>(data);
		} else {
			this.last = this.last.next = new Node<T>(data);
		}
	}

	public T removeFromFront() throws EmptyListException {
		Node<T> remove = null;

		if (isEmpty())
			throw new EmptyListException();

		remove = this.first;
		if (this.first.equals(last)) {
			this.first = this.last = null;
		} else {
			this.first = this.first.next;
		}

		return remove.data;
	}

	public T removeFromBack() throws EmptyListException {
		Node<T> remove = null;

		if (isEmpty())
			throw new EmptyListException();

		remove = this.last;
		if (this.first.equals(this.last))
			this.first = this.last = null;
		else {
			this.current = this.first;

			// Iterate to the node just before the last node
			while (this.current != this.last)
				this.current = this.current.next;

			// Reassigned the new lastnode and break next chain of the removed nodes
			this.last = current;
			current.next = null;
		}

		return remove.data;
	}

	public T getFirst() throws EmptyListException {
		if (isEmpty())
			throw new EmptyListException();

		return this.first.data;
	}

	public T getNext() {
		if (this.current != this.last) {
			current = current.next;
			return current.data;
		} else {
			return null;
		}
	}
}
