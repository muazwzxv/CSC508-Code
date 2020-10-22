package Q3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useDelimiter("\n");

		MyArrayList<Staff> list = getInput(in);

		displayAll(list);
		list.add(new Staff("siti hajar kamaludin", "123456", "CEO", "Safety and health", 12000));

		System.out.println("\n Delete by ID :");
		String toDelete = in.next();
		Staff deleted = null;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStaffId().equalsIgnoreCase(toDelete)) {
				deleted = list.get(i);
				list.remove(i);
			}
		}
		System.out.println("\n The deleted staff: \n" + deleted.toString());

		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getSalary() > 2000)
				count++;
		}
		System.out.println("\nNumber of staff earning more than RM2k: " + count);

		Staff minimum = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getSalary() < minimum.getSalary())
				minimum = list.get(i);
		}
		System.out.println("\n Minimum earning staff : " + minimum.toString());

	}

	static MyArrayList<Staff> getInput(Scanner in) {

		MyArrayList<Staff> list = new MyArrayList<Staff>();
		System.out.println("\n Enter number of staff : ");
		int num = in.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println("\n Name: ");
			String name = in.next();

			System.out.println("\n Staff Id: ");
			String id = in.next();

			System.out.println("\n Position: ");
			String p = in.next();

			System.out.println("\n Department: ");
			String d = in.next();

			System.out.println("\n Monthly Salary: ");
			double s = in.nextDouble();

			list.add(new Staff(name, id, p, d, s));
		}

		return list;
	}

	static void displayAll(MyArrayList<Staff> staff) {
		for (int i = 0; i < staff.size(); i++) {
			System.out.println("\n" + staff.get(i).toString());
		}
	}
}
