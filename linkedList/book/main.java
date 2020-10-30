package book;

import java.util.Scanner;

import userLinkedList.*;

public class main {

	public static void main(String[] arg) throws EmptyListException {

		Scanner in = new Scanner(System.in);
		in.useDelimiter("\n");

		LinkedList list = new LinkedList();
		Book bk = new Book("Bukulan kontol", "Muaz Bin Wazir", 400, 2020);

		System.out.println("\n Data to Enter: ");
		int count = in.nextInt();

		for (int i = 0; i < count; i++) {
			System.out.println("\n Book Name: ");
			String n = in.next();
			System.out.println("\n Author Name: ");
			String author = in.next();
			System.out.println("\n Price: RM");
			double p = in.nextDouble();
			System.out.println("\n Year: ");
			int y = in.nextInt();

			bk = new Book(n, author, p, y);
			list.insertAtBack(bk);
		}

		System.out.println("\n Enter title to search: ");
		String key = in.next();
		Book found = search(list, key);
		System.out.println("\n Found \n" + found.toString());
	}

	static Book search(LinkedList list, String key) {
		Node current = list.getHeadNode();
		Node last = list.getTailNode();

		while (current != last) {
			Book temp = ((Book) current.getData());

			if (temp.getTitle().equalsIgnoreCase(key))
				return temp;

			current = list.getNext(current);
		}

		return null;
	}

	static double getAverage(LinkedList list) {
		Node current = list.getHeadNode();
		Node last = list.getTailNode();

		double total = 0;
		int count = 0;

		while (current != last) {
			Book temp = ((Book) current.getData());

			total += temp.getPrice();
			count++;
		}

		return total / count;
	}

}