public class Student {
	private String name;
	private int age;
	private String program;
	private int cgpa;

	public Student(String n, int a, String p, int c) {
		this.name = n;
		this.age = a;
		this.program = p;
		this.cgpa = c;
	}

	public void setName(String n) {
		this.name = n;
	}

	public void setAge(int a) {
		this.age = a;
	}

	public void setProgram(String p) {
		this.program = p;
	}

	public void setCgpa(int c) {
		this.cgpa = c;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String getProgram() {
		return this.program;
	}

	public int getCgpa() {
		return this.cgpa;
	}

}
