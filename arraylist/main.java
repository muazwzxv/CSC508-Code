public class main {
	public static void main(String[] args) {

		Student data = new Student("muaz", 21, "CS230", 4);

		MyArrayList<Student> list = new MyArrayList<Student>();
		list.add(data);

		System.out.println(list.get(0).getName());
	}
}
