package Q3;

public class Staff {

	private String name;
	private String staffId;
	private String position;
	private String department;
	private double monthlySalary;

	public Staff(String n, String id, String p, String d, double m) {
		this.name = n;
		this.staffId = id;
		this.position = p;
		this.department = d;
		this.monthlySalary = m;
	}

	public String getName() {
		return this.name;
	}

	public String getStaffId() {
		return this.staffId;
	}

	public String getPosition() {
		return this.position;
	}

	public String getDepartment() {
		return this.department;
	}

	public double getSalary() {
		return this.monthlySalary;
	}

	public void setName(String n) {
		this.name = n;
	}

	public void setId(String id) {
		this.staffId = id;
	}

	public void setPosition(String p) {
		this.position = p;
	}

	public void setMonthlySalary(double s) {
		this.monthlySalary = s;
	}
}
