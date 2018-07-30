package calculator;

class Calculate {
	double x;
	double y;
	
	Calculate() {}
	
	double add(double x, double y) {
		double sum = x + y;
		return sum;
	}
	double add(double x, double y, double z) {
		return add(x, y) + z;
	}
	double subtract(double x, double y) {
		double sub = x - y;
		return sub;
	}
	double substract(double x, double y, double z) {
		return subtract(x, y) + z;
	}
	double multiply(double x, double y) {
		double mult = x * y;
		return mult;
	} 
	double divide(double x, double y) {
		if (y != 0) {
			double div = x / y;
			return div;
		} else {
			System.out.println("Błąd, nie można dzielić przez zero !");
			return 0;
		}
	}
	void printAll(double x, double y) {
		Calculate c = new Calculate();
		double a = c.add(x, y);
		double b = c.subtract(x, y);
		double e = c.multiply(x, y);
		double f = c.divide(x, y);
		System.out.println("Dodawanie: " + a + "\n Odejmowanie " + b + "\n Mnożenie: " + e + "\n Dzielenie: " + f);
	}
}
