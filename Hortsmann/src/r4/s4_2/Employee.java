package r4.s4_2;

import java.util.Date;
import java.util.GregorianCalendar;

class Employee {
	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee(String n, double s, int year, int month, int day) {
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		hireDay = calendar.getTime();
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public Date getHireDay() {
		return (Date) hireDay.clone();
	}
	public void raiseSalary(double byPercent) {
		double raise = this.salary * byPercent / 100;
		salary += raise;
	}
	public static void printAll(Employee staff[]) {
		System.out.println("|      Imiê i Nazwisko      |     Wyp³ata     |            Zatrudniony/a           | ");
		System.out.println("");
		for (Employee e: staff) {
			System.out.println(e.getName() + "      |      " + e.getSalary() + "     |     " + e.getHireDay());
		}
		System.out.println("");
	}
}
