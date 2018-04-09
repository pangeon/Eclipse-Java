package r4_s4_5;

import static java.lang.System.*; // import statyczny
import static java.lang.Math.*; // import statyczny

public class ContructorTest {

	public static void main(String[] args) {
		Employee[] staff = new Employee[4];
		staff[0] = new Employee("Hubert", 40000);
		staff[1] = new Employee(60000);
		staff[2] = new Employee(80000);
		staff[3] = new Employee();
		// Wydruk informacji o wszystkich obiektach klasy Employee.
		for (Employee e : staff) {
			out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
		}
		out.println("Wynik " + (pow(3, 4) + sqrt(12) + PI)); // du¿a korzyœæ przy korzystaniu z klasy Math
		// wa¿ne konkatenacja wyst¹pi przed wykonaniem operacji matematycznych gdy zapomnimy nawiasów

	}

}
