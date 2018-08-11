package topic26.files.exercise;

import java.io.Serializable;

public class Company implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Employee[] employeeGroup;
	
	public Employee[] getEmployeeGroup() {
		return employeeGroup;
	}
	
	public Company(int membersAmount) {
		employeeGroup = new Employee[membersAmount];
	}

	public void addWorker(Employee worker, int mumMember) {
		employeeGroup[mumMember] = worker;
	}
	
	
}
