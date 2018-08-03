package calculator.geom;

public class Circ implements GeomCalc {
	
	private double r = 0;

	public Circ(double r) {
		this.r = r;
	}
	@Override
	public void setCircPerimeter(double r) {
		this.r = r;	
	}
	@Override
	public void setTriangPerimeter(double a, double b, double c, double h) {
		System.out.println("Niepoprawna metoda w tym kontekście.");
	}
	@Override
	public String getPerimeter() {
		return "Obwód koła: " + 2*GeomCalc.PI*r;
	}
	@Override
	public void setCircArea(double r) {
		this.r = r;
	}
	@Override
	public String getArea() {
		return "Pole koła: " + GeomCalc.PI*r*r;
	}

	@Override
	public void setPerimeter(double x, double y) {
		System.out.println("Niepoprawna metoda w tym kontekście.");
	}
	@Override
	public void setArea(double x, double y) {
		System.out.println("Niepoprawna metoda w tym kontekście.");
		
	}
}
