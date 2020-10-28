package book;

import userLinkedList.LinkedList;

public class main {

	public static void main(String[] arg) {
		LinkedList list = new LinkedList();

		Book bk = new Book("Bukulan kontol", "Muaz Bin Wazir", 400, 2020);
		System.out.println(bk);

		list.insertAtFront(bk);
		System.out.println(list);
	}

}
