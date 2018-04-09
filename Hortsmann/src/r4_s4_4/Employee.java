package r4_s4_4;

class Employee {
	private String name;
	private double salary;
	public Employee(String n, double s) {
		name = n;
		salary = s;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	public static void tripleValue(double x) { // nie dzia³a
		x = 3 * x;
		System.out.println("Koniec metody: x=" + x);
	}
	public static void tripleSalary(Employee x) { // dzia³a
		x.raiseSalary(200);
		System.out.println("Koniec metody: salary=" + x.getSalary());
	}
	public static void swap(Employee x, Employee y) {
		Employee temp = x;
		x = y;
		y = temp;
		System.out.println("Koniec metody: x=" + x.getName());
		System.out.println("Koniec metody: y=" + y.getName());
	}
}
