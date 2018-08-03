package calculator.geom;

public class Triang implements GeomCalc {

	private double a = 0;
	private double b = 0;
	private double c = 0;
	private double h = 0;
	
	public Triang(double a, double b, double c, double h) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.h = h;
	}
	public Triang(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public Triang(double a, double h) {
		this.a = a;
		this.h = h;
	}
	public Triang(double a) {
		this.a = a;
	}
	@Override
	public void setTriangPerimeter(double a, double b, double c, double h) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.h = h;
	}
	@Override
	public String getPerimeter() {
		return "Obwód trójkąta: " + (a+b+c);
	}
	@Override
	public void setArea(double a, double h) {
		this.a = a;
		this.h = h;
	}
	@Override
	public String getArea() {
		return "Pole trójkąta: " + (0.5*a*h);
	}
	@Override
	public void setPerimeter(double x, double y) {
		System.out.println("Niepoprawna metoda w tym kontekście.");
	}
	@Override
	public void setCircPerimeter(double r) {
		System.out.println("Niepoprawna metoda w tym kontekście.");
	}
	@Override
	public void setCircArea(double r) {
		System.out.println("Niepoprawna metoda w tym kontekście.");
		
	}
	

}
