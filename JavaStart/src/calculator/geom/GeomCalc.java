package calculator.geom;

/*
Napisz program rozszerzający możliwości przykłady z lekcji. Stwórz kalkulator, który komunikujący 
się z użytkownikiem i pobierający od niego dane, który pozwala na wyliczenie pola i obwodu 
prostokąta, trójkąta i koła. 

Program powinien wykorzystywać co najmniej jeden interfejs.
*/
public interface GeomCalc {
	
	public static final double PI = Math.PI;
	
	public void setPerimeter(double x, double y);
	public void setTriangPerimeter(double a, double b, double c, double h);
	public void setCircPerimeter(double r);
	public void setCircArea(double r);
	public String getPerimeter();
	public void setArea(double x, double y);
	public String getArea();
	
	default void showPerimeterAndArea() {
		System.out.println(getPerimeter());
		System.out.println(getArea());
	}
	
}
