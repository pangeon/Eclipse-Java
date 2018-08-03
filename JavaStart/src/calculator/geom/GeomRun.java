package calculator.geom;

import java.util.Scanner;

public class GeomRun {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Zdefiniuj rodzaj operacji - kw, troj, kolo");
		String operation = in.nextLine();
		
		switch (operation) {
		case "kw":
			System.out.println("Zdefiniuj paremetry figury - kwadrat");
			double a = in.nextDouble();
			double b = in.nextDouble();
			Rect rectagle = new Rect(a, b);
			rectagle.showPerimeterAndArea();
			break;
		case "troj":
			System.out.println("Zdefiniuj paremetry figury - trójkąt");
			double c = in.nextDouble();
			double d = in.nextDouble();
			double e = in.nextDouble();
			double f = in.nextDouble();
			Triang triangle = new Triang(c, d, e, f);
			triangle.showPerimeterAndArea();
			break;
		case "kolo":
			System.out.println("Zdefiniuj paremetry figury - koło");
			double g = in.nextDouble();
			Circ circle = new Circ(g);
			circle.showPerimeterAndArea();
			break;
		default:
			System.out.println("Podano nieprawdłowe polecenie.");;
		}
		in.close();
	}
}
