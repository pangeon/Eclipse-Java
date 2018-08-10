package topic26.files.exercise;

public class Employee extends Person {
	private static final long serialVersionUID = 1L;
	
	private double salary = 0;

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String name, String surname, double salary) {
		super(name, surname);
		setSalary(salary);
	}
}
