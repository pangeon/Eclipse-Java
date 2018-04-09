package r4_s4_4;

public class ParamTest {

	public static void main(String[] args) {
		/*
		* Test 1. Metody nie mog¹ modyfikowaæ parametrów liczbowych.
		*/
		System.out.println("Testowanie tripleValue:");
		double percent = 10;
		System.out.println("Przed: percent=" + percent);
		Employee.tripleValue(percent);
		System.out.println("Po: percent=" + percent);
		
		/*
		* Test 2. Metody mog¹ zmieniaæ stan parametrów bêd¹cych obiektami.
		*/
		System.out.println("\nTestowanie tripleSalary:");
		Employee harry = new Employee("Grzegorz", 50000);
		System.out.println("Przed: salary=" + harry.getSalary());
		Employee.tripleSalary(harry);
		System.out.println("Po: salary=" + harry.getSalary());
		
		/*
		* Test 3. Metody nie mog¹ dodawaæ nowych obiektów do parametrów obiektowych.
		*/
		System.out.println("\nTestowanie swap:");
		Employee a = new Employee("Alicja", 70000);
		Employee b = new Employee("Grzegorz", 60000);
		
		System.out.println("Przed: a=" + a.getName());
		System.out.println("Przed: b=" + b.getName());
		Employee.swap(a, b);
		System.out.println("Po: a=" + a.getName());
		System.out.println("Po: b=" + b.getName());
	}
}


