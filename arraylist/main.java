public class main {
	public static void main(String[] args) {

		Student data = new Student("muaz", 21, "CS230", 4);

		// with generic type safety
		MyArrayList<Student> list = new MyArrayList<Student>();
		list.add(data);
		// list.add(7);
		System.out.println("Generic \n" + list);

		// With non generic type safety
		MyArrayList list2 = new MyArrayList();
		list2.add(3);
		list2.add(data);
		list2.add("kontolan rasukan barney and friends");
		System.out.println("Non Generic \n" + list2);

		MyArrayList<Student> seeded = seed();
		System.out.println("From seeded \n" + seeded);
	}

	static MyArrayList<Student> seed() {
		MyArrayList<Student> list = new MyArrayList<Student>();

		list.add(new Student("Muaz", 21, "CSC230", 4));
		list.add(new Student("Syuk", 21, "CSC230", 4));
		list.add(new Student("Hakim", 21, "CSC230", 4));
		list.add(new Student("Amsyar", 21, "CSC230", 4));
		list.add(new Student("Dayang", 21, "CSC230", 4));
		list.add(new Student("Mizan", 21, "CSC230", 4));
		list.add(new Student("Alep", 21, "CSC230", 4));
		list.add(new Student("Ajim", 21, "CSC230", 4));
		list.add(new Student("Jebat", 21, "CSC230", 4));
		list.add(new Student("Ajiq", 21, "CSC230", 4));
		list.add(new Student("Zetty", 21, "CSC230", 4));

		return list;
	}

	static void askNumber() {

	}
}
