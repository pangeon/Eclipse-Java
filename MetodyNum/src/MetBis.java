
public class MetBis {

	public static double f(double x) {
		// rozpatruje wielomian x^2-5
		return x*x - 5;
	}
	public static void check(double lowerLimit, double upperLimit) {
		double x = upperLimit-lowerLimit;
		while(f(x) > 0) {
			x /= 2;
			System.out.println(x);
		}
		System.out.println("Wynik: " + x);
	}
	public static void main(String[] args) {
		check(0, 10);
	}

}
