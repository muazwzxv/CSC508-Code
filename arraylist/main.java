public class main {
	public static void main(String[] args) {

		Student data = new Student("muaz", 21, "CS230", 4);

		// with generic type safety
		MyArrayList<Student> list = new MyArrayList<Student>();
		list.add(data);

		// With non generic type safety
		MyArrayList list2 = new MyArrayList();
		list2.add(3);
		list2.add(data);

		System.out.println(list2);
		System.out.println(list.get(0).getName());
	}

	static Student[] seed() {
		Student[] data = new Student[10];

		return data;
	}
}
