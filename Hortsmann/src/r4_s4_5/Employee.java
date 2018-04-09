package r4_s4_5;

import java.util.Random;

class Employee {
	private static int nextId;
	private int id;
	private String name = "no name";
	private double salary;
	
	// Statyczny blok inicjuj¹cy.
	static {
		Random generator = new Random();
		// Ustawienie zmiennej nextId na losow¹ liczbê ca³kowit¹ z przedzia³u 0 – 9999.
		nextId = generator.nextInt(10000);
	}
	// Blok inicjuj¹cy obiektów.
	{
		id = nextId;
		nextId++;
	}
	public Employee(String n, double s) {
		name = n;
		salary = s;
	}
	
	public Employee(double s) {
		// Wywo³anie konstruktora Employee(String, double).
		this("Employee # " + nextId, s);
	}
	// Konstruktor domyœlny.
	public Employee()
	{
	// Zmienna name zainicjowana wartoœci¹ "" — patrz ni¿ej.
	// Zmienna salary nie jest jawnie ustawiona — inicjacja wartoœci¹ 0.
	// Zmienna id jest inicjowana w bloku inicjuj¹cym.
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
