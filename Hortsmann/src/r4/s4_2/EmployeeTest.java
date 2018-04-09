package r4.s4_2;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Adam Wolniewicz       ", 1550, 2014, 4, 5);
		staff[1] = new Employee("Jakub Pacyniak        ", 4550, 1998, 10, 6);
		staff[2] = new Employee("Aleksandra Chwaliñska ", 2320, 2005, 8, 30);
		
		Employee.printAll(staff);
		
		staff[1].raiseSalary(30);
		
		Employee.printAll(staff);
	}
}
