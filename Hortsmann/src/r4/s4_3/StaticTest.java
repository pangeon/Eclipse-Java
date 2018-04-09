package r4.s4_3;

public class StaticTest {

	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Tomasz", 40000);
		staff[1] = new Employee("Dariusz", 60000);
		staff[2] = new Employee("Grzegorz", 65000);
		
		// Drukowanie informacji o wszystkich obiektach klasy Employee.
		for (Employee e : staff) {
			e.setId();
			System.out.println("name = " + e.getName() + ", id = " + e.getId() + ", salary = " + e.getSalary());
		}
		int n = Employee.getNextId(); // Wywo³anie metody statycznej.
		System.out.println("Nastêpny dostêpny identyfikator = " + n);
	}
}
