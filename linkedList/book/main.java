package book;

import userLinkedList.*;

public class main {

	public static void main(String[] arg) throws EmptyListException {
		LinkedList list = new LinkedList();

		Book bk = new Book("Bukulan kontol", "Muaz Bin Wazir", 400, 2020);

		list.insertAtFront(bk);

		Book first = (Book) list.getFirst();
		System.out.println(first.getTitle());

	}

}
