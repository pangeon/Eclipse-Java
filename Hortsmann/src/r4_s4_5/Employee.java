package r4_s4_5;

import java.util.Random;

class Employee {
	private static int nextId;
	private int id;
	private String name = "no name";
	private double salary;
	
	// Statyczny blok inicjuj�cy.
	static {
		Random generator = new Random();
		// Ustawienie zmiennej nextId na losow� liczb� ca�kowit� z przedzia�u 0 � 9999.
		nextId = generator.nextInt(10000);
	}
	// Blok inicjuj�cy obiekt�w.
	{
		id = nextId;
		nextId++;
	}
	public Employee(String n, double s) {
		name = n;
		salary = s;
	}
	
	public Employee(double s) {
		// Wywo�anie konstruktora Employee(String, double).
		this("Employee # " + nextId, s);
	}
	// Konstruktor domy�lny.
	public Employee()
	{
	// Zmienna name zainicjowana warto�ci� "" � patrz ni�ej.
	// Zmienna salary nie jest jawnie ustawiona � inicjacja warto�ci� 0.
	// Zmienna id jest inicjowana w bloku inicjuj�cym.
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public double getSalary() {
		return salary;
	}
	
	
}
