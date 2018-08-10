package topic26.files.exercise;

public class Company {
	private Employee[] employeeGroup;
	
	public Company(int membersAmount) {
		this.employeeGroup = new Employee[membersAmount];
	}
	public Employee getEmployee(int member) {
		return employeeGroup[member];
	}
	public void setEmployeeGroup(int member, String name, String surname, double salary) {
		Employee worker = getEmployee(member);
		worker = new Employee(name, surname, salary);
	}
	
	
}
