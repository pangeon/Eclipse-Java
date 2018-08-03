package calculator.geom;

public class Rect implements GeomCalc {
	
	private double x = 0;
	private double y = 0;
	
	public Rect(double x, double y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String getPerimeter() {
		return "Obwód prostokąta: " + 2*(x+y);
	}
	@Override
	public String getArea() {
		return "Pole prostokąta: " + x*y;
	}
	@Override
	public void setPerimeter(double x, double y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public void setArea(double x, double y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public void setTriangPerimeter(double a, double b, double c, double h) {
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
