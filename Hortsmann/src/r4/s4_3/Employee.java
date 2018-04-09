package r4.s4_3;

class Employee {
	private static int nextId = 1;
	
	private String name;
	private double salary;
	private int id;
	
	Employee(String n, double s) {
		name = n;
		salary = s;
		id = 0;
	}
	/* Kostruktor:
	 * 
	 * Employee(String n, double s) {
		 n = name;
		 s = salary;
		 id = 0;
	  }  
	   zwróci null (ustawi wartoœci pól znane z klasy) !!!
	 */

	public static int getNextId() {
		return nextId;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public int getId() {
		return id;
	}
	public void setId() {
		id = nextId;
		nextId++;
	}
	// test jednostkowy
	public static void main(String[] args) { // test jednostkowy
		Employee e = new Employee("Test udany", 999999);
		System.out.println(e.getName() + " " + e.getSalary());
	}
	
}
